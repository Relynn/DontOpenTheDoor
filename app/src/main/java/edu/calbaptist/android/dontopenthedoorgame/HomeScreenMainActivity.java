package edu.calbaptist.android.dontopenthedoorgame;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class HomeScreenMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);             // App is created

        setContentView(R.layout.activity_home_screen_main); // Brand new surface view to render game rather than xml
    }
    public void PlayButtonClick(View view) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);  // Removes title
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);    // Makes game fullscreen
        setContentView(new GamePlayActivity(this)); // Brand new surface view to render game rather than xml

    }
}