package edu.calbaptist.android.dontopenthedoorgame;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.view.SurfaceHolder;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class GamePlayActivity extends Activity {



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
}
