package com.example.magui.myapplication.tab1.C_F;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;

import com.example.magui.myapplication.R;

/**
 * Created by magui on 07/08/2017.
 */
/*
Handler class for f chord variants
 */
public class chord_F_Handler extends FragmentActivity {

    //@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.f_handler);

        //initialise view pager and page adaptor
        ViewPager mViewpager = (ViewPager) findViewById(R.id.F_Pager);
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
                    //change to c major
                    return chord_F_Major.newInstance("F Major");
                case 1:
                    return new chord_F_Minor();

                case 2:
                    return new chord_F_Seventh();

                default:
                    return null;
            }


        }

        /**
         * Get count method to return the number of items in the page viwer
         *
         * @return
         */
        @Override
        public int getCount() {
            return 3;
        }


    }

}
