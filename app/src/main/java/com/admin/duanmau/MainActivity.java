package com.admin.duanmau;

import android.content.Intent;
import android.os.Bundle;

import com.admin.duanmau.Base.BaseActivity;
import com.admin.duanmau.DangNhap.DangNhapActivity;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                startActivity(new Intent(MainActivity.this,DangNhapActivity.class));
            }
        },3000);

    }
}
