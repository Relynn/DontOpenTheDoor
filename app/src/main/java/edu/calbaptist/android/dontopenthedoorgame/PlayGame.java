package edu.calbaptist.android.dontopenthedoorgame;

import android.annotation.SuppressLint;
import android.graphics.drawable.AnimationDrawable;
import android.media.Image;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

/**
 *
 */
public class PlayGame extends AppCompatActivity {

    ImageView d1, d2, d3, d4;
    TextView tv_score;
    Button start_button;
    Random r;
    int score =0, fps = 1000;
    int which = 0, whichsave = 0;
    int templeft = 0, left = 1;

    AnimationDrawable an;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_game);

        r = new Random();

        start_button = (Button) findViewById(R.id.start_button);
        tv_score = (TextView) findViewById(R.id.tv_score);
        d1 = (ImageView) findViewById(R.id.d1);
        d2 = (ImageView) findViewById(R.id.d2);
        d3 = (ImageView) findViewById(R.id.d3);
        d4 = (ImageView) findViewById(R.id.d4);

        d1.setVisibility(View.INVISIBLE);
        d2.setVisibility(View.INVISIBLE);
        d3.setVisibility(View.INVISIBLE);
        d4.setVisibility(View.INVISIBLE);

        start_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                score = 0;
                left = 1;
                tv_score.setText("SCORE: " + score);
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        theGameActions();
                    }

                }, 1000);
                start_button.setEnabled(false);
            }
        });

        d1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                templeft = 1;
                d1.setImageResource(R.drawable.door1);
                score=score+1;
                tv_score.setText("SCORE: " + score);
                d1.setEnabled(false);
            }
        });
        d2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                templeft = 1;
                d2.setImageResource(R.drawable.door2);
                score=score+1;
                tv_score.setText("SCORE: " + score);
                d2.setEnabled(false);
            }
        });

        d3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                templeft = 1;
                d3.setImageResource(R.drawable.door3);
                score=score+1;
                tv_score.setText("SCORE: " + score);
                d3.setEnabled(false);
            }
        });
        d4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                templeft = 1;
                d4.setImageResource(R.drawable.door4);
                score=score+1;
                tv_score.setText("SCORE: " + score);
                d4.setEnabled(false);

            }
        });
    }

    private void theGameActions(){
        if(score < 10 ){
            fps = 1000;
        }
        else if(score >= 10 && score <20){
            fps = 950;
        }
        else if(score >= 20 && score <30){
            fps = 900;
        }
        else if(score >= 30 && score <40){
            fps = 850;
        }
        else if(score >= 40 && score <50){
            fps = 800;
        }
        else if(score >= 50 && score <60){
            fps = 750;
        }
        else if(score >= 60 && score <70){
            fps = 700;
        }
        else if(score >= 70 && score <80){
            fps = 650;
        }
        else if(score >= 80 && score <90){
            fps = 600;
        }
        else if(score >= 90 && score <100){
            fps = 550;
        }
        else if(score >= 100){
            fps = 400;
        }
        an = (AnimationDrawable) ContextCompat.getDrawable(this, R.drawable.anim);

        do{
            which = r.nextInt(4) +1;
        } while(whichsave == which);
        whichsave = which;

        if(which == 1){
            d1.setImageDrawable(an);
            d1.setVisibility(View.VISIBLE);
            d1.setEnabled(true);
        } else if(which == 2){
            d2.setImageDrawable(an);
            d2.setVisibility(View.VISIBLE);
            d2.setEnabled(true);
        } else if(which == 3){
            d3.setImageDrawable(an);
            d3.setVisibility(View.VISIBLE);
            d3.setEnabled(true);
        } else if(which == 4){
            d4.setImageDrawable(an);
            d4.setVisibility(View.VISIBLE);
            d4.setEnabled(true);
        }

        an.start();

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                d1.setVisibility(View.INVISIBLE);
                d2.setVisibility(View.INVISIBLE);
                d3.setVisibility(View.INVISIBLE);
                d4.setVisibility(View.INVISIBLE);

                d1.setEnabled(false);
                d2.setEnabled(false);
                d3.setEnabled(false);
                d4.setEnabled(false);

                if(templeft == 0){
                    left = left -1;
                } else if(templeft ==1){
                    templeft = 0;
                }

                if(left== 0){
                    Toast.makeText(PlayGame.this, "GAME OVER", Toast.LENGTH_SHORT).show();
                    start_button.setEnabled(true);
                } else if(left > 0){
                    theGameActions();
                }
            }
        }, fps);

    }

}
