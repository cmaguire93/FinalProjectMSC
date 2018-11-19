package com.example.magui.myapplication.tab2;

import android.content.Intent;

import com.example.magui.myapplication.MainActivity;
import com.example.magui.myapplication.R;
import com.example.magui.myapplication.tab2.tuner.TunerActivity;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.shadows.ShadowApplication;

/**
 * Created by magui on 29/01/2018.
 */

@RunWith(RobolectricTestRunner.class)
public class tab2_test_class {

    /*
Test to prove clicking chromatic tuner button opens the chromatic tuner feature
*/
    @Test
    public void chromatic_tuner_test() {
        MainActivity activity = Robolectric.setupActivity(MainActivity.class);
        activity.findViewById(R.id.chromatic_tuner).performClick();

        Intent expectedIntent = new Intent(activity, TunerActivity.class);
        Intent actual = ShadowApplication.getInstance().getNextStartedActivity();
        Assert.assertEquals(expectedIntent.getComponent(), actual.getComponent());
    }

    /*
  Test to prove clicking chromatic tuner button opens the standard tuner feature
  */
    @Test
    public void standard_tuning_test() {
        MainActivity activity = Robolectric.setupActivity(MainActivity.class);
        activity.findViewById(R.id.button).performClick();

        Intent expectedIntent = new Intent(activity, standard_tuning.class);
        Intent actual = ShadowApplication.getInstance().getNextStartedActivity();
        Assert.assertEquals(expectedIntent.getComponent(), actual.getComponent());
    }


    /*
Test to prove clicking chromatic tuner button opens the drop d tuner feature
*/
    @Test
    public void drop_d_test() {
        MainActivity activity = Robolectric.setupActivity(MainActivity.class);
        activity.findViewById(R.id.button2).performClick();

        Intent expectedIntent = new Intent(activity, d_tuning.class);
        Intent actual = ShadowApplication.getInstance().getNextStartedActivity();
        Assert.assertEquals(expectedIntent.getComponent(), actual.getComponent());
    }

    /*
Test to prove clicking chromatic tuner button opens the open g tuner feature
*/
    @Test
    public void open_g_test() {
        MainActivity activity = Robolectric.setupActivity(MainActivity.class);
        activity.findViewById(R.id.button3).performClick();

        Intent expectedIntent = new Intent(activity, open_g_tuning.class);
        Intent actual = ShadowApplication.getInstance().getNextStartedActivity();
        Assert.assertEquals(expectedIntent.getComponent(), actual.getComponent());
    }


}



