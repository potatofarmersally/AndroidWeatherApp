package com.example.weatherapp.Model;

public class Sys {
    private int myType;
    private int myId;
    private double myMessage;
    private String myCountry;
    private double mySunrise;
    private double mySunset;

    public Sys(int myType, int myId, double myMessage, String myCountry, double mySunrise, double mySunset) {
        this.myType = myType;
        this.myId = myId;
        this.myMessage = myMessage;
        this.myCountry = myCountry;
        this.mySunrise = mySunrise;
        this.mySunset = mySunset;
    }

    public int getMyType() {
        return myType;
    }

    public void setMyType(int myType) {
        this.myType = myType;
    }

    public int getMyId() {
        return myId;
    }

    public void setMyId(int myId) {
        this.myId = myId;
    }

    public double getMyMessage() {
        return myMessage;
    }

    public void setMyMessage(double myMessage) {
        this.myMessage = myMessage;
    }

    public String getMyCountry() {
        return myCountry;
    }

    public void setMyCountry(String myCountry) {
        this.myCountry = myCountry;
    }

    public double getMySunrise() {
        return mySunrise;
    }

    public void setMySunrise(double mySunrise) {
        this.mySunrise = mySunrise;
    }

    public double getMySunset() {
        return mySunset;
    }

    public void setMySunset(double mySunset) {
        this.mySunset = mySunset;
    }
}
