package com.example.magui.myapplication.tab1.Fsharp_B;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.magui.myapplication.R;

/**
 * Created by magui on 10/08/2017.
 */

public class chord_A_Sharp_Seventh extends Fragment {

    /**
     * Method diplays content of the a sharp seventh page
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // initialises rootview
        View rootView = inflater.inflate(R.layout.a_sharp_seventh, container, false);
        // initialises button
        Button play_ASharpSeventh = (Button) rootView.findViewById(R.id.play_A_Sharp_Seventh);
        // onclick listener to play sound file
        play_ASharpSeventh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final MediaPlayer ASharpSeventh = MediaPlayer.create(getActivity(), R.raw.a_sharp_seventh);

                ASharpSeventh.start();
            }
        });
        // returns rootview variable
        return rootView;

    }
}

