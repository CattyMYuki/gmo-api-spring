package com.gmo.api.gmoapi.restcontroller.externalApi;

public class test {
    public static void main(final String[] args) throws Exception {
        final gmoGetApi gmoGetApi = new gmoGetApi();

        String result;
        String alt_coin;
        alt_coin = "XRP";
        result = gmoGetApi.getTicker(alt_coin);
        System.out.print(result);

    }
}