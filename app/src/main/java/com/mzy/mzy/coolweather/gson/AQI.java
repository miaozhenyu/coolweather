package com.mzy.mzy.coolweather.gson;

/**
 * Created by MZY on 2017/7/31.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
