package com.easyweather.com.easyweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Lenovo on 2017/4/11.
 */

public class Forecast {
    public String date;

    @SerializedName("cond")
    public More more;
    @SerializedName("tmp")
    public Temperature temperature;

    public class More{
        @SerializedName("txt_d")
        public String info;
    }

    public class Temperature{
        public String max;
        public String min;
    }

}
