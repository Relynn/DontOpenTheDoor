package edu.calbaptist.android.dontopenthedoorgame;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;


public class HomeScreenMainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_home_screen_main); // Home Screen
        Button play_button = (Button) findViewById(R.id.play_button);
        Button leaderboardButton = (Button)findViewById(R.id.leaderboard_button);
        Button theme_button = (Button) findViewById(R.id.theme_button);

        // Alert Dialog greeting that suggests user to use headphones
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                AlertDialog.Builder builder = new AlertDialog.Builder(HomeScreenMainActivity.this, R.style.AlertDialogCustom)
                        .setTitle("Note:")
                        .setMessage("Plugging in headphones can enhance the game play experience!");
                AlertDialog alertdialog = builder.create();
                alertdialog.show();
            }
        }, 2000);

        //Adds Background Music
        MediaPlayer player = MediaPlayer.create(this, R.raw.scary);
        player.setLooping(true);
        player.start();
    }

    public void PlayButtonClick(View view) {
        //setContentView(R.layout.activity_difficulty_selection); // Goes to game difficulty selection: {easy, medium, hard}
        Intent intent = new Intent(HomeScreenMainActivity.this, DifficultyActivity.class);
        startActivity(intent);
    }

    public void LeaderboardButtonClick(View view) {
        Intent intent = new Intent(HomeScreenMainActivity.this, Leaderboard.class);
        startActivity(intent);
    }

    public void ThemeButtonClick(View view) {
        Intent intent = new Intent(HomeScreenMainActivity.this, ThemesActivity.class);
        startActivity(intent);
    }

}