package com.seokee.hobby.model;

public class Home_Star_Rv_Model {
    private int borderImage;
    private String title;
    private String text;
    public Home_Star_Rv_Model(int borderImage, String title, String text){
        this.borderImage = borderImage;
        this.title = title;
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getBorderImage() {
        return borderImage;
    }

    public void setBorderImage(int borderImage) {
        this.borderImage = borderImage;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
