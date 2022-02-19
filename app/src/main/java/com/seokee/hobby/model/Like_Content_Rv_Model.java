package com.seokee.hobby.model;

public class Like_Content_Rv_Model {
    private String id;
    private int imageSource;
    private String content;
    private int viewType;

    public Like_Content_Rv_Model() {
    }

    public Like_Content_Rv_Model(String id, String content,int viewType) {
        this.id = id;
        this.content = content;
        this.viewType = viewType;
    }

    public Like_Content_Rv_Model(String id, int imageSource, String content,int viewType) {
        this.id = id;
        this.imageSource = imageSource;
        this.content = content;
        this.viewType = viewType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getImageSource() {
        return imageSource;
    }

    public void setImageSource(int imageSource) {
        this.imageSource = imageSource;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getViewType() {
        return viewType;
    }

    public void setViewType(int viewType) {
        this.viewType = viewType;
    }
}
