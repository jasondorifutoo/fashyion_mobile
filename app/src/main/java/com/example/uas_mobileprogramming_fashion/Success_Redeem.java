package com.example.uas_mobileprogramming_fashion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;

public class Success_Redeem extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success_redeem);
        Button dash = findViewById(R.id.backdash);
        dash.setBackgroundColor(Color.parseColor("#985dc0"));
        dash.setOnClickListener(view -> {
            Intent back = new Intent(Success_Redeem.this, Dashboard.class);
            startActivity(back);
        });
    }
}