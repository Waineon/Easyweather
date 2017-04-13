package com.easyweather.com.easyweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Lenovo on 2017/4/11.
 */

public class Basic {

    /**
     * city : 青岛
     * id : CN101120201
     * update : {"loc":"2016-08-30 11: 52"}
     */

    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String id;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
