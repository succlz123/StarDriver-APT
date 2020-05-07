package org.succlz123.stardriver.app.task;

import android.content.Context;

import org.succlz123.stardriver.StarDriverInit;
import org.succlz123.stardriver.StarDriverResult;
import org.succlz123.stardriver.IStarDriver;

@StarDriverInit(name = "Crash Tracking", after = {AppInitTaskInfoReporting.class})
public class AppInitCrashTracking extends IStarDriver {

    @Override
    public void initialize(Context context, StarDriverResult result) {
        try {
            Thread.sleep(12);
            throw new NullPointerException();
        } catch (Exception e) {
            result.success = false;
            result.errorMessage = e.toString();
        }
    }
}