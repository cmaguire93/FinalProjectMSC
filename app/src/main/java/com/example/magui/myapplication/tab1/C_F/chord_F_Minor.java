package com.example.magui.myapplication.tab1.C_F;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.magui.myapplication.R;

/**
 * Created by magui on 07/08/2017.
 */

public class chord_F_Minor extends android.support.v4.app.Fragment {


    /**
     * Method displays f minor chord page
     *
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //initialises rootview variable
        View rootView = inflater.inflate(R.layout.f_minor, container, false);
        // initialises button
        Button play_FMinor = (Button) rootView.findViewById(R.id.play_F_Minor);
        // onclcik listener to play sound file
        play_FMinor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final MediaPlayer FMinor = MediaPlayer.create(getActivity(), R.raw.f_minor);

                FMinor.start();
            }
        });

        // returns rootview variable
        return rootView;


    }


}


