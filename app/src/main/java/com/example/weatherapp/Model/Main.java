package com.example.weatherapp.Model;

public class Main {
    private double myTemp;
    private double myPressure;
    private int myHumidity;
    private double myTempMin;
    private double myTempMax;

    public Main(double myTemp, double myPressure, int myHumidity, double myTempMin, double myTempMax) {
        this.myTemp = myTemp;
        this.myPressure = myPressure;
        this.myHumidity = myHumidity;
        this.myTempMin = myTempMin;
        this.myTempMax = myTempMax;
    }
//put cloud coverage in here
    public double getMyTemp() {
        return myTemp;
    }

    public void setMyTemp(double myTemp) {
        this.myTemp = myTemp;
    }

    public double getMyPressure() {
        return myPressure;
    }

    public void setMyPressure(double myPressure) {
        this.myPressure = myPressure;
    }

    public int getMyHumidity() {
        return myHumidity;
    }

    public void setMyHumidity(int myHumidity) {
        this.myHumidity = myHumidity;
    }

    public double getMyTempMin() {
        return myTempMin;
    }

    public void setMyTempMin(double myTempMin) {
        this.myTempMin = myTempMin;
    }

    public double getMyTempMax() {
        return myTempMax;
    }

    public void setMyTempMax(double myTempMax) {
        this.myTempMax = myTempMax;
    }
}
