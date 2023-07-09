package com.example.uas_mobileprogramming_fashion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;

public class SuccessBuy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success_buy);
        Button dash = findViewById(R.id.back_dash);
        dash.setBackgroundColor(Color.parseColor("#985dc0"));
        dash.setOnClickListener(view -> {
            Intent back = new Intent(SuccessBuy.this, Dashboard.class);
            startActivity(back);
        });
    }
}