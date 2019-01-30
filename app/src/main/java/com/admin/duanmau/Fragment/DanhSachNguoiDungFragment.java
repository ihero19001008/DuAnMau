package com.admin.duanmau.Fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.admin.duanmau.Adapter.UserAdapter;
import com.admin.duanmau.DAO.UserDAO;
import com.admin.duanmau.Model.User;
import com.admin.duanmau.R;
import com.admin.duanmau.SQLite.Database;

import java.util.ArrayList;
import java.util.List;

public class DanhSachNguoiDungFragment extends Fragment {

    private View rootview;
    private UserAdapter adapter;
    private List<User> list;
    private RecyclerView rvNguoiDung;
    private UserDAO userDAO;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootview = inflater.inflate(R.layout.fragment_danh_sach_nguoi_dung,container,false);
        rvNguoiDung = rootview.findViewById(R.id.rvNguoiDung);

        userDAO = new UserDAO(getContext());
        list = new ArrayList<>();

//        for(int i = 0; i < 10; i++){
//            String username = "username"+i;
//            String password = "password"+i;
//            String phone = "phone"+i;
//            String fullname = "fullname"+i;
//            User user = new User(username,password,phone,fullname);
//            database.insertUser(user);
//        }

        list = userDAO.getAllUser();
        adapter = new UserAdapter(getContext(),list);
        rvNguoiDung.setLayoutManager(new LinearLayoutManager(getContext()));
        rvNguoiDung.setAdapter(adapter);

        return rootview;
    }


}
