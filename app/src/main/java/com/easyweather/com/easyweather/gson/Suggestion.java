package com.easyweather.com.easyweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Lenovo on 2017/4/11.
 */

public class Suggestion {

    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWarh carWarh;

    @SerializedName("sport")
    public Sport sport;

    public class Comfort{
        @SerializedName("txt")
        public String info;
    }
    public class CarWarh{
        @SerializedName("txt")
        public String info;
    }

    public class Sport{
        @SerializedName("txt")
        public String info;
    }


}
