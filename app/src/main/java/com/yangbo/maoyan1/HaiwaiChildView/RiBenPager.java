package com.yangbo.maoyan1.HaiwaiChildView;

import android.content.Context;
import android.view.View;

import com.yangbo.maoyan1.R;
import com.yangbo.maoyan1.base.BaseFireFragment;

/**
 * Created by sdf on 2016/6/25.
 */
public class RiBenPager extends BaseFireFragment {


    public RiBenPager(Context context) {
        super(context);
    }

    @Override
    public View initView() {
        View view=View.inflate(context, R.layout.haiwai_riebn_pager,null);
        return view;
    }

    @Override
    public void initData() {
        super.initData();
    }
}
