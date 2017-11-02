package edu.calbaptist.android.dontopenthedoorgame;

import android.app.ListFragment;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ArrayAdapter;

public class HomeScreenMainActivity extends AppCompatActivity {
    private DatabaseHelper dbHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);             // App is created
        setContentView(R.layout.activity_home_screen_main); // Brand new surface view to render game rather than xml
        dbHelper = DatabaseHelper.getInstance(this);
        dbHelper.open();
    }

    @Override
    protected void onResume() {
        super.onResume();
        ListFragment listFragment = (ListFragment) getFragmentManager().findFragmentById(R.id.listFragment);


        //ListFragment listFragment2 = (ListFragment) findViewById(R.id.listFragment2);
        ArrayAdapter adapter = (ArrayAdapter) listFragment.getListAdapter();
        //ArrayAdapter adapter2 = (ArrayAdapter) listFragment2.getListAdapter();
        adapter.clear();
        //adapter2.clear();
        adapter.addAll(dbHelper.getAllPlayers());
        //adapter2.addAll(dbHelper.getAllCourses());
        adapter.notifyDataSetChanged();
        //adapter2.notifyDataSetChanged();
    }
    public void PlayButtonClick(View view) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);  // Removes title
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);    // Makes game fullscreen
        setContentView(new GamePlayActivity(this)); // Brand new surface view to render game rather than xml

    }
    public void LeaderboardButtonClick(View view) {
        setContentView(R.layout.activity_share); // Goes to leaderboard

    }
}