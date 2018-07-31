package com.murach.m14_program_assignment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.media.MediaPlayer;
import android.widget.Button;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final MediaPlayer catSoundMediaPlayer = MediaPlayer.create(this, R.raw.cat_meowing_780889994);

        final Button playSound = (Button) this.findViewById(R.id.play_sound);

        playSound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                catSoundMediaPlayer.start();
            }
        });
    }
}
