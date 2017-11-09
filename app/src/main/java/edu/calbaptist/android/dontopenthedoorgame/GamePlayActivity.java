package edu.calbaptist.android.dontopenthedoorgame;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.view.SurfaceHolder;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import edu.calbaptist.android.dontopenthedoorgame.database.DoorGameBaseHelper;
import edu.calbaptist.android.dontopenthedoorgame.database.DoorGameDbSchema;

import static edu.calbaptist.android.dontopenthedoorgame.database.DoorGameDbSchema.PlayerTable.*;


public class GamePlayActivity extends Activity {
     private static GamePlayActivity sGamePlayActivity;

//    boolean running = true;
//    while (!running)
//    {
//        updateGameState();
//        displayGameState();
//    }


     private Context mContext;
     private SQLiteDatabase mDatabase;

     public static GamePlayActivity get(Context context) {
         if (sGamePlayActivity == null) {
             sGamePlayActivity = new GamePlayActivity(context);
         }
         return sGamePlayActivity;
     }

     private GamePlayActivity(Context context) {
          mContext = context.getApplicationContext();
          mDatabase = new DoorGameBaseHelper(mContext).getWritableDatabase();

     }

     public void addPlayer(Player p) {
         ContentValues values = getContentValues(p);

         mDatabase.insert(NAME, null, values);

     }

     public List<Player> getPlayers() {
          return new ArrayList<>();
     }

     public Player getPlayer(UUID id) {
          return null;
     }

     public void updateCrime(Player p) {
        String uuidString = p.getId().toString();
        ContentValues values = getContentValues(p);

        mDatabase.update(NAME, values,
                DoorGameDbSchema.Cols.UUID + " = ?",
                new String[] { uuidString });
    }

     private static ContentValues getContentValues(Player p) {
          ContentValues values = new ContentValues();
          values.put(DoorGameDbSchema.Cols.UUID, p.getId().toString());
          values.put(DoorGameDbSchema.Cols.PLAYER, p.getPlayer());
          values.put(DoorGameDbSchema.Cols.SCORE, p.getScore());
          return values;
     }

    /**
     *
     * Tests dialog for New High Score pop up
     *
     @Override
     protected void onCreate(Bundle savedInstanceState) {
     super.onCreate(savedInstanceState);

     Button mDialogNewScore = (Button) findViewById(R.id.new_score_test);
     mDialogNewScore.setOnClickListener(new View.OnClickListener() {
     @Override
     public void onClick(View view) {
     AlertDialog.Builder mBuilder = new AlertDialog.Builder(GamePlayActivity.this);
     View mView = getLayoutInflater().inflate(R.layout.dialog_new_high_score, null);
     final EditText mPlayerName = (EditText) mView.findViewById(R.id.player_name);
     Button mSaveScore = (Button) mView.findViewById(R.id.save_score_button);

     mSaveScore.setOnClickListener(new View.OnClickListener() {
     @Override
     public void onClick(View view) {
     if (!mPlayerName.getText().toString().isEmpty()) {
     Toast.makeText(GamePlayActivity.this,
     R.string.success_save_msg,
     Toast.LENGTH_SHORT).show();
     } else {
     Toast.makeText(GamePlayActivity.this,
     R.string.error_save_msg,
     Toast.LENGTH_SHORT).show();
     }
     }
     });

     mBuilder.setView(mView);
     AlertDialog dialog = mBuilder.create();
     dialog.show();
     }
     });
     }

     **/

}

