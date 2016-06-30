package com.yangbo.maoyan1.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.yangbo.maoyan1.R;
import com.yangbo.maoyan1.bean.ShopBean;

import java.util.List;

/**
 * Created by sdf on 2016/6/30.
 */
public class ShopWareAdapter extends RecyclerView.Adapter<ShopWareAdapter.ViewHolder> {
    private Context context;
    private List<ShopBean.DataBean.ListBean> lists;

    public ShopWareAdapter(Context context, List<ShopBean.DataBean.ListBean> list) {
        this.context=context;
        this.lists=list;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_shop_wrae,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.tv_shop_name.setText(lists.get(position).getTitle());
        holder.tv_price.setText(lists.get(position).getPrice()+"");
        //联网请求图片
        Glide.with(context).load(lists.get(position).getPic())
                .placeholder(R.drawable.kg)
                .error(R.drawable.kg)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(holder.iv_shop_picture);

    }

    @Override
    public int getItemCount() {
        return lists.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        ImageView iv_shop_picture;
        TextView tv_shop_name,tv_price;
        public ViewHolder(View itemView) {
            super(itemView);
            iv_shop_picture = (ImageView) itemView.findViewById(R.id.iv_shop_picture);
            tv_shop_name = (TextView) itemView.findViewById(R.id.tv_shop_name);
            tv_price = (TextView) itemView.findViewById(R.id.tv_price);
        }
    }

}
