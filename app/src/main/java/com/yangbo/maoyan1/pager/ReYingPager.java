package com.yangbo.maoyan1.pager;

import android.content.Context;
import android.view.View;

import com.yangbo.maoyan1.R;
import com.yangbo.maoyan1.base.BasePager;


/**
 * Created by yangbo on 2016/6/22.
 */
public class ReYingPager extends BasePager {

    public ReYingPager(Context context) {
        super(context);
    }

    @Override
    public View initView() {
        View view = View.inflate(context, R.layout.pager_reying,null);
        return view;
    }
}
