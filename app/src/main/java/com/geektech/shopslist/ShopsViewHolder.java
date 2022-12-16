package com.geektech.shopslist;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ShopsViewHolder extends RecyclerView.ViewHolder {
    private TextView tvShops;
    public ShopsViewHolder(@NonNull View itemView) {
        super(itemView);
        tvShops = itemView.findViewById(R.id.tv_shops);

    }
    public void bind(String contact){
        tvShops.setText(contact);
    }
}
