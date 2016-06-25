package com.yangbo.maoyan1.base;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.view.View;

/**
 * Created by sdf on 2016/6/25.
 */
public abstract class BaseFireFragment extends Fragment {

    public Context context;
    public View rootView;


    public BaseFireFragment(Context context) {
        this.context = context;
        rootView = initView();
    }

    public abstract View initView();

    public void initData(){

    }
}
