package com.example.magui.myapplication.tab3;

import android.content.Intent;

import com.example.magui.myapplication.R;
import com.example.magui.myapplication.tab3.guitar_riffs.come_as_you_are;
import com.example.magui.myapplication.tab3.guitar_riffs.fa;
import com.example.magui.myapplication.tab3.guitar_riffs.heartbreaker;
import com.example.magui.myapplication.tab3.guitar_riffs.iron_man;
import com.example.magui.myapplication.tab3.guitar_riffs.satisfaction;
import com.example.magui.myapplication.tab3.guitar_riffs.seven_nation_army;
import com.example.magui.myapplication.tab3.guitar_riffs.sotw;
import com.example.magui.myapplication.tab3.guitar_riffs.soyl;

import junit.framework.Assert;

import org.junit.Test;
import org.robolectric.Robolectric;
import org.robolectric.shadows.ShadowApplication;

/**
 * Created by magui on 29/01/2018.
 * Tests the intents on the learn riffs page of the app
 */

public class riffs_test {

    /*
Test to prove clicking smoke on the water button opens the correct tutorial page
 */
    @Test
    public void Smoke_On_The_Water_Test() {
        riffs_page activity = Robolectric.setupActivity(riffs_page.class);
        activity.findViewById(R.id.Sotw).performClick();

        Intent expectedIntent = new Intent(activity, sotw.class);
        Intent actual = ShadowApplication.getInstance().getNextStartedActivity();
        Assert.assertEquals(expectedIntent.getComponent(), actual.getComponent());
    }

    /*
Test to prove clicking satisfaction button opens the correct tutorial page
*/
    @Test
    public void Satisfaction() {
        riffs_page activity = Robolectric.setupActivity(riffs_page.class);
        activity.findViewById(R.id.Satisfaction).performClick();

        Intent expectedIntent = new Intent(activity, satisfaction.class);
        Intent actual = ShadowApplication.getInstance().getNextStartedActivity();
        Assert.assertEquals(expectedIntent.getComponent(), actual.getComponent());
    }


    /*
Test to prove clicking seven nation army button opens the correct tutorial page
*/
    @Test
    public void Seven_Nation_Army_Test() {
        riffs_page activity = Robolectric.setupActivity(riffs_page.class);
        activity.findViewById(R.id.Seven_nation_army).performClick();

        Intent expectedIntent = new Intent(activity, seven_nation_army.class);
        Intent actual = ShadowApplication.getInstance().getNextStartedActivity();
        Assert.assertEquals(expectedIntent.getComponent(), actual.getComponent());
    }


    /*
Test to prove clicking fluorescent adolescent button opens the correct tutorial page
*/
    @Test
    public void Fluorescent_Adolescent_Test() {
        riffs_page activity = Robolectric.setupActivity(riffs_page.class);
        activity.findViewById(R.id.Fluorescent_Adolescent).performClick();

        Intent expectedIntent = new Intent(activity, fa.class);
        Intent actual = ShadowApplication.getInstance().getNextStartedActivity();
        Assert.assertEquals(expectedIntent.getComponent(), actual.getComponent());
    }

    /*
   Test to prove clicking come as you are button opens the correct tutorial page
    */
    @Test
    public void Come_As_You_Are() {
        riffs_page activity = Robolectric.setupActivity(riffs_page.class);
        activity.findViewById(R.id.Come_As).performClick();

        Intent expectedIntent = new Intent(activity, come_as_you_are.class);
        Intent actual = ShadowApplication.getInstance().getNextStartedActivity();
        Assert.assertEquals(expectedIntent.getComponent(), actual.getComponent());
    }

    /*
   Test to prove clicking heartbreaker button opens the correct tutorial page
    */
    @Test
    public void Heartbreaker_Test() {
        riffs_page activity = Robolectric.setupActivity(riffs_page.class);
        activity.findViewById(R.id.Heartbreker).performClick();

        Intent expectedIntent = new Intent(activity, heartbreaker.class);
        Intent actual = ShadowApplication.getInstance().getNextStartedActivity();
        Assert.assertEquals(expectedIntent.getComponent(), actual.getComponent());
    }

    /*
Test to prove clicking SOYL button opens the correct tutorial page
*/
    @Test
    public void SOYL() {
        riffs_page activity = Robolectric.setupActivity(riffs_page.class);
        activity.findViewById(R.id.Sunshine).performClick();

        Intent expectedIntent = new Intent(activity, soyl.class);
        Intent actual = ShadowApplication.getInstance().getNextStartedActivity();
        Assert.assertEquals(expectedIntent.getComponent(), actual.getComponent());
    }

    /*
Test to prove clicking Ironman button opens the correct tutorial page
*/
    @Test
    public void Ironman_Test() {
        riffs_page activity = Robolectric.setupActivity(riffs_page.class);
        activity.findViewById(R.id.Iron_Man).performClick();

        Intent expectedIntent = new Intent(activity, iron_man.class);
        Intent actual = ShadowApplication.getInstance().getNextStartedActivity();
        Assert.assertEquals(expectedIntent.getComponent(), actual.getComponent());
    }

}