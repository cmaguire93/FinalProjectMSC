package com.example.magui.myapplication.Login_Register;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.magui.myapplication.MainActivity;
import com.example.magui.myapplication.MainActivity_logged_in;
import com.example.magui.myapplication.R;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by magui on 28/08/2017.
 */

public class User_Activity extends AppCompatActivity {


    TextView textView;
    Button button;

    RequestQueue requestQueue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_user_activity);


        //Initialising textview
        textView = (TextView) findViewById(R.id.textView);

        // Request queue
        requestQueue = Volley.newRequestQueue(getApplicationContext());

        // initialising button
        button = (Button) findViewById(R.id.Proceed);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), MainActivity_logged_in.class);
                startActivity(intent);
            }
        });


        //Fetching username from shared preferences
        SharedPreferences sharedPreferences = getSharedPreferences(configuration.SHARED_PREF_NAME, Context.MODE_PRIVATE);
        String username = sharedPreferences.getString(configuration.USERNAME_SHARED_PREF, "Not Available");

        //Showing the current logged in email to textview
        textView.setText("Current User: " + configuration.KEY_USERNAME);
        //textView.setText("User ID"+ configuration.KEY_USER_ID);
    }


    //Logout function
    private void logout() {
        //Creating an alert dialog to confirm logout
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setMessage("Are you sure you want to logout?");
        alertDialogBuilder.setPositiveButton("Yes",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {

                        //Getting out sharedpreferences
                        SharedPreferences preferences = getSharedPreferences(configuration.SHARED_PREF_NAME, Context.MODE_PRIVATE);
                        //Getting editor
                        SharedPreferences.Editor editor = preferences.edit();

                        //Puting the value false for loggedin
                        editor.putBoolean(configuration.LOGGEDIN_SHARED_PREF, false);

                        //Putting blank value to email
                        editor.putString(configuration.USERNAME_SHARED_PREF, "");

                        //Saving the sharedpreferences
                        editor.commit();

                        //Starting login activity
                        Intent intent = new Intent(getBaseContext(), MainActivity.class);
                        startActivity(intent);
                    }
                });

        alertDialogBuilder.setNegativeButton("No",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {

                    }
                });

        //Showing the alert dialog
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //Adding our menu to toolbar
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.menuLogout) {
            //calling logout method when the logout button is clicked
            logout();
        }
        return super.onOptionsItemSelected(item);
    }



public void viewAchievements(String phpURL) {

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