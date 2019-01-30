package com.admin.duanmau.DAO;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.admin.duanmau.Model.User;
import com.admin.duanmau.SQLite.Database;

import java.util.ArrayList;
import java.util.List;

import static com.admin.duanmau.SQLite.Constants.user_fullname;
import static com.admin.duanmau.SQLite.Constants.user_password;
import static com.admin.duanmau.SQLite.Constants.user_phone;
import static com.admin.duanmau.SQLite.Constants.user_table;
import static com.admin.duanmau.SQLite.Constants.user_username;

public class UserDAO {

    Database dbHelper;

    public UserDAO(Context context) {
        this.dbHelper = dbHelper;
    }
    public long insertUser(User user){
        long result = -1;

        ContentValues c = new ContentValues();
        c.put(user_username, user.getUsername());
        c.put(user_password, user.getPassword());
        c.put(user_phone, user.getPhone());
        c.put(user_fullname , user.getFullname());

        SQLiteDatabase db = dbHelper.getWritableDatabase();
        result = db.insert(user_table, null, c);
        db.close();

        return result;
    }

    public List<User> getAllUser(){
        List<User> list = new ArrayList<>();

        String query = "select * from "+user_table;
        SQLiteDatabase db = dbHelper.getReadableDatabase();
        Cursor c = db.rawQuery(query,null);

        if(c != null){
            if(c.getCount() > 0){
                while (c.moveToNext()){
                    String username = c.getString(0);
                    String password = c.getString(1);
                    String phone = c.getString(2);
                    String fullname = c.getString(3);

                    User user = new User(username,password,phone,fullname);
                    list.add(user);
                }
                c.close();
                db.close();
            }
        }

        return list;
    }

}
