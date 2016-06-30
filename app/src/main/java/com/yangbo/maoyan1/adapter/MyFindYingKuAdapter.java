package com.yangbo.maoyan1.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.yangbo.maoyan1.R;
import com.yangbo.maoyan1.activity.FindYingKuActivity;
import com.yangbo.maoyan1.bean.DaiYIngRcViewBean;

import java.util.List;

/**
 * Created by yangbo on 2016/6/29.
 */
public class MyFindYingKuAdapter extends RecyclerView.Adapter<MyFindYingKuAdapter.MyYingkuHolder> {
    //待映的数据，用一下 ，哈哈
    private final List<DaiYIngRcViewBean.DataBean.ComingBean> coming;

    String[] jiang = {"上海电影节", "戛纳电影节", "香港金像奖", "奥斯卡金像奖", "柏林电影节",
            "金球奖", "台湾金马奖", "东京电影节", "釜山电影节", "威尼斯电影节"};


    private Context context;

    //构造器
    public MyFindYingKuAdapter(FindYingKuActivity findYingKuActivity, List<DaiYIngRcViewBean.DataBean.ComingBean> coming) {
        this.context = findYingKuActivity;
        this.coming = coming;
    }

    @Override
    public MyFindYingKuAdapter.MyYingkuHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_find_yingku, parent, false);
        return new MyYingkuHolder(view);
    }

    @Override
    public void onBindViewHolder(MyFindYingKuAdapter.MyYingkuHolder holder, int position) {
        holder.tv_jiangxiang_1.setText(jiang[position]);
        if (coming.size() > position) {
            String img = coming.get(position).getImg();

            String replace = img.replace("w.h", "165.220");
            Glide.with(context).load(replace).diskCacheStrategy(DiskCacheStrategy.ALL).into(holder.iv_jiangxiang);
            holder.tv_jiangxiang_2.setText(coming.get(position).getNm());
        }
    }


    @Override
    public int getItemCount() {
        return 10;
    }

    class MyYingkuHolder extends RecyclerView.ViewHolder {
        TextView tv_jiangxiang_1;
        TextView tv_jiangxiang_2;
        ImageView iv_jiangxiang;

        public MyYingkuHolder(View itemView) {
            super(itemView);
            tv_jiangxiang_1 = (TextView) itemView.findViewById(R.id.tv_jiangxiang_1);
            tv_jiangxiang_2 = (TextView) itemView.findViewById(R.id.tv_jiangxiang_2);
            iv_jiangxiang = (ImageView) itemView.findViewById(R.id.iv_jiangxiang);
        }


    }
}