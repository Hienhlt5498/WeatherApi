package com.example.ThoiTiet.DataOneCall;

public class Feels_like {
    private double day;
    private double night;
    private double eve;
    private double morn;

    public Feels_like() {
    }

    public double getDay() {
        return day;
    }

    public double getNight() {
        return night;
    }

    public double getEve() {
        return eve;
    }

    public double getMorn() {
        return morn;
    }

    @Override
    public String toString() {
        return "Feels_like{" +
                "day=" + day +
                ", night=" + night +
                ", eve=" + eve +
                ", morn=" + morn +
                '}';
    }
}
