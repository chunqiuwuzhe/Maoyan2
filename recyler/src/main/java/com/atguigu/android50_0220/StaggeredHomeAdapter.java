package com.atguigu.android50_0220;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Administrator on 2016/6/23.
 */
public class StaggeredHomeAdapter extends RecyclerView.Adapter {

    private Context context;
    private List<String> list;
    private List<Integer> data = new ArrayList<>();

    public StaggeredHomeAdapter(Context context, List<String> list) {
        this.context = context;
        this.list = list;

        //产生随机数用来显示item的高度
        Random random = new Random();
        for (int i = 0; i < list.size(); i++) {
            int nextInt = random.nextInt(200)+300;
            data.add(nextInt);
        }
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        MyViewHolder myViewHolder = new MyViewHolder(LayoutInflater.from(context).inflate(
                R.layout.item_staggered_home, parent, false));
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ((MyViewHolder)holder).setData(list.get(position),data.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder
    {

        TextView tv;

        public MyViewHolder(View view)
        {
            super(view);
            tv = (TextView) view.findViewById(R.id.tv);

        }

        public void setData(String data, Integer integer) {
            tv.setText(data);
            ViewGroup.LayoutParams layoutParams = tv.getLayoutParams();
            layoutParams.height = integer;
            tv.setLayoutParams(layoutParams);

        }
    }
}
