package com.example.CoolWeather.util;

import org.junit.runner.Request;

public class HttpUtil {
    public static void sendOkHttpRequest(String address,okttp3.Callback callback)
    {
        OkHttpClient client=new OkHttpClient();
        Request request= new Request.Builder().url(adress).build();
        Client.newcall(request).enqueue(callback);
    }
}
