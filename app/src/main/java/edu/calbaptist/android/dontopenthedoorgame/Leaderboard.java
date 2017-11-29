package edu.calbaptist.android.dontopenthedoorgame;

import android.app.Activity;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.UUID;

/**
 * Created by lynnreilly on 10/25/17.
 */

public class Leaderboard extends Activity {

    protected SQLiteDatabase db;

    ArrayList<String> addArray = new ArrayList<String>();
    ListView show;
    Button bContinue;
    Button bShare;
    Intent shareIntent;
    String shareMessage = "My top 3 high scores for Don't Open The Door are: "
            + ", "
            + ", "
            + "! Can you beat my score?";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leaderboard);


       // db = (new DatabaseHelper(this)).getReadableDatabase();

       // db = (new DatabaseHelper(this)).getReadableDatabase();

        //Adds Background Music
        MediaPlayer player = MediaPlayer.create(this, R.raw.scary);
        player.setLooping(true);
        player.start();



        bContinue = (Button) findViewById(R.id.continue_button);
        bContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
                //
            }
        });

        bShare = (Button) findViewById(R.id.share_button);
        bShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                shareIntent = new Intent(android.content.Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                shareIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "My App");
                shareIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareMessage);
                startActivity(Intent.createChooser(shareIntent, "Share via"));
            }
        });

    }

    public void ContinueButtonClick(View view) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.activity_home_screen_main);

    }
}
