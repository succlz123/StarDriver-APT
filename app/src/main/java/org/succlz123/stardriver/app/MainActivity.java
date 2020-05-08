package org.succlz123.stardriver.app;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import org.succlz123.stardriver.R;
import org.succlz123.stardriver.StarDriverManager;
import org.succlz123.stardriver.StarDriverStatistics;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv = findViewById(R.id.content);
        ArrayList<StarDriverStatistics> results = StarDriverManager.inject(this.getApplication());
        for (StarDriverStatistics result : results) {
            tv.append(result.name + "\nsuccess: " + result.success + " time: " + result.useTime + "ms\n");
            if (!result.success && result.errorMessage != null) {
                tv.append("message: " + result.errorMessage + "\n\n");
            } else {
                tv.append("\n");
            }
        }
    }
}
