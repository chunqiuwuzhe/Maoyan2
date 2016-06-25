package com.yangbo.maoyan1.adapter;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.yangbo.maoyan1.R;

import java.util.ArrayList;


/**
 * Created by sdf on 2016/6/24.
 */
public class Rcl_Daiying_Adapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private Context content;
    private ArrayList<String> arr;

    public Rcl_Daiying_Adapter(Context context, ArrayList<String> arr) {
        this.content=context;
        this.arr=arr;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (viewType==0){

            View view = LayoutInflater.from(content).inflate(R.layout.daiying_item_sou_vp,parent,false);

            return new Dy_HeadHolder(view);
        }
        if(viewType==1){
            View view = LayoutInflater.from(content).inflate(R.layout.daiying_item_rcl_one,null);
            return new Dy_TwoHeadHolder(view);
        }
        View view = LayoutInflater.from(content).inflate(R.layout.item_daiying_rcl,parent,false);
        return new Dy_RclViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (position==0){
            return ;
        }
        if(position==1){
            return ;
        }
        ((Dy_RclViewHolder)holder).text.setText(arr.get(position));
    }

    @Override
    public int getItemCount() {
        return arr.size();
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
}
class Dy_RclViewHolder extends RecyclerView.ViewHolder{
    TextView text;
    public Dy_RclViewHolder(View itemView) {
        super(itemView);
        text = (TextView) itemView.findViewById(R.id.text);
    }
}
class Dy_HeadHolder extends RecyclerView.ViewHolder{
    private LinearLayout ll_sousou;
    private ViewPager vp_daiying_title;
    public Dy_HeadHolder(View itemView) {
        super(itemView);
        ll_sousou = (LinearLayout) itemView.findViewById(R.id.ll_sousou);
        vp_daiying_title = (ViewPager) itemView.findViewById(R.id.vp_daiying_title);
    }

}
class Dy_TwoHeadHolder extends RecyclerView.ViewHolder{
    public Dy_TwoHeadHolder(View itemView) {
        super(itemView);
    }

}
