package com.example.ThoiTiet.dataTriggers;

import java.util.Arrays;

public class JsonTriggers {
    private String _id;
    private int __v;
    private Alerts alerts;
    private Area[] area;
    private Number[] conditions;
    private Time_period time_period;

    public JsonTriggers() {
    }

    public String get_id() {
        return _id;
    }

    public int get__v() {
        return __v;
    }

    public Alerts getAlerts() {
        return alerts;
    }

    public Area[] getArea() {
        return area;
    }

    public Number[] getConditions() {
        return conditions;
    }

    public Time_period getTime_period() {
        return time_period;
    }

    @Override
    public String toString() {
        return "JsonTriggers{" +
                "_id='" + _id + '\'' +
                ", __v=" + __v +
                ", alerts=" + alerts +
                ", area=" + Arrays.toString(area) +
                ", conditions=" + Arrays.toString(conditions) +
                ", time_period=" + time_period +
                '}';
    }
}
