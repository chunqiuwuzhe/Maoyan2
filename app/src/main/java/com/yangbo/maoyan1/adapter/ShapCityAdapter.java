package com.yangbo.maoyan1.adapter;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioGroup;

import com.yangbo.maoyan1.R;
import com.yangbo.maoyan1.bean.ShopCityVpBean;

import java.util.List;

/**
 * Created by sdf on 2016/6/29.
 */
public class ShapCityAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private Context context;
    private List<ShopCityVpBean.DataBean> beans;

    private ViewPager viewPager;
    public void setBeans(List<ShopCityVpBean.DataBean> beans) {
        this.beans = beans;
    }

    public ShapCityAdapter(Context context) {
        this.context = context;
        notifyItemRangeChanged(0, 1);
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (viewType == 0) {
            View view = LayoutInflater.from(context).inflate(R.layout.shop_viewpager, parent, false);
            return new vP_ViewHolder(view);
        }
        if(viewType==1){
            View view = LayoutInflater.from(context).inflate(R.layout.shop_month,parent,false);
            return new MonthViewPager(view);
        }
        View view = LayoutInflater.from(context).inflate(R.layout.shop_like,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if(position==0&&beans!=null&&beans.size()>0){
            ShopVPAdapter shopVPAdapter = new ShopVPAdapter(context,beans);
            viewPager = ((vP_ViewHolder) holder).vpShop;
            ((vP_ViewHolder)holder).vpShop.setAdapter(shopVPAdapter);
            //Handler不等于空发送消息
            if(internalHandler==null){
                internalHandler = new InternalHandler();
                internalHandler.removeCallbacksAndMessages(null);
                internalHandler.postDelayed(new MyRun(),2000);
            }
            return;
        }
        if(position==1){
            return;
        }
    }

    @Override
    public int getItemCount() {
        return 10;
    }

    @Override
    public int getItemViewType(int position) {
        if (position == 0) {
            return 0;
        }
        if(position==1){
            return 1;
        }
        return 2;
    }
    class ViewHolder extends RecyclerView.ViewHolder{

        public ViewHolder(View itemView) {
            super(itemView);
        }
    }
    //每月特价
    class MonthViewPager extends RecyclerView.ViewHolder{
        ImageView iv_one,iv_two,iv_three;
        public MonthViewPager(View itemView) {
            super(itemView);
            iv_one = (ImageView) itemView.findViewById(R.id.iv_one);
            iv_two = (ImageView) itemView.findViewById(R.id.iv_two);
            iv_three = (ImageView) itemView.findViewById(R.id.iv_three);
        }
    }
    private InternalHandler internalHandler;
    //轮播图
    class InternalHandler extends Handler {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            int item = viewPager.getCurrentItem()+1;
            viewPager.setCurrentItem(item);
            internalHandler.removeCallbacksAndMessages(null);
            internalHandler.postDelayed(new MyRun(), 2000);
        }
    }
    private class MyRun implements Runnable {
        @Override
        public void run() {
//            internalHandler.removeCallbacksAndMessages(null);
            internalHandler.sendEmptyMessage(0);
        }
    }
    //Viewpager类型
    class vP_ViewHolder extends RecyclerView.ViewHolder {
        ViewPager vpShop;
        RadioGroup rg_one;
        RadioGroup rg_two;

        public vP_ViewHolder(View itemView) {
            super(itemView);
            vpShop = (ViewPager) itemView.findViewById(R.id.vp_shop);
            rg_one = (RadioGroup) itemView.findViewById(R.id.rg_one);
            rg_two = (RadioGroup) itemView.findViewById(R.id.rg_two);
            rg_one.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {
                    switch (checkedId) {
                        case R.id.rb_shuma:
                            break;
                        case R.id.rb_gaowan:
                            break;
                        case R.id.rb_wanju:
                            break;
                        case R.id.rb_shenghuo:
                            break;
                        case R.id.rb_fushi:
                            break;
                    }
                }
            });
            rg_two.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {
                    switch (checkedId) {
                        case R.id.rb_chaobian:
                            break;
                        case R.id.rb_jiqimao:
                            break;
                        case R.id.rb_moshou:
                            break;
                        case R.id.rb_meidui:
                            break;
                        case R.id.rb_xingqiu:
                            break;
                    }
                }
            });
        }
    }
}
