# Forbric Crasher

Yeah I'm goona let Forbric crash anyway.

A mod that intentionally crashes Minecraft when loaded using [Minecraft-Forbric-mod-loader](https://github.com/Ray-T-r/Minecraft-Forbric-mod-loader), but runs normally with Fabric or NeoForge.

## Building and releases

Build the universal mod JAR with Java 25:

```sh
./gradlew universalJar
```

Gradle derives the version from Git. A clean checkout of `v1.2.3` produces version `1.2.3` in the JAR filename and
the Fabric and NeoForge metadata. Commits after a version tag include the commit distance and hash, such as
`1.2.3-2-gabc1234`; untagged history uses `0.0.0-dev.<hash>`. Tracked local changes add a `-dirty` suffix.

Pushing a `v*` tag runs the release workflow and creates a draft GitHub release with the universal JAR attached.
To run it manually, open **Actions → Draft release → Run workflow** and enter an existing release tag, such as
`v1.2.3`. The workflow checks out and builds that tag.
The workflow explicitly passes the release tag as `-Pmod_version`, ensuring the release uses that tag's version.
You can also use this override when building from a source archive without Git metadata:

```sh
./gradlew universalJar -Pmod_version=1.2.3
```

## Detecting the Forbric mod loader

> The following investigation was conducted by Codex.

Investigated [Minecraft-Forbric-mod-loader](https://github.com/Ray-T-r/Minecraft-Forbric-mod-loader) on
2026-10-09 at commit [`520d7aad11cc7c9b8c8278b5f541e4429e1f7623`](https://github.com/Ray-T-r/Minecraft-Forbric-mod-loader/tree/520d7aad11cc7c9b8c8278b5f541e4429e1f7623).
The source was cloned separately for inspection, without adding a submodule or a dependency to this project.
These findings apply to the current **Forbric kernel**. The repository also contains the first-generation
`forbric-loader`, which uses a different architecture.

### Recommended runtime checks

For a Fabric mod, inspect the implementation returned by the public Fabric Loader API:

```java
boolean forbric = net.fabricmc.loader.api.FabricLoader.getInstance()
        .getClass()
        .getName()
        .equals("net.forbric.kernel.fabric.KernelFabricLoader");
```

Forbric's replacement `FabricLoader.getInstance()` returns its `KernelFabricLoader` singleton. Check from a mod
entrypoint or later: the upstream API throws if accessed before the singleton is created. Comparing a class name
avoids linking against Forbric classes and requires only the Fabric API already available to a Fabric mod.

Sources: [FabricLoader.getInstance()](https://github.com/Ray-T-r/Minecraft-Forbric-mod-loader/blob/520d7aad11cc7c9b8c8278b5f541e4429e1f7623/forbric-kernel/src/main/java/net/fabricmc/loader/api/FabricLoader.java#L30-L46)
and [KernelFabricLoader](https://github.com/Ray-T-r/Minecraft-Forbric-mod-loader/blob/520d7aad11cc7c9b8c8278b5f541e4429e1f7623/forbric-kernel/src/main/java/net/forbric/kernel/fabric/KernelFabricLoader.java#L53-L67).

For common code shared by Fabric and NeoForge, inspect the class loader that defined this mod's own class:

```java
static boolean isForbric(Class<?> modClass) {
    for (ClassLoader loader = modClass.getClassLoader(); loader != null; loader = loader.getParent()) {
        if (loader.getClass().getName().equals("net.forbric.kernel.classloading.ForbricClassLoader")) {
            return true;
        }
    }
    return false;
}
```

Pass a class from this mod, such as `ForbricCrasher.class`. The kernel's `ForbricClassLoader` defines game and mod
classes for all three ecosystems; walking parents also accommodates a child loader. This is the recommended
shared-code fingerprint because it identifies the loader actually hosting the mod, without importing Fabric,
NeoForge, or Forbric APIs. It is inferred from the source architecture and has not been verified in a running game.

Sources: [ForbricClassLoader](https://github.com/Ray-T-r/Minecraft-Forbric-mod-loader/blob/520d7aad11cc7c9b8c8278b5f541e4429e1f7623/forbric-kernel/src/main/java/net/forbric/kernel/classloading/ForbricClassLoader.java#L36-L49)
and [DelegationPolicy](https://github.com/Ray-T-r/Minecraft-Forbric-mod-loader/blob/520d7aad11cc7c9b8c8278b5f541e4429e1f7623/forbric-kernel/src/main/java/net/forbric/kernel/classloading/DelegationPolicy.java).

Both checks depend on implementation names rather than a documented detection contract. Recheck them when
supporting a newer release. A renamed or relocated implementation can produce a false negative; these checks
are runtime fingerprints, not proof against deliberate spoofing.

### Other signals and their limitations

- **Class availability:** a non-initializing `Class.forName` probe for
  `net.forbric.kernel.fabric.KernelFabricLoader`, using the mod class's loader, can establish that kernel classes
  are visible. It is weaker than inspecting an active instance or defining loader: an unused jar can make a class
  visible. Handle `ClassNotFoundException` and report `LinkageError` separately from ordinary absence.
- **Fabric mod IDs:** do not rely on `FabricLoader.getInstance().isModLoaded("forbric")`. The kernel registers
  `minecraft`, `java`, and `fabricloader` as built-ins, with the latter named `Fabric Loader (Forbric kernel)`.
  Its `isModLoaded` implementation only checks the registered ID/alias map. The name of the `fabricloader`
  metadata is a secondary fingerprint; its version represents the implemented Fabric Loader API level, not the
  Forbric release. See [built-in registration](https://github.com/Ray-T-r/Minecraft-Forbric-mod-loader/blob/520d7aad11cc7c9b8c8278b5f541e4429e1f7623/forbric-kernel/src/main/java/net/forbric/kernel/boot/KernelFabricEcosystem.java#L172-L184)
  and [ID lookup](https://github.com/Ray-T-r/Minecraft-Forbric-mod-loader/blob/520d7aad11cc7c9b8c8278b5f541e4429e1f7623/forbric-kernel/src/main/java/net/forbric/kernel/fabric/KernelFabricLoader.java#L537-L549).
- **Legacy runtime mod:** `forbricruntime` is declared by the first-generation loader's
  [runtime metadata](https://github.com/Ray-T-r/Minecraft-Forbric-mod-loader/blob/520d7aad11cc7c9b8c8278b5f541e4429e1f7623/forbric-loader/src/runtime-meta/fabric.mod.json).
  It is a useful legacy hint, not a required ID for the current kernel. The current checks above do not claim
  coverage of all historical Forbric releases.
- **Launcher profile:** the kernel installer writes `mainClass` as
  `net.forbric.kernel.boot.KernelClientLaunch` and a top-level `forbric` metadata object with `declares` and
  `ecosystems`. These are useful for offline inspection of an installed version JSON. A launcher's Fabric label
  is insufficient: the installer deliberately declares a Fabric coordinate for launcher compatibility.
  Dedicated servers use `net.forbric.kernel.boot.KernelServerLaunch`. See
  [installer profile generation](https://github.com/Ray-T-r/Minecraft-Forbric-mod-loader/blob/520d7aad11cc7c9b8c8278b5f541e4429e1f7623/forbric-kernel-installer/src/main/java/net/forbric/installer/kernel/Installer.java#L115-L183)
  and [server entrypoint](https://github.com/Ray-T-r/Minecraft-Forbric-mod-loader/blob/520d7aad11cc7c9b8c8278b5f541e4429e1f7623/forbric-kernel/src/main/java/net/forbric/kernel/boot/KernelServerLaunch.java).
- **Branding and network detection:** title-screen/F3 branding can display Forbric, but can be disabled with
  `-Dforbric.branding=off`. The branding transformer explicitly leaves `ClientBrandRetriever` and the brand
  NeoForge sends to servers untouched. Consequently, a remote server cannot reliably identify Forbric from the
  client brand alone. See [ForbricBrandingInjector](https://github.com/Ray-T-r/Minecraft-Forbric-mod-loader/blob/520d7aad11cc7c9b8c8278b5f541e4429e1f7623/forbric-kernel/src/main/java/net/forbric/kernel/transform/ForbricBrandingInjector.java#L32-L44).
- **System properties and files:** `forbric.*` switches and `.forbric-kernel` files are diagnostic hints. Switches
  can be set in any JVM, and files can remain after switching loaders; neither establishes an active Forbric runtime.
