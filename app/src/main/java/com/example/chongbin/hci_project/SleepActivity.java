package com.example.chongbin.hci_project;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatButton;
import android.view.View;

public class SleepActivity extends AppCompatActivity {
    MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sleep);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        mediaPlayer = MediaPlayer.create(getApplicationContext(),R.raw.piano);

        AppCompatButton button1 = findViewById(R.id.button_play);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });

    }

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }

    @Override
    protected void onDestroy() {
        mediaPlayer.stop();
        super.onDestroy();
    }
}