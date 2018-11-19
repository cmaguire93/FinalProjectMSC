package com.example.magui.myapplication.Login_Register;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatButton;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.magui.myapplication.R;

import java.util.HashMap;
import java.util.Map;


public class Login2 extends AppCompatActivity implements View.OnClickListener {

    //Defining edit texts
    private EditText editTextUsername;
    private EditText editTextPassword;
    private AppCompatButton buttonLogin;
    Button button;

    //boolean variable to check if user is logged in or not
    //initially it is false
    private boolean loggedIn = false;

    // new instance of configuration class
    configuration configuration = new configuration();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login2);

        //Initializing views
        editTextUsername = (EditText) findViewById(R.id.editTextUsername);
        editTextPassword = (EditText) findViewById(R.id.editTextPass);
        button = (Button) findViewById(R.id.Register_button);
        buttonLogin = (AppCompatButton) findViewById(R.id.buttonLogin);


        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), User_Activity.class);
                startActivity(intent);
            }
        });

        //Adding click listener
        buttonLogin.setOnClickListener(this);


    }

    @Override
    protected void onResume() {
        super.onResume();
        //In on resume fetching value from configuration
        SharedPreferences sharedPreferences = getSharedPreferences(configuration.SHARED_PREF_NAME, Context.MODE_PRIVATE);

        //Fetching the boolean value form configuration
        loggedIn = sharedPreferences.getBoolean(configuration.LOGGEDIN_SHARED_PREF, false);

        //If loggedIn is true
        if (loggedIn) {
            //Intent to begin user activity
            Intent intent = new Intent(Login2.this, User_Activity.class);
            startActivity(intent);
        }
    }

    private void login() {
        //Getting values from edit texts
        final String username = editTextUsername.getText().toString().trim();
        final String pass = editTextPassword.getText().toString().trim();

        //Creating a string request
        StringRequest stringRequest = new StringRequest(Request.Method.POST, configuration.LOGIN_URL,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {


                        //If we are getting success echo from server
                        if (response.equalsIgnoreCase(configuration.LOGIN_SUCCESS)) {


                            //sets verified values in configuration class
                            configuration.setUsername(editTextUsername.getText().toString().trim());
                            configuration.setUser_Password(editTextPassword.getText().toString().trim());




/*
                            //gets boolean response from array
                        try {
                            JSONObject jsonResponse = new JSONObject(response);
                            boolean success = jsonResponse.getBoolean("success");



                            //sets user id variable to what is stored in the database
                            configuration.setUser_id(jsonResponse.getString("userid"));


                            if (success) {
*/
                            //Creating a shared preference
                            SharedPreferences sharedPreferences = Login2.this.getSharedPreferences(configuration.SHARED_PREF_NAME, Context.MODE_PRIVATE);

                            //Creating editor to store values to shared preferences
                            SharedPreferences.Editor editor = sharedPreferences.edit();

                            //Adding values to editor
                            editor.putBoolean(configuration.LOGGEDIN_SHARED_PREF, true);
                            editor.putString(configuration.USERNAME_SHARED_PREF, username);
                            editor.putString(configuration.KEY_PASS, pass);

                            //may need to be changed!!
                            //editor.putString(configuration.KEY_USER_ID, configuration.getUserID());

                            //Saving values to editor
                            editor.commit();

                            //Starting user profile activity
                            Intent intent = new Intent(Login2.this, User_Activity.class);
                            startActivity(intent);
                            Toast.makeText(Login2.this, "Login successful!", Toast.LENGTH_LONG).show();


                        } else {
                            //If the server response is not "success"
                            //Displaying an error message on toast
                            Toast.makeText(Login2.this, "Invalid username or password, Try again", Toast.LENGTH_LONG).show();
                        }
                            /*

                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
*/
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                }) {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String, String> params = new HashMap<>();
                //Adding parameters to request
                params.put(configuration.KEY_USERNAME, username);
                params.put(configuration.KEY_PASS, pass);

                //returning parameters
                return params;
            }
        };

        //Adding the string request to the queue
        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);
    }

    @Override
    public void onClick(View v) {
        //Calling the login function
        login();
    }
}
