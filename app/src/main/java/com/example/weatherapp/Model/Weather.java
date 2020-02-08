package com.example.weatherapp.Model;

public class Weather {
    private int myId;
    private String myMain;
    private String myDescription;
    private String myIcon;

    public Weather(int myId, String myMain, String myDescription, String myIcon) {
        this.myId = myId;
        this.myMain = myMain;
        this.myDescription = myDescription;
        this.myIcon = myIcon;
    }

    public int getMyId() {
        return myId;
    }

    public void setMyId(int myId) {
        this.myId = myId;
    }

    public String getMyMain() {
        return myMain;
    }

    public void setMyMain(String myMain) {
        this.myMain = myMain;
    }

    public String getMyDescription() {
        return myDescription;
    }

    public void setMyDescription(String myDescription) {
        this.myDescription = myDescription;
    }

    public String getMyIcon() {
        return myIcon;
    }

    public void setMyIcon(String myIcon) {
        this.myIcon = myIcon;
    }
}
