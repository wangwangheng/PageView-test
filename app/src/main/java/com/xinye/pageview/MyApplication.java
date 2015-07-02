package com.xinye.pageview;

import android.app.Application;
import android.content.Context;
import android.util.Log;

/**
 * Created by wangheng on 2015/6/28.
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        this.sContext = getApplicationContext();

        if(userName.equals("")){
            Log.i("wangheng","isNull");
        }

    }

    private String userName;
    private static Context sContext;
}
