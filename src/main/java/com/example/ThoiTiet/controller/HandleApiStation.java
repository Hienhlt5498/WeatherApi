package com.example.ThoiTiet.controller;

import com.example.ThoiTiet.dataStations.JsonStation;
import com.google.gson.Gson;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.ResponseBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

@RestController
public class HandleApiStation {

//    @Scheduled(fixedRate = 6000)
    @GetMapping("/apistation")
    public static JsonStation getDataStation() {

        OkHttpClient client = new OkHttpClient();
        Gson gson = new Gson();
        JsonStation data = null;

        // Tạo một request đến API //api.openweathermap.org/data/2.5/weather?q=Hanoi&&APPID=bffca17bcb552b8c8e4f3b82f64cccd2
        Request res = new Request.Builder().url("https://samples.openweathermap.org/data/3.0/stations?appid=b1b15e88fa797225412429c1c50c122a1").build();

        try {
            // Gửi Request đến API và nhận về Response
            Response response = client.newCall(res).execute();
            // lấy Body
            ResponseBody body = response.body();

            // Chuyển đổi Body - chuỗi Json thành Object
            data = gson.fromJson(body.string(), JsonStation.class);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return data;
    }
}
