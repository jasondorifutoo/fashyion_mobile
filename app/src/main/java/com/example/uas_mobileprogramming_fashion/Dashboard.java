package com.example.uas_mobileprogramming_fashion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;

public class Dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        Button buy = findViewById(R.id.buybtn);
        buy.setBackgroundColor(Color.parseColor("#81d4a5"));
        Button history = findViewById(R.id.historybtn);
        history.setBackgroundColor(Color.parseColor("#81d4a5"));
        Button outlets = findViewById(R.id.locationbtn);
        outlets.setBackgroundColor(Color.parseColor("#81d4a5"));
        Button redeem = findViewById(R.id.redeemptsbtn);
        redeem.setBackgroundColor(Color.parseColor("#81d4a5"));

        // Moving to Buy Activity if Buy Button is Clicked
        buy.setOnClickListener(view -> {
            Intent buymerch = new Intent(Dashboard.this, Buy.class);
            startActivity(buymerch);
        });

        // Moving to History Activity if History Button is Clicked
        history.setOnClickListener(view -> {
            Intent histr = new Intent(Dashboard.this, History.class);
            startActivity(histr);
        });
//
        // Moving to Outlets Activity if Outlets Button is Clicked
        outlets.setOnClickListener(view -> {
            Intent loc = new Intent(Dashboard.this, Outlets.class);
            startActivity(loc);
        });
//
        // Moving to Points Redeem Activity if Redeem Button is Clicked
        redeem.setOnClickListener(view -> {
            Intent redemp = new Intent(Dashboard.this, Redeem.class);
            startActivity(redemp);
        });
    }
}