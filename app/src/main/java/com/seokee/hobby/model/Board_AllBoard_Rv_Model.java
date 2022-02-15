package com.seokee.hobby.model;

import java.util.Date;

public class Board_AllBoard_Rv_Model {
    private String title;
    private String body;
    private Date date;

    public Board_AllBoard_Rv_Model() {
    }

    public Board_AllBoard_Rv_Model(String title, String body, Date date) {
        this.title = title;
        this.body = body;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
