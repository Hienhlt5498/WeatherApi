package com.example.ThoiTiet.DataOneCall;

import com.example.ThoiTiet.data1.Weather;

import java.util.Arrays;

public class Daily {

    private long dt;
    private long sunrise;
    private long sunset;
    private Temp temp;
    private Feels_like feels_like;
    private int pressure;
    private int humidity;
    private double dew_point;

    private double wind_speed;
    private double wind_deg;
    private Weather[] weather;
    private int clouds;
    private double pop;
    private double rain;
    private double uvi;

    public Daily() {
    }

    public long getDt() {
        return dt;
    }

    public long getSunrise() {
        return sunrise;
    }

    public long getSunset() {
        return sunset;
    }

    public Temp getTemp() {
        return temp;
    }

    public Feels_like getFeels_like() {
        return feels_like;
    }

    public int getPressure() {
        return pressure;
    }

    public int getHumidity() {
        return humidity;
    }

    public double getDew_point() {
        return dew_point;
    }

    public double getWind_speed() {
        return wind_speed;
    }

    public double getWind_deg() {
        return wind_deg;
    }

    public Weather[] getWeather() {
        return weather;
    }

    public int getClouds() {
        return clouds;
    }

    public double getPop() {
        return pop;
    }

    public double getRain() {
        return rain;
    }

    public double getUvi() {
        return uvi;
    }

    @Override
    public String toString() {
        return "Daily{" +
                "dt=" + dt +
                ", sunrise=" + sunrise +
                ", sunset=" + sunset +
                ", temp=" + temp +
                ", feels_like=" + feels_like +
                ", pressure=" + pressure +
                ", humidity=" + humidity +
                ", dew_point=" + dew_point +
                ", wind_speed=" + wind_speed +
                ", wind_deg=" + wind_deg +
                ", weather=" + Arrays.toString(weather) +
                ", clouds=" + clouds +
                ", pop=" + pop +
                ", rain=" + rain +
                ", uvi=" + uvi +
                '}';
    }
}
