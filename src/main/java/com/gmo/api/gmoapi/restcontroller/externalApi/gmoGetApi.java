package com.gmo.api.gmoapi.restcontroller.externalApi;

import com.google.gson.Gson;
import okhttp3.*;
import java.util.*;

public class gmoGetApi {
    private String url = "https://api.coin.z.com/public/v1/ticker";
    private HttpUrl.Builder urlBuilder = HttpUrl.parse(url).newBuilder();

    public String getTicker(String alt_coin) throws Exception {
        Gson gson = new Gson();

        // Add request Param
        Map<String, String> params = new HashMap<>();
        params.put("symbol", alt_coin);
        params.forEach(urlBuilder::addQueryParameter);

        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(urlBuilder.build()).build();

        //HTTP Request 
        Call call = client.newCall(request);
        Response response = call.execute();

        //Parse JSON format
        // String result = gson.fromJson(response.body().string(), String.class);
        String result = response.body().string();
        return result;
    }

}