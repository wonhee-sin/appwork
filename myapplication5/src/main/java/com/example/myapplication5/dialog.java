package com.example.myapplication5;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;

import com.example.myapplication5.databinding.ActivityDialogBinding;

public class dialog extends AppCompatActivity {

    ActivityDialogBinding binding;
    AlertDialog dialog;
    AlertDialog dialog2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDialogBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnalert.setOnClickListener(view -> {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setIcon(android.R.drawable.ic_dialog_alert);
            builder.setTitle("dkf");
            builder.setMessage("wefwefwef");
            builder.setPositiveButton("ok",null);
            builder.setNegativeButton("no",null);
            dialog = builder.create();
            dialog.show();
        });

        binding.btnlist.setOnClickListener(view -> {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("wefwef");
            builder.setSingleChoiceItems(R.array.dialog_array, 0, null);
            builder.setPositiveButton("ok",null);
            builder.setNegativeButton("no",null);
            dialog2 = builder.create();
            dialog2.show();

        });
    }
}