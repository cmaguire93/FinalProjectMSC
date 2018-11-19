package com.example.magui.myapplication;

import android.test.ActivityInstrumentationTestCase2;

import com.example.magui.myapplication.tab1.tab1;


public class MainActivityTest extends
        ActivityInstrumentationTestCase2<MainActivity> {

    private MainActivity testingActivity;
    private tab1 testFragment;
    //...

    public MainActivityTest() {

        super(MainActivity.class);
    }




    @Override
    protected void setUp() throws Exception {
        super.setUp();

        // Starts the activity under test using
        // the default Intent with:
        // action = {@link Intent#ACTION_MAIN}
        // flags = {@link Intent#FLAG_ACTIVITY_NEW_TASK}
        // All other fields are null or empty.
        testingActivity = getActivity();

        testFragment = new tab1();
       // testingActivity.getFragmentManager().beginTransaction().add(R.id.container,testFragment,null).commit();
        /**
         * Synchronously wait for the application to be idle.  Can not be called
         * from the main application thread -- use {@link #start} to execute
         * instrumentation in its own thread.
         *
         * Without waitForIdleSync(); our test would have nulls in fragment references.
         */
        getInstrumentation().waitForIdleSync();
    }



}