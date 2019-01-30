package com.admin.duanmau.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.admin.duanmau.Model.User;
import com.admin.duanmau.R;

import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserHolder> {

    Context context;
    List<User> userList;

    public UserAdapter(Context context, List<User> userList) {
        this.context = context;
        this.userList = userList;
    }

    @NonNull
    @Override
    public UserHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(context).inflate(R.layout.list_item_nguoi_dung,viewGroup,false);

        return new UserHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserHolder holder, int i) {
        User user = userList.get(i);
        holder.txtHoTenNguoiDung.setText(user.getFullname());
        holder.imgCloseUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Xin chao minh la User adapter", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public class UserHolder extends RecyclerView.ViewHolder {

        TextView txtHoTenNguoiDung;
        ImageView imgCloseUser;

        public UserHolder(@NonNull View itemView) {
            super(itemView);
            txtHoTenNguoiDung = itemView.findViewById(R.id.txtHoTenNguoiDung);
            imgCloseUser = itemView.findViewById(R.id.imgCloseUser);
        }
    }
}
