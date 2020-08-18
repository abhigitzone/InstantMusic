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

public class LibraryRecyclerAdapter extends RecyclerView.Adapter<LibraryRecyclerAdapter.MyViewHolder> {
    Context mContext;
    List<DataSong> dataSongs;

    public LibraryRecyclerAdapter(Context mContext, List<DataSong> dataSongs) {
        this.mContext = mContext;
        this.dataSongs = dataSongs;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(mContext).inflate(R.layout.song_sample_list, parent, false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.songName.setText(dataSongs.get(position).getSongName());
        holder.songInfo.setText(dataSongs.get(position).getSongInfo());
        holder.songImg.setImageResource(dataSongs.get(position).getSongImg());

    }

    @Override
    public int getItemCount() {
        return dataSongs.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        private ImageView songImg;
        private TextView songName;
        private TextView songInfo;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            songImg = itemView.findViewById(R.id.song_image);
            songName = itemView.findViewById(R.id.song_title);
            songInfo = itemView.findViewById(R.id.song_artist);
        }
    }
}
