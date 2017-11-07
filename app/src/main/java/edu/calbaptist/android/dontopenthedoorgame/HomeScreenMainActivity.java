package edu.calbaptist.android.dontopenthedoorgame;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class HomeScreenMainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen_main);
    }

    public void PlayButtonClick(View view) {
        setContentView(R.layout.activity_game_play); // Brand new surface view to render game rather than xml

}

    public void LeaderboardButtonClick(View view) {
        setContentView(R.layout.activity_leaderboard); // Goes to leaderboard

    }

}