package com.example.ThoiTiet.dataStations;

import java.util.Arrays;
import java.util.Date;

public class JsonStation {

    private String id;
    private String created_at;
    private String updated_at;
    private String external_id;
    private String name;
    private double longitude;
    private double latitude;
    private int altitude;
    private int rank;

    public JsonStation() {
    }

    public String getId() {
        return id;
    }

    public String getCreated_at() {
        return created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public String getExternal_id() {
        return external_id;
    }

    public String getName() {
        return name;
    }

    public double getLongitude() {
        return longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public int getAltitude() {
        return altitude;
    }

    public int getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return "JsonStation{" +
                "id='" + id + '\'' +
                ", created_at=" + created_at +
                ", updated_at=" + updated_at +
                ", external_id='" + external_id + '\'' +
                ", name='" + name + '\'' +
                ", longitude=" + longitude +
                ", latitude=" + latitude +
                ", altitude=" + altitude +
                ", rank=" + rank +
                '}';
    }
}
