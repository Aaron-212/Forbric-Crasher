# Forbric Crasher

[English](README_EN.md)

没错，检测到 Forbric 就崩溃。让我们给 Forbric Loader 那雷霆的“兼容性”上再添把火吧！

这个模组会在由 [Minecraft-Forbric-mod-loader](https://github.com/Ray-T-r/Minecraft-Forbric-mod-loader)
加载时主动触发崩溃，但在 NeoForge 或 Fabric 下不会。

本模组仅支持 Minecraft 26.2，因为 Forbric Loader 现在也只支持 26.2。

> 以下文本特别鸣谢由 [cubk1](https://github.com/cubk1) 撰写的 [Ray-T-r/Minecraft-Forbric-mod-loader#59](https://github.com/Ray-T-r/Minecraft-Forbric-mod-loader/issues/59)

---

## Forbric Crasher《测评和反馈》

在我在 GayHub 看到这个雷霆东西之后秉承赤石精神对这个东西进行了体验，以下是笔者的一些使用体验。

首先进行一下省流：

这是一个正宗老狗屎，堪比我声称我统一了 SteamOS、Omarchy、Bazzite 制造了一个叫做 Omssite 的作业系统，然后这个作业系统有 SteamOS 的体积和响应速度、Omarchy 的软件生态和游戏性能、Bazzite 的驱动支持。集成百家之短，去其精华，取其糟粕。

现在你不可能使用这个狗屎运行任何整合包或者高级mod，可能作者许愿时候已经想到要让哪些东西一起运行了可惜并没有成功，因为作者完全低估了做这个事情的难度和施工范围，可能在订阅了 Codex Plus 之后直接开启了 `/loop` 开始力大砖飞迭迭代代，最终成功制作出了这个雷霆大肥美狗屎。

<img width="1260" height="840" alt="Image" src="./assets/665201130-3f7a9f27-5580-4304-b914-30b9e43e98e7.png" />

## 然后我看到有人在 https://github.com/Ray-T-r/Minecraft-Forbric-mod-loader/issues/39 制作了一个“与此同时这是Forbric Crasher”图片，但是笔者认为绘制的不太准确，以下是笔者使用 ChatGPT™️在5个恒纪元内制作的更加准确的图片

<details>
<summary>点击观赏</summary>

<img width="1257" height="710" alt="Image" src="./assets/forbric crasher.png" />

</details>

## 正文

这个老猎奇东西应该算是吃到 [f(x)](https://zh.wikipedia.org/wiki/映射) 或者 [g(x)](https://zh.wikipedia.org/wiki/映射) 退网的红利了，如果有 f(x) 这个屎十万年之内都做不出来这个东西（的完美实现），因为你无论使用多少 [大语言模型](https://zh.wikipedia.org/wiki/中文房间) 代币进行 [力大砖飞行动](https://zh.wikipedia.org/zh-hans/SpaceX星艦) 都无法给所有用 f(x) 命名反射的mod进行妥善处理，所以这个东西可能在五个 [银河年](https://zh.wikipedia.org/zh-hans/银河年) 之内都不可能顺利backport到 26.1 以下 以下因为以前有很多mod喜欢直接反射 f(x) 或者 g(x)，他可能遭遇了一万层以上 [面向对象](https://zh.wikipedia.org/wiki/函数式编程) 包装所以你的 LmaoLolMyass 根本无法根据引用（reference）来判断，而且这个 mod 本身没有任何跨版本架构设计，然后修复兼容性问题也是针对某一个mod的特定版本进行修补听起来就非常痛苦因为实际上你无法解决所有mod里的奇妙写法，也就是你即将不得不抛弃mod生态最肥美的 1.20.1 / 1.21 去玩这个 Mojang 跟风 苹果 使用的年份命名版本和这个发展程度堪比 [委内瑞拉](https://zh.wikipedia.org/wiki/委内瑞拉) 的版本就爲了使用这个雷霆东西。

所以笔者认为，本项目的视频和 [读我.妈的](https://github.com/Aaron-212/Forbric-Crasher/blob/main/README.md) 以至于这个项目的名字都涉嫌了虚假宣传，虽然本项目叫 Forbric Crasher 听起来非常美妙，健壮性非常好，但是实际上他的兼容性完全就是一个屎，文不对题，既不能顺利执行 LiteLoader 的功能，也不能顺利的执行 Quilt 的功能，就像 [古巴](https://zh.wikipedia.org/zh-hans/古巴) 并不民主主义、也不是人民共和国一样。

然而令人蒙古的是虽然 我的世界 在 26.1 以上并没有混淆，但是笔者在观赏 [使用患有创伤后应激障碍并且不太喜欢写缩进的大语言模型生成式预训练转换器编写的神秘代码](https://github.com/Ray-T-r/Minecraft-Forbric-mod-loader/blob/1aa478eaac3ccfd143c820ac57ab718225c4ab9c/forbric-kernel/src/main/java/net/forbric/kernel/mixin/FinalMixinApplications.java) 时，还是在代码中莫名其妙发现了 f(x) 映射相关的代码，也许是以后打算兼容一下 迷你世界 然后证明 迷你世界 才受大众喜爱什么的。

<img width="328" height="313" alt="Image" src="./assets/gigachad.png" />

> 正在GitHub上和网友汴京的作者

第一次启动 [Embeddium](https://zh.wikipedia.org/wiki/嵌入式系统)（[Lite](https://geometry.games/game/geometry-dash-lite/index.html)Loader）版本我居然惊讶的发现这个 LiteLoader 版本的 Embeddium 想在这个mod [发射台](hhttps://en.wikipedia.org/wiki/List_of_built-in_macOS_apps#Launchpad) 上启动居然他妈的需要安装 [Quilt API](https://wiki.quiltmc.org/en/concepts/qsl-qfapi)，虽然我猜这大概是 Embeddium 不认为自己运行在 LiteLoader 了比如你成功误导了 `Class.forName` 什么的或者你的 [polyfill](<https://en.wikipedia.org/wiki/Polyfill_(programming)>) 大全成功给 [默认渲染器](https://wiki.fabricmc.net/drafts:rendering) [操](https://zh.wikipedia.org/wiki/草本植物) 飞了导致的，我不太理解这是什么操作逻辑但是只能 [尊重](<https://zh.wikipedia.org/wiki/蔑視_(遊戲)>) 一下了，于是决定安装一下 QuiltAPI 令人蒙古的是 QuiltAPI 里的组件都能加载失败 3 个，造成了加载 2 个mod失败 5 个mod的奇景。

<img width="1447" height="897" alt="Image" src="./assets/截屏2026-10-09 13.59.22.png" />

这个现象进一步证明了我的 [观点](https://zh.wikipedia.org/zh-hans/事實)，就是你永远无法 [打过](https://www.bilibili.com/video/BV1YM411s76S) 所有mod的奇怪写法，你只能挨个修补，如果要维护多个版本那更是 [地狱](https://gpustresstest.com/tests/volume-shader/) 难度，你可能想说你可以不维护旧版本，但是你这个东西只要不维护就永远有你不知道的mod里的写法恶心你。

说起 [AI开发](https://github.com/Aidan945/slop-check) 大伙都在骂我说实话没什么意见，但是有一个严肃的问题，就是你的Harness验收标准可能不太符合一个科学的提示词工程思想，就是你的测试标准是能进世界并且Mixin注入进去了从你不知道是不小心还是故意的commit上来的一些文档可以看出，很显然这个验收方案只适用于渲染类mod比如 Embeddium，大部分mod实现的功能可能都无法验证，也就是mod运行时的问题可能需要人工或者靠受害者提交issue来找到，毕竟现在 LmaoLolMyass 的视觉能力可能对这些mod是否工作正确没有任何识别方法。

[![YouTube](https://img.youtube.com/vi/Tw18-4U7mts/hqdefault.jpg)](https://www.youtube.com/watch?v=Tw18-4U7mts)

然后这个 mod 的兼容性也是非常的诡异，在我安装了一个 Cargo.rs 定位为 [Utility](https://modrinth.com/discover/mods?f=categories:utility) 的Mod也就是甚至没有在 我的世界 里添加很多新物品新方块精密机器的 [3D Skin Layers](https://modrinth.com/mod/3dskinlayers) 之后弹出了一个崩溃甚至让我游玩六年 我的世界 第一次见这个诡异的弹窗大半夜给我 [睾丸](https://www.bilibili.com/video/BV1PUE76uExK/) 吓爆一颗，导致我以前和 [我老婆](https://www.fz.wiki/wiki/干员/赛希) 平均有一颗睾丸，现在我和 [我老婆](https://www.fz.wiki/wiki/干员/赛希) 平均只有0.5颗睾丸了。

当然笔者 [喷](https://zh.wikipedia.org/wiki/QBA-221全自动霰弹枪) 了这么多肯定会有人说我是杠精，接下来笔者给作者提供一个 [解决方案](https://learn.microsoft.com/zh-cn/visualstudio/ide/solutions-and-projects-in-visual-studio?view=visualstudio)，是笔者没有消耗任何token使用 [大脑](https://zh.wikipedia.org/wiki/糞便) 想出来的。

对于反射 f(x)/g(x) 笔者认为可以通过给所有反射相关的API（例如getMethod，getField）在加载类过程中使用ASM [Transformer](https://zh.wikipedia.org/wiki/变压器) 进行 [劫持](https://zh.wikipedia.org/wiki/DNS劫持) 到你自己的API（例如`Forbric CrasherReflection.getMethod()`），这样他输入的就是最终拼接的引用，这样你可以不用任何 [启发式分析](https://zh.wikipedia.org/wiki/路径依赖) 就可以backport你的力作到 1.20.1 / 1.21 这样的肥美版本了，还可以节省你的 [Codex Plus](https://www.doubao.com/member/subscription) 订阅代币。

当然对于奇妙写法的处理笔者也没有启发式分析以外的方案，除非你直接研发一个接入 [OpenAI兼容API](https://developers.cloudflare.com/workers-ai/configuration/open-ai-compatibility/) 就可以让 LmaoLolMyass 来自动操 [字节码](https://www.bytedance.com/) 运行时修复冲突，所以这大概是无解的，这个项目大概在家用显卡推理 [GPT-6-Sol](https://developers.openai.com/api/docs/models/gpt-6-sol) 速度达到 11.4514tps 来修复字节码之前都不能 [上桌](https://dict.concised.moe.edu.tw/dictView.jsp?ID=34931&la=0&powerMode=0) 生产环境，也就是大概无法完美运行任何整合包，笔者建议直接去寻找最适合你的用户群体，只要Mod协议的CustomPayload工作正常能在服务器里游玩就行了的用户群体，也就是那些想在整合包服务器里开挂的神经病们，这样你就可以在 LiteLoader 整合包服务器里开 [Wurst](https://www.wurstclient.net/) 了，毕竟外挂是最不吃 mod 特性的，只靠Mixin来挂载hook。

什么？你的 mod 连 Wurst 都加载不了。？那没事了。！

---

## 构建与发布

安装 [mise](https://mise.jdx.dev/) 和 Java 25 后，构建通用模组 JAR：

```sh
mise install
mise exec -- gradle universalJar
```

mise 管理 `mise.toml` 中固定的 Gradle 版本。请将 `JAVA_HOME` 设置为 Java 25 的安装路径；
macOS 上默认使用 `/Library/Java/JavaVirtualMachines/zulu-25.jdk/Contents/Home`。

Gradle 自动从 Git 获取版本号。在没有本地修改的 `v1.2.3` 标签上构建时，JAR 文件名以及 Fabric 和
NeoForge 元数据中的版本号均为 `1.2.3`。版本标签之后的提交会附带提交数量和哈希，例如
`1.2.3-2-gabc1234`；没有版本标签时使用 `0.0.0-dev.<hash>`。已跟踪文件存在本地修改时会追加 `-dirty` 后缀。

推送 `v*` 标签会触发发布工作流，在 `ubuntu-latest` 上使用 Java 25 构建，并创建附带通用 JAR 的
GitHub Release 草稿。也可以在 **Actions → Draft release → Run workflow** 中输入已有的发布标签
（例如 `v1.2.3`）手动触发；工作流会检出并构建该标签。
工作流通过 `-Pmod_version` 显式传入发布标签，确保模组版本与该标签一致。
从不含 Git 元数据的源码压缩包构建时，也可以手动覆盖版本号：

```sh
mise exec -- gradle universalJar -Pmod_version=1.2.3
```

## 检测 Forbric 模组加载器

> 以下调查由 Codex 完成。

本次调查于 2026-10-09 进行，调查对象为
[Minecraft-Forbric-mod-loader](https://github.com/Ray-T-r/Minecraft-Forbric-mod-loader) 的提交
[`520d7aad11cc7c9b8c8278b5f541e4429e1f7623`](https://github.com/Ray-T-r/Minecraft-Forbric-mod-loader/tree/520d7aad11cc7c9b8c8278b5f541e4429e1f7623)。
调查时单独克隆了其源码进行检查，没有向本项目添加子模块或依赖。
这些结论适用于当前的 **Forbric 内核**。该仓库还包含第一代 `forbric-loader`，其架构有所不同。

### 推荐的运行时检查

对于 Fabric 模组，可以检查公开的 Fabric Loader API 返回的实现类：

```java
boolean forbric = net.fabricmc.loader.api.FabricLoader.getInstance()
        .getClass()
        .getName()
        .equals("net.forbric.kernel.fabric.KernelFabricLoader");
```

Forbric 替换后的 `FabricLoader.getInstance()` 会返回其 `KernelFabricLoader` 单例。
应在模组入口点或更晚的阶段执行检查：上游 API 在单例创建之前被调用时会抛出异常。
比较类名可以避免直接引用 Forbric 的类，只需要 Fabric 模组本就能使用的 Fabric API。

来源：[FabricLoader.getInstance()](https://github.com/Ray-T-r/Minecraft-Forbric-mod-loader/blob/520d7aad11cc7c9b8c8278b5f541e4429e1f7623/forbric-kernel/src/main/java/net/fabricmc/loader/api/FabricLoader.java#L30-L46)
和 [KernelFabricLoader](https://github.com/Ray-T-r/Minecraft-Forbric-mod-loader/blob/520d7aad11cc7c9b8c8278b5f541e4429e1f7623/forbric-kernel/src/main/java/net/forbric/kernel/fabric/KernelFabricLoader.java#L53-L67)。

对于 Fabric 和 NeoForge 共用的代码，可以检查定义本模组自身类的类加载器：

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

传入本模组中的一个类，例如 `ForbricCrasher.class`。
内核的 `ForbricClassLoader` 会为三个生态系统定义游戏类和模组类；遍历父加载器也能兼容子加载器的情况。
这是共用代码中推荐使用的运行时特征，因为它能识别实际承载该模组的加载器，
无需导入 Fabric、NeoForge 或 Forbric 的 API。
这一结论根据源码架构推断得出，尚未在运行中的游戏里验证。

来源：[ForbricClassLoader](https://github.com/Ray-T-r/Minecraft-Forbric-mod-loader/blob/520d7aad11cc7c9b8c8278b5f541e4429e1f7623/forbric-kernel/src/main/java/net/forbric/kernel/classloading/ForbricClassLoader.java#L36-L49)
和 [DelegationPolicy](https://github.com/Ray-T-r/Minecraft-Forbric-mod-loader/blob/520d7aad11cc7c9b8c8278b5f541e4429e1f7623/forbric-kernel/src/main/java/net/forbric/kernel/classloading/DelegationPolicy.java)。

这两种检查都依赖实现类的名称，而非文档规定的检测约定。支持新版本时应重新核查。
实现类被重命名或移到其他包后，检查可能出现假阴性；这些检查只是运行时特征识别，无法防范刻意伪装。

### 其他信号及其局限

- **类是否可见：**使用模组类的类加载器，通过不触发类初始化的 `Class.forName` 调用探测
  `net.forbric.kernel.fabric.KernelFabricLoader`，可以确认内核类是否可见。
  这种方式不如检查实际使用的实例或定义类的加载器可靠：未被使用的 jar 也可能让该类可见。
  应处理 `ClassNotFoundException`，并将 `LinkageError` 与普通的类不存在情况分开报告。
- **Fabric 模组 ID：**不要依赖 `FabricLoader.getInstance().isModLoaded("forbric")`。
  内核会将 `minecraft`、`java` 和 `fabricloader` 注册为内置模组，
  其中后者的名称为 `Fabric Loader (Forbric kernel)`。
  `isModLoaded` 的实现只检查已注册的 ID／别名映射。
  `fabricloader` 元数据中的名称可作为辅助识别特征；其版本代表所实现的 Fabric Loader API 版本，
  而非 Forbric 的发行版本。参见
  [内置模组注册](https://github.com/Ray-T-r/Minecraft-Forbric-mod-loader/blob/520d7aad11cc7c9b8c8278b5f541e4429e1f7623/forbric-kernel/src/main/java/net/forbric/kernel/boot/KernelFabricEcosystem.java#L172-L184)
  和 [ID 查询](https://github.com/Ray-T-r/Minecraft-Forbric-mod-loader/blob/520d7aad11cc7c9b8c8278b5f541e4429e1f7623/forbric-kernel/src/main/java/net/forbric/kernel/fabric/KernelFabricLoader.java#L537-L549)。
- **旧版运行时模组：**第一代加载器的
  [运行时元数据](https://github.com/Ray-T-r/Minecraft-Forbric-mod-loader/blob/520d7aad11cc7c9b8c8278b5f541e4429e1f7623/forbric-loader/src/runtime-meta/fabric.mod.json)
  声明了 `forbricruntime`。它可以作为识别旧版加载器的线索，但当前内核并不要求存在这个 ID。
  上述针对当前内核的检查并不保证覆盖所有历史 Forbric 版本。
- **启动器配置：**内核安装器会将 `mainClass` 写为 `net.forbric.kernel.boot.KernelClientLaunch`，
  并写入包含 `declares` 和 `ecosystems` 的顶层 `forbric` 元数据对象。
  这些信息可用于离线检查已安装版本的 JSON 文件。
  启动器显示的 Fabric 标签不足以判断加载器：安装器为了兼容启动器，会特意声明 Fabric 坐标。
  独立服务器使用 `net.forbric.kernel.boot.KernelServerLaunch`。参见
  [安装器配置生成](https://github.com/Ray-T-r/Minecraft-Forbric-mod-loader/blob/520d7aad11cc7c9b8c8278b5f541e4429e1f7623/forbric-kernel-installer/src/main/java/net/forbric/installer/kernel/Installer.java#L115-L183)
  和 [服务器入口点](https://github.com/Ray-T-r/Minecraft-Forbric-mod-loader/blob/520d7aad11cc7c9b8c8278b5f541e4429e1f7623/forbric-kernel/src/main/java/net/forbric/kernel/boot/KernelServerLaunch.java)。
- **品牌标识与网络检测：**标题界面和 F3 界面的品牌标识可以显示 Forbric，
  但可通过 `-Dforbric.branding=off` 禁用。
  品牌标识转换器明确不会修改 `ClientBrandRetriever`，也不会修改 NeoForge 发送给服务器的品牌信息。
  因此，远程服务器无法仅凭客户端品牌信息可靠地识别 Forbric。参见
  [ForbricBrandingInjector](https://github.com/Ray-T-r/Minecraft-Forbric-mod-loader/blob/520d7aad11cc7c9b8c8278b5f541e4429e1f7623/forbric-kernel/src/main/java/net/forbric/kernel/transform/ForbricBrandingInjector.java#L32-L44)。
- **系统属性与文件：**`forbric.*` 开关和 `.forbric-kernel` 文件可作为诊断线索。
  这些开关可以在任意 JVM 中设置，文件也可能在切换加载器后残留；
  二者都无法证明当前正在运行 Forbric。
