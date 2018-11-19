package com.example.magui.myapplication.tab1.Fsharp_B;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.magui.myapplication.R;

/**
 * Created by magui on 09/08/2017.
 */

public class chord_G_Sharp_Seventh extends Fragment {

    /**
     * Mthod diplays content of the c sharp page
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.g_sharp_seventh, container, false);

        Button play_GSharpSeventh = (Button) rootView.findViewById(R.id.play_G_Sharp_Seventh);


        play_GSharpSeventh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final MediaPlayer GSharpSeventh= MediaPlayer.create(getActivity(), R.raw.g_sharp_seventh);

                GSharpSeventh.start();
            }
        });



        return rootView;

    }
}

