package com.example.ThoiTiet.DataOneCall;

public class Minutely {
    private long dt;
    private int precipitation;

    public Minutely() {
    }

    public long getDt() {
        return dt;
    }

    public void setDt(long dt) {
        this.dt = dt;
    }

    public int getPrecipitation() {
        return precipitation;
    }

    public void setPrecipitation(int precipitation) {
        this.precipitation = precipitation;
    }

    @Override
    public String toString() {
        return "Minutely{" +
                "dt=" + dt +
                ", precipitation=" + precipitation +
                '}';
    }
}
