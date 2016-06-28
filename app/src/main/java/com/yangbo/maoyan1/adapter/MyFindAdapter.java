package com.yangbo.maoyan1.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.yangbo.maoyan1.R;
import com.yangbo.maoyan1.activity.H5FindActivity;

/**
 * Created by yangbo on 2016/6/28.
 */
public class MyFindAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private final Context context;

    public MyFindAdapter(Context context) {
        this.context = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        if(viewType == 0) {
            View view = LayoutInflater.from(context).inflate(R.layout.item_find_header, parent, false);
            return new MyFindHolder1(view);
        }
        if(viewType == 1) {
            View view = LayoutInflater.from(context).inflate(R.layout.item_find_body1, parent, false);
            return new MyFindHolder2(view);
        }
        return null;
    }

    /**
     * 绑定数据
     * @param holder
     * @param position
     */
    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 1;
    }

    @Override
    public int getItemViewType(int position) {

       if(position == 0) {
           return 0;
       }
        return 1;
    }

    class MyFindHolder1 extends RecyclerView.ViewHolder{
        ViewPager vp_find_vp;
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
            tv_find_huati.setOnClickListener(myOnClickListener );
            tv_find_zixun.setOnClickListener(myOnClickListener);
            tv_find_yingku.setOnClickListener(myOnClickListener );
            tv_find_piaofang.setOnClickListener(myOnClickListener);
        }

    }
    class MyOnClickListener implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            Intent intent = new Intent(context,H5FindActivity.class);
            switch (v.getId()) {
                case R.id.tv_find_huati :
                    intent.putExtra("url","");
                    break;
                case R.id.tv_find_zixun :
                    intent.putExtra("url","");

                    break;
                case R.id.tv_find_yingku :
                    intent.putExtra("url","");
                    break;
                case R.id.tv_find_piaofang :
                    intent.putExtra("url","");
                    break;
            }
            context.startActivity(intent);
        }
    }

    class MyFindHolder2 extends RecyclerView.ViewHolder{

        public MyFindHolder2(View itemView) {
            super(itemView);
        }
    }
}
