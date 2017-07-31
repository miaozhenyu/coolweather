package com.mzy.mzy.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by MZY on 2017/7/31.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
