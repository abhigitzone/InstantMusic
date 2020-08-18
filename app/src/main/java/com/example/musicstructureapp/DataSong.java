package com.example.musicstructureapp;

public class DataSong {
    private String songName;
    private String songInfo;
    private int songImg;

    public DataSong(String songName, String songInfo, int songImg) {
        this.songName = songName;
        this.songInfo = songInfo;
        this.songImg = songImg;
    }

    public String getSongName() {
        return songName;
    }

    public String getSongInfo() {
        return songInfo;
    }

    public int getSongImg() {
        return songImg;
    }
}
