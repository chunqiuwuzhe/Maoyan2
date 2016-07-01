package com.yangbo.maoyan1.adapter;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.yangbo.maoyan1.R;
import com.yangbo.maoyan1.bean.CinemaBean;
import com.yangbo.maoyan1.bean.CinemaViewPagerBean;
import com.yangbo.maoyan1.utils.DistanceUtil;

import java.text.DecimalFormat;
import java.util.List;

/**
 * Created by yangbo on 2016/6/25.
 */
public class MyCinemaAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
//    private  CinemaBean cinemaBean;

    private Context context;
    //list、的数据集合
    private List<CinemaBean.DataBean.changpingquBean> changpingqu;
    private List<CinemaViewPagerBean.DataBean> viewPagerDatas;
    private CinemaBean.DataBean.changpingquBean changpingquBean;
    private ViewPager viewpager;
    InternalHander internalHander = null;


    //适配器
    public MyCinemaAdapter(Context context) {
        this.context = context;
    }

    //设置数据
    public void setCinemaBean(List<CinemaBean.DataBean.changpingquBean> changpingqu) {
        this.changpingqu = changpingqu;


    }

    //设置ViewPager数据
    public void setViewPagerData(List<CinemaViewPagerBean.DataBean> data) {
        this.viewPagerDatas = data;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        if (viewType == 0) {
            View view = LayoutInflater.from(context).inflate(R.layout.item_cinema_vp, parent, false);
            return new MyHolder1(view);


        }
        if (viewType == 1) {
            View view = LayoutInflater.from(context).inflate(R.layout.item_cinema_normal, parent, false);
            return new MyHolder2(view);
        }
        return null;
    }

    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder holder, final int position) {
        if (position == 0 && viewPagerDatas != null && viewPagerDatas.size() > 0) {
            ((MyHolder1) holder).vp_cinema_header.setVisibility(View.VISIBLE);
            MyCinemaHeaderAdapter cinema_header_adapter = new MyCinemaHeaderAdapter(context, viewPagerDatas);
            viewpager = ((MyHolder1) holder).vp_cinema_header;
            ((MyHolder1) holder).vp_cinema_header.setAdapter(cinema_header_adapter);
            ((MyHolder1) holder).vp_cinema_header.setCurrentItem(50);

            /**
             * 设置顶部轮播图
             */
            //发消息，实现循环播放！

            if (internalHander == null) {
                internalHander = new InternalHander();
                //移除所有的消息和任务
                internalHander.removeCallbacksAndMessages(null);
                //4秒后执行任务
                internalHander.postDelayed(new InternalRunnable(), 3000);
            }

        }

        //list的绑定数据
        if (changpingqu != null && changpingqu.size() > 0) {
            if (holder instanceof MyHolder2) {
                changpingquBean = changpingqu.get(position - 1);
                //            116.386267,40.107628?
                //根据经温度 计算距离
                double lng = changpingqu.get(position - 1).getLng();
                double lat = changpingqu.get(position - 1).getLat();
                double distance = DistanceUtil.getDistance(40.107628, 116.386267, lat, lng);

                String format = new DecimalFormat("#.0").format(distance);


                //绑定数据
                ((MyHolder2) holder).tv_cinema_yingyuan.setText(changpingquBean.getNm());
                ((MyHolder2) holder).tv_cinema_price.setText(changpingquBean.getSellPrice() + "");
                ((MyHolder2) holder).tv_cinema_dizhi.setText(changpingquBean.getAddr().replace("changpingqu", "昌平区"));


                //设置距离
                ((MyHolder2) holder).tv_cinema_intance.setText(format + "km");

                if( changpingquBean!=null &&changpingquBean.getSellPrice()>35){

                    ((MyHolder2) holder).btn_small_4d.setVisibility(View.GONE);
                    ((MyHolder2) holder).btn_small_gaiqian.setVisibility(View.GONE);
                    ((MyHolder2) holder).btn_small_tuan.setVisibility(View.GONE);
                }else if( changpingquBean!=null &&changpingquBean.getSellPrice()<=35){
                    ((MyHolder2) holder).btn_small_tui.setVisibility(View.GONE);
                    ((MyHolder2) holder).btn_small_xiaochi.setVisibility(View.GONE);
                    ((MyHolder2) holder).btn_small_zuo.setVisibility(View.GONE);
                }
            }


//
        }
    }

    /**
     * 自定义Handler类
     * 实现循环播放！
     */
    class InternalHander extends Handler {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);

            int item = viewpager.getCurrentItem() + 1;
            viewpager.setCurrentItem(item);
            internalHander.postDelayed(new InternalRunnable(), 3000);
        }
    }

    class InternalRunnable implements Runnable {

        @Override
        public void run() {
            internalHander.sendEmptyMessage(0);
        }
    }


    @Override
    public int getItemCount() {
        if (changpingqu != null && changpingqu.size() > 0) {
            return changpingqu.size() + 1;
        }
        return 0;
    }

    @Override
    public int getItemViewType(int position) {
        if (position == 0) {
            return 0;
        }
        return 1;
    }


    /**
     * 顶部的ViewHolder
     */
    class MyHolder1 extends RecyclerView.ViewHolder {

        public ViewPager vp_cinema_header;

        public MyHolder1(View itemView) {
            super(itemView);
            vp_cinema_header = (ViewPager) itemView.findViewById(R.id.vp_cinema_header);
        }
    }

    /**
     * 下边的ViewHolder
     */
    class MyHolder2 extends RecyclerView.ViewHolder {
        TextView tv_cinema_yingyuan;//影院名称
        TextView tv_cinema_price;//价格 --元起
        TextView tv_cinema_dizhi;//地址
        TextView tv_cinema_intance;//距离

        Button btn_small_zuo;
        Button btn_small_tuan;
        Button btn_small_4d;
        Button btn_small_xiaochi;
        Button btn_small_tui;
        Button btn_small_gaiqian;


        public MyHolder2(final View itemView) {
            super(itemView);
            tv_cinema_yingyuan = (TextView) itemView.findViewById(R.id.tv_cinema_yingyuan);
            tv_cinema_price = (TextView) itemView.findViewById(R.id.tv_cinema_price);
            tv_cinema_dizhi = (TextView) itemView.findViewById(R.id.tv_cinema_dizhi);
            tv_cinema_intance = (TextView) itemView.findViewById(R.id.tv_cinema_intance);
            btn_small_zuo = (Button) itemView.findViewById(R.id.btn_small_zuo);
            btn_small_tuan = (Button) itemView.findViewById(R.id.btn_small_tuan);
            btn_small_4d = (Button) itemView.findViewById(R.id.btn_small_4d);
            btn_small_xiaochi = (Button) itemView.findViewById(R.id.btn_small_xiaochi);
            btn_small_tui = (Button) itemView.findViewById(R.id.btn_small_tui);
            btn_small_gaiqian = (Button) itemView.findViewById(R.id.btn_small_gaiqian);

            if (onItemClickListener != null) {
                itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onItemClickListener.onItemClick(changpingquBean);
                    }
                });

            }


        }
    }


    /**
     * 设置接口
     */
    public interface OnItemClickListener {

        void onItemClick(CinemaBean.DataBean.changpingquBean changpingquBean);
    }

    //创建成员变量
    public OnItemClickListener onItemClickListener;

    //set方法
    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }
}
