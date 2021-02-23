package com.example.musicstructureapp.Adapter;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.musicstructureapp.Model.DataSongCategory;
import com.example.musicstructureapp.R;

import java.util.List;

public class CategorySongItemAdapter extends RecyclerView.Adapter<CategorySongItemAdapter.CategoryViewHolder> {
    private Context mContext;
    private List<DataSongCategory> dataSongCategories;

    public CategorySongItemAdapter(Context mContext, List<DataSongCategory> dataSongCategories) {
        this.mContext = mContext;
        this.dataSongCategories = dataSongCategories;
    }

    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CategoryViewHolder(LayoutInflater.from(mContext).inflate(R.layout.home_song_category_list, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder holder, int position) {
        holder.songTitle.setText(dataSongCategories.get(position).getSongTitle());
        holder.songImg.setImageResource(dataSongCategories.get(position).getSongImg());
    }

    @Override
    public int getItemCount() {
        return dataSongCategories.size();
    }

    public static final class CategoryViewHolder extends RecyclerView.ViewHolder {
        private ImageView songImg;
        private TextView songTitle;

        public CategoryViewHolder(@NonNull View itemView) {
            super(itemView);

            songImg = itemView.findViewById(R.id.songIMG);
            songTitle = itemView.findViewById(R.id.songTitle);

        }
    }

}
