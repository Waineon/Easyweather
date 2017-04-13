package com.easyweather.com.easyweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Lenovo on 2017/4/11.
 */

public class Now {
    @SerializedName("tmp")
    public String tmpperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
