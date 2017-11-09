package edu.calbaptist.android.dontopenthedoorgame;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;


public class GamePlayActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen_main); // Home Screen
        Button playButton = (Button)findViewById(R.id.play_button);
        Button leaderboardButton = (Button)findViewById(R.id.leaderboard_button);


    }

//    boolean running = true;
//
//    while(running)
//    {
//        updateGameState();
//        displayGameState();
//
//        if (correctDoorClicked() == true){
//             // game should load new screen w/ randomized correct door
//             // and randomized green arrow with it. Score is updated
//        }
//        else {
//             // if not clicked in the right amount of time, while loop
//             // stops and game play is destroyed.
//
//             // if score is greater than any of the top 3 scores, it takes
//             // the place of the score's position it beats. A dialog toast
//             // pops up with info to fill out for new score save.
//             // if not a new score then score is displayed in pop up with
//             // a continue button that takes you to the leaderboard screen.
//        }
//    }
//
//
//
//    private void displayGameState() {
//    }
//
//    private boolean correctDoorClicked() {
//
//    }
//
//    private void updateGameState() {
//
//     }
//     /**
//     *
//     * Tests dialog for New High Score pop up
//     *
//     @Override
//     protected void onCreate(Bundle savedInstanceState) {
//     super.onCreate(savedInstanceState);
//
//     Button mDialogNewScore = (Button) findViewById(R.id.new_score_test);
//     mDialogNewScore.setOnClickListener(new View.OnClickListener() {
//     @Override
//     public void onClick(View view) {
//     AlertDialog.Builder mBuilder = new AlertDialog.Builder(GamePlayActivity.this);
//     View mView = getLayoutInflater().inflate(R.layout.dialog_new_high_score, null);
//     final EditText mPlayerName = (EditText) mView.findViewById(R.id.player_name);
//     Button mSaveScore = (Button) mView.findViewById(R.id.save_score_button);
//
//     mSaveScore.setOnClickListener(new View.OnClickListener() {
//     @Override
//     public void onClick(View view) {
//     if (!mPlayerName.getText().toString().isEmpty()) {
//     Toast.makeText(GamePlayActivity.this,
//     R.string.success_save_msg,
//     Toast.LENGTH_SHORT).show();
//     } else {
//     Toast.makeText(GamePlayActivity.this,
//     R.string.error_save_msg,
//     Toast.LENGTH_SHORT).show();
//     }
//     }
//     });
//
//     mBuilder.setView(mView);
//     AlertDialog dialog = mBuilder.create();
//     dialog.show();
//     }
//     });
//     }
//
//     **/

}

