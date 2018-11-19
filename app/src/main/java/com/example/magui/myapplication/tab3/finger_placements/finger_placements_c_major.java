package com.example.magui.myapplication.tab3.finger_placements;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.magui.myapplication.R;

/**
 * Created by magui on 04/09/2017.
 */

public class finger_placements_c_major extends android.support.v4.app.Fragment {


    /**
     * Method to display c major finger placements page
     *
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //initialise rootview variable
        View rootView = inflater.inflate(R.layout.tutor_finger_placements_c_major, container, false);


        final int[] tracker = new int[3];

        Button button1 = (Button) rootView.findViewById(R.id.button1);
        Button button2 = (Button) rootView.findViewById(R.id.button2);
        Button button3 = (Button) rootView.findViewById(R.id.button3);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tracker[0] = 1;




            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                for (int i = 0; i < 1; i++) {
                    if (tracker[i] == 0) {
                        Toast.makeText(getActivity(), "try again!",
                                Toast.LENGTH_SHORT).show();
                    } else {
                        tracker[1] = 1;
                    }
                }


            }
        });


        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                for (int i = 0; i < 1; i++) {
                    if (tracker[i] == 0) {
                        Toast.makeText(getActivity(), "try again!",
                                Toast.LENGTH_SHORT).show();
                    } else {
                        tracker[2] = 1;
                        Toast.makeText(getActivity(), "correct!",
                                Toast.LENGTH_SHORT).show();

                        final MediaPlayer c_major = MediaPlayer.create(getActivity(), R.raw.c_major);

                        c_major.start();

                    }
                }

            }
        });

        return rootView;

    }


}
