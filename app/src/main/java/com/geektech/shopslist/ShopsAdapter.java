package com.geektech.shopslist;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ShopsAdapter extends RecyclerView.Adapter<ShopsViewHolder> {
    private ArrayList<String> shopsText;

    public ShopsAdapter(ArrayList<String> shopsText) {
        this.shopsText = shopsText;
    }

    @NonNull
    @Override
    public ShopsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ShopsViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_shops, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ShopsViewHolder holder, int position) {
        holder.bind(shopsText.get(position));
    }

    @Override
    public int getItemCount() {
        return shopsText.size();
    }
}
