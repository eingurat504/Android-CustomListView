package com.example.a4d.list;

import java.util.ArrayList;

public class DataEvents {
    private String title, images;

   
    public DataEvents() {
    }
 
    public DataEvents(String title, String images) {
        this.title = title;
        this.images = images;

        
    }
 
    public String getTitle() {
        return title;
    }
 
    public void setTitle(String title) {
        this.title = title;
    }
 
    public String getthumbnailImage() {
        return images;
    }
 
    public void setthumbnailImage(String images) {
        this.images = images;
    }
 

 

 
}