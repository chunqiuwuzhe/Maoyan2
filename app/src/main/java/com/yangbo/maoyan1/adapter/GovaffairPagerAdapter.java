package com.yangbo.maoyan1.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.yangbo.maoyan1.R;
import com.yangbo.maoyan1.ShopCart.ShoppingCartTop100;
import com.yangbo.maoyan1.utils.CartProviderTop100;
import com.yangbo.maoyan1.view.NumberAddSubView;

import java.util.Iterator;
import java.util.List;


/**
 * Created by yangbo on 2016/6/16.
 * RecyclerView 的适配器
 */
public class GovaffairPagerAdapter extends RecyclerView.Adapter<GovaffairPagerAdapter.MyViewHolder> {

    private final Context context;
    private final List<ShoppingCartTop100> datas;
    private final CheckBox checkbox_all;
    private final TextView tv_total_price;
    private final CartProviderTop100 cartProvider;
    private double totalPrice;
    
    public GovaffairPagerAdapter(Context context, final List<ShoppingCartTop100> datas, final CheckBox checkbox_all, TextView tv_total_price) {
        this.context = context;
        this.datas = datas;
        this.checkbox_all = checkbox_all;
        this.tv_total_price = tv_total_price;
        cartProvider = new CartProviderTop100(context);
        showTotalPrice();
        checkAllNone();
        /**
         * dianji 某条的监听
         */
        setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(View v, int position) {
                //1.把该状态取反，刷新状态
                ShoppingCartTop100 cart = datas.get(position);
                cart.setChecked(!cart.isChecked());
                notifyItemChanged(position);
                //2.校验全选按钮的状态
                checkAllNone();
                //3.显示总价格
                showTotalPrice();
            }
        });
        checkbox_all.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //1.得到状态 如果选中  所有数据勾选
                boolean ischk = checkbox_all.isChecked();
                checkAllOrNo(ischk);
                //2.显示总价格
                showTotalPrice();
            }


        });
    }
    public void checkAllOrNo(boolean ischk) {
        if (datas != null && datas.size() > 0) {
            for(int i = 0; i < datas.size(); i++) {
                datas.get(i).setChecked(ischk);
                notifyItemChanged(i);
            }
        }
    }

    public void checkAllNone() {
        int number = 0;
        if (datas != null && datas.size() > 0) {
            for (int i = 0; i < datas.size(); i++) {
                ShoppingCartTop100 cart = datas.get(i);
                if (!cart.isChecked()) {//只要有一个不被选中
                    checkbox_all.setChecked(false);
                } else {
                    //选中的
                    number += 1;
                }
            }

            if (number == datas.size()) {
                checkbox_all.setChecked(true);
            }
        }

    }

    private void showTotalPrice() {
        //计算总价格
        double total_price = getTotalPrice();
        //设置到tv_total_price
        if (tv_total_price != null) {
            tv_total_price.setText("合计￥" + total_price);
        }
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        if (datas != null && datas.size() > 0) {
            for (int i = 0; i < datas.size(); i++) {
                ShoppingCartTop100 cart = datas.get(i);
                if (cart.isChecked()) {
                    totalPrice += cart.getCount() * cart.getSc();
//                    notifyItemChanged(i);
                }
            }
        }
        return totalPrice;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_govaffairpager,parent, false);
//        View view = View.inflate(context, R.layout.item_govaffairpager, null);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        final ShoppingCartTop100 cart = datas.get(position);
        holder.checkbox.setChecked(cart.isChecked());
        holder.tv_name.setText(cart.getNm());
        holder.tv_price.setText(cart.getSc() + "");
        holder.numberAddSubView.setValue(cart.getCount());

        Glide.with(context).load(cart.getImg().replace("w.h", "165.220"))
                .diskCacheStrategy(DiskCacheStrategy.ALL)
//                .placeholder(R.drawable.news_pic_default)
//                .error(R.drawable.news_pic_default)
                .into(holder.iv_gova_icon);

        holder.numberAddSubView.setOnButtonClickListener(new NumberAddSubView.OnButtonClickListener() {
            @Override
            public void onSubButton(View view, int value) {
                cart.setCount(value);
                cartProvider.updateData(cart);
                showTotalPrice();
            }

            @Override
            public void onAddButton(View view, int value) {
                cart.setCount(value);
                cartProvider.updateData(cart);
                showTotalPrice();
            }
        });
    }

    @Override
    public int getItemCount() {
        return datas.size();
    }

    /**
     * 删除选中的数据，并刷新
     */
    public void deleteData() {
//        if(datas!= null && datas.size()>0) {
//            for(int i = 0; i < datas.size(); i++) {
//                ShoppingCartTop100 cart = datas.get(i);
//                if(cart.isChacked()) {
//                    datas.remove(i);
//                      cartProvider.deleleData(cart);
//                    notifyItemRemoved(i);
//                    i--;
//                }
//            }
//        }

        if(datas!= null && datas.size()>0) {
            for(Iterator iterator = datas.iterator();iterator.hasNext();) {
                ShoppingCartTop100 cart = (ShoppingCartTop100) iterator.next();
                if(cart.isChecked()) {
                    int position = datas.indexOf(cart);
                    iterator.remove();
                    //当移除的时候刷新
                    cartProvider.deleleData(cart);
                    notifyItemRemoved(position);
                }
            }
        }


    }


    class MyViewHolder extends RecyclerView.ViewHolder {
        private NumberAddSubView numberAddSubView;
        private TextView tv_price;
        private TextView tv_name;
        private ImageView iv_gova_icon;
        private CheckBox checkbox;

        public MyViewHolder(View itemView) {
            super(itemView);
            numberAddSubView = (NumberAddSubView) itemView.findViewById(R.id.numberAddSubView);
            tv_price = (TextView) itemView.findViewById(R.id.tv_price);
            tv_name = (TextView) itemView.findViewById(R.id.tv_name);
            iv_gova_icon = (ImageView) itemView.findViewById(R.id.iv_gova_icon);
            checkbox = (CheckBox) itemView.findViewById(R.id.checkbox);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (onItemClickListener != null) {
                        onItemClickListener.onItemClick(v, getLayoutPosition());
                    }
                }
            });
        }
    }

    public interface OnItemClickListener {
        public void onItemClick(View v, int position);
    }

    private OnItemClickListener onItemClickListener;

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }
}
