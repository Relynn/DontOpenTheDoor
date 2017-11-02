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


        ArrayAdapter adapter = (ArrayAdapter) listFragment.getListAdapter();
        adapter.clear();
        adapter.addAll(dbHelper.getAllPlayers());
        adapter.notifyDataSetChanged();
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