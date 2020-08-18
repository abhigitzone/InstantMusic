package com.example.musicstructureapp;

public class DataHome {
    private int homeImg;
    private String homeTitle;


    public DataHome(int homeImg, String homeTitle) {
        this.homeImg = homeImg;
        this.homeTitle = homeTitle;
    }

    public int getHomeImg() {
        return homeImg;
    }

    public String getHomeTitle() {
        return homeTitle;
    }
}
