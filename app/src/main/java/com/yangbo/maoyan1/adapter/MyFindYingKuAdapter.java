package com.yangbo.maoyan1.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.yangbo.maoyan1.R;
import com.yangbo.maoyan1.activity.FindYingKuActivity;

/**
 * Created by yangbo on 2016/6/29.
 */
public class MyFindYingKuAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private  Context context;
    
    //构造器
    public MyFindYingKuAdapter(FindYingKuActivity findYingKuActivity) {
        this.context = findYingKuActivity;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_find_yingku,parent,false);
        return new MyYingkuHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 12;
    }

    class MyYingkuHolder extends RecyclerView.ViewHolder{

        public MyYingkuHolder(View itemView) {
            super(itemView);
        }
    }
}