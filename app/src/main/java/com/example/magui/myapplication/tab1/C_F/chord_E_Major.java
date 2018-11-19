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

public class chord_E_Major extends Fragment {

    /*8
    Method returns view of e major chord page
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        //final MediaPlayer player = new MediaPlayer();
        // initialises rootview
        View rootView = inflater.inflate(R.layout.e_major, container, false);
        // initialises button
        Button play_EMajor = (Button) rootView.findViewById(R.id.play_E_Major);
        // onlclick listener to play sound file
        play_EMajor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final MediaPlayer EMajor = MediaPlayer.create(getActivity(), R.raw.e_major);

                EMajor.start();
            }
        });
        // returns rootview variable
        return rootView;
    }


    public static chord_E_Major newInstance(String text) {

        chord_E_Major f = new chord_E_Major();
        Bundle b = new Bundle();
        b.putString("msg", text);

        f.setArguments(b);

        return f;
    }


}
