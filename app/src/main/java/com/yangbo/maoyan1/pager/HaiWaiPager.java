package com.yangbo.maoyan1.pager;

import android.content.Context;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.TextView;

import com.yangbo.maoyan1.HaiwaiChildView.HanguoPager;
import com.yangbo.maoyan1.HaiwaiChildView.MeiguoPager;
import com.yangbo.maoyan1.HaiwaiChildView.RiBenPager;
import com.yangbo.maoyan1.R;
import com.yangbo.maoyan1.adapter.Vp_HaiWai_Adapter;
import com.yangbo.maoyan1.base.BaseFireFragment;
import com.yangbo.maoyan1.base.BasePager;
import com.yangbo.maoyan1.view.HaiWaiViewPager;

import java.util.ArrayList;


/**
 * Created by yangbo on 2016/6/22.
 */
public class HaiWaiPager extends BasePager {
    private TabLayout tab_haiwai;
    private TextView tv_haiwai_guojia;
    private HaiWaiViewPager vp_haiwai;
    private ArrayList<BaseFireFragment> arr_vp;
    private Vp_HaiWai_Adapter hwAdapter;

    private String[] str = {"美国","韩国","日本"};

    public HaiWaiPager(Context context) {
        super(context);
    }

    @Override
    public View initView() {
        View view = View.inflate(context, R.layout.fragment_haiwai, null);
        tab_haiwai = (TabLayout) view.findViewById(R.id.tab_haiwai);
        vp_haiwai = (HaiWaiViewPager) view.findViewById(R.id.vp_haiwai);
        tv_haiwai_guojia = (TextView) view.findViewById(R.id.tv_haiwai_guojia);
        return view;
    }

    @Override
    public void initData() {
        super.initData();
        arr_vp = new ArrayList<>();
//        添加页面
        arr_vp.add(new MeiguoPager(context));
        arr_vp.add(new HanguoPager(context));
        arr_vp.add(new RiBenPager(context));
        //设置适配器
        hwAdapter = new Vp_HaiWai_Adapter(arr_vp);
        vp_haiwai.setAdapter(hwAdapter);
        //TabLayout关联viewpager
        tab_haiwai.setupWithViewPager(vp_haiwai);
        //默认第一个页面
        vp_haiwai.setCurrentItem(0);
        //默认加载第一个页面的布局
        arr_vp.get(0).initData();
        //viewpager的监听
        vp_haiwai.addOnPageChangeListener(new MyOnPageChangeListener());
        //监听tablayout
        tab_haiwai.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                vp_haiwai.setCurrentItem(tab.getPosition());
                tv_haiwai_guojia.setText(str[tab.getPosition()]);
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }


    private class MyOnPageChangeListener implements ViewPager.OnPageChangeListener {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int position) {
            arr_vp.get(position).initData();
        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    }
}
