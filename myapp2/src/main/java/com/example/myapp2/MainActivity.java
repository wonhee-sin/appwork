package com.example.myapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnTrue;
    Button btnFalse;
    TextView txtView;
    boolean run =false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnTrue = findViewById(R.id.btnTrue);
        txtView = findViewById(R.id.txtView);


        btnTrue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(run == true){
                    txtView.setVisibility(View.INVISIBLE);
                    run = false;
                }else if(run == false){
                    txtView.setVisibility(View.VISIBLE);
                    run = true;
                }

            }
        });

    }
}