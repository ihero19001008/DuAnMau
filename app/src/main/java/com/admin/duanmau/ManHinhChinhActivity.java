package com.admin.duanmau;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.admin.duanmau.BanChay.BanChayActivity;
import com.admin.duanmau.Base.BaseActivity;
import com.admin.duanmau.HoaDon.HoaDonActivity;
import com.admin.duanmau.NguoiDungActivity.NguoiDungActivity;
import com.admin.duanmau.Sach.SachActivity;
import com.admin.duanmau.TheLoaiSach.TheLoaiSachActivity;

public class ManHinhChinhActivity extends BaseActivity implements View.OnClickListener {


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
            changeClass(NguoiDungActivity.class);
        }
        else if(v == llTheLoaiSach){
            changeClass(TheLoaiSachActivity.class);
        }
        else if(v == llSach){
            changeClass(SachActivity.class);
        }
        else if(v == llHoaDon){
            changeClass(HoaDonActivity.class);
        }
        else if(v == llBanChay){
            changeClass(BanChayActivity.class);
        }
        else if(v == llThongKe){
            changeClass(ThongKeActivity.class);
        }
    }
}
