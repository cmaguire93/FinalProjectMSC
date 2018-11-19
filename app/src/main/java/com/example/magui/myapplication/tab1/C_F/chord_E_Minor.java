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

public class chord_E_Minor extends android.support.v4.app.Fragment {

    /**
     * Method displays e minor chord page
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
        View rootView = inflater.inflate(R.layout.e_minor, container, false);
        // initialises button
        Button play_Eminor=(Button)rootView.findViewById(R.id.play_E_Minor);
        // onclick listener to play sound file
        play_Eminor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final MediaPlayer E_Eminor = MediaPlayer.create(getActivity(),R.raw.e_minor);

                E_Eminor.start();
            }
        });
        // returns rootview variable
        return rootView;


    }


}


