package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText name1;
    private Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);
        name1 = findViewById(R.id.name1);
        
        //버튼 클릭 이벤트
        btn1.setOnClickListener(view -> {
            String str = name1.getText().toString();
            Intent intent = new Intent(MainActivity.this, subactivity.class);
            //데이터 보내는 함수 putExtra()
            intent.putExtra("str", str);
            startActivity(intent);
        });
    }
}