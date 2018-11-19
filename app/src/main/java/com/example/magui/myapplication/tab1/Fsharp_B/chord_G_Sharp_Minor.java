package com.example.magui.myapplication.tab1.Fsharp_B;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.magui.myapplication.R;

/**
 * Created by magui on 09/08/2017.
 */

public class chord_G_Sharp_Minor extends android.support.v4.app.Fragment{



    /**
     * Method displays g sharp minor chord page
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // initialises rootview
        View rootView = inflater.inflate(R.layout.g_sharp_minor, container, false);
        // initialises button
        Button play_GSharpMinor = (Button) rootView.findViewById(R.id.play_G_Sharp_Minor);
        // onclick listener to play sound file
        play_GSharpMinor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // needs to be changed to g sharp minor sound file
                final MediaPlayer GSharpMinor= MediaPlayer.create(getActivity(), R.raw.g_sharp_minor);

                GSharpMinor.start();
            }
        });

        // returns rootview variable
        return rootView;
    }




}
