package edu.calbaptist.android.dontopenthedoorgame;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class HomeScreenMainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen_main); // Home Screen
    }

    public void PlayButtonClick(View view) {
        setContentView(R.layout.activity_difficulty_selection); // Goes to game difficulty selection: {easy, medium, hard}

}

    public void LeaderboardButtonClick(View view) {
        setContentView(R.layout.activity_leaderboard); // Goes to leaderboard

    }

}