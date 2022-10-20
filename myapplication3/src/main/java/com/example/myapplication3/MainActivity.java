package com.example.myapplication3;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.os.VibratorManager;

import com.example.myapplication3.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());
        
        //진동 클릭 이벤트
        binding.btn1.setOnClickListener(view -> {
            Vibrator vibrator;
            if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.S){
                VibratorManager manager =
                        (VibratorManager) getSystemService(VIBRATOR_MANAGER_SERVICE);
                vibrator = manager.getDefaultVibrator();
            }else{
                vibrator = (Vibrator) getSystemService(VIBRATOR_SERVICE);
            }
            //진동 울림
            if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
                vibrator.vibrate(VibrationEffect.createOneShot(1000, VibrationEffect.DEFAULT_AMPLITUDE));
            }else{
                vibrator.vibrate(1000);
            }
        });

        binding.btn2.setOnClickListener(view -> {

            Uri notification = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);

            Ringtone ringtone =
                    RingtoneManager.getRingtone(getApplicationContext(), notification);

            ringtone.play();
        });

    }
}