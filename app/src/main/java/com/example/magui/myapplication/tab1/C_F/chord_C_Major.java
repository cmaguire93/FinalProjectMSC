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
 * Created by magui on 02/08/2017.
 */

public class chord_C_Major extends Fragment {

    /*
    Method returns view of c major chord page
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        // initialises media player
        final MediaPlayer player = new MediaPlayer();

        // creates rootview of c major layout
        View rootView = inflater.inflate(R.layout.c_major, container, false);


        // TextView tv = (TextView) rootView.findViewById(R.id.C_MajorTextView);
        //tv.setText(getArguments().getString("msg"));


        // initialises button
        Button play_Cmajor = (Button) rootView.findViewById(R.id.play_C_Major);


        // onclick listener to play sound file
        play_Cmajor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final MediaPlayer Cmajor = MediaPlayer.create(getActivity(), R.raw.c_major);

                Cmajor.start();
            }
        });


        // returns root view variable
        return rootView;
    }


    public static chord_C_Major newInstance(String text) {

        chord_C_Major f = new chord_C_Major();
        Bundle b = new Bundle();
        b.putString("msg", text);

        f.setArguments(b);

        return f;
    }


}
