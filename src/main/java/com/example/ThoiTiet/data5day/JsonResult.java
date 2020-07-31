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

public class JsonResult {

    private String cod;
    private int message;
    private int cnt;
    private List[] list;
    private City city;

    public JsonResult() {
    }

    public String getCod() {
        return cod;
    }

    public int getMessage() {
        return message;
    }

    public int getCnt() {
        return cnt;
    }

    public List[] getList() {
        return list;
    }

    public City getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "JsonResult{" +
                "cod='" + cod + '\'' +
                ", message=" + message +
                ", cnt=" + cnt +
                ", list=" + Arrays.toString(list) +
                ", city=" + city +
                '}';
    }
}
