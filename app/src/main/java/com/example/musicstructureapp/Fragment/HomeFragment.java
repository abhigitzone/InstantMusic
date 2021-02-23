package com.example.musicstructureapp.Fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.musicstructureapp.Model.DataHome;
import com.example.musicstructureapp.Adapter.HomeRecyclerAdapter;
import com.example.musicstructureapp.Model.DataSongCategory;
import com.example.musicstructureapp.R;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {
    List<DataHome> dataHomes;
    View v;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.home_fragment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //Add Data to child recycler..

        //Data to Popular playlist : Done
        List<DataSongCategory> categoriesItem1 = new ArrayList<>();
        categoriesItem1.add(new DataSongCategory(1, R.drawable.marsh_mellow, "Marshmallow"));
        categoriesItem1.add(new DataSongCategory(2, R.drawable.j_fla, "J. fla"));
        categoriesItem1.add(new DataSongCategory(3, R.drawable.indila, "Indila Sedraïa"));
        categoriesItem1.add(new DataSongCategory(4, R.drawable.selena_on, "Selena gomez"));
        categoriesItem1.add(new DataSongCategory(5, R.drawable.alan_walker, "Alan walker"));

        //Data to Best of Artists. : Done
        List<DataSongCategory> categoriesItem2 = new ArrayList<>();
        categoriesItem2.add(new DataSongCategory(1, R.drawable.taylor, "Taylor swift"));
        categoriesItem2.add(new DataSongCategory(2, R.drawable.dua_lipa, "Dua Lipa"));
        categoriesItem2.add(new DataSongCategory(3, R.drawable.enrique_r, "Enrique iglesias"));
        categoriesItem2.add(new DataSongCategory(4, R.drawable.eminem_t, "Eminem"));
        categoriesItem2.add(new DataSongCategory(5, R.drawable.ronan_song, "Ronan Keating"));

        //Data to POP.. : Done
        List<DataSongCategory> categoriesItem3 = new ArrayList<>();
        categoriesItem3.add(new DataSongCategory(1, R.drawable.lady_gaga, "Lady gaga"));
        categoriesItem3.add(new DataSongCategory(2, R.drawable.katy__perry, "Katy perry"));
        categoriesItem3.add(new DataSongCategory(3, R.drawable.pitbull, "Pitbull"));
        categoriesItem3.add(new DataSongCategory(4, R.drawable.shakira, "Shakira"));
        categoriesItem3.add(new DataSongCategory(5, R.drawable.jay_z, "Jay Z"));

        //Data to Songs you might like..
        List<DataSongCategory> categoriesItem4 = new ArrayList<>();
        categoriesItem4.add(new DataSongCategory(1, R.drawable.charlie_puth_da, "Dangerously"));
        categoriesItem4.add(new DataSongCategory(2, R.drawable.pitbull, "Dale"));
        categoriesItem4.add(new DataSongCategory(3, R.drawable.enrique, "Escape"));
        categoriesItem4.add(new DataSongCategory(4, R.drawable.two_pac, "2 pac"));
        categoriesItem4.add(new DataSongCategory(5, R.drawable.song_album, "Attention"));

        //Data to For your listening pleasure..
        List<DataSongCategory> categoriesItem5 = new ArrayList<>();
        categoriesItem5.add(new DataSongCategory(1, R.drawable.selena_tw, "Revival"));
        categoriesItem5.add(new DataSongCategory(2, R.drawable.katy_perry_two, "Prism"));
        categoriesItem5.add(new DataSongCategory(3, R.drawable.ariana, "Into you"));
        categoriesItem5.add(new DataSongCategory(4, R.drawable.billie_eilish, "Billie eilish"));
        categoriesItem5.add(new DataSongCategory(5, R.drawable.camila_cabello, "Senorita"));

        //Data to Bollywood mush..
        List<DataSongCategory> categoriesItem6 = new ArrayList<>();
        categoriesItem6.add(new DataSongCategory(1, R.drawable.arijit, "Arijit singh"));
        categoriesItem6.add(new DataSongCategory(2, R.drawable.kk, "KK"));
        categoriesItem6.add(new DataSongCategory(3, R.drawable.shreya, "Shreya ghosal"));
        categoriesItem6.add(new DataSongCategory(4, R.drawable.jubin_o, "Jubin nautiyal"));
        categoriesItem6.add(new DataSongCategory(5, R.drawable.sonu, "Sonu nigham"));

        //Data to Made for you..
        List<DataSongCategory> categoriesItem7 = new ArrayList<>();
        categoriesItem7.add(new DataSongCategory(1, R.drawable.wiz_khalida, "Wiz Khalifa"));
        categoriesItem7.add(new DataSongCategory(2, R.drawable.ed_sheeran, "Ed sheeran"));
        categoriesItem7.add(new DataSongCategory(3, R.drawable.britney, "Britney spears"));
        categoriesItem7.add(new DataSongCategory(4, R.drawable.eminem, "Eminem"));
        categoriesItem7.add(new DataSongCategory(5, R.drawable.justin, "Justin bieber"));


        //Add Data to parent recycler..
        dataHomes = new ArrayList<>();
        dataHomes.add(new DataHome("Popular playlists", categoriesItem1));
        dataHomes.add(new DataHome("Best of artists", categoriesItem2));
        dataHomes.add(new DataHome("Pop forever", categoriesItem3));
        dataHomes.add(new DataHome("Songs you might like", categoriesItem4));
        dataHomes.add(new DataHome("For Your Listening Pleasure!", categoriesItem5));
        dataHomes.add(new DataHome("Too mush Bollywood", categoriesItem6));
        dataHomes.add(new DataHome("Made for you", categoriesItem7));

        setMainCategoryAdapter(dataHomes);
    }

    private void setMainCategoryAdapter(List<DataHome> dataHomes) {
        HomeRecyclerAdapter homeRecyclerAdapter = new HomeRecyclerAdapter(getActivity(), dataHomes);
        RecyclerView recyclerView = getView().findViewById(R.id.home_recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(homeRecyclerAdapter);
    }

}
