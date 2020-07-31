package com.example.ThoiTiet.controller;

import com.example.ThoiTiet.DataOneCall.JsonOneCall;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.ResponseBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.MalformedURLException;
import java.net.URL;

@RestController
public class HandleApiMap {

    @GetMapping("/map")
    public void getMap() throws MalformedURLException {
//        OkHttpClient client = new OkHttpClient();
        try {
            URL url = new URL("https://openweathermap.org/weathermap?basemap=map&cities=false&layer=clouds&lat=30&lon=-20&zoom=3");
        } catch (Exception ex) {
            ex.printStackTrace();
        }

//        Request res = new Request.Builder().url("https://openweathermap.org/weathermap?basemap=map&cities=false&layer=clouds&lat=30&lon=-20&zoom=3").build();

        return;
    }

}
