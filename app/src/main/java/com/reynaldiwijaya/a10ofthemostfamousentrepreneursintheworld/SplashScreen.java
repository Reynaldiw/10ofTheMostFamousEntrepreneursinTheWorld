package com.reynaldiwijaya.a10ofthemostfamousentrepreneursintheworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;

public class SplashScreen extends AppCompatActivity {
    public long ms = 0;
    public long splashTime = 3000;
    public boolean splashActive = true;
    public boolean paused = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        final ProgressBar progressBar = findViewById(R.id.progressBar);

        Thread myThread = new Thread(){
            public void run() {
                try{
                    while (splashActive && ms < splashTime){
                        if (!paused){
                            ms = ms + 40;
                            sleep(100);
                            progressBar.setProgress((int)ms);
                        }
                    }
                }catch (Exception e){
                    }finally {
                    Intent pindah = new Intent(SplashScreen.this, MainActivity.class);
                    startActivity(pindah);
                    finish();
                }
            }
        };
        myThread.start();

    }
}
