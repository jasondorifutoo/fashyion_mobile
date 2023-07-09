package com.example.uas_mobileprogramming_fashion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText clr_userid;
    EditText clr_userpwd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Declarations and Button Colouring
        Button clear_button = findViewById(R.id.clrbtn);
        clear_button.setBackgroundColor(Color.parseColor("#B5C99A"));
        Button login_button = findViewById(R.id.loginbtn);
        login_button.setBackgroundColor(Color.parseColor("#B5C99A"));
        Button signup_button = findViewById(R.id.signupbtn);
        signup_button.setBackgroundColor(Color.parseColor("#004AAD"));

        // clear all inputs if the clear button is clicked
        clr_userid = (EditText) findViewById(R.id.user_id);
        clr_userpwd = (EditText) findViewById(R.id.user_password);
        clear_button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //Clear EditText
                clr_userid.getText().clear();
                clr_userpwd.getText().clear();
            }
        });

        // Moving to the create account page if sign up button is clicked
        signup_button.setOnClickListener(view -> {
            Intent signup = new Intent(MainActivity.this, CreateAccount.class);
            startActivity(signup);
        });

        // Moving to the dashboard page if login button is clicked
        login_button.setOnClickListener(view -> {
            Intent login = new Intent(MainActivity.this, Dashboard.class);
            startActivity(login);
        });
    }
}