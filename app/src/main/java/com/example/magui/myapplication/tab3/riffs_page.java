package com.example.magui.myapplication.tab3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.Button;

import com.example.magui.myapplication.R;
import com.example.magui.myapplication.tab3.guitar_riffs.come_as_you_are;
import com.example.magui.myapplication.tab3.guitar_riffs.fa;
import com.example.magui.myapplication.tab3.guitar_riffs.heartbreaker;
import com.example.magui.myapplication.tab3.guitar_riffs.iron_man;
import com.example.magui.myapplication.tab3.guitar_riffs.satisfaction;
import com.example.magui.myapplication.tab3.guitar_riffs.seven_nation_army;
import com.example.magui.myapplication.tab3.guitar_riffs.sotw;
import com.example.magui.myapplication.tab3.guitar_riffs.soyl;

/**
 * Created by magui on 22/08/2017.
 */

public class riffs_page extends FragmentActivity {

    // declaring variables
    Button Sotw, Satisfaction, Sna, IronMan, Caua, Heartbreaker, Soyl, Fa;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tutor_riffs);

        // initialising variables
        Sotw = (Button) findViewById(R.id.Sotw);
        Satisfaction = (Button) findViewById(R.id.Satisfaction);
        Sna = (Button) findViewById(R.id.Seven_nation_army);
        IronMan = (Button) findViewById(R.id.Iron_Man);
        Caua = (Button) findViewById(R.id.Come_As);
        Heartbreaker = (Button) findViewById(R.id.Heartbreker);
        Soyl = (Button) findViewById(R.id.Sunshine);
        Fa = (Button) findViewById(R.id.Fluorescent_Adolescent);
        // onclick listener to open new activity
        Sotw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), sotw.class);
                startActivity(intent);
            }
        });

        // onclick listener to open new activity
        Satisfaction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getBaseContext(), satisfaction.class);
                startActivity(intent);
            }
        });

        // onclick listener to open new activity
        Sna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getBaseContext(), seven_nation_army.class);
                startActivity(intent);
            }
        });

        // onclick listener to open new activity
        Fa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getBaseContext(), fa.class);
                startActivity(intent);
            }
        });


        // onclick listener to open new activity
        IronMan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getBaseContext(), iron_man.class);
                startActivity(intent);
            }
        });

        // onclick listener to open new activity
        Caua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getBaseContext(), come_as_you_are.class);
                startActivity(intent);
            }
        });

        // onclick listener to open new activity
        Heartbreaker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getBaseContext(), heartbreaker.class);
                startActivity(intent);
            }
        });

        // onclick listener to open new activity
        Soyl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getBaseContext(), soyl.class);
                startActivity(intent);
            }
        });


    }


}