package edu.calbaptist.android.dontopenthedoorgame;

import android.graphics.Canvas;
import android.view.SurfaceHolder;

/**
 * Created by Charlie on 10/27/17.
 *
 * This is the thread for the game loop. Game runs through
 * this loop once every frame. There are a set amount of methods
 * that run per frame.
 */

public class GameThread extends Thread {

    private int FPS = 30;       // Frames per second
    private double avgFPS;      // Average Frames per second to test amount of FPS on average
    private SurfaceHolder surfaceHolder;
    private GamePlayActivity game;      // Instance of game
    private boolean running;        // Tests: is game running?
    public static Canvas canvas;        // Canvas to draw on

    /**
     * Constructor
     * @param surfaceHolder
     * @param game
     */

    public GameThread(SurfaceHolder surfaceHolder, GamePlayActivity game) {
        super();
        this.surfaceHolder = surfaceHolder;
        this.game = game;
    }

    @Override
    public void run() {
        long startTime;
        long timeMillis;
        long waitTime;
        long totalTime = 0;
        int frameCount = 0;
        long targetTime = 1000/FPS;

        while (running) {
            startTime = System.nanoTime();
            canvas = null;      // initialize canvas

            try {
                canvas = this.surfaceHolder.lockCanvas();
                // Game loop is within this container
                // this is where everything is updated
                synchronized (surfaceHolder) {
                    this.game.update();
                    this.game.draw(canvas);
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                if (canvas != null) {
                    try {
                        surfaceHolder.unlockCanvasAndPost(canvas);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
            timeMillis = (System.nanoTime() - startTime) / 1000000;    // Time in milliseconds after loop occurred
            waitTime = targetTime - timeMillis;

            try {
                this.sleep(waitTime);
            } catch (Exception e) {
                e.printStackTrace();
            }

            // Calculates average FPS and prints it out
            totalTime += System.nanoTime() - startTime;
            frameCount++;
            if (frameCount == FPS) {
                avgFPS = 1000 / ((totalTime / frameCount) / 1000000);
                frameCount = 0;
                totalTime = 0;
                System.out.println(avgFPS);
            }
        }
    }

    /**
     * Starts and kills game
     * @param isRunning
     */

    public void setRunning (boolean isRunning) {
        running = isRunning;
    }
}