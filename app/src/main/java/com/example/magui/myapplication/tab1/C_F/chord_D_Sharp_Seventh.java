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

public class chord_D_Sharp_Seventh extends Fragment {

    /**
     * Method diplays content of the d sharp seventh page
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // initialises rootview
        View rootView = inflater.inflate(R.layout.d_sharp_seventh, container, false);
        // initialises button
        Button play_DSharpSeventh = (Button) rootView.findViewById(R.id.play_D_Sharp_Seventh);
        // on click listener to play sound file
        play_DSharpSeventh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final MediaPlayer DSharpSEventh= MediaPlayer.create(getActivity(), R.raw.d_sharp_seventh);

                DSharpSEventh.start();
            }
        });


        // returns rootview variable
        return rootView;

    }
}