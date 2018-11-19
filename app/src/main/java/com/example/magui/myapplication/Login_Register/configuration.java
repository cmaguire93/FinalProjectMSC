package com.example.magui.myapplication.Login_Register;

/**
 * Created by magui on 31/08/2017.
 */
/*
Configuration for hosting app locally
 */
public class configuration {

    //URL to our login.php file
    public static final String LOGIN_URL = "http://10.0.2.2/AndroidApp/Login2.php";

    //URL to .php file which returns an array response
    public static final String LOGIN_URL2 = "http://10.0.2.2/AndroidApp/loginArray.php";

    //Strings referring to .php files which will unlock user achievements
    //public final String UNLOCK_REGISTER_ACHIEVEMENT = "http://10.0.2.2/AndroidApp/Register_Achievement.php";
    public static final String UPDATE_BASIC_CHORDS_ACHIEVEMENT = "http://10.0.2.2/AndroidApp/Beginner_Chords_Achievement.php";
    public static final String UPDATE_INTERMEDIATE_CHORDS_ACHIEVEMENT = "http://10.0.2.2/AndroidApp/Intermedite_Chords_Achievement.php";
    public static final String UNLOCK_RECORD_AUDIO_ACHIEVEMENT = "http://10.0.2.2/AndroidApp/Record_Audio_Achievement.php";
    public static final String UPDATE_BASIC_RIFFS_ACHIEVEMENT = "http://10.0.2.2/AndroidApp/Basic_Riffs_Achievement.php";
    public static final String UPDATE_INTERMEDIATE_RIFFS_ACHIEVEMENT = "http://10.0.2.2/AndroidApp/INtermediate_Riffs_Achievement.php";
    public static final String UNLOCK_SEND_AUDIO_ACHIEVEMENT = "http://10.0.2.2/AndroidApp/Send_Audio_Achievement.php";

    //view achievements.php files needs to be created
    public final String VIEW_UNLOCKED_ACHIEVEMENTS = "http://10.0.2.2/AndroidApp/View_Achievements.php";

    //Keys for email and password as defined in login.php
    public static final String KEY_USERNAME = "username";
    public static final String KEY_PASS = "pass";
    public static final String KEY_USER_ID = "userid";

    //If server response is equal to this that means login is successful
    public static final String LOGIN_SUCCESS = "success";

    // Corresponds to database
    public static final String SHARED_PREF_NAME = "guitar_tutor";

    // Username
    public static final String USERNAME_SHARED_PREF = "username";

    //Used to track if user is logged in/out
    public static final String LOGGEDIN_SHARED_PREF = "loggedin";

/*
Global variables
 */

    public static String username;
    public static String user_password;

    //getters and setters for global variables
    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public String getUser_Password() {return this.user_password;}

    public void setUser_Password(String user_password) {this.user_password = user_password;}


}




