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

import java.util.ArrayList;


/**
 * Created by yangbo on 2016/6/22.
 */
public class HaiWaiPager extends BasePager {
    private TabLayout tab_haiwai;
    private TextView tv_haiwai_guojia;
    private ViewPager vp_haiwai;
    private String[] str = {"美国","韩国","日本"};
    private ArrayList<BaseFireFragment> arr_vp;
    private Vp_HaiWai_Adapter hwAdapter;

    public HaiWaiPager(Context context) {
        super(context);
    }

    @Override
    public View initView() {
        View view = View.inflate(context, R.layout.fragment_haiwai, null);
        tab_haiwai = (TabLayout) view.findViewById(R.id.tab_haiwai);
        vp_haiwai = (ViewPager) view.findViewById(R.id.vp_haiwai);
        tv_haiwai_guojia = (TextView) view.findViewById(R.id.tv_haiwai_guojia);
        setData();
        return view;
    }

    public void setData() {
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
    }
}
