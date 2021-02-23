package com.example.musicstructureapp.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.musicstructureapp.Model.SearchData;
import com.example.musicstructureapp.R;

import java.util.List;

public class SearchRecyclerAdapter extends RecyclerView.Adapter<SearchRecyclerAdapter.MyViewHolder> {
    Context mContext;
    List<SearchData> searchDataList;

    public SearchRecyclerAdapter(Context mContext, List<SearchData> searchDataList) {
        this.mContext = mContext;
        this.searchDataList = searchDataList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(mContext).inflate(R.layout.search_list_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.itemName.setText(searchDataList.get(position).getItemName());
        holder.itemImg.setImageResource(searchDataList.get(position).getItemImg());
    }

    @Override
    public int getItemCount() {
        return searchDataList.size();
    }

    public static final class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView itemName;
        private ImageView itemImg;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            itemName = itemView.findViewById(R.id.searchItemText);
            itemImg = itemView.findViewById(R.id.searchItemImg);
        }
    }
}
