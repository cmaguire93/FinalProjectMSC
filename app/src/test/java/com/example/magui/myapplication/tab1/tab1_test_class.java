package com.example.magui.myapplication.tab1;

import android.content.Intent;

import com.example.magui.myapplication.Login_Register.Login2;
import com.example.magui.myapplication.Login_Register.Register;
import com.example.magui.myapplication.MainActivity;
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

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.shadows.ShadowApplication;

/**
 * Created by magui on 29/01/2018.
 * Tests intents stemming form tab 1 page work correctly
 */
@RunWith(RobolectricTestRunner.class)
public class tab1_test_class {


    /*
Test to prove clicking Login textView opens login page
*/
    @Test
    public void Login_Intent_test() {
        MainActivity activity = Robolectric.setupActivity(MainActivity.class);
        activity.findViewById(R.id.Login).performClick();

        Intent expectedIntent = new Intent(activity, Login2.class);
        Intent actual = ShadowApplication.getInstance().getNextStartedActivity();
        Assert.assertEquals(expectedIntent.getComponent(), actual.getComponent());
    }

    /*
Test to prove clicking Register textView opens register page
*/
    @Test
    public void Register_Intent_test() {

        MainActivity activity = Robolectric.setupActivity(MainActivity.class);
        activity.findViewById(R.id.Register).performClick();

        Intent expectedIntent = new Intent(activity, Register.class);
        Intent actual = ShadowApplication.getInstance().getNextStartedActivity();
        Assert.assertEquals(expectedIntent.getComponent(), actual.getComponent());
    }

    /*
  Test to prove clicking C button opens correct chord handler page
   */
    @Test
    public void C_chord_test() {
        MainActivity activity = Robolectric.setupActivity(MainActivity.class);
        activity.findViewById(R.id.C_button).performClick();

        Intent expectedIntent = new Intent(activity, chord_C_handler.class);
        Intent actual = ShadowApplication.getInstance().getNextStartedActivity();
        Assert.assertEquals(expectedIntent.getComponent(), actual.getComponent());
    }

    /*
Test to prove clicking D button opens correct chord handler page
*/
    @Test
    public void D_chord_test() {
        MainActivity activity = Robolectric.setupActivity(MainActivity.class);
        activity.findViewById(R.id.D_button).performClick();

        Intent expectedIntent = new Intent(activity, chord_D_handler.class);
        Intent actual = ShadowApplication.getInstance().getNextStartedActivity();
        Assert.assertEquals(expectedIntent.getComponent(), actual.getComponent());
    }

    /*
Test to prove clicking E button opens correct chord handler page
*/
    @Test
    public void E_chord_test() {
        MainActivity activity = Robolectric.setupActivity(MainActivity.class);
        activity.findViewById(R.id.E_button).performClick();

        Intent expectedIntent = new Intent(activity, chord_E_Handler.class);
        Intent actual = ShadowApplication.getInstance().getNextStartedActivity();
        Assert.assertEquals(expectedIntent.getComponent(), actual.getComponent());
    }

    /*
Test to prove clicking F button opens correct chord handler page
*/
    @Test
    public void F_chord_test() {
        MainActivity activity = Robolectric.setupActivity(MainActivity.class);
        activity.findViewById(R.id.F_button).performClick();

        Intent expectedIntent = new Intent(activity, chord_F_Handler.class);
        Intent actual = ShadowApplication.getInstance().getNextStartedActivity();
        Assert.assertEquals(expectedIntent.getComponent(), actual.getComponent());
    }

    /*
Test to prove clicking G button opens correct chord handler page
*/
    @Test
    public void G_chord_test() {
        MainActivity activity = Robolectric.setupActivity(MainActivity.class);
        activity.findViewById(R.id.G_button).performClick();

        Intent expectedIntent = new Intent(activity, chord_G_Handler.class);
        Intent actual = ShadowApplication.getInstance().getNextStartedActivity();
        Assert.assertEquals(expectedIntent.getComponent(), actual.getComponent());
    }

    /*
Test to prove clicking A button opens correct chord handler page
*/
    @Test
    public void A_chord_test() {
        MainActivity activity = Robolectric.setupActivity(MainActivity.class);
        activity.findViewById(R.id.A_button).performClick();

        Intent expectedIntent = new Intent(activity, chord_A_Handler.class);
        Intent actual = ShadowApplication.getInstance().getNextStartedActivity();
        Assert.assertEquals(expectedIntent.getComponent(), actual.getComponent());
    }

    /*
Test to prove clicking B button opens correct chord handler page
*/
    @Test
    public void B_chord_test() {
        MainActivity activity = Robolectric.setupActivity(MainActivity.class);
        activity.findViewById(R.id.B_button).performClick();

        Intent expectedIntent = new Intent(activity, chord_B_Handler.class);
        Intent actual = ShadowApplication.getInstance().getNextStartedActivity();
        Assert.assertEquals(expectedIntent.getComponent(), actual.getComponent());
    }

    /*
Test to prove clicking C sharp  button opens correct chord handler page
 */
    @Test
    public void C_Sharp_chord_test() {
        MainActivity activity = Robolectric.setupActivity(MainActivity.class);
        activity.findViewById(R.id.C_Sharp_button).performClick();

        Intent expectedIntent = new Intent(activity, chord_C_Sharp_handler.class);
        Intent actual = ShadowApplication.getInstance().getNextStartedActivity();
        Assert.assertEquals(expectedIntent.getComponent(), actual.getComponent());
    }

    /*
Test to prove clicking D sharp button opens correct chord handler page
*/
    @Test
    public void D_Sharp_chord_test() {
        MainActivity activity = Robolectric.setupActivity(MainActivity.class);
        activity.findViewById(R.id.D_Sharp_button).performClick();

        Intent expectedIntent = new Intent(activity, chord_D_Sharp_handler.class);
        Intent actual = ShadowApplication.getInstance().getNextStartedActivity();
        Assert.assertEquals(expectedIntent.getComponent(), actual.getComponent());
    }

    /*
Test to prove clicking F sharp  button opens correct chord handler page
*/
    @Test
    public void F_Sharp_chord_test() {
        MainActivity activity = Robolectric.setupActivity(MainActivity.class);
        activity.findViewById(R.id.F_Sharp_button).performClick();

        Intent expectedIntent = new Intent(activity, chord_F_Sharp_Handler.class);
        Intent actual = ShadowApplication.getInstance().getNextStartedActivity();
        Assert.assertEquals(expectedIntent.getComponent(), actual.getComponent());
    }

    /*
Test to prove clicking G sharp  button opens correct chord handler page
*/
    @Test
    public void G_Sharp_chord_test() {
        MainActivity activity = Robolectric.setupActivity(MainActivity.class);
        activity.findViewById(R.id.G_Sharp_button).performClick();

        Intent expectedIntent = new Intent(activity, chord_G_Sharp_Handler.class);
        Intent actual = ShadowApplication.getInstance().getNextStartedActivity();
        Assert.assertEquals(expectedIntent.getComponent(), actual.getComponent());
    }

    /*
Test to prove clicking A sharp button opens correct chord handler page
*/
    @Test
    public void A_Sharp_chord_test() {
        MainActivity activity = Robolectric.setupActivity(MainActivity.class);
        activity.findViewById(R.id.A_Sharp_button).performClick();

        Intent expectedIntent = new Intent(activity, chord_A_Sharp_Handler.class);
        Intent actual = ShadowApplication.getInstance().getNextStartedActivity();
        Assert.assertEquals(expectedIntent.getComponent(), actual.getComponent());
    }




}
