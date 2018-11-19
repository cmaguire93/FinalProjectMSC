package com.example.magui.myapplication.tab3.chord_transitions;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.AnimationDrawable;
import android.media.MediaPlayer;
import android.media.MediaRecorder;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.support.v4.content.ContextCompat;
import android.support.v4.content.FileProvider;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.example.magui.myapplication.Login_Register.configuration;
import com.example.magui.myapplication.R;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import static android.Manifest.permission.RECORD_AUDIO;
import static android.Manifest.permission.WRITE_EXTERNAL_STORAGE;

/**
 * Created by magui on 24/08/2017.
 */

public class g_major_e_minor_c_major_g_major extends FragmentActivity {

    // variables
    Button Listen, Listen_half, buttonStart, buttonStop, buttonCompareAudio, buttonStopPlayback, buttonGetHelp;
    String AudioSavePathInDevice = null;
    MediaRecorder Recorder;
    Random random;
    String RandomAudioFileName = "FileName";
    public static final int RequestPermissionCode = 1;
    MediaPlayer mediaPlayer;
    RequestQueue requestQueue;

    // creating configuration class
    final configuration configuration = new configuration();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tutor_chords_g_em_c_g);

        // initialising variables
        buttonStart = (Button) findViewById(R.id.start_recording);
        buttonStop = (Button) findViewById(R.id.stop_recording);
        buttonCompareAudio = (Button) findViewById(R.id.compare);
        buttonStopPlayback = (Button) findViewById(R.id.stop_playback);
        buttonGetHelp = (Button) findViewById(R.id.Get_Help);
        Listen = (Button) findViewById(R.id.listen);
        Listen_half = (Button) findViewById(R.id.play_half_speed);

        buttonStop.setEnabled(false);
        buttonCompareAudio.setEnabled(false);
        buttonStopPlayback.setEnabled(false);
        buttonGetHelp.setEnabled(false);

        // creating random class
        random = new Random();

        // initialising image view
        ImageView imageView = (ImageView) findViewById(R.id.Chord);
        imageView.setImageResource(R.drawable.transition_g_em_c_g);

        // creating media player
        final MediaPlayer g_em_c_g = MediaPlayer.create(this, R.raw.transition_g_em_c_g);
        final MediaPlayer g_em_c_g_half = MediaPlayer.create(this, R.raw.transition_g_em_c_g_half);

        // onclick listener to play audio and start animation transition
        Listen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ImageView imageView = (ImageView) findViewById(R.id.Chord);
                imageView.setImageResource(R.drawable.transition_g_em_c_g);

                AnimationDrawable transition = (AnimationDrawable) imageView.getDrawable();

                g_em_c_g.start();
                transition.start();

                //updates user's basic chord achievement
                updateLearnIntermediateChordsAchievement(configuration.UPDATE_INTERMEDIATE_CHORDS_ACHIEVEMENT);

            }


        });

        Listen_half.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ImageView imageView = (ImageView) findViewById(R.id.Chord);
                imageView.setImageResource(R.drawable.transition_g_em_c_g_half);

                AnimationDrawable transition = (AnimationDrawable) imageView.getDrawable();

                g_em_c_g_half.start();
                transition.start();


            }


        });


        // onclick listener to check storage permission
        buttonStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (checkForPermission()) {

                    AudioSavePathInDevice = Environment.getExternalStorageDirectory().getAbsolutePath() + "/" + "AudioRecording.mp3";
                    //AudioSavePathInDevice +="AudioRecording.3gp";
                    //+ "/" + CreateFileName(5) + "AudioRecording.3gp";

                    // calls unlock record audio method
                    unlockRecordAudioAchievement(configuration.UNLOCK_RECORD_AUDIO_ACHIEVEMENT);

                    RecorderSetup();

                    try {
                        Recorder.prepare();
                        Recorder.start();
                    } catch (IllegalStateException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    } catch (IOException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }

                    buttonStart.setEnabled(false);
                    buttonStop.setEnabled(true);

                    Toast.makeText(g_major_e_minor_c_major_g_major.this, "Recording started",
                            Toast.LENGTH_LONG).show();
                } else {
                    requestPermission();
                }

            }
        });
        // onclick listener to handle stop button
        buttonStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Recorder.stop();
                buttonStop.setEnabled(false);
                buttonCompareAudio.setEnabled(true);
                buttonStart.setEnabled(true);
                buttonStopPlayback.setEnabled(false);
                buttonGetHelp.setEnabled(true);

                Toast.makeText(g_major_e_minor_c_major_g_major.this, "Recording Completed",
                        Toast.LENGTH_LONG).show();
            }
        });

        // onclick to handler compare button
        // will output audio user has recorded then the correct playing of the chord sequence for comparison
        buttonCompareAudio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) throws IllegalArgumentException,
                    SecurityException, IllegalStateException {

                buttonStop.setEnabled(false);
                buttonStart.setEnabled(false);
                buttonStopPlayback.setEnabled(true);

                mediaPlayer = new MediaPlayer();
                try {
                    mediaPlayer.setDataSource(AudioSavePathInDevice);
                    mediaPlayer.prepare();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                mediaPlayer.start();
                Toast.makeText(g_major_e_minor_c_major_g_major.this, "How you sound",
                        Toast.LENGTH_LONG).show();


                // on completion listener to stop user audio and then play correct chord sequence
                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mediaPlayer.stop();

                        g_em_c_g.start();

                        Toast.makeText(g_major_e_minor_c_major_g_major.this, "How its supposed to sound",
                                Toast.LENGTH_LONG).show();


                    }
                });

            }
        });

        // onclcik to handle stop playback
        buttonStopPlayback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonStop.setEnabled(false);
                buttonStart.setEnabled(true);
                buttonStopPlayback.setEnabled(false);
                buttonCompareAudio.setEnabled(true);

                if (mediaPlayer != null) {
                    mediaPlayer.stop();
                    mediaPlayer.release();
                    RecorderSetup();
                }
            }
        });

        // will send audio user has recorded to tutor's email address
        buttonGetHelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonStop.setEnabled(false);
                buttonStart.setEnabled(true);
                buttonStopPlayback.setEnabled(false);
                buttonCompareAudio.setEnabled(true);

                /**
                 * Intent to open up email
                 */
                //String fileName = "/AudioRecording.3pg";
                //File fileLocation = new File(Environment.getExternalStorageDirectory().getAbsolutePath(), fileName);
                //Uri path = Uri.fromFile(fileLocation);

                // Intent to open user apps with email function
                // Will create template email with the user recorded audio as an attachment
                Intent i = new Intent(Intent.ACTION_SEND_MULTIPLE);
                i.setType("message/rfc822");
                i.putExtra(Intent.EXTRA_EMAIL, new String[]{"cmaguire82@qub.ac.uk"});
                i.putExtra(Intent.EXTRA_SUBJECT, "Help with this chord transition");
                i.putExtra(Intent.EXTRA_TEXT, "I'm having trouble learning this chord transition could you help? ");

                ArrayList<Uri> uris = new ArrayList<Uri>();
                String shareName = new String(Environment.getExternalStorageDirectory() + "/AudioRecording.mp3");
                File shareFile = new File(shareName);
                Uri contentUri = FileProvider.getUriForFile(getApplicationContext(), "com.example.magui.myapplication.provider", shareFile);
                uris.add(contentUri);
                i.putParcelableArrayListExtra(Intent.EXTRA_STREAM, uris);

                // Grant temporary read permission to the content URI
                i.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);

                String msgStr = "Share...";
                startActivity(Intent.createChooser(i, msgStr));

                // calls unlocked send audio method
                unlockSendAudioAchievement(configuration.UNLOCK_SEND_AUDIO_ACHIEVEMENT);

            }
        });


    }

    /*
    Method to setup the media recorder
     */
    public void RecorderSetup() {
        Recorder = new MediaRecorder();
        Recorder.setAudioSource(MediaRecorder.AudioSource.MIC);
        Recorder.setOutputFormat(MediaRecorder.OutputFormat.THREE_GPP);
        Recorder.setAudioEncoder(MediaRecorder.OutputFormat.AMR_NB);
        Recorder.setOutputFile(AudioSavePathInDevice);
    }

    /*
     Method to create file name for user audio
         */
    public String CreateFileName(int string) {
        StringBuilder stringBuilder = new StringBuilder(string);
        int i = 0;
        while (i < string) {
            stringBuilder.append(RandomAudioFileName.
                    charAt(random.nextInt(RandomAudioFileName.length())));

            i++;
        }
        return stringBuilder.toString();
    }

    /*
    Method to request permission to record audio and write external storage
     */
    private void requestPermission() {
        ActivityCompat.requestPermissions(g_major_e_minor_c_major_g_major.this, new
                String[]{WRITE_EXTERNAL_STORAGE, RECORD_AUDIO}, RequestPermissionCode);
    }

    /*
        Method to handle user response to request permission
         */
    @Override
    public void onRequestPermissionsResult(int requestCode,
                                           String permissions[], int[] grantResults) {
        switch (requestCode) {
            case RequestPermissionCode:
                if (grantResults.length > 0) {
                    boolean StoragePermission = grantResults[0] ==
                            PackageManager.PERMISSION_GRANTED;
                    boolean RecordPermission = grantResults[1] ==
                            PackageManager.PERMISSION_GRANTED;

                    if (StoragePermission && RecordPermission) {
                        Toast.makeText(g_major_e_minor_c_major_g_major.this, "Permission Granted",
                                Toast.LENGTH_LONG).show();
                    } else {
                        Toast.makeText(g_major_e_minor_c_major_g_major.this, "Permission Denied", Toast.LENGTH_LONG).show();
                    }
                }
                break;
        }
    }

    /*
    Checks permission for record audio and storage
     */
    public boolean checkForPermission() {
        int result = ContextCompat.checkSelfPermission(getApplicationContext(),
                WRITE_EXTERNAL_STORAGE);
        int result1 = ContextCompat.checkSelfPermission(getApplicationContext(),
                RECORD_AUDIO);
        return result == PackageManager.PERMISSION_GRANTED &&
                result1 == PackageManager.PERMISSION_GRANTED;
    }

    /*
   Program which handles the unlock Record audio achievement
    */
    public void unlockRecordAudioAchievement(String phpURL) {

        StringRequest request = new StringRequest(Request.Method.POST, phpURL,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        //doesn't return anything
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        //error response
                    }

                }
        ) {
            @Override
            protected Map<String, String> getParams() {
                Map<String, String> params = new HashMap<String, String>();
                //params.put("user_id", configuration.KEY_USER_ID);
                params.put("username", configuration.KEY_USERNAME);
                params.put("pass", configuration.KEY_PASS);

                return params;
            }
        };

        requestQueue.add(request);

    }

    /*
Program which handles the unlock Record audio achievement
 */
    public void unlockSendAudioAchievement(String phpURL) {

        StringRequest request = new StringRequest(Request.Method.POST, phpURL,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        //doesn't return anything
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        //error response
                    }

                }
        ) {
            @Override
            protected Map<String, String> getParams() {
                Map<String, String> params = new HashMap<String, String>();
                //params.put("user_id", configuration.KEY_USER_ID);
                params.put("username", configuration.KEY_USERNAME);
                params.put("pass", configuration.KEY_PASS);

                return params;
            }
        };

        requestQueue.add(request);

    }

    /*
          Program which handles the update learn chord achievement
           */
    public void updateLearnIntermediateChordsAchievement(String phpURL) {

        StringRequest request = new StringRequest(Request.Method.POST, phpURL,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        //doesn't return anything
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        //error response
                    }

                }
        ) {
            @Override
            protected Map<String, String> getParams() {
                Map<String, String> params = new HashMap<String, String>();
                //params.put("user_id", configuration.KEY_USER_ID);
                params.put("username", configuration.KEY_USERNAME);
                params.put("pass", configuration.KEY_PASS);

                return params;
            }
        };

        requestQueue.add(request);

    }
}
