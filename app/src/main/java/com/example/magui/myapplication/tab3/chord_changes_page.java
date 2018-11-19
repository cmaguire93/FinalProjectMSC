package com.example.magui.myapplication.tab3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.Button;

import com.example.magui.myapplication.R;
import com.example.magui.myapplication.tab3.chord_transitions.a_major_d_major;
import com.example.magui.myapplication.tab3.chord_transitions.a_minor_e_minor;
import com.example.magui.myapplication.tab3.chord_transitions.bm_d_g_d_g_d_e;
import com.example.magui.myapplication.tab3.chord_transitions.c_g_am_f_am_f_fm;
import com.example.magui.myapplication.tab3.chord_transitions.e_major_e_minor;
import com.example.magui.myapplication.tab3.chord_transitions.e_minor_c_major;
import com.example.magui.myapplication.tab3.chord_transitions.em_am_g_c_g_b7;
import com.example.magui.myapplication.tab3.chord_transitions.g_major_e_minor_c_major_g_major;

/**
 * Created by magui on 22/08/2017.
 */

public class chord_changes_page extends FragmentActivity {

    Button EMajor_EMinor;
    Button AMajor_DMajor;
    Button EMinor_CMajor;
    Button AMinor_EMinor;
    Button GMajor_EMinor_CMajor_GMajor;
    Button Bm_D_G_D_G_D_E;
    Button C_G_F_Am_F_Fm;
    Button Em_Am_G_C_G_B7;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tutor_chord_changes);


        EMajor_EMinor = (Button) findViewById(R.id.E_Major_E_Minor);
        AMajor_DMajor = (Button) findViewById(R.id.A_Major_D_Major);
        EMinor_CMajor = (Button) findViewById(R.id.E_Minor_C_Major);
        AMinor_EMinor = (Button) findViewById(R.id.A_Minor_E_Minor);
        GMajor_EMinor_CMajor_GMajor = (Button) findViewById(R.id.G_Major_E_Minor_D_Major_G_Major);
        Bm_D_G_D_G_D_E = (Button) findViewById(R.id.B_Minor_D_Major_G_Major_D_Major_G_Major_D_Major_E_Major);
        C_G_F_Am_F_Fm = (Button) findViewById(R.id.C_Major_G_Major_F_Major_A_Minor_F_Major_F_Minor);
        Em_Am_G_C_G_B7 = (Button) findViewById(R.id.E_Minor_A_Minor_G_Major_C_Major_G_Major_B_Seventh);


        EMajor_EMinor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), e_major_e_minor.class);
                startActivity(intent);
            }
        });

        AMajor_DMajor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getBaseContext(), a_major_d_major.class);
                startActivity(intent);

            }
        });


        EMinor_CMajor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), e_minor_c_major.class);
                startActivity(intent);
            }
        });


        AMinor_EMinor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), a_minor_e_minor.class);
                startActivity(intent);
            }
        });

        GMajor_EMinor_CMajor_GMajor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), g_major_e_minor_c_major_g_major.class);
                startActivity(intent);
            }
        });

        Bm_D_G_D_G_D_E.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), bm_d_g_d_g_d_e.class);
                startActivity(intent);
            }
        });

        C_G_F_Am_F_Fm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), c_g_am_f_am_f_fm.class);
                startActivity(intent);
            }
        });

        Em_Am_G_C_G_B7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), em_am_g_c_g_b7.class);
                startActivity(intent);
            }
        });


    }


}
