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

public class chord_C_Sharp_Minor extends android.support.v4.app.Fragment{



    /**
     * Method displays c sharp minor chord page
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // initialise rootview
        View rootView = inflater.inflate(R.layout.c_sharp_minor, container, false);
        // initialise button
        Button play_CSharpMinor = (Button) rootView.findViewById(R.id.play_C_Sharp_Minor);

        //onclick lister to play sound file
        play_CSharpMinor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final MediaPlayer CSharpMinor= MediaPlayer.create(getActivity(), R.raw.c_sharp_minor);

                CSharpMinor.start();
            }
        });


        // returns rootview variable
        return rootView;




    }


}
