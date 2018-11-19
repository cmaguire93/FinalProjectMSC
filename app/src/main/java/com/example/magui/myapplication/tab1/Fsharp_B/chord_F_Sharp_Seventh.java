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
 * Created by magui on 09/08/2017.
 */

public class chord_F_Sharp_Seventh  extends Fragment {

    /**
     * Mthod diplays content of the f sharp seventh page
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // initialises rootview
        View rootView = inflater.inflate(R.layout.f_sharp_seventh, container, false);
        // initialises button
        Button play_FSharpSeventh = (Button) rootView.findViewById(R.id.play_F_Sharp_Seventh);
        // onclick listener to play sound file
        play_FSharpSeventh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final MediaPlayer FSharpSeventh= MediaPlayer.create(getActivity(), R.raw.f_sharp_seventh);

                FSharpSeventh.start();
            }
        });

        // returns rootview variable
        return rootView;

    }
}

