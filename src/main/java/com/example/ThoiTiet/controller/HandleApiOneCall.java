package com.example.ThoiTiet.controller;

import com.example.ThoiTiet.DataOneCall.JsonOneCall;
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
public class HandleApiOneCall {

    @GetMapping("/onecall")
    public static JsonOneCall getDataOneCall() {
        OkHttpClient client = new OkHttpClient();
        Gson gson = new Gson();
        JsonOneCall data = null;

        // Tạo một request đến API //https://api.openweathermap.org/data/2.5/onecall?lat=21.0286755&lon=-105.7558943&appid=0791af58d522eeb0c7270fe179944aff
        Request res = new Request.Builder().url("https://api.openweathermap.org/data/2.5/onecall?lat=21.0286755&lon=105.7558943&appid=0791af58d522eeb0c7270fe179944aff").build();
        try {
            // Gửi Request đến API và nhận về Response
            Response response = client.newCall(res).execute();
            // lấy Body
            ResponseBody body = response.body();

            // Chuyển đổi Body - chuỗi Json thành Object
            data = gson.fromJson(body.string(), JsonOneCall.class);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return data;
    }

    @Scheduled(fixedRate = 60*1000)
    public void getOneCall() {
        OkHttpClient client = new OkHttpClient();
        Gson gson = new Gson();
        JsonOneCall data = null;

        Request res = new Request.Builder().url("https://api.openweathermap.org/data/2.5/onecall?lat=21.0286755&lon=105.7558943&appid=0791af58d522eeb0c7270fe179944aff").build();
        try {

            Response response = client.newCall(res).execute();
            ResponseBody body = response.body();
            data = gson.fromJson(body.string(), JsonOneCall.class);

            try {
                // chuyển đổi object thành chuỗi
                String obj = data.toString();
                FileOutputStream fo = new FileOutputStream("OneCall.txt");
                ObjectOutputStream oos = new ObjectOutputStream(fo);
                oos.writeObject(obj);

            } catch (Exception e) {
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
