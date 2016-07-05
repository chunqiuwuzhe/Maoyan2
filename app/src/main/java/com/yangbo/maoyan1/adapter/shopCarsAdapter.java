package com.yangbo.maoyan1.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.yangbo.maoyan1.R;
import com.yangbo.maoyan1.ShopCart.ShoppingCart;
import com.yangbo.maoyan1.utils.CartProvider;
import com.yangbo.maoyan1.view.NumberAddSubView;

import java.util.List;

/**
 * Created by sdf on 2016/7/4.
 */
public class shopCarsAdapter extends RecyclerView.Adapter<shopCarsAdapter.ViewHolder> {
    private TextView tv_total_price;
    private CheckBox checkbox;
    private Context context;
    private List<ShoppingCart> datas;
    private float totalPrice;

    private CartProvider cartProvider;
    /**
     * 最少库存
     */
    private int minValue = 1;

    /**
     * 库存里面的最大值
     */
    private int maxValue = 10;

    public shopCarsAdapter(Context context, List<ShoppingCart> datas, CheckBox checkbox_all, TextView tv_total_price) {
        this.context = context;
        this.datas = datas;
        this.checkbox = checkbox_all;
        this.tv_total_price = tv_total_price;
        cartProvider = new CartProvider(context);
        //设置总价格
        showTotalPrice();
    }

    public void showTotalPrice() {
        float totalPrice = getTotalPrice();
        tv_total_price.setText("合计:￥" + totalPrice);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_shopcart_pager, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        final ShoppingCart cart = datas.get(position);
        holder.checkbox.setChecked(cart.isCheck());
        holder.tvName.setText(cart.getTitle());
        holder.tvPrice.setText("￥:" + cart.getPrice());
        holder.numberAddSubView.setValue(cart.getCount());

        //联网请求图片
        Glide.with(context).load(cart.getPic())
                .placeholder(R.drawable.kg)
                .error(R.drawable.kg)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(holder.ivIcon);

        holder.numberAddSubView.setOnButtonClickListener(new NumberAddSubView.OnButtonClickListener() {
            ShoppingCart cart = datas.get(position);

            //物品数量减少的监听
            @Override
            public void onSubButton(View view, int value) {
                Log.e("TAG-----------", value + "");
                //设置物品的数量并更新
                cart.setCount(value);

                if (value>minValue&&value <= maxValue) {
                    //更新到本地
                    cartProvider.update(cart);
                }
                //重新计算总价格
                showTotalPrice();
            }

            //物品数量增加的监听
            @Override
            public void onAddButton(View view, int value) {
                //设置物品的数量并更新
                cart.setCount(value);
                if (value <= maxValue) {
                    //更新到本地
                    cartProvider.update(cart);
                }
                //重新计算总价格
                showTotalPrice();
            }
        });
    }

    @Override
    public int getItemCount() {
        if (datas != null && datas.size() > 0) {
            return datas.size();
        }
        return 0;
    }

    public float getTotalPrice() {
        float totalPrice = 0;
        if (datas != null && datas.size() > 0) {
            for (int i = 0; i < datas.size(); i++) {
                ShoppingCart cart = datas.get(i);
                if (cart.isCheck()) {
                    totalPrice = (float) (totalPrice + cart.getCount() * cart.getPrice());
                }
            }
        }
        return totalPrice;
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        CheckBox checkbox;
        ImageView ivIcon;
        TextView tvName;
        TextView tvPrice;
        NumberAddSubView numberAddSubView;

        public ViewHolder(View itemView) {
            super(itemView);
            checkbox = (CheckBox) itemView.findViewById(R.id.checkbox);
            ivIcon = (ImageView) itemView.findViewById(R.id.iv_icon);
            tvName = (TextView) itemView.findViewById(R.id.tv_name);
            tvPrice = (TextView) itemView.findViewById(R.id.tv_price);
            numberAddSubView = (NumberAddSubView) itemView.findViewById(R.id.number_add_sub_view);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (myItemOnClickLinsster != null) {
                        myItemOnClickLinsster.itemOnClickLinster(v, getLayoutPosition());
                    }
                }
            });
        }
    }

    private MyItemOnClickLinsster myItemOnClickLinsster;

    public void setMyItemOnClickLinsster(MyItemOnClickLinsster myItemOnClickLinsster) {
        this.myItemOnClickLinsster = myItemOnClickLinsster;
    }

    public interface MyItemOnClickLinsster {
        void itemOnClickLinster(View view, int position);
    }
}
