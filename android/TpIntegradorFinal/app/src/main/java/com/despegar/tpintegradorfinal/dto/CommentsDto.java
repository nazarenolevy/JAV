package com.despegar.tpintegradorfinal.dto;

/**
 * Created by nazarenolevy on 09/05/16.
 */
public class CommentsDto {

    private String title;
    private String good;
    private String bad;
    private String type;

    public CommentsDto() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGood() {
        return good;
    }

    public void setGood(String good) {
        this.good = good;
    }

    public String getBad() {
        return bad;
    }

    public void setBad(String bad) {
        this.bad = bad;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
