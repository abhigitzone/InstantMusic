package com.example.musicstructureapp.Model;

public class SearchData {
    private String itemName;
    private int itemImg;

    public SearchData(String itemName, int itemImg) {
        this.itemName = itemName;
        this.itemImg = itemImg;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemImg() {
        return itemImg;
    }

    public void setItemImg(int itemImg) {
        this.itemImg = itemImg;
    }
}
