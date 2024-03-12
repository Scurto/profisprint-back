package com.profisprint.model.captcha;

import java.util.ArrayList;

public class CaptchaModel {

    private String title;
    private ArrayList<String> imageList;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<String> getImageList() {
        return imageList;
    }

    public void setImageList(ArrayList<String> imageList) {
        this.imageList = imageList;
    }

    @Override
    public String toString() {
        return "CaptchaModel{" +
                "title='" + title + '\'' +
                ", imageList=" + imageList +
                '}';
    }
}
