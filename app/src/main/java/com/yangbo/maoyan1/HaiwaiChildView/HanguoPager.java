package com.yangbo.maoyan1.HaiwaiChildView;

import android.content.Context;
import android.view.View;

import com.yangbo.maoyan1.R;
import com.yangbo.maoyan1.base.BaseFireFragment;

/**
 * Created by sdf on 2016/6/25.
 */
public class HanguoPager extends BaseFireFragment {


    public HanguoPager(Context context) {
        super(context);
    }

    @Override
    public View initView() {
        View view=View.inflate(context, R.layout.haiwai_hanguo_pager,null);
        return view;
    }

    @Override
    public void initData() {
        super.initData();
    }
}
