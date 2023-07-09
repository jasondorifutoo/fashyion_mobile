package com.example.uas_mobileprogramming_fashion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class SuccessCreate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success_create);
        Button backtologin = findViewById(R.id.backtologin);
        backtologin.setBackgroundColor(Color.parseColor("#B5C99A"));
        backtologin.setOnClickListener(view -> {
            Intent back = new Intent(SuccessCreate.this, MainActivity.class);
            startActivity(back);
        });
    }
}