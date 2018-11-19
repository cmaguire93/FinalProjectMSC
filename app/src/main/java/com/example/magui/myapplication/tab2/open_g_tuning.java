package com.example.magui.myapplication.tab2;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.magui.myapplication.R;

/**
 * Created by magui on 26/08/2017.
 */

public class open_g_tuning extends FragmentActivity {

    // declaring variables
    TextView low_d_note, low_g_note, d_note, g_note, b_note, high_d;
    Button play_all;

    /*
    Returns tuner_open_g xml layout
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tuner_open_g);

        // initialising variables
        low_d_note = (TextView) findViewById(R.id.low_d_note);
        low_g_note = (TextView) findViewById(R.id.low_g_note);
        d_note = (TextView) findViewById(R.id.d_note);
        g_note = (TextView) findViewById(R.id.g_note);
        b_note = (TextView) findViewById(R.id.b_note);
        high_d = (TextView) findViewById(R.id.high_d_note);
        play_all = (Button) findViewById(R.id.play_all);

        final MediaPlayer low_d = MediaPlayer.create(this, R.raw.g_tuning_d_low);
        final MediaPlayer low_g = MediaPlayer.create(this, R.raw.g_tuning_g_low);
        final MediaPlayer d = MediaPlayer.create(this, R.raw.g_tuning_d);
        final MediaPlayer g = MediaPlayer.create(this, R.raw.g_tuning_g);
        final MediaPlayer b = MediaPlayer.create(this, R.raw.g_tuning_b);
        final MediaPlayer d_high = MediaPlayer.create(this, R.raw.g_tuning_d_high);
        final MediaPlayer g_tuning = MediaPlayer.create(this, R.raw.g_tuning);


        low_d_note.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                low_d.start();

            }
        });
        low_g_note.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                low_g.start();

            }
        });
        d_note.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                d.start();

            }
        });

        g_note.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                g.start();

            }
        });

        b_note.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                b.start();

            }
        });
        high_d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                d_high.start();

            }
        });


        play_all.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                g_tuning.start();

            }
        });

    }
}
