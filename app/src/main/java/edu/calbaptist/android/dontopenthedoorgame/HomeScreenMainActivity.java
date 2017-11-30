package edu.calbaptist.android.dontopenthedoorgame;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
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

        //AlertDialog suggesting user to plug in headphones for a better experience
//        AlertDialog.Builder mBuilder = new AlertDialog.Builder(HomeScreenMainActivity.this)
//                .setMessage("Note: To enhance your experience we recommend plugging in headphones to get the full effect.");
//            AlertDialog alert = mBuilder.create();
//            alert.show();


//        View mView = getLayoutInflater().inflate(R.layout.dialog_greeting, null);
//        TextView gMessage = (TextView) mView.findViewById(R.id.greeting);
//        mBuilder.setView(mView);
//        AlertDialog dialog = mBuilder.create();
//        dialog.show();

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