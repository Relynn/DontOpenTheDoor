package edu.calbaptist.android.dontopenthedoorgame.database;

import android.database.Cursor;
import android.database.CursorWrapper;

import java.util.UUID;


import edu.calbaptist.android.dontopenthedoorgame.Player;
import edu.calbaptist.android.dontopenthedoorgame.database.DoorGameDbSchema.PlayerTable;

/**
 * Created by lynnreilly on 11/15/17.
 */

public class DoorGameCursorWrapper extends CursorWrapper{
    DoorGameCursorWrapper (Cursor cursor) {
        super(cursor);
    }

    public Player getPlayer() {
        String uuidString = getString(getColumnIndex(PlayerTable.Cols.UUID));
        String player = getString(getColumnIndex(PlayerTable.Cols.PLAYER));
        Double score = getDouble(getColumnIndex(PlayerTable.Cols.SCORE));

        Player p = new Player(UUID.fromString(uuidString));
        p.setPlayer(player);
        p.setScore(score);

        return p;
    }
}
