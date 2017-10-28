package edu.calbaptist.android.dontopenthedoorgame;

import android.content.Context;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

public class GamePlayActivity extends SurfaceView implements SurfaceHolder.Callback {

    private GameThread thread;  // Initialize GameThread

    /**
     * Constructor
     * @param context
     */
    public GamePlayActivity(Context context) {
        super(context);

        getHolder().addCallback(this);  // Callback is set to the SurfaceView so events get triggered from here

        thread = new GameThread(getHolder(), this);

        setFocusable(true);
    }

    @Override
    public void surfaceCreated(SurfaceHolder holder) {
        thread.setRunning(true);    // When surface is created thread is set to true
        thread.start();             // Starts thread
    }

    @Override
    public void surfaceChanged (SurfaceHolder holder, int format, int width, int height) {

    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {
        boolean retry = true;
        while (retry) {
            try{
                thread.setRunning(false);
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            retry = false;
        }
    }

    public void update() {

    }
}
