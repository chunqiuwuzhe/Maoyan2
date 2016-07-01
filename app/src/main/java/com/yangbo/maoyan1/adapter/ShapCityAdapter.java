package com.yangbo.maoyan1.adapter;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.yangbo.maoyan1.R;
import com.yangbo.maoyan1.activity.ShopH5Activity;
import com.yangbo.maoyan1.activity.ShopWraseFactionActivity;
import com.yangbo.maoyan1.bean.ShopBean;
import com.yangbo.maoyan1.bean.ShopCityVpBean;

import java.util.List;

/**
 * Created by sdf on 2016/6/29.
 */
public class ShapCityAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private Context context;
    private List<ShopCityVpBean.DataBean> beans;

    private List<ShopBean.DataBean.ListBean> list;

    public void setList(List<ShopBean.DataBean.ListBean> list) {
        this.list = list;
    }

    private ViewPager viewPager;

    public void setBeans(List<ShopCityVpBean.DataBean> beans) {
        this.beans = beans;
    }

    public ShapCityAdapter(Context context) {
        this.context = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (viewType == 0) {
            View view = LayoutInflater.from(context).inflate(R.layout.shop_viewpager, parent, false);
            return new vP_ViewHolder(view);
        }
        if (viewType == 1) {
            View view = LayoutInflater.from(context).inflate(R.layout.shop_month, parent, false);
            return new MonthViewPager(view);
        }
        View view = LayoutInflater.from(context).inflate(R.layout.shop_like, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (position == 0 && beans != null && beans.size() > 0) {
            ShopVPAdapter shopVPAdapter = new ShopVPAdapter(context, beans);
            viewPager = ((vP_ViewHolder) holder).vpShop;
            ((vP_ViewHolder) holder).vpShop.setAdapter(shopVPAdapter);
            //Handler不等于空发送消息
            if (internalHandler == null) {
                internalHandler = new InternalHandler();
                internalHandler.removeCallbacksAndMessages(null);
                internalHandler.postDelayed(new MyRun(), 2000);
            }
            return;
        }

        if (position >= 4 && position < list.size() - 1 && list != null && list.size() > 0) {
            ((ViewHolder) holder)._view.setVisibility(View.GONE);
            ((ViewHolder) holder).tv_title.setVisibility(View.GONE);
            if (position == 4) {
                ((ViewHolder) holder)._view.setVisibility(View.VISIBLE);
                ((ViewHolder) holder).tv_title.setVisibility(View.VISIBLE);
            }
            ShopBean.DataBean.ListBean listBean = list.get(2 * position - 8);
            ShopBean.DataBean.ListBean listBean2 = list.get(2 * position - 7);
            ((ViewHolder) holder).tv_shop_name.setText(listBean.getTitle());
            ((ViewHolder) holder).tv_shop_name2.setText(listBean2.getTitle());
            ((ViewHolder) holder).tv_price.setText(listBean.getPrice() + "");
            ((ViewHolder) holder).tv_price2.setText(listBean2.getPrice() + "");
            //联网请求图片
            Glide.with(context).load(listBean.getPic())
                    .placeholder(R.drawable.kg)
                    .error(R.drawable.kg)
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                    .into(((ViewHolder) holder).iv_shop_picture);
            //联网请求图片
            Glide.with(context).load(listBean2.getPic())
                    .placeholder(R.drawable.kg)
                    .error(R.drawable.kg)
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                    .into(((ViewHolder) holder).iv_shop_picture2);

            return;
        }

    }

    @Override
    public int getItemCount() {
        if (list != null && list.size() > 0) {
            return Math.abs(list.size() / 2) + 4;
        }
        return 0;

    }

    @Override
    public int getItemViewType(int position) {
        if (position == 0) {
            return 0;
        }
        if (position == 1 || position == 2 || position == 3) {
            return 1;
        }
        return 2;
    }

    //商品ViewHolder
    class ViewHolder extends RecyclerView.ViewHolder {
        View _view;
        TextView tv_title;
        ImageView iv_shop_picture, iv_shop_picture2;
        TextView tv_shop_name, tv_shop_name2;
        TextView tv_price, tv_price2;

        public ViewHolder(View itemView) {
            super(itemView);
            _view = itemView.findViewById(R.id._view);
            tv_title = (TextView) itemView.findViewById(R.id.tv_title);
            iv_shop_picture = (ImageView) itemView.findViewById(R.id.iv_shop_picture);
            iv_shop_picture2 = (ImageView) itemView.findViewById(R.id.iv_shop_picture2);
            tv_shop_name = (TextView) itemView.findViewById(R.id.tv_shop_name);
            tv_shop_name2 = (TextView) itemView.findViewById(R.id.tv_shop_name2);
            tv_price = (TextView) itemView.findViewById(R.id.tv_price);
            tv_price2 = (TextView) itemView.findViewById(R.id.tv_price2);
        }
    }

    //每月特价
    class MonthViewPager extends RecyclerView.ViewHolder implements View.OnClickListener {
        LinearLayout ll_one, ll_two, ll_three;

        public MonthViewPager(View itemView) {
            super(itemView);
            ll_one = (LinearLayout) itemView.findViewById(R.id.ll_one);
            ll_two = (LinearLayout) itemView.findViewById(R.id.ll_two);
            ll_three = (LinearLayout) itemView.findViewById(R.id.ll_three);


            ll_one.setOnClickListener(this);
            ll_two.setOnClickListener(this);
            ll_three.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            Intent intent = new Intent(context, ShopH5Activity.class);
            int position = getLayoutPosition();
            if (position == 1) {
                if (v.getId() == R.id.ll_one) {
                    intent.putExtra("id", 1);
                    context.startActivity(intent);
                } else if (v.getId() == R.id.ll_two) {
                    intent.putExtra("id", 2);
                    context.startActivity(intent);
                } else if (v.getId() == R.id.ll_three) {
                    intent.putExtra("id", 3);
                    context.startActivity(intent);
                }
            } else if (position == 2) {
                if (v.getId() == R.id.ll_one) {
                    intent.putExtra("id", 4);
                    context.startActivity(intent);
                } else if (v.getId() == R.id.ll_two) {
                    intent.putExtra("id", 5);
                    context.startActivity(intent);
                } else if (v.getId() == R.id.ll_three) {
                    intent.putExtra("id", 6);
                    context.startActivity(intent);
                }
            }
        }
    }

    private InternalHandler internalHandler;

    //轮播图
    class InternalHandler extends Handler {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            int item = viewPager.getCurrentItem() + 1;
            viewPager.setCurrentItem(item);
            internalHandler.removeCallbacksAndMessages(null);
            internalHandler.postDelayed(new MyRun(), 2000);
        }
    }

    private class MyRun implements Runnable {
        @Override
        public void run() {
//            internalHandler.removeCallbacksAndMessages(null);
            internalHandler.sendEmptyMessage(0);
        }
    }

    //Viewpager类型
    class vP_ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ViewPager vpShop;
        RadioButton rbShuma;
        RadioButton rbGaowan;
        RadioButton rbWanju;
        RadioButton rbShenghuo;
        RadioButton rbFushi;
        RadioButton rbChaobian;
        RadioButton rbJiqimao;
        RadioButton rbMoshou;
        RadioButton rbMeidui;
        RadioButton rbXingqiu;
        public vP_ViewHolder(View itemView) {
            super(itemView);
            vpShop = (ViewPager) itemView.findViewById(R.id.vp_shop);
            rbShuma = (RadioButton) itemView.findViewById(R.id.rb_shuma);
            rbGaowan = (RadioButton) itemView.findViewById(R.id.rb_gaowan);
            rbWanju = (RadioButton) itemView.findViewById(R.id.rb_wanju);
            rbShenghuo = (RadioButton) itemView.findViewById(R.id.rb_shenghuo);
            rbFushi = (RadioButton) itemView.findViewById(R.id.rb_fushi);
            rbChaobian = (RadioButton) itemView.findViewById(R.id.rb_chaobian);
            rbJiqimao = (RadioButton) itemView.findViewById(R.id.rb_jiqimao);
            rbMoshou = (RadioButton) itemView.findViewById(R.id.rb_moshou);
            rbMeidui = (RadioButton) itemView.findViewById(R.id.rb_meidui);
            rbXingqiu = (RadioButton) itemView.findViewById(R.id.rb_xingqiu);

            rbShuma.setOnClickListener(this);
            rbGaowan.setOnClickListener(this);
            rbWanju.setOnClickListener(this);
            rbShenghuo.setOnClickListener(this);
            rbFushi.setOnClickListener(this);
            rbChaobian.setOnClickListener(this);
            rbJiqimao.setOnClickListener(this);
            rbMoshou.setOnClickListener(this);
            rbMeidui.setOnClickListener(this);
            rbXingqiu.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            Intent intent = new Intent(context, ShopWraseFactionActivity.class);
            if (v == rbShuma) {
                Toast.makeText(context, "数码", Toast.LENGTH_SHORT).show();
                intent.putExtra("id",1);
                context.startActivity(intent);
            } else if (v == rbGaowan) {
                intent.putExtra("id",2);
                context.startActivity(intent);
            } else if (v == rbWanju) {
                intent.putExtra("id",3);
                context.startActivity(intent);
            } else if (v == rbShenghuo) {
                intent.putExtra("id",4);
                context.startActivity(intent);
            } else if (v == rbFushi) {
                intent.putExtra("id",5);
                context.startActivity(intent);
            } else if (v == rbChaobian) {
                intent.putExtra("id",6);
                context.startActivity(intent);
            } else if (v == rbJiqimao) {
                intent.putExtra("id",7);
                context.startActivity(intent);
            } else if (v == rbMoshou) {
                intent.putExtra("id",8);
                context.startActivity(intent);
            } else if (v == rbMeidui) {
                intent.putExtra("id",9);
                context.startActivity(intent);
            } else if (v == rbXingqiu) {
                intent.putExtra("id",10);
                context.startActivity(intent);
            }
        }
    }
}
