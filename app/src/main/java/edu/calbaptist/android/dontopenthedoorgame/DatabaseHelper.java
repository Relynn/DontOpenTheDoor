package edu.calbaptist.android.dontopenthedoorgame;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lynnreilly on 10/25/17.
 */

public class DatabaseHelper {

    private static final String TAG = "DatabaseHelper";

    private static DatabaseHelper dbHelper = null;
    private SQLiteDatabase database = null;

    private static final String DATABASE_NAME = "dotd.db";
    private static final int DATABASE_VERSION = 1;

    public static DatabaseHelper getInstance(Context context) {
        if (dbHelper == null) {
            dbHelper = new DatabaseHelper(context.getApplicationContext());
        }
        return dbHelper;
    }

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    public void open() throws SQLException {
        database = getWritableDatabase();
    }

    public void close() {
        close();
    }

    public Player createPlayer(String player, Double score) {
        ContentValues values = new ContentValues();
        values.put("player", player);
        values.put("score", score);

        long insertId = database.insert("PLAYERS", null, values);

        if (insertId != -1) {
            return new Player(insertId, player, score);
        }

        Log.e(TAG, "Error inserting data!");
        return null;
    }



    public List<Player> getAllPlayers() {
        List<Player> player = new ArrayList<Student>();

        Cursor cursor = database.rawQuery("select * from players", null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            Player student = new Player();
            student.setId(cursor.getLong(0));
            student.setPlayer(cursor.getString(1));
            student.setScore(cursor.getString(2));
            player.add(student);
            cursor.moveToNext();
        }
        cursor.close();
        return player;
    }


}
