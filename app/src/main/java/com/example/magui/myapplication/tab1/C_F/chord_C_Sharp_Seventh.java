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

public class chord_C_Sharp_Seventh extends Fragment {

    /**
     * Mthod diplays content of the c sharp seventh page
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // initialises rootview variable
        View rootView = inflater.inflate(R.layout.c_sharp_seventh, container, false);
        // initialises button
        Button play_CSharpSeventh = (Button) rootView.findViewById(R.id.play_C_Sharp_Seventh);
        //onllcik listener to play sound file
        play_CSharpSeventh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final MediaPlayer CSharpSeventh= MediaPlayer.create(getActivity(), R.raw.c_sharp_seventh);

                CSharpSeventh.start();
            }
        });

        // returns rootview variable
        return rootView;

    }
}