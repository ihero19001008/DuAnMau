package com.admin.duanmau.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.admin.duanmau.Fragment.ChinhSuaNguoiDungFragment;
import com.admin.duanmau.Fragment.DanhSachNguoiDungFragment;
import com.admin.duanmau.Fragment.GioiThieuFragment;
import com.admin.duanmau.Fragment.ThemNguoiDungFragment;

public class ViewPagerNguoiDungAdapter extends FragmentStatePagerAdapter {

    public ViewPagerNguoiDungAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {

        Fragment fragment = null;
        switch(i){
            case 0: fragment = new DanhSachNguoiDungFragment(); break;
            case 1: fragment = new ThemNguoiDungFragment(); break;
            case 2: fragment = new ChinhSuaNguoiDungFragment(); break;
            case 3: fragment = new GioiThieuFragment(); break;
        }

        return fragment;
    }

    @Override
    public int getCount() {
        return 4;
    }
}
