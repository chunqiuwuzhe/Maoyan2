package com.yangbo.maoyan1.adapter;

import android.content.Context;
import android.graphics.Paint;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.yangbo.maoyan1.R;
import com.yangbo.maoyan1.ShopCart.ShoppingCart;
import com.yangbo.maoyan1.bean.ShopFenLeiBean;
import com.yangbo.maoyan1.utils.CartProvider;

import java.util.List;

/**
 * Created by sdf on 2016/7/1.
 */
public class ShopFenLeiAdapter extends RecyclerView.Adapter<ShopFenLeiAdapter.ViewHolder> {
    private int widthL;
    private Context context;
    private List<ShopFenLeiBean.DataBean.ListBean> list;

    private CartProvider cartProvider;

    public ShopFenLeiAdapter(Context context, List<ShopFenLeiBean.DataBean.ListBean> list, int width) {
        this.context=context;
        this.list=list;
        this.widthL=width;
        this.cartProvider=new CartProvider(context);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.item_shop_fenlei,parent,false);
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

        ImageView iv_addShopCar;
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
            //添加购物车
            iv_addShopCar = (ImageView) itemView.findViewById(R.id.iv_addShopCar);
            iv_addShopCar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(context, "添加购物车", Toast.LENGTH_SHORT).show();
                    ShopFenLeiBean.DataBean.ListBean wares =  list.get(getLayoutPosition()-1);
                    ShoppingCart cart = cartProvider.conversion(wares);
                    cartProvider.update(cart);
                }
            });
        }
    }
}
