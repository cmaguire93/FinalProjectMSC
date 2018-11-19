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

public class chord_D_Sharp_Major extends Fragment {

    /*8
    Method returns view of d sharp major chord page
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // initialises mediaplayer
        final MediaPlayer player = new MediaPlayer();
        // initialises rootview
        View rootView = inflater.inflate(R.layout.d_sharp_major, container, false);
        // iniitialises button
        Button play_DSharpMajor = (Button) rootView.findViewById(R.id.play_D_Sharp_Major);

        // onlclick listener to pla sound file
        play_DSharpMajor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final MediaPlayer DSharpMajor= MediaPlayer.create(getActivity(), R.raw.d_sharp_major);

                DSharpMajor.start();
            }
        });

        // returns rootview variable
        return rootView;
    }


    public static chord_D_Sharp_Major newInstance(String text) {

        chord_D_Sharp_Major f = new chord_D_Sharp_Major();
        Bundle b = new Bundle();
        b.putString("msg", text);

        f.setArguments(b);

        return f;
    }


}