package com.example.ThoiTiet.data1;


public class Rain {
    private double OneHour;

    public Rain() {
    }

    public double getOneHour() {
        return OneHour;
    }

    public void setOneHour(double oneHour) {
        OneHour = oneHour;
    }

    @Override
    public String toString() {
        return "Rain{" +
                "OneHour=" + OneHour +
                '}';
    }
}
