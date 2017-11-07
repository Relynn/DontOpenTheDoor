package edu.calbaptist.android.dontopenthedoorgame;

/**
 * Created by lynnreilly on 10/25/17.
 */

public class DatabaseHelper
//        extends SQLiteOpenHelper
{
//
//    private static final String TAG = "DatabaseHelper";
//
//    private static DatabaseHelper dbHelper = null;
//    private SQLiteDatabase database = null;
//
//    private static final String DATABASE_NAME = "dotd.db";
//    private static final int DATABASE_VERSION = 1;
//
//    public static DatabaseHelper getInstance(Context context) {
//        if (dbHelper == null) {
//            dbHelper = new DatabaseHelper(context.getApplicationContext());
//        }
//        return dbHelper;
//    }
//
//    public DatabaseHelper(Context context) {
//        super(context, DATABASE_NAME, null, DATABASE_VERSION);
//    }
//
//    public void open() throws SQLException {
//        database = getWritableDatabase();
//
//        database.execSQL("CREATE TABLE IF NOT EXISTS PLAYERS(" +
//                "id INTEGER PRIMARY KEY, " +
//                "player TEXT NOT NULL, " +
//                "code DOUBLE);");
//    }
//
//    public void close() {
//        close();
//    }
//
//    public Player createPlayer(String player, Double score) {
//        ContentValues values = new ContentValues();
//        values.put("player", player);
//        values.put("score", score);
//
//        long insertId = database.insert("PLAYERS", null, values);
//
//        if (insertId != -1) {
//            return new Player(insertId, player, score);
//        }
//
//        Log.e(TAG, "Error inserting data!");
//        return null;
//    }
//
//
//
//    public List<Player> getAllPlayers() {
//        List<Player> player = new ArrayList<Player>();
//
//        Cursor cursor = database.rawQuery("select * from players", null);
//        cursor.moveToFirst();
//        while (!cursor.isAfterLast()) {
//            Player p = new Player();
//            p.setId(cursor.getLong(0));
//            p.setPlayer(cursor.getString(1));
//            p.setScore(cursor.getDouble(2));
//            player.add(p);
//            cursor.moveToNext();
//        }
//        cursor.close();
//        return player;
//    }
//
//    @Override
//    public void onCreate(SQLiteDatabase database) {
//        database.execSQL("CREATE TABLE IF NOT EXISTS PLAYERS(" +
//                "id INTEGER PRIMARY KEY, " +
//                "player TEXT NOT NULL, " +
//                "code DOUBLE);");
//    }
//
//
//    @Override
//    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
//        Log.i(TAG, "Upgrading database from version " + oldVersion + " to "
//                + newVersion);
//        db.execSQL("DROP TABLE IF EXISTS PLAYERS");
//        onCreate(db);
//    }

}