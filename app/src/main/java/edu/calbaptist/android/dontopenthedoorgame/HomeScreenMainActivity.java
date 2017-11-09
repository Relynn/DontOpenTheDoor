package edu.calbaptist.android.dontopenthedoorgame;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;

public class HomeScreenMainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen_main); // Home Screen
        Button playButton = (Button)findViewById(R.id.play_button);
        Button leaderboardButton = (Button)findViewById(R.id.leaderboard_button);

        //Adds Background Music
        MediaPlayer player = MediaPlayer.create(this, R.raw.scary);
        player.setLooping(true);
        player.start();
    }

//    @Override
//    protected void onResume() {
//        super.onResume();
//        ListFragment listFragment = (ListFragment) getFragmentManager().findFragmentById(R.id.listFragment);
//
//
//        ArrayAdapter adapter = (ArrayAdapter) listFragment.getListAdapter();
//        adapter.clear();
//        adapter.addAll(dbHelper.getAllPlayers());
//        adapter.notifyDataSetChanged();

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        //inflater.inflate(R.menu.toolbar_main, menu);
        return true;
    }

    public void PlayButtonClick(View view) {
        setContentView(R.layout.activity_difficulty_selection); // Goes to game difficulty selection: {easy, medium, hard}

}

    public void LeaderboardButtonClick(View view) {
        setContentView(R.layout.activity_leaderboard); // Goes to leaderboard

    }

}