package com.yangbo.maoyan1.adapter;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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


    public MyCinemaAdapter(Context context) {
        this.context = context;
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
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (position == 0 && viewPagerDatas!=null && viewPagerDatas.size()>0) {
            MyCinemaHeaderAdapter  cinema_header_adapter = new MyCinemaHeaderAdapter(context,viewPagerDatas);

            ( (MyHolder1) holder).vp_cinema_header.setAdapter(cinema_header_adapter);
        }

        if(changpingqu!=null && changpingqu.size()>0) {
            if(holder instanceof MyHolder2){
//            List<CinemaBean.DataBean.changpingquBean> changpingqu = cinemaBean.getData().getchangpingqu();
                //绑定数据
                ( (MyHolder2) holder).tv_cinema_yingyuan.setText(changpingqu.get(position-1).getNm());
                ( (MyHolder2) holder).tv_cinema_price.setText(changpingqu.get(position-1).getSellPrice()+"");
                ( (MyHolder2) holder).tv_cinema_dizhi.setText(changpingqu.get(position-1).getAddr().replace("changpingqu","昌平区"));

//            116.386267,40.107628?
                //根据经温度 计算距离
                double lng = changpingqu.get(position-1).getLng();
                double lat = changpingqu.get(position-1).getLat();
                double distance = DistanceUtil.getDistance(40.107628, 116.386267, lat, lng);

                String format = new DecimalFormat("#.0").format(distance);
                //设置距离
                ( (MyHolder2) holder).tv_cinema_intance.setText(format+"km");

                if(onItemClickListener!=null) {
                    onItemClickListener.onItemClick();
                }
        }


//            ( (MyHolder2) holder).
        }
    }


    @Override
    public int getItemCount() {
        return changpingqu.size()+1;
    }

    @Override
    public int getItemViewType(int position) {
        if (position == 0) {
            return 0;
        }
        return 1;
    }

    public void setCinemaBean(List<CinemaBean.DataBean.changpingquBean> changpingqu) {
        this.changpingqu = changpingqu;
    }

    public void setViewPagerData(List<CinemaViewPagerBean.DataBean> data) {
        this.viewPagerDatas = data;
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


        public MyHolder2(View itemView) {
            super(itemView);
            tv_cinema_yingyuan = (TextView) itemView.findViewById(R.id.tv_cinema_yingyuan);
            tv_cinema_price = (TextView) itemView.findViewById(R.id.tv_cinema_price);
            tv_cinema_dizhi = (TextView) itemView.findViewById(R.id.tv_cinema_dizhi);
            tv_cinema_intance = (TextView) itemView.findViewById(R.id.tv_cinema_intance);
        }
    }


    /**
     * 设置接口
     */
    interface OnItemClickListener{
        public void onItemClick();
    }
    //创建成员变量
    OnItemClickListener onItemClickListener;
    //set方法
    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }
}
