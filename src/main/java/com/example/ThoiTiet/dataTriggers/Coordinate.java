package com.example.ThoiTiet.dataTriggers;

public class Coordinate {

    private double lon;
    private double lat;

    public double getLon() {
        return lon;
    }

    public double getLat() {
        return lat;
    }

    @Override
    public String toString() {
        return lon +
                "," + lat;
    }
}
