package com.admin.duanmau.DangNhapDangKy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;

import com.admin.duanmau.MainActivity;
import com.admin.duanmau.ManHinhChinhActivity;
import com.admin.duanmau.R;

public class DangNhapActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView imageView;
    private EditText edtTenDangNhap;
    private EditText edtMatKhau;
    private CheckBox cbNhoMatKhau;
    private Button btnDangNhap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dang_nhap);

        imageView = (ImageView) findViewById(R.id.imageView);
        edtTenDangNhap = (EditText) findViewById(R.id.edtTenDangNhap);
        edtMatKhau = (EditText) findViewById(R.id.edtMatKhau);
        cbNhoMatKhau = (CheckBox) findViewById(R.id.cbNhoMatKhau);
        btnDangNhap = (Button) findViewById(R.id.btnDangNhap);

        btnDangNhap.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v == btnDangNhap){
            startActivity(new Intent(DangNhapActivity.this, ManHinhChinhActivity.class));
        }
    }
}
