package com.example.ThoiTiet.DataOneCall;

import com.example.ThoiTiet.data1.Rain;
import com.example.ThoiTiet.data1.Weather;

import java.util.Arrays;

public class Hourly {
    private long dt;
    private double temp;
    private double feels_like;
    private int pressure;
    private int humidity;
    private double dew_point;
    private int clouds;
    private int visibility;
    private double wind_speed;
    private int wind_deg;
    private Weather[] weather;
    private double pop;
    private Rain rain;

    public Hourly() {
    }

    public long getDt() {
        return dt;
    }

    public double getTemp() {
        return temp;
    }

    public double getFeels_like() {
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

    public int getClouds() {
        return clouds;
    }

    public int getVisibility() {
        return visibility;
    }

    public double getWind_speed() {
        return wind_speed;
    }

    public int getWind_deg() {
        return wind_deg;
    }

    public Weather[] getWeather() {
        return weather;
    }

    public double getPop() {
        return pop;
    }

    public Rain getRain() {
        return rain;
    }

    @Override
    public String toString() {
        return "Hourly{" +
                "dt=" + dt +
                ", temp=" + temp +
                ", feels_like=" + feels_like +
                ", pressure=" + pressure +
                ", humidity=" + humidity +
                ", dew_point=" + dew_point +
                ", clouds=" + clouds +
                ", visibility=" + visibility +
                ", wind_speed=" + wind_speed +
                ", wind_deg=" + wind_deg +
                ", weather=" + Arrays.toString(weather) +
                ", pop=" + pop +
                ", rain=" + rain +
                '}';
    }
}
