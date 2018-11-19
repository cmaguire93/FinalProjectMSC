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

public class chord_C_Sharp_Major extends Fragment {

    /*8
    Method returns view of c sharp major chord page
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // initialise media player
        final MediaPlayer player = new MediaPlayer();
        // initialise rootview
        View rootView = inflater.inflate(R.layout.c_sharp_major, container, false);
        // initialise button
        Button play_CSharpMajor = (Button) rootView.findViewById(R.id.play_C_Sharp_Major);

        // onclick listener to play sound file
        play_CSharpMajor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final MediaPlayer CSharpMajor= MediaPlayer.create(getActivity(), R.raw.c_sharp_major);

                CSharpMajor.start();
            }
        });

        // returns rootview variable
        return rootView;
    }


    public static chord_C_Sharp_Major newInstance(String text) {

        chord_C_Sharp_Major f = new chord_C_Sharp_Major();
        Bundle b = new Bundle();
        b.putString("msg", text);

        f.setArguments(b);

        return f;
    }


}