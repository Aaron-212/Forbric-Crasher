package com.aaron212.forbriccrasher.fabric;

import com.aaron212.forbriccrasher.ForbricCrasher;
import net.fabricmc.api.ModInitializer;

public final class ForbricCrasherFabric implements ModInitializer {

    @Override
    public void onInitialize() {
        // Run our common setup.
        ForbricCrasher.init();
    }
}
