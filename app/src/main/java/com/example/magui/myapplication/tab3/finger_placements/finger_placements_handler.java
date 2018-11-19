package com.example.magui.myapplication.tab3.finger_placements;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;

import com.example.magui.myapplication.R;

/**
 * Created by magui on 02/09/2017.
 */

public class finger_placements_handler extends FragmentActivity {

        //@Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.tutor_finger_placements_handler);

            //initialise view pager and page adaptor
            ViewPager mViewpager = (ViewPager) findViewById(R.id.finger_placement_pager);
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
                        return finger_placements_a_major.newInstance("D Major");
                    case 1:
                        return new finger_placements_b_major();

                    case 2:
                        return new finger_placements_c_major();

                    case 3:
                        return new finger_placements_d_major();
                    case 4:
                        return new finger_placements_e_major();

                    case 5:
                        return new finger_placements_f_major();

                    case 6:
                        return new finger_placements_g_major();

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
                return 7;
            }


        }

    }





/*
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tutor_finger_placements_a_major);

        final int[] tracker = new int[3];
        final MediaPlayer a_major = MediaPlayer.create(this, R.raw.a_major);

        Button button1 = (Button) findViewById(R.id.button1);
        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tracker[0] = 1;

                Toast.makeText(getBaseContext(), "try again!",
                        Toast.LENGTH_SHORT).show();


            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                for (int i = 0; i < 1; i++) {
                    if (tracker[i] == 0) {
                        Toast.makeText(getBaseContext(), "try again!",
                                Toast.LENGTH_SHORT).show();
                    } else {
                        tracker[1] = 1;
                    }
                }


            }
        });


        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                for (int i = 0; i < 1; i++) {
                    if (tracker[i] == 0) {
                        Toast.makeText(getBaseContext(), "try again!",
                                Toast.LENGTH_SHORT).show();
                    } else {
                        tracker[2] = 1;
                        Toast.makeText(getBaseContext(), "correct!",
                                Toast.LENGTH_SHORT).show();

                        a_major.start();

                    }
                }

            }
        });


    }
}
*/
