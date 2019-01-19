package com.admin.duanmau;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.admin.duanmau.NguoiDungActivity.NguoiDungActivity;

public class ManHinhChinhActivity extends AppCompatActivity implements View.OnClickListener {


    private LinearLayout llNguoiDung;
    private LinearLayout llTheLoaiSach;
    private LinearLayout llSach;
    private LinearLayout llHoaDon;
    private LinearLayout llBanChay;
    private LinearLayout llThongKe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man_hinh_chinh);

        llNguoiDung = (LinearLayout) findViewById(R.id.llNguoiDung);
        llTheLoaiSach = (LinearLayout) findViewById(R.id.llTheLoaiSach);
        llSach = (LinearLayout) findViewById(R.id.llSach);
        llHoaDon = (LinearLayout) findViewById(R.id.llHoaDon);
        llBanChay = (LinearLayout) findViewById(R.id.llBanChay);
        llThongKe = (LinearLayout) findViewById(R.id.llThongKe);

        llNguoiDung.setOnClickListener(this);
        llTheLoaiSach.setOnClickListener(this);
        llSach.setOnClickListener(this);
        llHoaDon.setOnClickListener(this);
        llBanChay.setOnClickListener(this);
        llThongKe.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v == llNguoiDung){
            startActivity(new Intent(ManHinhChinhActivity.this, NguoiDungActivity.class));
        }
        else if(v == llTheLoaiSach){
            
        }
        else if(v == llSach){

        }
        else if(v == llHoaDon){

        }
        else if(v == llBanChay){

        }
        else if(v == llThongKe){

        }
    }
}
