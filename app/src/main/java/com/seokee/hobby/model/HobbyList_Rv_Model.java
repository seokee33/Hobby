package com.seokee.hobby.model;

public class HobbyList_Rv_Model {
    private int hobbyImage;
    private String name;

    public HobbyList_Rv_Model(int borderImage, String name){
        this.hobbyImage = borderImage;
        this.name = name;
    }

    public int getHobbyImage() {
        return hobbyImage;
    }

    public void setHobbyImage(int hobbyImage) {
        this.hobbyImage = hobbyImage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
