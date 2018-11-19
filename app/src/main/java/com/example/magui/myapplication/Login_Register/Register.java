package com.example.magui.myapplication.Login_Register;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.magui.myapplication.R;
import com.kosalgeek.asynctask.AsyncResponse;
import com.kosalgeek.asynctask.PostResponseAsyncTask;

import java.util.HashMap;

/**
 * Created by magui on 21/08/2017.
 */

public class Register extends AppCompatActivity implements AsyncResponse, View.OnClickListener {

    EditText first_name, last_name, username, pass;
    Button register;
    configuration configuration = new configuration();

    // note: there is a problem here with registration where the first and last name are registered as the username and password

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);

        first_name = (EditText) findViewById(R.id.Reg_firstname);
        last_name = (EditText) findViewById(R.id.Reg_lastname);
        username = (EditText) findViewById(R.id.Reg_Username);
        pass = (EditText) findViewById(R.id.Reg_password);
        register = (Button) findViewById(R.id.Register_button);

        register.setOnClickListener(this);


    }


    @Override
    public void processFinish(String result) {


// if statement to handles successful or unsuccessful registration

        if (result.equals("success")) {

            Toast.makeText(this, "You have registered successfully!", Toast.LENGTH_LONG).show();

            Intent intent = new Intent(getBaseContext(), User_Activity.class);
            startActivity(intent);


        } else {
            Toast.makeText(this, "Registration Failed, Try a different username", Toast.LENGTH_LONG).show();
        }
    }


    @Override
    public void onClick(View v) {

        // hash map to post user entered details to db

        HashMap postData = new HashMap();
        postData.put("first_name", first_name.getText().toString());
        postData.put("last_name", last_name.getText().toString());
        postData.put("username", username.getText().toString());
        postData.put("pass", pass.getText().toString());

        String firstName = first_name.getText().toString();
        String lastName = last_name.getText().toString();
        String userName = username.getText().toString();
        String passWord = pass.getText().toString();

        // validation for user empty fields
        if (firstName.isEmpty() || lastName.isEmpty() || userName.isEmpty() || passWord.isEmpty()) {

            Toast.makeText(this, "Please enter all the required fields", Toast.LENGTH_LONG).show();
        }

        else if (TextUtils.isDigitsOnly(passWord)) {
            pass.setError("Must include characters");
        }

        else if (TextUtils.isEmpty(userName) || TextUtils.isDigitsOnly(userName)) {
            username.setError("Must include characters");
        }

        // validation for a password below the required length
        else if (passWord.length() < 7) {

            pass.setError("Password must be at least 7 characters ");
            //Toast.makeText(this, "Password must be at least 7 characters ", Toast.LENGTH_LONG).show();
        }
        // validation for a password below the required length
        else if (userName.length() < 7) {

            username.setError("Username must be at least 7 characters ");
            //Toast.makeText(this, "Username must be at least 7 characters ", Toast.LENGTH_LONG).show();


        } else {
            // will execute the register.php file once the user has entered the required criteria
            PostResponseAsyncTask task = new PostResponseAsyncTask(this, postData);
            task.execute("http://10.0.2.2/AndroidApp/register.php");

            // sets username in configuration class
            configuration.setUsername(username.getText().toString().trim());


        }
    }
}