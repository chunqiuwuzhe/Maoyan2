package com.yangbo.maoyan1.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.yangbo.maoyan1.R;

/**
 * Created by sdf on 2016/6/27.
 */
public class RclDayingOneAdapter extends RecyclerView.Adapter<RclDayingOneAdapter.MyRclViewHolder>{
    private Context context;

    public RclDayingOneAdapter(Context context) {
        this.context=context;
    }

    @Override
    public MyRclViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_haiwai_one_rcl, parent, false);
        return new MyRclViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyRclViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 20;
    }

    class MyRclViewHolder extends RecyclerView.ViewHolder{

        public MyRclViewHolder(View itemView) {
            super(itemView);
        }
    }
}
