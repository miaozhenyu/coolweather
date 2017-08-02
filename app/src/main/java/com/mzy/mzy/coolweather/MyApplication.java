package com.mzy.mzy.coolweather;

import android.app.Application;
import android.content.Context;

import org.litepal.LitePal;

/**
 * Created by MZY on 2017/8/1.
 */

public class MyApplication extends Application {
    private static Context context;

    @Override
    public void onCreate() {
        context = getApplicationContext();
        LitePal.initialize(context);
        super.onCreate();
    }
    public static Context getContext(){
        return context;
    }
}
