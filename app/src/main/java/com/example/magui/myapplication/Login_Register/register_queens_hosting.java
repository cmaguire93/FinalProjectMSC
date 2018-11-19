package com.example.magui.myapplication.Login_Register;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.magui.myapplication.R;
import com.kosalgeek.asynctask.AsyncResponse;
import com.kosalgeek.asynctask.PostResponseAsyncTask;

import java.util.HashMap;

/**
 * Created by magui on 07/09/2017.
 */

public class register_queens_hosting  extends AppCompatActivity implements AsyncResponse, View.OnClickListener{

    EditText first_name, last_name, username, pass;
    Button register;


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

        HashMap postData = new HashMap();


        if(result.equals("success")) {

            Toast.makeText(this, "Register Successful", Toast.LENGTH_LONG).show();

            Intent intent = new Intent(getBaseContext(), User_Activity.class);
            startActivity(intent);



        }else{
            Toast.makeText(this, "Register Failed", Toast.LENGTH_LONG).show();
        }
    }




    @Override
    public void onClick(View v) {

        HashMap postData = new HashMap();
        postData.put("first_name", first_name.getText().toString());
        postData.put("last_name", last_name.getText().toString());
        postData.put("username", username.getText().toString());
        postData.put("pass", pass.getText().toString());
        PostResponseAsyncTask task = new PostResponseAsyncTask(this, postData);
        task.execute("http://10.0.2.2/AndroidApp/register.php");


    }


}
