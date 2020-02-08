package com.example.weatherapp.Model;

public class Wind {
    private double mySpeed;
    private double myDeg;

    public Wind(double mySpeed, double myDeg) {
        this.mySpeed = mySpeed;
        this.myDeg = myDeg;
    }

    public double getMySpeed() {
        return mySpeed;
    }

    public void setMySpeed(double mySpeed) {
        this.mySpeed = mySpeed;
    }

    public double getMyDeg() {
        return myDeg;
    }

    public void setMyDeg(double myDeg) {
        this.myDeg = myDeg;
    }
}
