package com.yangbo.maoyan1.adapter;

import android.support.v4.view.PagerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

import com.yangbo.maoyan1.base.BaseFireFragment;

import java.util.ArrayList;

/**
 * Created by sdf on 2016/6/25.
 */
public class Vp_HaiWai_Adapter extends PagerAdapter {


    private final ArrayList<BaseFireFragment> arr;
    private String[] str = {"美国","韩国","日本"};

    public Vp_HaiWai_Adapter(ArrayList<BaseFireFragment> arr_vp) {
        Log.e("TAG",arr_vp.toString());
        Log.e("TAG*************", str.toString());
        this.arr=arr_vp;
    }


    @Override
    public int getCount() {
        return arr.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        BaseFireFragment baseFireFragment = arr.get(position);
        View view = baseFireFragment.initView();
        baseFireFragment.initData();
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
//        super.destroyItem(container, position, object);
        container.removeView((View) object);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return str[position];
    }
}
