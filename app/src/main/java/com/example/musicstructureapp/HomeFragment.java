package com.example.musicstructureapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {
    List<DataHome> dataHomes;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.home_fragment, container, false);
        RecyclerView recyclerView = v.findViewById(R.id.home_recycler);
        HomeRecyclerAdapter homeRecyclerAdapter = new HomeRecyclerAdapter(getActivity(), dataHomes);
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        recyclerView.setAdapter(homeRecyclerAdapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        dataHomes = new ArrayList<>();

        dataHomes.add(new DataHome(R.drawable.dance, getString(R.string.dance)));
        dataHomes.add(new DataHome(R.drawable.party, getString(R.string.party)));
        dataHomes.add(new DataHome(R.drawable.relaxing, getString(R.string.relaxing)));
        dataHomes.add(new DataHome(R.drawable.pop, getString(R.string.pop)));
        dataHomes.add(new DataHome(R.drawable.motivation, getString(R.string.motivation)));
        dataHomes.add(new DataHome(R.drawable.song_album, getString(R.string.song_artist1)));
        dataHomes.add(new DataHome(R.drawable.gladiator, getString(R.string.gladiator)));
        dataHomes.add(new DataHome(R.drawable.last_archive, getString(R.string.last_archive)));
        dataHomes.add(new DataHome(R.drawable.billie_eilish, getString(R.string.song_artist5)));
    }
}
