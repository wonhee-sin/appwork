package com.example.myapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class Toggle extends AppCompatActivity {

    TextView txtToggle;
    ToggleButton btnToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toggle);

        txtToggle = findViewById(R.id.txtToggle);
        btnToggle = findViewById(R.id.btnToggle);

        btnToggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                String toastMsg;
                if(b){
                    toastMsg = "켜짐";
                    txtToggle.setText("꺼짐");
                }else{
                    toastMsg = "꺼짐";
                    txtToggle.setText("켜짐");
                }
                Toast.makeText(Toggle.this, toastMsg, Toast.LENGTH_LONG).show();
            }
        });
    }

}