package com.example.ThoiTiet.DataOneCall;

import java.util.Arrays;

public class JsonOneCall {

    //https://api.openweathermap.org/data/2.5/onecall?lat=33.441792&lon=-94.037689&exclude=hourly,daily&appid=0791af58d522eeb0c7270fe179944aff
    private double lat;
    private double lon;
    private String timezone;
    private int timezone_offset;
    private Current current;
    private Hourly[] hourly;
    private Daily[] daily;

    public JsonOneCall() {
    }

    @Override
    public String toString() {
        return "JsonOneCall{" +
                "lat=" + lat +
                ", lon=" + lon +
                ", timezone='" + timezone + '\'' +
                ", timezone_offset=" + timezone_offset +
                ", current=" + current +
                ", hourly=" + Arrays.toString(hourly) +
                ", daily=" + Arrays.toString(daily) +
                '}';
    }

    public double getLat() {
        return lat;
    }

    public double getLon() {
        return lon;
    }

    public String getTimezone() {
        return timezone;
    }

    public int getTimezone_offset() {
        return timezone_offset;
    }

    public Current getCurrent() {
        return current;
    }

    public Hourly[] getHourly() {
        return hourly;
    }

    public Daily[] getDaily() {
        return daily;
    }
}
