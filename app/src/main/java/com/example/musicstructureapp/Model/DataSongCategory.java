package com.example.musicstructureapp.Model;

public class DataSongCategory {
    int id;
    int songImg;
    String songTitle;

    public DataSongCategory(int id, int songImg, String songTitle) {
        this.id = id;
        this.songImg = songImg;
        this.songTitle = songTitle;
    }

    public String getSongTitle() {
        return songTitle;
    }

    public void setSongTitle(String songTitle) {
        this.songTitle = songTitle;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSongImg() {
        return songImg;
    }

    public void setSongImg(int songImg) {
        this.songImg = songImg;
    }
}
