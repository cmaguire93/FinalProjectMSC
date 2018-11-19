package com.example.magui.myapplication.tab1.C_F;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.magui.myapplication.R;

import static com.example.magui.myapplication.R.raw.d_seventh;

/**
 * Created by magui on 07/08/2017.
 */

public class chord_D_Seventh extends Fragment {

    /**
     * Mthod diplays content of the d seventh page
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // initialises rootview variable
        View rootView = inflater.inflate(R.layout.d_seventh, container, false);
        // initialises button
        Button play_DSeventh = (Button) rootView.findViewById(R.id.play_D_Seventh);
        // onlclick listener to play sound file
        play_DSeventh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final MediaPlayer DSeventh = MediaPlayer.create(getActivity(), d_seventh);


                DSeventh.start();
            }
        });
        // returns rootview variable
        return rootView;

    }
}