package edu.calbaptist.android.dontopenthedoorgame;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class ToolbarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toolbar);
    }

    public void SoundButtonClick(View view) {

    }
    public void VibrateButtonClick(View view) {

    }
    public void AchievementsButtonClick(View view) {
        setContentView(R.layout.activity_themes);
    }
}
