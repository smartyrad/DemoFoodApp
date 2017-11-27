package com.example.currentplacedetailsonmap;

/**
 * Created by reubenvarghese1 on 28/11/17.
 */

public class ItemObjects {


    private String name;
    private String date;
    private String duration;
    private String type1;

    public ItemObjects(String name, String date, String duration, String type1) {
        this.name = name;
        this.date = date;
        this.duration = duration;
        this.type1 = type1;
    }


    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public String getDuration() {
        return duration;
    }

    public  String getType1(){ return  type1;}
}