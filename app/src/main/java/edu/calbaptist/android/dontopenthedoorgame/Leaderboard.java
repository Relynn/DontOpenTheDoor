package edu.calbaptist.android.dontopenthedoorgame;

import android.app.Activity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

/**
 * Created by lynnreilly on 10/25/17.
 */

public class Leaderboard extends Activity {

    public void ContinueButtonClick(View view) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_home_screen_main);

    }
    public void ShareButtonClick(View view) {

    }
}
