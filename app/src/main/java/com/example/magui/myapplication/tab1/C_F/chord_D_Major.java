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

public class chord_D_Major extends Fragment {

    /*8
    Method returns view of d major chord page
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // initialises media player
        final MediaPlayer player = new MediaPlayer();
        // initialises rootview
        View rootView = inflater.inflate(R.layout.d_major, container, false);
        // initialies button
        Button play_DMajor = (Button) rootView.findViewById(R.id.play_D_Major);
        //onclick listener to play sound file
        play_DMajor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final MediaPlayer DMajor= MediaPlayer.create(getActivity(), R.raw.d_major);

                DMajor.start();
            }
        });
        // returns rootview
        return rootView;
    }


    public static chord_D_Major newInstance(String text) {

        chord_D_Major f = new chord_D_Major();
        Bundle b = new Bundle();
        b.putString("msg", text);

        f.setArguments(b);

        return f;
    }


}

