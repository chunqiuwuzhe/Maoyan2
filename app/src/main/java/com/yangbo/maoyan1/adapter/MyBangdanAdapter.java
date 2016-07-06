package com.yangbo.maoyan1.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.yangbo.maoyan1.R;
import com.yangbo.maoyan1.ShopCart.ShoppingCartTop100;
import com.yangbo.maoyan1.bean.Yingku_ReMenKouBeiBean;
import com.yangbo.maoyan1.utils.CartProviderTop100;

import java.util.List;

/**
 * Created by yangbo on 2016/7/6.
 */


public class MyBangdanAdapter extends BaseAdapter {
    private final Context context;
    private final List<Yingku_ReMenKouBeiBean.DataBean.MoviesBean> movies;
    private CartProviderTop100 cartProviderTop100;

    public MyBangdanAdapter(Context context, List<Yingku_ReMenKouBeiBean.DataBean.MoviesBean> movies) {
        this.context = context;
        this.cartProviderTop100 = new CartProviderTop100(context);
        this.movies = movies;
    }

    @Override
    public int getCount() {
        return movies.size();
    }

    @Override
    public Object getItem(int position) {
        return movies.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        Holder holder;
        if (convertView == null) {
            holder = new Holder();
            convertView = View.inflate(context, R.layout.item_bangdan, null);
            holder.iv_ry_movie = (ImageView) convertView.findViewById(R.id.iv_ry_movie);
            holder.tv_movie_name = (TextView) convertView.findViewById(R.id.tv_movie_name);
            holder.tv_name_one = (TextView) convertView.findViewById(R.id.tv_name_one);
            holder.tv_name_two = (TextView) convertView.findViewById(R.id.tv_name_two);
            holder.tv_pingfen = (TextView) convertView.findViewById(R.id.tv_pingfen);
            holder.btn_goupiao = (Button) convertView.findViewById(R.id.btn_goupiao);
            convertView.setTag(holder);
        } else {
            holder = (Holder) convertView.getTag();
        }
        final Yingku_ReMenKouBeiBean.DataBean.MoviesBean moviesBean = movies.get(position);
        holder.tv_movie_name.setText(moviesBean.getNm());
        holder.tv_name_one.setText(moviesBean.getStar());
        holder.tv_name_two.setText(moviesBean.getRt());
        holder.tv_pingfen.setText(moviesBean.getSc() + "");

        Glide.with(context).load(moviesBean.getImg().replace("w.h", "165.220"))
                .diskCacheStrategy(DiskCacheStrategy.ALL).into(holder.iv_ry_movie);
        holder.btn_goupiao.setText("购买");
        //购买的按钮
        holder.btn_goupiao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "买", Toast.LENGTH_SHORT).show();
                Yingku_ReMenKouBeiBean.DataBean.MoviesBean moviesBean1 = movies.get(position);
                ShoppingCartTop100 cart = cartProviderTop100.conversion(moviesBean1);
                cartProviderTop100.addData(cart);
            }
        });

        return convertView;
    }
    static class Holder {
        ImageView iv_ry_movie;
        TextView tv_movie_name;
        TextView tv_name_one;
        TextView tv_name_two;
        TextView tv_pingfen;
        Button btn_goupiao;
    }


}

