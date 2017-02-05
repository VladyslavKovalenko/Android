package com.grebz.grebzband.grebz;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    BackgroundMachine machine;
    ImageButton img_b_v;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final MediaPlayer cops = MediaPlayer.create(this, R.raw.cops);
        final MediaPlayer bicycle = MediaPlayer.create(this, R.raw.bicycle);

        machine = new BackgroundMachine(cops, bicycle);
        cops.start();

        img_b_v = (ImageButton) findViewById(R.id.logo);
        img_b_v.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                runMachine(v);
            }

        });
    }

    public void runMachine(View v) {

        if (v == img_b_v) {
            machine.change_background(img_b_v);
        }
    }
}
