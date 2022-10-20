package com.example.myweb4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class subactivity extends AppCompatActivity {

    Button btnMove2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subactivity);

        btnMove2 = findViewById(R.id.btnMove2);

        btnMove2.setOnClickListener(view -> {
           Intent intent = new Intent(subactivity.this, MainActivity.class);
           startActivity(intent);
        });
    }
}