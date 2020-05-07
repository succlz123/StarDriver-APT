package org.succlz123.stardriver.app.task;

import android.content.Context;

import org.succlz123.stardriver.IStarDriver;
import org.succlz123.stardriver.StarDriverInit;
import org.succlz123.stardriver.StarDriverResult;

@StarDriverInit(name = "Info Report", after = {AppInitLogger.class})
public class AppInitTaskInfoReporting extends IStarDriver {

    @Override
    public void initialize(Context context, StarDriverResult result) {
        try {
            Thread.sleep(66);
        } catch (InterruptedException e) {
            result.success = false;
            result.errorMessage = e.toString();
            return;
        }
        result.success = true;
    }
}