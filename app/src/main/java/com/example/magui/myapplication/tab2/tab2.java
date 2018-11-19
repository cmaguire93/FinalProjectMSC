package com.example.magui.myapplication.tab2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.magui.myapplication.Login_Register.Login2;
import com.example.magui.myapplication.Login_Register.Register;
import com.example.magui.myapplication.R;
import com.example.magui.myapplication.tab2.tuner.TunerActivity;

/**
 * Created by magui on 01/08/2017.
 */

public class tab2 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab_2, container, false);


        TextView login = (TextView) rootView.findViewById(R.id.Login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Login2.class);
                startActivity(intent);
            }
        });


        TextView register = (TextView) rootView.findViewById(R.id.Register);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Register.class);
                startActivity(intent);
            }
        });

        Button button =(Button) rootView.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(),standard_tuning.class);
                startActivity(intent);

            }
        });

        Button button2 =(Button) rootView.findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(),d_tuning.class);
                startActivity(intent);

            }
        });

        Button button3 =(Button) rootView.findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(),open_g_tuning.class);
                startActivity(intent);

            }
        });


        Button button4 = (Button) rootView.findViewById(R.id.chromatic_tuner);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),TunerActivity.class);
                startActivity(intent);
            }
        });

        return rootView;

    }

}
