package edu.calbaptist.android.dontopenthedoorgame;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ThemesActivity extends BaseActivity implements View.OnClickListener {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_themes);
        ((ImageButton)findViewById(R.id.fall_button)).setOnClickListener(this);
        ((ImageButton)findViewById(R.id.winter_button)).setOnClickListener(this);
        ((ImageButton)findViewById(R.id.spring_button)).setOnClickListener(this);
        ((ImageButton)findViewById(R.id.summer_button)).setOnClickListener(this);
        ((Button)findViewById(R.id.original_theme_button)).setOnClickListener(this);
        ((Button)findViewById(R.id.exit_button)).setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.fall_button:
                Utility.setTheme(getApplicationContext(), 1);
                recreateActivity();
                break;
            case R.id.winter_button:
                Utility.setTheme(getApplicationContext(), 2);
                recreateActivity();
                break;
            case R.id.spring_button:
                Utility.setTheme(getApplicationContext(), 3);
                recreateActivity();
                break;
            case R.id.summer_button:
                Utility.setTheme(getApplicationContext(), 4);
                recreateActivity();
                break;
        }
    }
    public void recreateActivity() {
        Intent intent = getIntent();
        intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
        finish();
        overridePendingTransition(0, 0);
        startActivity(intent);
        overridePendingTransition(0, 0);
    }

}