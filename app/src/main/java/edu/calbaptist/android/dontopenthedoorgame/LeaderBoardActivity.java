package edu.calbaptist.android.dontopenthedoorgame;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;

import java.util.UUID;

public class LeaderBoardActivity extends Activity {

    private static final String EXTRA_PLAYER_ID =
            "edu.calbaptist.android.dontopenthedoorgame.player_id";

    public static Intent newIntent(Context packageContext, UUID playerId) {
        Intent intent = new Intent(packageContext, LeaderBoardActivity.class);
        intent.putExtra(EXTRA_PLAYER_ID, playerId);
        return intent;
    }

//    @Override
//    protected Fragment createFragment() {
//        UUID playerId = (UUID) getIntent()
//                .getSerializableExtra(EXTRA_PLAYER_ID);
//        return LeaderBoardFragment.newInstance(playerId);
//    }
}
