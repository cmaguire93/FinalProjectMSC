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

public class chord_A_Major  extends Fragment {

    /*
    Method returns view of a major chord page
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        final MediaPlayer player = new MediaPlayer();
        // initialises rootview
        View rootView = inflater.inflate(R.layout.a_major, container, false);
        // initialises button
        Button play_Amajor = (Button) rootView.findViewById(R.id.play_A_Major);

        // onlclcik listener to play sound file
        play_Amajor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final MediaPlayer Amajor= MediaPlayer.create(getActivity(), R.raw.a_major);

                Amajor.start();
            }
        });
        // returns rootview
        return rootView;
    }


    public static chord_A_Major newInstance(String text) {

        chord_A_Major f = new chord_A_Major();
        Bundle b = new Bundle();
        b.putString("msg", text);

        f.setArguments(b);

        return f;
    }


}

