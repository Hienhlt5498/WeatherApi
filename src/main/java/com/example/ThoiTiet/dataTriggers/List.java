package com.example.ThoiTiet.dataTriggers;

import java.util.Arrays;

public class List {

    private Conditions[] conditions;
    private long last_update;
    private long date;
    private Coordinates coordinates;

    public List() {
    }

    public Conditions[] getConditions() {
        return conditions;
    }

    public long getLast_update() {
        return last_update;
    }

    public long getDate() {
        return date;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    @Override
    public String toString() {
        return "List{" +
                "conditions=" + Arrays.toString(conditions) +
                ", last_update=" + last_update +
                ", date=" + date +
                ", coordinates=" + coordinates +
                '}';
    }
}
