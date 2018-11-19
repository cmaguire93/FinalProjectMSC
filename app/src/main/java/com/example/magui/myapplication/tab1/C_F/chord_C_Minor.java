package com.example.magui.myapplication.tab1.C_F;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.magui.myapplication.R;

/**
 * Created by magui on 02/08/2017.
 */

public class chord_C_Minor extends android.support.v4.app.Fragment {


    /**
     * Method displays c minor chord page
     *
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // creates rootview of c minor layout
        View rootView = inflater.inflate(R.layout.c_minor, container, false);


        //initialises button
        Button play_Cminor = (Button) rootView.findViewById(R.id.play_C_Minor);

        // onlclick listener to play sound file
        play_Cminor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final MediaPlayer Cminor = MediaPlayer.create(getActivity(), R.raw.c_minor);

                Cminor.start();
            }
        });

        // returns rootview variable
        return rootView;

    }


}


