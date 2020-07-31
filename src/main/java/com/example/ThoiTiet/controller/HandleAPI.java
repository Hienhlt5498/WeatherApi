package com.example.ThoiTiet.controller;

import com.example.ThoiTiet.data1.WeatherDb;

import com.google.gson.Gson;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.ResponseBody;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.*;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

@RestController
public class HandleAPI {

    @GetMapping("/get")
    public static WeatherDb getJsonData(String city) {
        OkHttpClient client = new OkHttpClient();
        Gson gson = new Gson();
        WeatherDb data = null;

        Scanner sc = new Scanner(System.in);
        city = sc.nextLine();

        // Tạo một request đến API //api.openweathermap.org/data/2.5/weather?q=Hanoi&&APPID=bffca17bcb552b8c8e4f3b82f64cccd2
        Request res = new Request.Builder().url("http://api.openweathermap.org/data/2.5/weather?q="+city+ "&APPID=bffca17bcb552b8c8e4f3b82f64cccd2").build();
        try {
            // Gửi Request đến API và nhận về Response
            Response response = client.newCall(res).execute();
            // lấy Body
            ResponseBody body = response.body();

            // Chuyển đổi Body - chuỗi Json thành Object
            data = gson.fromJson(body.string(), WeatherDb.class);

            try {
                // chuyển đổi object thành chuỗi
                String obj = data.toString();
                FileOutputStream fo = new FileOutputStream("data1.txt");
                ObjectOutputStream oos = new ObjectOutputStream(fo);
                oos.writeObject(obj);

            } catch (Exception e) {
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return data;
    }

    //Tạo job lấy dữ liệu định kì 1 phút 1 lần
    @Scheduled(fixedRate = 60*1000)
    public void getJsonDatabase() {

        OkHttpClient client = new OkHttpClient();
        Gson gson = new Gson();
        WeatherDb data = null;

        Request res = new Request.Builder().url("http://api.openweathermap.org/data/2.5/weather?q=Hanoi&APPID=bffca17bcb552b8c8e4f3b82f64cccd2").build();

        try {

            Response response = client.newCall(res).execute();
            ResponseBody body = response.body();
            data = gson.fromJson(body.string(), WeatherDb.class);

            try {
                // chuyển đổi object thành chuỗi
                String obj = data.toString();
                FileOutputStream fo = new FileOutputStream("data2.txt");
                ObjectOutputStream oos = new ObjectOutputStream(fo);
                oos.writeObject(obj);

            } catch (Exception e) {
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
