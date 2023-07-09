package com.example.uas_mobileprogramming_fashion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class CreateAccount extends AppCompatActivity {
    EditText clr_username;
    EditText clr_userid;
    EditText clr_userpwd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);
        // declarations of the button, thus changing the color
        Button clear_input = findViewById(R.id.clrbtn);
        clear_input.setBackgroundColor(Color.parseColor("#B5C99A"));
        Button backlogin = findViewById(R.id.backtologin);
        backlogin.setBackgroundColor(Color.parseColor("#B5C99A"));
        Button create_btn = findViewById(R.id.createbtn);
        create_btn.setBackgroundColor(Color.parseColor("#B5C99A"));
        RadioButton terms_condition = findViewById(R.id.termcondi);

        // clear all inputs if the clear button is clicked
        clr_username = (EditText) findViewById(R.id.user_name);
        clr_userid = (EditText) findViewById(R.id.user_id);
        clr_userpwd = (EditText) findViewById(R.id.user_password);

        clear_input.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Clear EditText
                clr_userid.getText().clear();
                clr_userpwd.getText().clear();
                clr_username.getText().clear();
                terms_condition.setChecked(false);
            }
        });
        // Moving on to success page if create button is clicked
        create_btn.setOnClickListener(view -> {
            Intent next = new Intent(CreateAccount.this, SuccessCreate.class);
            startActivity(next);
        });

        // Back to login if the user wishes
        backlogin.setOnClickListener(view -> {
            Intent prev = new Intent(CreateAccount.this, MainActivity.class);
            startActivity(prev);
        });
    }
}