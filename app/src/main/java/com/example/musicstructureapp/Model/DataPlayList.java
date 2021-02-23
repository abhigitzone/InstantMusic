package com.example.musicstructureapp.Model;

public class DataPlayList {
    private String songName;
    private String songInfo;
    private int songImg;

    public DataPlayList(String songName, String songInfo, int songImg) {
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
