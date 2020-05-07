package org.succlz123.stardriver.app;

import org.succlz123.stardriver.StarDriverInit;
import org.succlz123.stardriver.app.task.AppInitAccountInfo;
import org.succlz123.stardriver.app.task.AppInitCrashTracking;
import org.succlz123.stardriver.app.task.AppInitLogger;
import org.succlz123.stardriver.app.task.AppInitTaskSDKA;
import org.succlz123.stardriver.app.task.AppInitTaskSDKB;

public class AppInitTaskHelper {

    @StarDriverInit(name = "Application logger")
    public AppInitLogger logger;

    @StarDriverInit(name = "SDK A", after = {AppInitCrashTracking.class, AppInitTaskSDKB.class}, before = {AppInitAccountInfo.class})
    public AppInitTaskSDKA sdkA;

    @StarDriverInit(name = "SDK B", after = {AppInitCrashTracking.class}, before = {AppInitAccountInfo.class})
    public AppInitTaskSDKB sdkB;
}
