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
public class RclDayingTwoAdapter extends RecyclerView.Adapter<RclDayingTwoAdapter.MyViewHolder>{
    private Context context;

    public RclDayingTwoAdapter(Context context) {
        this.context=context;
    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_haiwai_two_rcl, parent, false);;
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 20;
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        public MyViewHolder(View itemView) {
            super(itemView);
        }
    }
}
