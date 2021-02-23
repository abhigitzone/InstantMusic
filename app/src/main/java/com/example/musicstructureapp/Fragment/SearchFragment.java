package com.example.musicstructureapp.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.musicstructureapp.Adapter.HomeRecyclerAdapter;
import com.example.musicstructureapp.Adapter.SearchRecyclerAdapter;
import com.example.musicstructureapp.Model.DataHome;
import com.example.musicstructureapp.Model.SearchData;
import com.example.musicstructureapp.R;

import java.util.ArrayList;
import java.util.List;

public class SearchFragment extends Fragment {
    List<SearchData> searchDataList;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.search_fragment, container, false);
        RecyclerView recyclerView = v.findViewById(R.id.searchRecycler);
        SearchRecyclerAdapter searchRecyclerAdapter = new SearchRecyclerAdapter(getActivity(), searchDataList);
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        recyclerView.setAdapter(searchRecyclerAdapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        searchDataList = new ArrayList<>();

        searchDataList.add(new SearchData("Pop", R.drawable.pop));
        searchDataList.add(new SearchData("Hip Hop", R.drawable.eminem));
        searchDataList.add(new SearchData("Rock music", R.drawable.pitbull));
        searchDataList.add(new SearchData("Romantic", R.drawable.selena_tw));
        searchDataList.add(new SearchData("Podcasts", R.drawable.gladiator));
        searchDataList.add(new SearchData("Motivation", R.drawable.motivation));
        searchDataList.add(new SearchData("New Release", R.drawable.ariana));
        searchDataList.add(new SearchData("Acoustic", R.drawable.enrique_r));
        searchDataList.add(new SearchData("Discover", R.drawable.last_archive));
        searchDataList.add(new SearchData("Concerts", R.drawable.dance));
        searchDataList.add(new SearchData("Bollywood", R.drawable.kk));
        searchDataList.add(new SearchData("Soothing", R.drawable.arijit));
    }
}
