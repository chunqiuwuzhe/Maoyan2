package com.yangbo.maoyan1.adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.yangbo.maoyan1.R;

/**
 * Created by yangbo on 2016/6/25.
 */
public class MyCinemaAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context context;

    public MyCinemaAdapter(Context context) {
        this.context = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (viewType == 0) {
            View view = LayoutInflater.from(context).inflate(R.layout.item_cinema_vp, parent, false);
            return new MyHolder1(view);
        }
        if (viewType == 1) {
            View view = LayoutInflater.from(context).inflate(R.layout.item_cinema_normal, parent, false);
            return new MyHolder2(view);
        }
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (position == 0) {
            CinemaHeaderAdapter  cinema_header_adapter = new CinemaHeaderAdapter();
            ( (MyHolder1) holder).vp_cinema_header.setAdapter(cinema_header_adapter);
        }else{
//            ( (MyHolder2) holder)
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
        return 1;
    }

    /**
     * 顶部的ViewHolder
     */
    class MyHolder1 extends RecyclerView.ViewHolder {

        public ViewPager vp_cinema_header;

        public MyHolder1(View itemView) {
            super(itemView);
            vp_cinema_header = (ViewPager) itemView.findViewById(R.id.vp_cinema_header);
        }
    }
    /**
     * 下边的ViewHolder
     */
    class MyHolder2 extends RecyclerView.ViewHolder {

        public MyHolder2(View itemView) {
            super(itemView);
        }
    }

    /**
     * 顶部广告页ViewPager的适配器
     */
    class CinemaHeaderAdapter extends PagerAdapter{

        @Override
        public int getCount() {
            return 3;
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view==object;
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            TextView tv = new TextView(context);
            tv.setText("我是广告"+1);
            container.addView(tv);
            return tv;
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
//            super.destroyItem(container, position, object);
            container.removeView((View) object);
        }
    }
}
