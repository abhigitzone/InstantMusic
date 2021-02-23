package com.example.musicstructureapp.Model;

import java.util.List;

public class DataHome {
    private String songCategory;
    private List<DataSongCategory> dataCategories;

    public DataHome(String songCategory, List<DataSongCategory> dataCategories) {
        this.songCategory = songCategory;
        this.dataCategories = dataCategories;
    }

    public String getSongCategory() {
        return songCategory;
    }

    public void setSongCategory(String songCategory) {
        this.songCategory = songCategory;
    }

    public List<DataSongCategory> getDataCategories() {
        return dataCategories;
    }

    public void setDataCategories(List<DataSongCategory> dataCategories) {
        this.dataCategories = dataCategories;
    }

}
