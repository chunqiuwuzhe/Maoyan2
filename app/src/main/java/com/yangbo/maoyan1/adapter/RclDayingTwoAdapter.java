package com.yangbo.maoyan1.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.yangbo.maoyan1.R;
import com.yangbo.maoyan1.bean.DaiYIngRcViewBean;

import java.util.List;

/**
 * Created by sdf on 2016/6/27.
 */
public class RclDayingTwoAdapter extends RecyclerView.Adapter<RclDayingTwoAdapter.MyViewHolder>{
    private Context context;
    private List<DaiYIngRcViewBean.DataBean.ComingBean> coming;
    public RclDayingTwoAdapter(Context context, List<DaiYIngRcViewBean.DataBean.ComingBean> coming) {
        this.context=context;
        this.coming=coming;
    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_haiwai_two_rcl, parent, false);;
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        //图片地址
        String img = coming.get(position).getImg();
        //替换字符串
        img = replace(img);
        //联网请求图片
        Glide.with(context).load(img)
                .placeholder(R.drawable.kg)
                .error(R.drawable.kg)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(holder.iv_movie);
    }
    //替换字符串
    private String replace(String img) {
        String replace = img.replace("w.h", "165.220");
        return replace;
    }
    @Override
    public int getItemCount() {
        if(coming!=null&&coming.size()>0){
            return coming.size();
        }
        return 0;
    }

    class MyViewHolder extends RecyclerView.ViewHolder{
        ImageView iv_movie;
        public MyViewHolder(View itemView) {
            super(itemView);
            iv_movie = (ImageView) itemView.findViewById(R.id.iv_movie);
        }
    }
}
