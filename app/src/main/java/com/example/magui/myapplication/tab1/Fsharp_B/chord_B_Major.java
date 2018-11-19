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

public class chord_B_Major extends Fragment {

    /*
    Method returns view of b major chord page
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        final MediaPlayer player = new MediaPlayer();
        // initialises rootview
        View rootView = inflater.inflate(R.layout.b_major, container, false);
        // initialises button
        Button play_Bmajor = (Button) rootView.findViewById(R.id.play_B_Major);
        // onclick listener to play sound file
        play_Bmajor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final MediaPlayer Bmajor = MediaPlayer.create(getActivity(), R.raw.b_major);

                Bmajor.start();
            }
        });

        // returns rootview variable
        return rootView;
    }


    public static chord_B_Major newInstance(String text) {

        chord_B_Major f = new chord_B_Major();
        Bundle b = new Bundle();
        b.putString("msg", text);

        f.setArguments(b);

        return f;
    }


}

