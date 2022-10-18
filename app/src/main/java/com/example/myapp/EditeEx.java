package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class EditeEx extends AppCompatActivity {

    private Button btn;
    private ImageView img1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edite_ex);

        btn = findViewById(R.id.btn);
        img1 = findViewById(R.id.img1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(EditeEx.this, "버튼이 눌렸습니다",
                        Toast.LENGTH_SHORT);

                toast.show();
            }
        });

        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(EditeEx.this, "라라라라라",
                        Toast.LENGTH_LONG);

                toast.show();
            }
        });
    }
}