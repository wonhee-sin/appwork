package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Toast;

import com.example.myapplication.databinding.ActivityMain5Binding;

public class MainActivity5 extends AppCompatActivity implements
        CompoundButton.OnCheckedChangeListener, View.OnClickListener
{

    ActivityMain5Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main5);

        binding = ActivityMain5Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //객체 등록
        binding.bellname.setOnClickListener(this);
        binding.onoff.setOnCheckedChangeListener(this);
        binding.repeat1.setOnCheckedChangeListener(this);
        binding.vibrate.setOnCheckedChangeListener(this);

/*        binding.onoff.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                   showToast("sfdwefwe");

            }
        });

        binding.repeat1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                    showToast("qwfewf");

            }
        });*/

/*        binding.bellname.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast("efwfewef");
            }
        });*/

/*        binding.vibrate.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                showToast("oijiobio");
            }
        });*/
        }
        //Toast 메서드
    private void showToast(String msg) {
        Toast.makeText(MainActivity5.this , msg , Toast.LENGTH_SHORT).show();

    }


    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        if(compoundButton == binding.onoff){
            showToast("abc");
        }else if(compoundButton == binding.repeat1){
            showToast("def");
        }else if(compoundButton == binding.vibrate) {
            showToast("ghi");
        }
    }

    @Override
    public void onClick(View view) {
        if(view == binding.bellname) 
        showToast("fefwe");
    }

    long initTime;  //초기 시간
    float location;
    float initX;
    //key 이벤트
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            if (System.currentTimeMillis() - initTime > 3000) {
                showToast("wefefwefewf");
                initTime = System.currentTimeMillis();
            } else {
                finish();
            }
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
    
    //터치 이벤트

    /*
    getX(), getY()
    getRowX(), getRowY()

    * ACTION_DOWN 화면에 터치된 순간에 이벤트
    * ACTION_UP 터치를 떼는 순간의 이벤트
    * ACTION_MOVE 터치된 후 이동하는 순간의 이벤트
    * */
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if(event.getAction() == MotionEvent.ACTION_DOWN){
            initX = event.getRawX();
        }else if(event.getAction() == MotionEvent.ACTION_UP){
            float difX = initX - event.getRawX();
            if(difX > 30){
                showToast("123");
            }else if(difX <30){
                showToast("456");
            }
        }
        return super.onTouchEvent(event);
    }
}