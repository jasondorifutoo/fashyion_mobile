package com.example.uas_mobileprogramming_fashion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Buy extends AppCompatActivity {
    int price = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy);
        Button done = findViewById(R.id.confirmbtn);
        done.setBackgroundColor(Color.parseColor("#985dc0"));
        done.setOnClickListener(view -> {
            Intent success = new Intent(Buy.this, SuccessBuy.class);
            startActivity(success);
        });
    }

    // Outfit Kibutsuji Buy button
    public void increaseKibutsuji(View view) {
        price = price + 100000;
        display(price);
    }

    // Education Uniform Buy button
    public void increaseEdu(View view) {
        price = price + 200000;
        display(price);
    }

    // Gojo Satoru Uniform Buy button
    public void increaseGojo(View view) {
        price = price + 690000;
        display(price);
    }

    // Main Function for Displaying total Charge
    private void display(int number) {
        TextView displayInteger = (TextView) findViewById(
                R.id.totalcharge);
        displayInteger.setText("Total Charge: Rp" + number + ",-");
    }
}