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
 * Created by magui on 07/08/2017.
 */

public class chord_E_Seventh extends Fragment {

    /**
     * Method displays content of the e seventh page
     *
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // initilises rootview
        View rootView = inflater.inflate(R.layout.e_seventh, container, false);
        // initialises button
        Button play_ESeventh = (Button) rootView.findViewById(R.id.play_E_Seventh);
        // onclick listener to play sound file
        play_ESeventh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final MediaPlayer E_Seventh = MediaPlayer.create(getActivity(), R.raw.e_seventh);

                E_Seventh.start();
            }
        });

        // returns rootview variable
        return rootView;

    }
}