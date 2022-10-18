package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class EditEx2 extends AppCompatActivity {

    EditText editText;
    Button btnsubmit;
    TextView txtview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_ex2);

        editText = findViewById(R.id.editText);
        btnsubmit = findViewById(R.id.btnsubmit);
        txtview = findViewById(R.id.txtview);

        //전송 버튼 이벤트
        btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = editText.getText().toString();
                txtview.setText(str);
            }
        });
    }
}