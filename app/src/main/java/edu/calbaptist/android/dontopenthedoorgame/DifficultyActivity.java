package edu.calbaptist.android.dontopenthedoorgame;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.Window;
import android.view.WindowManager;

/**
 * Created by Charlie on 11/7/17.
 */

public class DifficultyActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_difficulty_selection);

        Button easyButton = (Button)findViewById(R.id.easy_button);
        Button mediumButton = (Button)findViewById(R.id.medium_button);
        Button hardButton = (Button)findViewById(R.id.hard_button);

    }

    public void EasyButtonClick(View view) {

        setContentView(R.layout.activity_easy_gameplay);
    }

    public void MediumButtonClick(View view) {

        setContentView(R.layout.activity_medium_gameplay);
    }


    public void HardButtonClick(View view) {
        Intent intent = new Intent(DifficultyActivity.this, PlayGame.class);
        startActivity(intent);
        setContentView(R.layout.activity_hard_gameplay);
    }
}
