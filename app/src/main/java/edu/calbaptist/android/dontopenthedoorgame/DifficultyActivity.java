package edu.calbaptist.android.dontopenthedoorgame;

import android.app.Activity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Charlie on 11/7/17.
 */

public class DifficultyActivity extends Activity {


    Button mediumButton = (Button)findViewById(R.id.medium_button);
    Button hardButton = (Button)findViewById(R.id.hard_button);

    public void EasyButtonClick(View view) {
        Button easyButton = (Button)findViewById(R.id.easy_button);
        setContentView(R.layout.activity_easy_gameplay);
    }

    public void MediumButtonClick(View view) {

        setContentView(R.layout.activity_medium_gameplay);
    }
    public void HardButtonClick(View view) {

        setContentView(R.layout.activity_hard_gameplay);
    }
}
