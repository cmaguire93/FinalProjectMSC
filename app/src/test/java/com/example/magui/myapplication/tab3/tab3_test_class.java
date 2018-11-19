package com.example.magui.myapplication.tab3;

import android.content.Intent;

import com.example.magui.myapplication.MainActivity;
import com.example.magui.myapplication.R;
import com.example.magui.myapplication.tab3.finger_placements.finger_placements_handler;

import junit.framework.Assert;

import org.junit.Test;
import org.robolectric.Robolectric;
import org.robolectric.shadows.ShadowApplication;

/**
 * Created by magui on 29/01/2018.
 */

public class tab3_test_class {

    /*
Test to prove clicking learn chords button opens the correct tutorial menu
 */
    @Test
    public void learn_chords_test() {
        MainActivity activity = Robolectric.setupActivity(MainActivity.class);
        activity.findViewById(R.id.Learn_chord_changes).performClick();

        Intent expectedIntent = new Intent(activity, chord_changes_page.class);
        Intent actual = ShadowApplication.getInstance().getNextStartedActivity();
        Assert.assertEquals(expectedIntent.getComponent(), actual.getComponent());
    }

    /*
Test to prove clicking learn riffs button opens the correct tutorial menu
*/
    @Test
    public void learn_riffs_test() {
        MainActivity activity = Robolectric.setupActivity(MainActivity.class);
        activity.findViewById(R.id.Learn_riffs).performClick();

        Intent expectedIntent = new Intent(activity, riffs_page.class);
        Intent actual = ShadowApplication.getInstance().getNextStartedActivity();
        Assert.assertEquals(expectedIntent.getComponent(), actual.getComponent());
    }

    /*
   Test to prove clicking learn finger placements button opens learn finger placements section
    */
    @Test
    public void C_Sharp_chord_test() {
        MainActivity activity = Robolectric.setupActivity(MainActivity.class);
        activity.findViewById(R.id.finger_placement).performClick();

        Intent expectedIntent = new Intent(activity, finger_placements_handler.class);
        Intent actual = ShadowApplication.getInstance().getNextStartedActivity();
        Assert.assertEquals(expectedIntent.getComponent(), actual.getComponent());
    }
}
