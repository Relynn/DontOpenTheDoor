package edu.calbaptist.android.dontopenthedoorgame;

import android.app.Activity;
import android.view.View;

/**
 * Created by Charlie on 11/7/17.
 */

public class DifficultyActivity extends Activity {

    public void EasyButtonClick(View view) {
        setContentView(R.layout.activity_easy_gameplay);
    }

    public void MediumButtonClick(View view) {
        setContentView(R.layout.activity_medium_gameplay);
    }
    public void HardButtonClick(View view) {
        setContentView(R.layout.activity_hard_gameplay);
    }
}
