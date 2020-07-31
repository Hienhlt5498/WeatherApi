package com.example.ThoiTiet.controller;

import com.example.ThoiTiet.data5day.JsonResult;
import com.google.gson.Gson;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.ResponseBody;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

@RestController
public class HandleApi5Day3h {

    @GetMapping("/fiveday")
    public static JsonResult getDataFiveDays() {
        OkHttpClient client = new OkHttpClient();
        Gson gson = new Gson();
        JsonResult data = null;

        // Tạo một request đến API //api.openweathermap.org/data/2.5/weather?q=Hanoi&&APPID=bffca17bcb552b8c8e4f3b82f64cccd2
        Request res = new Request.Builder().url("https://api.openweathermap.org/data/2.5/forecast?"+"lat=21.0286755&lon=105.7558943"+ "&lang=vi&appid=0791af58d522eeb0c7270fe179944aff").build();
        try {
            // Gửi Request đến API và nhận về Response
            Response response = client.newCall(res).execute();
            ResponseBody body = response.body();
            data = gson.fromJson(body.string(), JsonResult.class);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return data;
    }

    @Scheduled(fixedRate = 60*1000)
    public void getJsonFiveDay() {
        OkHttpClient client = new OkHttpClient();
        Gson gson = new Gson();
        JsonResult data = null;

        Request res = new Request.Builder().url("https://api.openweathermap.org/data/2.5/forecast?"+"lat=21.0286755&lon=105.7558943"+ "&lang=vi&appid=0791af58d522eeb0c7270fe179944aff").build();
        try {

            Response response = client.newCall(res).execute();
            ResponseBody body = response.body();
            data = gson.fromJson(body.string(), JsonResult.class);

            try {
                // chuyển đổi object thành chuỗi
                String obj = data.toString();
                FileOutputStream fo = new FileOutputStream("five.txt");
                ObjectOutputStream oos = new ObjectOutputStream(fo);
                oos.writeObject(obj);

            } catch (Exception e) {
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
