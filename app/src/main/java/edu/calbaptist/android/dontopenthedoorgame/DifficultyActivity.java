package edu.calbaptist.android.dontopenthedoorgame;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
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
    }

    public void EasyButtonClick(View view) {
        setContentView(R.layout.activity_easy_gameplay);
    }

    public void MediumButtonClick(View view) {
        setContentView(R.layout.activity_medium_gameplay);
    }

    public void HardButtonClick(View view) {
        //setContentView(R.layout.activity_hard_gameplay);
        Intent intent = new Intent(DifficultyActivity.this, PlayGame.class);
        startActivity(intent);
    }
}
