package com.example.magui.myapplication.tab1;

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
import com.example.magui.myapplication.tab1.C_F.chord_C_Sharp_handler;
import com.example.magui.myapplication.tab1.C_F.chord_C_handler;
import com.example.magui.myapplication.tab1.C_F.chord_D_Sharp_handler;
import com.example.magui.myapplication.tab1.C_F.chord_D_handler;
import com.example.magui.myapplication.tab1.C_F.chord_E_Handler;
import com.example.magui.myapplication.tab1.C_F.chord_F_Handler;
import com.example.magui.myapplication.tab1.Fsharp_B.chord_A_Handler;
import com.example.magui.myapplication.tab1.Fsharp_B.chord_A_Sharp_Handler;
import com.example.magui.myapplication.tab1.Fsharp_B.chord_B_Handler;
import com.example.magui.myapplication.tab1.Fsharp_B.chord_F_Sharp_Handler;
import com.example.magui.myapplication.tab1.Fsharp_B.chord_G_Handler;
import com.example.magui.myapplication.tab1.Fsharp_B.chord_G_Sharp_Handler;

/**
 * Created by magui on 27/08/2017.
 */

public class tab1_logged_in extends Fragment {


    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.tab_1_logged_in, container, false);


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

        Button cButton = (Button) rootView.findViewById(R.id.C_button);
        cButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), chord_C_handler.class);
                startActivity(intent);
            }
        });

        Button CSharp = (Button) rootView.findViewById(R.id.C_Sharp_button);
        CSharp.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent CSharp = new Intent(getActivity(), chord_C_Sharp_handler.class);
                startActivity(CSharp);
            }
        });

        Button D = (Button) rootView.findViewById(R.id.D_button);
        D.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent D = new Intent(getActivity(), chord_D_handler.class);
                startActivity(D);
            }
        });

        Button DSharp = (Button) rootView.findViewById(R.id.D_Sharp_button);
        DSharp.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent DSharp = new Intent(getActivity(), chord_D_Sharp_handler.class);
                startActivity(DSharp);
            }
        });

        Button E = (Button) rootView.findViewById(R.id.E_button);
        E.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent E = new Intent(getActivity(), chord_E_Handler.class);
                startActivity(E);
            }
        });

        Button F = (Button) rootView.findViewById(R.id.F_button);
        F.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent F = new Intent(getActivity(), chord_F_Handler.class);
                startActivity(F);
            }
        });

        Button FSharp = (Button) rootView.findViewById(R.id.F_Sharp_button);
        FSharp.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent FSharp = new Intent(getActivity(), chord_F_Sharp_Handler.class);
                startActivity(FSharp);
            }
        });

        Button G = (Button) rootView.findViewById(R.id.G_button);
        G.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent G = new Intent(getActivity(), chord_G_Handler.class);
                startActivity(G);
            }
        });

        Button GSharp = (Button) rootView.findViewById(R.id.G_Sharp_button);
        GSharp.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent GSharp = new Intent(getActivity(), chord_G_Sharp_Handler.class);
                startActivity(GSharp);
            }
        });

        Button A = (Button) rootView.findViewById(R.id.A_button);
        A.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent A = new Intent(getActivity(), chord_A_Handler.class);
                startActivity(A);
            }
        });

        Button ASharp = (Button) rootView.findViewById(R.id.A_Sharp_button);
        ASharp.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent ASharp = new Intent(getActivity(), chord_A_Sharp_Handler.class);
                startActivity(ASharp);
            }
        });

        Button B = (Button) rootView.findViewById(R.id.B_button);
        B.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent B = new Intent(getActivity(), chord_B_Handler.class);
                startActivity(B);
            }
        });


        return rootView;

    }
}


