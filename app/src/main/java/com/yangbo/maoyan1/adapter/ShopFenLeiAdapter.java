package com.yangbo.maoyan1.adapter;

import android.content.Context;
import android.graphics.Paint;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.yangbo.maoyan1.R;
import com.yangbo.maoyan1.bean.ShopFenLeiBean;

import java.util.List;

/**
 * Created by sdf on 2016/7/1.
 */
public class ShopFenLeiAdapter extends RecyclerView.Adapter<ShopFenLeiAdapter.ViewHolder> {
    private int widthL;
    private Context context;
    private List<ShopFenLeiBean.DataBean.ListBean> list;

    public ShopFenLeiAdapter(Context context, List<ShopFenLeiBean.DataBean.ListBean> list, int width) {
        this.context=context;
        this.list=list;
        this.widthL=width;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.item_shop_fenlei,parent,false);
        ViewGroup.LayoutParams params = view.getLayoutParams();
        params.width=widthL/2;
        view.setLayoutParams(params);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        ShopFenLeiBean.DataBean.ListBean listBean = list.get(position);
        holder.tv_shop_name.setText(listBean.getTitle());
        holder.tv_price.setText(listBean.getPrice()+"");
        holder.tv_valueprice.setText(listBean.getValue()+"");
        //联网请求图片
        Glide.with(context).load(listBean.getPic())
                .placeholder(R.drawable.kg)
                .error(R.drawable.kg)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(holder.iv_shop_picture);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        ImageView iv_shop_picture;
        TextView tv_shop_name;
        TextView tv_price;
        TextView tv_valueprice;
        TextView yuan;
        public ViewHolder(View itemView) {
            super(itemView);
            iv_shop_picture = (ImageView) itemView.findViewById(R.id.iv_shop_picture);
            tv_shop_name = (TextView) itemView.findViewById(R.id.tv_shop_name);
            tv_price = (TextView) itemView.findViewById(R.id.tv_price);
            tv_valueprice = (TextView) itemView.findViewById(R.id.tv_valueprice);
            yuan = (TextView) itemView.findViewById(R.id.yuan);
            //设置中间划线
            tv_valueprice.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);
            yuan.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);
        }
    }
}
