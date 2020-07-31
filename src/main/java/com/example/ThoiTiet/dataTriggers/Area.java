package com.example.ThoiTiet.dataTriggers;

import java.util.Arrays;

public class Area {
    private String point;
    private String _id;
    private Coordinate[] coordinates;

    public Area() {
    }

    public String getPoint() {
        return point;
    }

    public String get_id() {
        return _id;
    }

    public Coordinate[] getCoordinates() {
        return coordinates;
    }

    @Override
    public String toString() {
        return "Area{" +
                "point='" + point + '\'' +
                ", _id='" + _id + '\'' +
                ", coordinates=" + Arrays.toString(coordinates) +
                '}';
    }
}
