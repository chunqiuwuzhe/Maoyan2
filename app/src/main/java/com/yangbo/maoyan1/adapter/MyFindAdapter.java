package com.yangbo.maoyan1.adapter;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.yangbo.maoyan1.R;
import com.yangbo.maoyan1.activity.H5FindActivity;
import com.yangbo.maoyan1.bean.FindListBean;
import com.yangbo.maoyan1.bean.FindViewPagerBean;
import com.yangbo.maoyan1.utils.UrlUtilsFind;

import java.util.List;

/**
 * Created by yangbo on 2016/6/28.
 */
public class MyFindAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private final Context context;
    //list的数据集合
    private List<FindListBean.DataBean.FeedsBean> feeds;
    //Viewpager的数据集合
    private List<FindViewPagerBean.DataBean> datas;
    //为了接收消息
    private ViewPager vp_find_vp1;

    public MyFindAdapter(Context context) {
        this.context = context;
    }

    //设置list的数据集合
    public void setFeeds(List<FindListBean.DataBean.FeedsBean> feeds) {
        this.feeds = feeds;
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        if (viewType == 0) {
            View view = LayoutInflater.from(context).inflate(R.layout.item_find_header, parent, false);
            return new MyFindHolder1(view);
        }
        if (viewType == 1) {
            View view = LayoutInflater.from(context).inflate(R.layout.item_find_body1, parent, false);
            return new MyFindHolder2(view);
        }
        return null;
    }
    /**
     * 绑定数据
     *
     * @param holder
     * @param position
     */
    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (position == 0&&datas!= null && datas.size()>0){
//            LogUtil.e("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!"+datas.get(0).getImgUrl());
            MyFindHeaderAdapter myFindHeaderAdapter = new MyFindHeaderAdapter(context,datas);
            vp_find_vp1 =  ( (MyFindHolder1)holder).vp_find_vp;
            ( (MyFindHolder1)holder).vp_find_vp.setAdapter(myFindHeaderAdapter);
            handler.sendEmptyMessageDelayed(1,2000);

        }
    }

    private Handler handler = new Handler(){
        public void handleMessage(Message msg){
            if(vp_find_vp1!=null) {
                vp_find_vp1.setCurrentItem(vp_find_vp1.getCurrentItem()+1);
                removeCallbacksAndMessages(null);
                handler.sendEmptyMessageDelayed(1,2000);
            }
        }
    };

    @Override
    public int getItemCount() {
        return 1;
    }

    @Override
    public int getItemViewType(int position) {

        if (position == 0) {
            return 0;
        }
        if (feeds != null && feeds.size() > 0) {
            return feeds.get(position).getFeedType();
        }

        return 1;
    }

    public void setDatas(List<FindViewPagerBean.DataBean> datas) {
        this.datas = datas;
    }


    class MyFindHolder1 extends RecyclerView.ViewHolder {
      public ViewPager vp_find_vp;
        TextView tv_find_huati;
        TextView tv_find_zixun;
        TextView tv_find_yingku;
        TextView tv_find_piaofang;


        public MyFindHolder1(View itemView) {
            super(itemView);
            vp_find_vp = (ViewPager) itemView.findViewById(R.id.vp_find_vp);
            tv_find_huati = (TextView) itemView.findViewById(R.id.tv_find_huati);
            tv_find_zixun = (TextView) itemView.findViewById(R.id.tv_find_zixun);
            tv_find_yingku = (TextView) itemView.findViewById(R.id.tv_find_yingku);
            tv_find_piaofang = (TextView) itemView.findViewById(R.id.tv_find_piaofang);

            MyOnClickListener myOnClickListener = new MyOnClickListener();
            tv_find_huati.setOnClickListener(myOnClickListener);
            tv_find_zixun.setOnClickListener(myOnClickListener);
            tv_find_yingku.setOnClickListener(myOnClickListener);
            tv_find_piaofang.setOnClickListener(myOnClickListener);
        }

    }

    class MyFindHolder2 extends RecyclerView.ViewHolder {

        public MyFindHolder2(View itemView) {
            super(itemView);
        }
    }

    //onclick的描述
    class MyOnClickListener implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            Intent intent = new Intent(context, H5FindActivity.class);
            switch (v.getId()) {
                case R.id.tv_find_huati:
                    intent.putExtra("url", UrlUtilsFind.URL_FIND_HUATI);
                    break;
                case R.id.tv_find_zixun:
                    intent.putExtra("url", UrlUtilsFind.URL_FIND_ZIXUN);

                    break;
                case R.id.tv_find_yingku:
                    intent.putExtra("url", "");
                    break;
                case R.id.tv_find_piaofang:
                    intent.putExtra("url", "");
                    break;
            }
            context.startActivity(intent);
        }
    }

}
