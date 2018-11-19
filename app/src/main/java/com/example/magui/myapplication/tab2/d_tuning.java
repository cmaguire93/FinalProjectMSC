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

public class d_tuning extends FragmentActivity {


    // declaring variables
    TextView d_note, g_note, c_note, f_note, a_note, high_d;
    Button play_all;

    /*
    Returns tuner_drop_d xml layout
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tuner_drop_d);

        // initialising variables
        d_note = (TextView) findViewById(R.id.d_note);
        g_note = (TextView) findViewById(R.id.g_note);
        c_note = (TextView) findViewById(R.id.c_note);
        f_note = (TextView) findViewById(R.id.f_note);
        a_note = (TextView) findViewById(R.id.a_note);
        high_d = (TextView) findViewById(R.id.high_d_note);
        play_all = (Button) findViewById(R.id.play_all);

        final MediaPlayer d = MediaPlayer.create(this, R.raw.d_tuning_d);
        final MediaPlayer g = MediaPlayer.create(this, R.raw.d_tuning_g);
        final MediaPlayer c = MediaPlayer.create(this, R.raw.d_tuning_c);
        final MediaPlayer f = MediaPlayer.create(this, R.raw.d_tuning_f);
        final MediaPlayer a = MediaPlayer.create(this, R.raw.d_tuning_a);
        final MediaPlayer d_high = MediaPlayer.create(this, R.raw.d_tuning_d_high);
        final MediaPlayer d_tuning = MediaPlayer.create(this, R.raw.d_tuning);


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
        c_note.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                c.start();

            }
        });

        f_note.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                f.start();

            }
        });

        a_note.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                a.start();

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

                d_tuning.start();

            }
        });

    }
}

