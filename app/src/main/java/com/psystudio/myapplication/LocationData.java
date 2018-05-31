package com.psystudio.myapplication;

/**
 * Created by alfo6-5 on 2018-05-15.
 */

public class LocationData { //sell arraylist에 넣을 배열 데이터들을 만드는 클래스

    String name;
    String location;
    int imgid;

    public LocationData(String name,String location,int imgid) {
        this.name = name;
        this.location = location;
        this.imgid = imgid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public int getImgid() {
        return imgid;
    }
    public void setImgid(int imgid) {
        this.imgid = imgid;
    }
}
