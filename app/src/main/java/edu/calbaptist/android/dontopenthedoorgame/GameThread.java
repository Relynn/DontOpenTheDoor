//package edu.calbaptist.android.dontopenthedoorgame;
//
//import android.util.Log;
//
//import static android.content.ContentValues.TAG;
//
///**
// * Created by Charlie on 10/27/17.
// *
// * This is the thread for the game loop. Game runs through
// * this loop once every frame. There are a set amount of methods
// * that run per frame.
// */
//
//public class GameThread extends Thread {
//    private final static int FRAMES_PER_SECOND = 25;
//    private final static int SKIP_TICKS = 1000/FRAMES_PER_SECOND;
//    private final static int MAX_FRAMESKIP = 10;
//
//    int loops;
//
//
//
//    public void run() {
//        Log.d(TAG, "Starting game loop");
//
//        long beginTime; // Time when the cycle begun
//        int endTime;    // Time (ms) when game
//        loops = 0;
//
//        while(loops < MAX_FRAMESKIP) {
//            update_game();
//
//            loops++;
//        }
//        display_game();
//    }
//}