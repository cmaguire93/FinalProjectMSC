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

public class chord_F_Seventh extends Fragment {

    /**
     * Method displays content of the f seventh page
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
        View rootView = inflater.inflate(R.layout.f_seventh, container, false);
        // initialise button
        Button play_FSeventh = (Button) rootView.findViewById(R.id.play_F_Seventh);
        // onlclcik listener to play sound file
        play_FSeventh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final MediaPlayer FSeventh = MediaPlayer.create(getActivity(), R.raw.f_seventh);

                FSeventh.start();
            }
        });

        // returns rootview variable
        return rootView;

    }
}
