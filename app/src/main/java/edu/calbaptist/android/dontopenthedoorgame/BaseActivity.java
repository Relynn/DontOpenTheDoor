package edu.calbaptist.android.dontopenthedoorgame;

import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;

/**
 * Created by Charlie on 11/27/17.
 */

public class BaseActivity extends AppCompatActivity {
    private final static int THEME_FALL = 1;
    private final static int THEME_WINTER = 2;
    private final static int THEME_SPRING = 3;
    private final static int THEME_SUMMER = 4;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        updateTheme();
    }
    public void updateTheme() {
        if (Utility.getTheme(getApplicationContext()) <= THEME_FALL) {
            setTheme(R.style.AppTheme_Fall);
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                getWindow().addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            }
        } else if (Utility.getTheme(getApplicationContext()) == THEME_WINTER) {
            setTheme(R.style.AppTheme_Winter);
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                getWindow().addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            }
        }
        else if (Utility.getTheme(getApplicationContext()) == THEME_SPRING) {
            setTheme(R.style.AppTheme_Spring);
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                getWindow().addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            }
        }
        else if (Utility.getTheme(getApplicationContext()) == THEME_SUMMER) {
            setTheme(R.style.AppTheme_Summer);
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                getWindow().addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            }
        }
    }
}