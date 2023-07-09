package com.example.uas_mobileprogramming_fashion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class History extends AppCompatActivity {
    ListView datas;
    String histories[] = {"Outlet A, 19/11/2020, +1pts", "Outlet A, 19/4/2021, +1pts", "Outlet C, 20/7/2021, +1pts"
                            ,"Outlet A, 14/2/2022, +1pts", "Outlet C, 6/11/2022, +1pts", "Outlet C, 25/12/2022, +1pts"
                            ,"Outlet B, 1/1/2023, +1pts", "Outlet B, 2/1/2023, +1pts", "Outlet C, 3/1/2023, +30pts"
                            ,"Outlet A, 6/1/2023, +1pts", "Outlet B, 8/4/2023, +10pts", "Outlet B, 6/7/2023, +20pts"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        datas = findViewById(R.id.listview1);
        ArrayAdapter<String> arr;
        arr = new ArrayAdapter<String>((Context)this,
                androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,
                histories);
        datas.setAdapter(arr);
        Button back = findViewById(R.id.dashbtn_1);
        back.setBackgroundColor(Color.parseColor("#81d4a5"));
        back.setOnClickListener(view -> {
            Intent prev = new Intent(History.this, Dashboard.class);
            startActivity(prev);
        });
    }
}