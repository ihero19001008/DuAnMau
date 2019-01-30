package com.admin.duanmau.SQLite;

public class Constants {

    //bảng
    public static final String user_table = "nguoidung";
    public static final String category_table = "theloai";

    //cột
    // -- Người dùng
    public static final String user_username = "username";
    public static final String user_password = "password";
    public static final String user_phone = "phone";
    public static final String user_fullname = "fullname";
    // -- Thể loại

    // Tạo bảng

    public static final String create_user_table =
            "create table "+user_table+"(" +
                    "" + user_username +" nvarchar,"+
                    "" + user_password +" nvarchar,"+
                    "" + user_phone +" nvarchar,"+
                    "" + user_fullname +" nvarchar"+
                    ")";

}
