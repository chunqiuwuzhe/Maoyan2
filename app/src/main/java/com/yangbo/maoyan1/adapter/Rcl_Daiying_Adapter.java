package com.yangbo.maoyan1.adapter;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.yangbo.maoyan1.R;
import com.yangbo.maoyan1.bean.DaiYIngRcViewBean;

import java.util.List;


/**
 * Created by sdf on 2016/6/24.
 */
public class Rcl_Daiying_Adapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public Context context;

    private List<DaiYIngRcViewBean.DataBean.ComingBean> coming;

    public void setComing(List<DaiYIngRcViewBean.DataBean.ComingBean> coming) {
        this.coming = coming;
    }

    public Rcl_Daiying_Adapter(Context context) {
        this.context=context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (viewType==0){

            View view = LayoutInflater.from(context).inflate(R.layout.daiying_item_sou_vp,parent,false);

            return new Dy_HeadHolder(view);
        }
        if(viewType==1){
            View view = LayoutInflater.from(context).inflate(R.layout.daiying_item_rcl_one,null);
            return new Dy_TwoHeadHolder(view);
        }
        View view = LayoutInflater.from(context).inflate(R.layout.item_daiying_rcl,parent,false);
        return new Dy_RclViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (position==0){
            //设置布局管理器
            ((Dy_HeadHolder) holder).manager = new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false);
            ((Dy_HeadHolder) holder).rcl_haiwai_title.setLayoutManager(((Dy_HeadHolder) holder).manager);
            RclDayingOneAdapter rclDayingOneAdapter = new RclDayingOneAdapter(context);
            ((Dy_HeadHolder) holder).rcl_haiwai_title.setAdapter(rclDayingOneAdapter);
            return ;
        }
        if(position==1){
            ((Dy_TwoHeadHolder) holder).manager = new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false);
            ((Dy_TwoHeadHolder) holder).rcl_haiwai_title_two.setLayoutManager(((Dy_TwoHeadHolder) holder).manager);
            RclDayingTwoAdapter rclDayingTwoAdapter = new RclDayingTwoAdapter(context);
            ((Dy_TwoHeadHolder) holder).rcl_haiwai_title_two.setAdapter(rclDayingTwoAdapter);
            return ;
        }
    }

    @Override
    public int getItemCount() {
        return 50;
    }
    @Override
    public int getItemViewType(int position) {
        if (position==0){
            return 0;
        }
        if(position==1){
            return 1;
        }
        return 2;
    }
    class Dy_RclViewHolder extends RecyclerView.ViewHolder{
        public Dy_RclViewHolder(View itemView) {
            super(itemView);
        }
    }
    class Dy_HeadHolder extends RecyclerView.ViewHolder{
        RecyclerView rcl_haiwai_title;
        LinearLayoutManager manager;
        public Dy_HeadHolder(View itemView) {
            super(itemView);
            rcl_haiwai_title = (RecyclerView) itemView.findViewById(R.id.rcl_haiwai_title);

        }

    }
    class Dy_TwoHeadHolder extends RecyclerView.ViewHolder{
        RecyclerView rcl_haiwai_title_two;
        LinearLayoutManager manager;
        public Dy_TwoHeadHolder(View itemView) {
            super(itemView);
            rcl_haiwai_title_two = (RecyclerView) itemView.findViewById(R.id.rcl_haiwai_title_two);
        }

    }

}



