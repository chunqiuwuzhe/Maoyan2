package com.yangbo.maoyan1.base;

import android.content.Context;
import android.view.View;

/**
 * Created by yangbo on 2016/6/22.
 */
public abstract class BasePager {
    public final View rootView;
    public Context context;

    public BasePager(Context context) {
        this.context = context;

        rootView = initView();
    }
    public abstract View initView();

    public void initData(){

    }
}
