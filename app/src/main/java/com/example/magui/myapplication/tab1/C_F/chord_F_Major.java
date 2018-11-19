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

public class chord_F_Major extends Fragment {

    /*8
    Method returns view of f major chord page
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        final MediaPlayer player = new MediaPlayer();
        // initialises rootview
        View rootView = inflater.inflate(R.layout.f_major, container, false);
        // initialises button
        Button play_FMajor = (Button) rootView.findViewById(R.id.play_F_Major);
        // onclick listener to play sound file
        play_FMajor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final MediaPlayer FMajor= MediaPlayer.create(getActivity(), R.raw.f_major);

                FMajor.start();
            }
        });

        // returns rootview variable
        return rootView;
    }


    public static chord_F_Major newInstance(String text) {

        chord_F_Major f = new chord_F_Major();
        Bundle b = new Bundle();
        b.putString("msg", text);

        f.setArguments(b);

        return f;
    }


}

