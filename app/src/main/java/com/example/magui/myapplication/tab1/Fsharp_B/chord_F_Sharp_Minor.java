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

public class chord_F_Sharp_Minor extends android.support.v4.app.Fragment{



    /**
     * Method displays f sharp minor chord page
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // initialises rootview
        View rootView = inflater.inflate(R.layout.f_sharp_minor, container, false);
        // initialises button
        Button play_FSharpMinor = (Button) rootView.findViewById(R.id.play_F_Sharp_Minor);
        // onclick listener to play sound file
        play_FSharpMinor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final MediaPlayer FSharpMinor= MediaPlayer.create(getActivity(), R.raw.f_sharp_minor);

                FSharpMinor.start();
            }
        });


        // returns rootview variabel
        return rootView;




    }


}
