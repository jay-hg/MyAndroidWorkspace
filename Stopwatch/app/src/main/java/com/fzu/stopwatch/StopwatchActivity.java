package com.fzu.stopwatch;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class StopwatchActivity extends AppCompatActivity {

    private int seconds = 0;
    private boolean running = false;
    private boolean wasRunning = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stopwatch);
        if(savedInstanceState != null) {
            running = savedInstanceState.getBoolean("running");
            seconds = (int)savedInstanceState.getLong("seconds");
        }
        runTimer();
    }

    public void onClickStart(View view) {
        running = true;
    }

    public void onClickStop(View view) {
        running = false;
        wasRunning = false;
    }

    public void onClickReset(View view) {
        seconds = 0;
        running = false;
        wasRunning = false;
    }

    private void runTimer() {
        final TextView timer = (TextView) findViewById(R.id.timer);
        final Handler handler = new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {
                int hours = seconds/3600;
                int minutes = (seconds/60)%60;
                int sec = seconds%60;
                String time = String.format("%d:%02d:%02d",hours,minutes,sec);
                timer.setText(time);
                if(running) seconds ++;
                handler.postDelayed(this,1000);
            }
        });
    }

    @Override
    protected void onStop() {
        super.onStop();
        wasRunning = running;
        running = false;
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putLong("seconds",seconds);
        outState.putBoolean("running",running);
    }

    @Override
    protected void onStart() {
        running = wasRunning;
        super.onStart();
    }

    @Override
    protected void onPause() {
        super.onPause();
        wasRunning = running;
        running = false;
    }

    @Override
    protected void onResume() {
        super.onResume();
        running = wasRunning;
    }
}
