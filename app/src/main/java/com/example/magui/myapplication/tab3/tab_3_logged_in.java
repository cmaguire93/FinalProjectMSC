package com.example.magui.myapplication.tab3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.magui.myapplication.Login_Register.Login;
import com.example.magui.myapplication.R;
import com.example.magui.myapplication.tab3.finger_placements.finger_placements_handler;

/**
 * Created by magui on 27/08/2017.
 */

public class tab_3_logged_in extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab_3_logged_in, container, false);

        TextView login = (TextView) rootView.findViewById(R.id.Login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Login.class);
                startActivity(intent);
            }
        });

/*
        TextView register = (TextView) rootView.findViewById(R.id.Register);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Register.class);
                startActivity(intent);
            }
        });

*/

        // will open the "learn chord changes" page
        Button chordButton =(Button) rootView.findViewById(R.id.Learn_chord_changes);
        chordButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(),chord_changes_page.class);
                startActivity(intent);

            }
        });

        // will open the "basic riffs" page
        Button riffButton =(Button) rootView.findViewById(R.id.Learn_riffs);
        riffButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(),riffs_page.class);
                startActivity(intent);

            }
        });

        Button fingerPlacementButton = (Button) rootView.findViewById(R.id.finger_placement);
        fingerPlacementButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), finger_placements_handler.class);
                startActivity(intent);
            }
        });

        return rootView;

    }}
