package com.yangbo.maoyan1.activity;

import android.app.Application;

import org.xutils.x;

/**
 * Created by yangbo on 2016/6/23.
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        x.Ext.init(this);
        x.Ext.setDebug(true);

    }
}
