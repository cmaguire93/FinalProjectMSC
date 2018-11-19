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

public class chord_D_Minor extends android.support.v4.app.Fragment {


    /**
     * Method displays d minor chord page
     *
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //initialise rootview variable
        View rootView = inflater.inflate(R.layout.d_minor, container, false);
        //initialises button
        Button play_DMinor = (Button) rootView.findViewById(R.id.play_D_Minor);
        // onlclcik listener to play sound file
        play_DMinor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final MediaPlayer DMinor = MediaPlayer.create(getActivity(), R.raw.d_minor);

                DMinor.start();
            }
        });
        // returns rootview variable
        return rootView;
    }


}




