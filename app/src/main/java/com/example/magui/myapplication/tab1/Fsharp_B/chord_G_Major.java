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

public class chord_G_Major extends Fragment {

    /*
    Method returns view of g major chord page
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        final MediaPlayer player = new MediaPlayer();
        // initialises rootview
        View rootView = inflater.inflate(R.layout.g_major, container, false);
        // initialises button
        Button play_Gmajor = (Button) rootView.findViewById(R.id.play_G_Major);
        // onclick listener to play sound file
        play_Gmajor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final MediaPlayer Gmajor= MediaPlayer.create(getActivity(), R.raw.g_major);

                Gmajor.start();
            }
        });

        // returns rootview variable
        return rootView;
    }


    public static chord_G_Major newInstance(String text) {

        chord_G_Major f = new chord_G_Major();
        Bundle b = new Bundle();
        b.putString("msg", text);

        f.setArguments(b);

        return f;
    }


}

