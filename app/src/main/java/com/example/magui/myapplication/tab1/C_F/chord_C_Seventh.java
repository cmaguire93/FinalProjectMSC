package com.example.magui.myapplication.tab1.C_F;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.magui.myapplication.R;

/**
 * Created by magui on 02/08/2017.
 */

public class chord_C_Seventh extends Fragment {

    /**
     * Method displays content of the c seventh page
     *
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // initialises rootview
        View rootView = inflater.inflate(R.layout.c_seventh, container, false);
        // initialises button
        Button play_Cseventh = (Button) rootView.findViewById(R.id.play_C_Seventh);

        // onclick listener to play sound file
        play_Cseventh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final MediaPlayer CSeventh = MediaPlayer.create(getActivity(), R.raw.c_seventh);

                CSeventh.start();
            }
        });


        // returns rootview variable
        return rootView;

    }
}