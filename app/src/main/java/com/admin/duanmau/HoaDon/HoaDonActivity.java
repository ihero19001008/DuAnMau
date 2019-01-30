package com.admin.duanmau.HoaDon;

import android.app.DatePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ListView;

import com.admin.duanmau.R;

import java.util.Calendar;


public class HoaDonActivity extends AppCompatActivity {

    private EditText edtMaHD;
    private EditText edtNgayMuaHD;
    private Button btnNgayMua;
    private Button btnThemHoaDon;
    private ListView lvHoaDon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoa_don);

        initView();

        btnNgayMua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Calendar calendar = Calendar.getInstance();
                int year = calendar.get(Calendar.YEAR);
                final int month = calendar.get(Calendar.MONTH);
                final int day = calendar.get(Calendar.DAY_OF_MONTH);
                DatePickerDialog datePickerDialog = new DatePickerDialog(HoaDonActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                        edtNgayMuaHD.setText(year+"/"+monthOfYear+"/"+dayOfMonth );
                    }
                }, year, month, day);

                datePickerDialog.show();

            }
        });

    }

    public void initView(){
        edtMaHD = (EditText) findViewById(R.id.edtMaHD);
        edtNgayMuaHD = (EditText) findViewById(R.id.edtNgayMuaHD);
        btnNgayMua = (Button) findViewById(R.id.btnNgayMua);
        btnThemHoaDon = (Button) findViewById(R.id.btnThemHoaDon);
        lvHoaDon = (ListView) findViewById(R.id.lvHoaDon);
    }

}
