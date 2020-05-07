package org.succlz123.stardriver.app.task;

import android.content.Context;

import org.succlz123.stardriver.StarDriverInit;
import org.succlz123.stardriver.StarDriverResult;
import org.succlz123.stardriver.IStarDriver;

@StarDriverInit(name = "Account Info")
public class AppInitAccountInfo extends IStarDriver {

    @Override
    public void initialize(Context context, StarDriverResult result) {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            result.success = false;
            result.errorMessage = e.toString();
            return;
        }
        result.success = true;
    }
}
