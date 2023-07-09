package com.example.uas_mobileprogramming_fashion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Redeem extends AppCompatActivity {
    int points = 69;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_redeem);
        Button success = findViewById(R.id.confirmbtn);
        success.setBackgroundColor(Color.parseColor("#985dc0"));
        success.setOnClickListener(view -> {
            Intent next = new Intent(Redeem.this, Success_Redeem.class);
            startActivity(next);
        });
    }
    // Pikachu Redeem button
    public void increasePikachu(View view) {
        points = points - 21;
        display(points);
    }

    // Bomber Jacket Redeem button
    public void increaseBombJack(View view) {
        points = points - 1;
        display(points);
    }

    // Charmander Redeem button
    public void increaseCharmander(View view) {
        points = points - 21;
        display(points);
    }

    // Snorlax Redeem button
    public void increaseSnorlax(View view) {
        points = points - 21;
        display(points);
    }

    // Main Function for Displaying remaining points
    private void display(int number) {
        TextView displayInteger = (TextView) findViewById(
                R.id.remainpts);
        displayInteger.setText("Remaining Points: " + number + "pts");
    }
}