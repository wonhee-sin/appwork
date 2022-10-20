package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class subactivity extends AppCompatActivity {

    private TextView txt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subactivity);

        txt2 = findViewById(R.id.txt2);

        Intent intent = getIntent();    //보내진 인텐트를 받을때

        String name = intent.getStringExtra("str");
        txt2.setText(name);
    }
}