package com.example.musicstructureapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class HomeRecyclerAdapter extends RecyclerView.Adapter<HomeRecyclerAdapter.MyViewHolder> {
    Context mContext;
    List<DataHome> dataHomes;

    public HomeRecyclerAdapter(Context mContext, List<DataHome> dataHomes) {
        this.mContext = mContext;
        this.dataHomes = dataHomes;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(mContext).inflate(R.layout.home_list_item, parent, false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.homeImg.setImageResource(dataHomes.get(position).getHomeImg());
        holder.homeText.setText(dataHomes.get(position).getHomeTitle());
    }

    @Override
    public int getItemCount() {
        return dataHomes.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        private ImageView homeImg;
        private TextView homeText;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            homeImg = itemView.findViewById(R.id.homeImg);
            homeText = itemView.findViewById(R.id.homeTitle);
        }
    }
}
