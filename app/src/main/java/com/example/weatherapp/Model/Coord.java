package com.example.weatherapp.Model;

public class Coord {
    private double myLat;
    private double myLon;

    public Coord(double theLat, double theLon) {
        this.myLat = theLat;
        this.myLon = theLon;
    }

    public double getMyLat() {
        return myLat;
    }

    public void setmyLat(double theLat) {
        this.myLat = theLat;
    }

    public double getMyLon() {
        return myLon;
    }

    public void setMyLon(double theLon) {
        this.myLon = theLon;
    }
}
