package com.example.musicstructureapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class LibraryFragment extends Fragment {
    List<DataSong> dataSongs;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.library_fragment, container, false);

        RecyclerView recyclerView = v.findViewById(R.id.recycler_library);
        LibraryRecyclerAdapter libraryRecyclerAdapter = new LibraryRecyclerAdapter(getActivity(), dataSongs);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(libraryRecyclerAdapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        dataSongs = new ArrayList<>();

        dataSongs.add(new DataSong(getString(R.string.song_1), getString(R.string.song_artist1), R.drawable.song_album));
        dataSongs.add(new DataSong(getString(R.string.song_3), getString(R.string.song_artist1), R.drawable.song_album));
        dataSongs.add(new DataSong(getString(R.string.song_4), getString(R.string.song_artist4), R.drawable.dance));
        dataSongs.add(new DataSong(getString(R.string.song_5), getString(R.string.song_artist5), R.drawable.billie_eilish));
        dataSongs.add(new DataSong(getString(R.string.song_6), getString(R.string.song_artist6), R.drawable.motivation));
        dataSongs.add(new DataSong(getString(R.string.song_7), getString(R.string.song_artist7), R.drawable.song_album));
        dataSongs.add(new DataSong(getString(R.string.song_8), getString(R.string.song_artist8), R.drawable.motivation));
        dataSongs.add(new DataSong(getString(R.string.song_9), getString(R.string.song_artist9), R.drawable.party));
        dataSongs.add(new DataSong(getString(R.string.song_2), getString(R.string.song_artist1), R.drawable.song_album));
    }
}
