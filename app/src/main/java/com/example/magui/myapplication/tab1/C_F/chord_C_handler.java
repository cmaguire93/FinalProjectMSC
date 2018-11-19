package com.example.magui.myapplication.tab1.C_F;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;

import com.example.magui.myapplication.R;

/**
 * Created by magui on 01/08/2017.
 */

/*
Class to handle the swipe view between c chord variants
 */
public class chord_C_handler extends FragmentActivity {

    // sets layout of activity
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.c_handler);

        //initialise view pager and page adaptor
        ViewPager mViewpager = (ViewPager) findViewById(R.id.C_HandlerPager);
        mViewpager.setAdapter(new ScreenSlidePagerAdapter(getSupportFragmentManager()));


    }

    /**
     * method to handle back press
     */
    @Override
    public void onBackPressed() {
        finish();

    }


    private class ScreenSlidePagerAdapter extends FragmentStatePagerAdapter {
        public ScreenSlidePagerAdapter(FragmentManager fm) {
            super(fm);
        }

        /**
         * Method witch implements switch to display content in the page viewer
         */
        @Override
        public android.support.v4.app.Fragment getItem(int position) {
            switch (position) {
                case 0:

                    return chord_C_Major.newInstance("C Major");
                case 1:
                    return new chord_C_Minor();

                case 2:
                    return new chord_C_Seventh();

                default:
                    return null;
            }


        }

        /**
         * Get count method to return the number of items in the page viewer
         *
         * @return
         */
        @Override
        public int getCount() {
            return 3;
        }


    }

}



