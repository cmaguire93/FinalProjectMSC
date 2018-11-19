package com.example.magui.myapplication.tab2;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.magui.myapplication.R;

/**
 * Created by magui on 15/08/2017.
 */

public class standard_tuning extends FragmentActivity {

    // declaring variables
    TextView e_note, a_note, d_note, g_note, b_note, high_e;
    Button play_all;

    /*
   Returns tuner_standard xml layout
    */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tuner_standard);

        // initialising variables
        e_note = (TextView) findViewById(R.id.e_note);
        a_note = (TextView) findViewById(R.id.a_note);
        d_note = (TextView) findViewById(R.id.d_note);
        g_note = (TextView) findViewById(R.id.g_note);
        b_note = (TextView) findViewById(R.id.b_note);
        high_e = (TextView) findViewById(R.id.high_e_note);
        play_all = (Button) findViewById(R.id.play_all);

        final MediaPlayer e = MediaPlayer.create(this, R.raw.tuning_e_standard_low);
        final MediaPlayer a = MediaPlayer.create(this, R.raw.tuning_a_standard);
        final MediaPlayer d = MediaPlayer.create(this, R.raw.tuning_d_standard);
        final MediaPlayer g = MediaPlayer.create(this, R.raw.tuning_g_standard);
        final MediaPlayer b = MediaPlayer.create(this, R.raw.tuning_b_standard);
        final MediaPlayer e_high = MediaPlayer.create(this, R.raw.tuning_e_standard_high);
        final MediaPlayer sandard_tuning = MediaPlayer.create(this, R.raw.tuning_standard);


        e_note.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                e.start();

            }
        });
        a_note.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                a.start();

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
        high_e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                e_high.start();

            }
        });


        play_all.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sandard_tuning.start();

            }
        });

    }
}
