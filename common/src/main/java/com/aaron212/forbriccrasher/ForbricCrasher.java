package com.aaron212.forbriccrasher;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class ForbricCrasher {

    public static final String MOD_ID = "forbric_crasher";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static void init() {
        if (isForbric()) {
            LOGGER.error("Forbric detected!");
            crash();
        } else {
            LOGGER.info("Forbric not detected, passing.");
        }
    }

    private static boolean isForbric() {
        for (ClassLoader loader = ForbricCrasher.class.getClassLoader(); loader != null; loader = loader.getParent()) {
            if (loader.getClass().getName().equals("net.forbric.kernel.classloading.ForbricClassLoader")) {
                return true;
            }
        }
        return false;
    }

    public static void crash() {
        // Forbric catches mod initialization exceptions; halt bypasses its recovery and JVM shutdown hooks.
        Runtime.getRuntime().halt(1);
    }
}
