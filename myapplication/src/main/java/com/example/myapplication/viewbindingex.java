package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.myapplication.databinding.ActivityViewbindingexBinding;

public class viewbindingex extends AppCompatActivity {

    ActivityViewbindingexBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        binding = ActivityViewbindingexBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.check1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    binding.check1.setText("체크");
                }else
                    binding.check1.setText("해제");
            }
        });

        binding.img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(viewbindingex.this, "1213f3", Toast.LENGTH_SHORT);

                toast.show();
            }
        });

    }
}