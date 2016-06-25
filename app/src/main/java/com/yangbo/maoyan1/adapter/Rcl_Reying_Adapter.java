package com.yangbo.maoyan1.adapter;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.yangbo.maoyan1.R;
import com.yangbo.maoyan1.bean.ReYing_ViewPager_bean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sdf on 2016/6/24.
 */
public class Rcl_Reying_Adapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private Context content;
    private List<ReYing_ViewPager_bean.DataBean> arr;
    private ArrayList<String> imageurl;
    //vp的适配器
    private ReYing_title_Adapter vp_adapter;

    public Rcl_Reying_Adapter(Context context, List<ReYing_ViewPager_bean.DataBean> arr) {
        this.content=context;
        this.arr=arr;
        Log.e("ARR",arr.get(0).getName());
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (viewType==0){

            View view = LayoutInflater.from(content).inflate(R.layout.reying_item_sou_vp,parent,false);

            return new Ry_HeadHolder(view);
        }
        if(viewType==1){
            View view = LayoutInflater.from(content).inflate(R.layout.reying_item_rcl_one,null);
            return new Ry_TwoHeadHolder(view);
        }
        View view = LayoutInflater.from(content).inflate(R.layout.item_reying_rcl,parent,false);
        return new Ry_RclViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (position==0){
            //设置适配器装载数据
            imageurl=new ArrayList<>();
            vp_adapter=new ReYing_title_Adapter(content,arr);
            ((Ry_HeadHolder)holder).vp_reying_title.setAdapter(vp_adapter);
            return ;
        }
        if(position==1){

            return ;
        }
//        ((Ry_RclViewHolder)holder).text.setText(arr.get(position));
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

    @Override
    public int getItemCount() {
        return 50;
    }
}
class Ry_RclViewHolder extends RecyclerView.ViewHolder{
    TextView text;
    public Ry_RclViewHolder(View itemView) {
        super(itemView);
        text = (TextView) itemView.findViewById(R.id.text);
    }
}
/*
* 热映ViewPager
* */
class Ry_HeadHolder extends RecyclerView.ViewHolder{
    public LinearLayout ll_sousou;
    public ViewPager vp_reying_title;
    public Ry_HeadHolder(View itemView) {
        super(itemView);
        ll_sousou = (LinearLayout) itemView.findViewById(R.id.ll_sousou);
        vp_reying_title = (ViewPager) itemView.findViewById(R.id.vp_reying_title);
    }
}
//第一条数据
class Ry_TwoHeadHolder extends RecyclerView.ViewHolder{
    public Ry_TwoHeadHolder(View itemView) {
        super(itemView);
    }

}
