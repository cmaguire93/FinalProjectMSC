package com.example.magui.myapplication.tab3;

import android.content.Intent;

import com.example.magui.myapplication.R;
import com.example.magui.myapplication.tab3.chord_transitions.a_major_d_major;
import com.example.magui.myapplication.tab3.chord_transitions.a_minor_e_minor;
import com.example.magui.myapplication.tab3.chord_transitions.bm_d_g_d_g_d_e;
import com.example.magui.myapplication.tab3.chord_transitions.c_g_am_f_am_f_fm;
import com.example.magui.myapplication.tab3.chord_transitions.e_major_e_minor;
import com.example.magui.myapplication.tab3.chord_transitions.e_minor_c_major;
import com.example.magui.myapplication.tab3.chord_transitions.em_am_g_c_g_b7;
import com.example.magui.myapplication.tab3.chord_transitions.g_major_e_minor_c_major_g_major;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.shadows.ShadowApplication;

/**
 * Created by magui on 29/01/2018.
 * Tests the intents on the chord transitions page of the app
 */
@RunWith(RobolectricTestRunner.class)
public class chord_transitions_test {


    /*
    Test to prove clicking E_minor_C_major button opens the correct tutorial page
     */
    @Test
    public void Eminor_CMajor_Test() {
        chord_changes_page activity = Robolectric.setupActivity(chord_changes_page.class);
        activity.findViewById(R.id.E_Minor_C_Major).performClick();

        Intent expectedIntent = new Intent(activity, e_minor_c_major.class);
        Intent actual = ShadowApplication.getInstance().getNextStartedActivity();
        Assert.assertEquals(expectedIntent.getComponent(), actual.getComponent());
    }

    /*
        Test to prove clicking A_minor_E_major button opens the correct tutorial page
         */
    @Test
    public void Aminor_EMinor_Test() {
        chord_changes_page activity = Robolectric.setupActivity(chord_changes_page.class);
        activity.findViewById(R.id.A_Minor_E_Minor).performClick();

        Intent expectedIntent = new Intent(activity, a_minor_e_minor.class);
        Intent actual = ShadowApplication.getInstance().getNextStartedActivity();
        Assert.assertEquals(expectedIntent.getComponent(), actual.getComponent());
    }


    /*
       Test to prove clicking A_major_D_major button opens the correct tutorial page
        */
    @Test
    public void AMajor_DMajor_Test() {
        chord_changes_page activity = Robolectric.setupActivity(chord_changes_page.class);
        activity.findViewById(R.id.A_Major_D_Major).performClick();

        Intent expectedIntent = new Intent(activity, a_major_d_major.class);
        Intent actual = ShadowApplication.getInstance().getNextStartedActivity();
        Assert.assertEquals(expectedIntent.getComponent(), actual.getComponent());
    }

    /*
          Test to prove clicking E_major_E_minor button opens the correct tutorial page
           */
    @Test
    public void EMajor_EMinor_Test() {
        chord_changes_page activity = Robolectric.setupActivity(chord_changes_page.class);
        activity.findViewById(R.id.E_Major_E_Minor).performClick();

        Intent expectedIntent = new Intent(activity, e_major_e_minor.class);
        Intent actual = ShadowApplication.getInstance().getNextStartedActivity();
        Assert.assertEquals(expectedIntent.getComponent(), actual.getComponent());
    }

    /*
          Test to prove clicking G_EM_C_G button opens the correct tutorial page
           */
    @Test
    public void G_EM_C_G_Test() {
        chord_changes_page activity = Robolectric.setupActivity(chord_changes_page.class);
        activity.findViewById(R.id.G_Major_E_Minor_D_Major_G_Major).performClick();

        Intent expectedIntent = new Intent(activity, g_major_e_minor_c_major_g_major.class);
        Intent actual = ShadowApplication.getInstance().getNextStartedActivity();
        Assert.assertEquals(expectedIntent.getComponent(), actual.getComponent());
    }

    /*
         Test to prove clicking C_G_F_Am_F_Am_F_Fm button opens the correct tutorial page
          */
    @Test
    public void C_G_F_Am_F_Am_F_Fm() {
        chord_changes_page activity = Robolectric.setupActivity(chord_changes_page.class);
        activity.findViewById(R.id.C_Major_G_Major_F_Major_A_Minor_F_Major_F_Minor).performClick();

        Intent expectedIntent = new Intent(activity, c_g_am_f_am_f_fm.class);
        Intent actual = ShadowApplication.getInstance().getNextStartedActivity();
        Assert.assertEquals(expectedIntent.getComponent(), actual.getComponent());
    }

    /*
        Test to prove clicking Bm_D_G_D_G_D_E button opens the correct tutorial page
         */
    @Test
    public void Bm_D_G_D_G_D_E() {
        chord_changes_page activity = Robolectric.setupActivity(chord_changes_page.class);
        activity.findViewById(R.id.B_Minor_D_Major_G_Major_D_Major_G_Major_D_Major_E_Major).performClick();

        Intent expectedIntent = new Intent(activity, bm_d_g_d_g_d_e.class);
        Intent actual = ShadowApplication.getInstance().getNextStartedActivity();
        Assert.assertEquals(expectedIntent.getComponent(), actual.getComponent());
    }

    /*
        Test to prove clicking Em_Am_G_C_G_B7 button opens the correct tutorial page
         */
    @Test
    public void Em_Am_G_C_G_B7() {
        chord_changes_page activity = Robolectric.setupActivity(chord_changes_page.class);
        activity.findViewById(R.id.E_Minor_A_Minor_G_Major_C_Major_G_Major_B_Seventh).performClick();

        Intent expectedIntent = new Intent(activity, em_am_g_c_g_b7.class);
        Intent actual = ShadowApplication.getInstance().getNextStartedActivity();
        Assert.assertEquals(expectedIntent.getComponent(), actual.getComponent());
    }


}
