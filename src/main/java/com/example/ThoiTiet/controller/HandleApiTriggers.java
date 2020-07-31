package com.example.ThoiTiet.controller;

import com.example.ThoiTiet.data1.WeatherDb;
import com.example.ThoiTiet.dataStations.JsonStation;
import com.example.ThoiTiet.dataTriggers.JsonTriggers;
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
public class HandleApiTriggers {

    //http://api.openweathermap.org/data/3.0/triggers?appid=0791af58d522eeb0c7270fe179944aff
    /*@GetMapping("/trigger")
    public static JsonTriggers getTriggers() {

        OkHttpClient client = new OkHttpClient();
        Gson gson = new Gson();
        JsonTriggers data = null;

        Request res = new Request.Builder().url("https://samples.openweathermap.org/data/3.0/triggers/816a?appid=0791af58d522eeb0c7270fe179944aff").build();
        try {
            // Gửi Request đến API và nhận về Response
            Response response = client.newCall(res).execute();
            // lấy Body
            ResponseBody body = response.body();

            // Chuyển đổi Body - chuỗi Json thành Object
            data = gson.fromJson(body.charStream(), JsonTriggers.class);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return data;
    }*/

    /*@Scheduled(fixedRate = 60*1000)
    public void getJsonDatabase() {

        OkHttpClient client = new OkHttpClient();
        Gson gson = new Gson();
        JsonTriggers data = null;

        Request res = new Request.Builder().url("https://samples.openweathermap.org/data/3.0/triggers/816a?appid=b1b15e88fa797225412429c1c50c122a1").build();

        try {

            Response response = client.newCall(res).execute();
            ResponseBody body = response.body();
            data = gson.fromJson(body.string(), JsonTriggers.class);

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
    }*/
}
