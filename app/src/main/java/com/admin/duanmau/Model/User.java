package com.admin.duanmau.Model;

public class User {

    String username;
    String password;
    String phone;
    String fullname;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public User(String username, String password, String phone, String fullname) {

        this.username = username;
        this.password = password;
        this.phone = phone;
        this.fullname = fullname;
    }
}
