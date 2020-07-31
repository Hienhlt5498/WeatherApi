/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.ThoiTiet.data5day;

import java.util.Arrays;

/**
 *
 * @author Administrator
 */

public class List {

    private long dt;
    private Main main;
    private Weather[] weather;
    private Clouds clouds;
    private Wind wind;
    private int visibility;
    private double pop;
    private Rain rain;
    private Sys sys;
    private String dt_txt;

    public List() {
    }

    public long getDt() {
        return dt;
    }

    public Main getMain() {
        return main;
    }

    public Weather[] getWeather() {
        return weather;
    }

    public Clouds getClouds() {
        return clouds;
    }

    public Wind getWind() {
        return wind;
    }

    public int getVisibility() {
        return visibility;
    }

    public double getPop() {
        return pop;
    }

    public Rain getRain() {
        return rain;
    }

    public Sys getSys() {
        return sys;
    }

    public String getDt_txt() {
        return dt_txt;
    }

    @Override
    public String toString() {
        return "DailyWeather{" +
                "dt=" + dt +
                ", main=" + main +
                ", weather=" + Arrays.toString(weather) +
                ", clouds=" + clouds +
                ", wind=" + wind +
                ", visibility=" + visibility +
                ", pop=" + pop +
                ", rain=" + rain +
                ", sys=" + sys +
                ", dt_txt='" + dt_txt + '\'' +
                '}';
    }
}
