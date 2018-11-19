package com.example.magui.myapplication.tab3.finger_placements;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.magui.myapplication.R;

/**
 * Created by magui on 02/09/2017.
 */

public class finger_placements_a_major extends Fragment {


    /*
    Method returns view of a finger placement tutorial page
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        //initialising rootview variable
        View rootView = inflater.inflate(R.layout.tutor_finger_placements_a_major, container, false);

        // declaring array
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

                        final MediaPlayer a_major = MediaPlayer.create(getActivity(), R.raw.a_major);


                        a_major.start();

                    }
                }

            }
        });

        return rootView;
    }


public static finger_placements_a_major newInstance(String text){

        finger_placements_a_major f =new finger_placements_a_major();
        Bundle b=new Bundle();
        b.putString("msg",text);

        f.setArguments(b);

        return f;
        }


        }
/*
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tutor_finger_placements_a_major);

        final int[] tracker = new int[3];
        final MediaPlayer a_major = MediaPlayer.create(this, R.raw.a_major);

        Button button1 = (Button) findViewById(R.id.button1);
        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tracker[0] = 1;

                Toast.makeText(getBaseContext(), "try again!",
                        Toast.LENGTH_SHORT).show();


            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                for (int i = 0; i < 1; i++) {
                    if (tracker[i] == 0) {
                        Toast.makeText(getBaseContext(), "try again!",
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
                        Toast.makeText(getBaseContext(), "try again!",
                                Toast.LENGTH_SHORT).show();
                    } else {
                        tracker[2] = 1;
                        Toast.makeText(getBaseContext(), "correct!",
                                Toast.LENGTH_SHORT).show();

                        a_major.start();

                    }
                }

            }
        });


    }
}
/*/
