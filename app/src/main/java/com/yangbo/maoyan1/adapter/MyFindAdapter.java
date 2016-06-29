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
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.yangbo.maoyan1.R;
import com.yangbo.maoyan1.activity.H5FindActivity;
import com.yangbo.maoyan1.bean.FindListBean;
import com.yangbo.maoyan1.bean.FindViewPagerBean;
import com.yangbo.maoyan1.utils.UrlUtilsFind;

import java.util.List;

/**
 * Created by yangbo on 2016/6/28.
 */
public class MyFindAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private final Context context;
    //list的数据集合
    private List<FindListBean.DataBean.FeedsBean> feeds;
    //Viewpager的数据集合
    private List<FindViewPagerBean.DataBean> datas;
    //为了接收消息
    private ViewPager vp_find_vp1;

    public MyFindAdapter(Context context) {
        this.context = context;
    }

    //设置list的数据集合
    public void setFeeds(List<FindListBean.DataBean.FeedsBean> feeds) {
        this.feeds = feeds;
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        if (viewType == 0) {
            View view = LayoutInflater.from(context).inflate(R.layout.item_find_header, parent, false);
            return new MyFindHolder0(view);
        }
        if (viewType == 1) {
            View view = LayoutInflater.from(context).inflate(R.layout.item_find_body1, parent, false);
            return new MyFindHolder1(view);
        }
        if (viewType == 2) {
            View view = LayoutInflater.from(context).inflate(R.layout.item_find_body1, parent, false);
            return new MyFindHolder1(view);
        }
        if (viewType == 3) {
            View view = LayoutInflater.from(context).inflate(R.layout.item_find_body1, parent, false);
            return new MyFindHolder1(view);
        }
        if (viewType == 4) {
            View view = LayoutInflater.from(context).inflate(R.layout.item_find_body4, parent, false);
            return new MyFindHolder1(view);
        }
        if (viewType == 5) {
            View view = LayoutInflater.from(context).inflate(R.layout.item_find_body1, parent, false);
            return new MyFindHolder1(view);
        }
        if (viewType == 6) {
            View view = LayoutInflater.from(context).inflate(R.layout.item_find_body1, parent, false);
            return new MyFindHolder1(view);
        }
        if (viewType == 7) {
            View view = LayoutInflater.from(context).inflate(R.layout.item_find_body1, parent, false);
            return new MyFindHolder1(view);
        }
        if (viewType == 8) {
            View view = LayoutInflater.from(context).inflate(R.layout.item_find_body8, parent, false);
            return new MyFindHolder8(view);
        }
        return null;
    }

    /**
     * 绑定数据
     *
     * @param holder
     * @param position
     */
    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (position == 0 && datas != null && datas.size() > 0) {
//            LogUtil.e("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!"+datas.get(0).getImgUrl());
            MyFindHeaderAdapter myFindHeaderAdapter = new MyFindHeaderAdapter(context, datas);
            vp_find_vp1 = ((MyFindHolder0) holder).vp_find_vp;
            ((MyFindHolder0) holder).vp_find_vp.setAdapter(myFindHeaderAdapter);
            handler.sendEmptyMessageDelayed(1, 2000);
        }

        if (getItemViewType(position) == 8 && feeds != null && feeds.size() > 0) {
            //设置图片
            List<FindListBean.DataBean.FeedsBean.ImagesBean> images = feeds.get(position-1).getImages();
            Glide.with(context).load(images.get(0).getUrl())
                    .placeholder(R.drawable.kg)
                    .error(R.drawable.kg)
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                    .into(((MyFindHolder8) holder).iv_find8_iv01);

            Glide.with(context).load(images.get(1).getUrl())
                    .placeholder(R.drawable.kg)
                    .error(R.drawable.kg)
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                    .into(((MyFindHolder8) holder).iv_find8_iv02);

            Glide.with(context).load(images.get(2).getUrl())
                    .placeholder(R.drawable.kg)
                    .error(R.drawable.kg)
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                    .into(((MyFindHolder8) holder).iv_find8_iv03);

            ((MyFindHolder8) holder).tv_find8_tittle.setText(feeds.get(position-1).getTitle());//设置标题
            ((MyFindHolder8) holder).tv_find8_piece.setText(feeds.get(position-1).getImageCount()+"");//图片数量
            ((MyFindHolder8) holder).tv_find8_foot1.setText(feeds.get(position-1).getUser().getNickName());//电影快运
            ((MyFindHolder8) holder).tv_find8_foot2.setText(feeds.get(position-1).getViewCount()+"");//电影快运
            ((MyFindHolder8) holder).tv_find8_foot3.setText(feeds.get(position-1).getCommentCount()+"");//电影快运

        }


    }

    private Handler handler = new Handler() {
        public void handleMessage(Message msg) {
            if (vp_find_vp1 != null) {
                vp_find_vp1.setCurrentItem(vp_find_vp1.getCurrentItem() + 1);
                removeCallbacksAndMessages(null);
                handler.sendEmptyMessageDelayed(1, 2000);
            }
        }
    };

    @Override
    public int getItemCount() {
        if (feeds != null && feeds.size() > 0) {
            return feeds.size();
        }
        return 1;
    }

    @Override
    public int getItemViewType(int position) {

        if (position == 0) {
            return 0;
        }
        if (feeds != null && feeds.size() > 0) {
            return feeds.get(position-1).getFeedType();
        }

        return 1;
    }

    public void setDatas(List<FindViewPagerBean.DataBean> datas) {
        this.datas = datas;
    }

    //头部holder
    class MyFindHolder0 extends RecyclerView.ViewHolder {
        public ViewPager vp_find_vp;
        TextView tv_find_huati;
        TextView tv_find_zixun;
        TextView tv_find_yingku;
        TextView tv_find_piaofang;


        public MyFindHolder0(View itemView) {
            super(itemView);
            vp_find_vp = (ViewPager) itemView.findViewById(R.id.vp_find_vp);
            tv_find_huati = (TextView) itemView.findViewById(R.id.tv_find_huati);
            tv_find_zixun = (TextView) itemView.findViewById(R.id.tv_find_zixun);
            tv_find_yingku = (TextView) itemView.findViewById(R.id.tv_find_yingku);
            tv_find_piaofang = (TextView) itemView.findViewById(R.id.tv_find_piaofang);

            MyOnClickListener myOnClickListener = new MyOnClickListener();
            tv_find_huati.setOnClickListener(myOnClickListener);
            tv_find_zixun.setOnClickListener(myOnClickListener);
            tv_find_yingku.setOnClickListener(myOnClickListener);
            tv_find_piaofang.setOnClickListener(myOnClickListener);
        }

    }

    class MyFindHolder1 extends RecyclerView.ViewHolder {

        public MyFindHolder1(View itemView) {
            super(itemView);
        }
    }

    /**
     * 样式8的holder
     */
    class MyFindHolder8 extends RecyclerView.ViewHolder {
        TextView tv_find8_date;//顶部今天
        TextView tv_find8_tittle;//标题
        TextView tv_find8_piece;//图片张数
        ImageView iv_find8_iv01;//图片
        ImageView iv_find8_iv02;
        ImageView iv_find8_iv03;
        TextView tv_find8_foot1;//底部
        TextView tv_find8_foot2;//底部
        TextView tv_find8_foot3;//底部

        public MyFindHolder8(View itemView) {
            super(itemView);
            tv_find8_date = (TextView) itemView.findViewById(R.id.tv_find8_date);
            tv_find8_tittle = (TextView) itemView.findViewById(R.id.tv_find8_tittle);
            tv_find8_piece = (TextView) itemView.findViewById(R.id.tv_find8_piece);
            iv_find8_iv01 = (ImageView) itemView.findViewById(R.id.iv_find8_iv01);
            iv_find8_iv02 = (ImageView) itemView.findViewById(R.id.iv_find8_iv02);
            iv_find8_iv03 = (ImageView) itemView.findViewById(R.id.iv_find8_iv03);
            tv_find8_foot1 = (TextView) itemView.findViewById(R.id.tv_find8_foot1);
            tv_find8_foot2 = (TextView) itemView.findViewById(R.id.tv_find8_foot2);
            tv_find8_foot3 = (TextView) itemView.findViewById(R.id.tv_find8_foot3);
        }
    }

    /**
     * 样式8的holder
     */
    class MyFindHolder4 extends RecyclerView.ViewHolder {

        public MyFindHolder4(View itemView) {
            super(itemView);
        }
    }


    //onclick的描述
    class MyOnClickListener implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            Intent intent = new Intent(context, H5FindActivity.class);
            switch (v.getId()) {
                case R.id.tv_find_huati:
                    intent.putExtra("url", UrlUtilsFind.URL_FIND_HUATI);
                    break;
                case R.id.tv_find_zixun:
                    intent.putExtra("url", UrlUtilsFind.URL_FIND_ZIXUN);

                    break;
                case R.id.tv_find_yingku:
                    intent.putExtra("url", "");
                    break;
                case R.id.tv_find_piaofang:
                    intent.putExtra("url", "");
                    break;
            }
            context.startActivity(intent);
        }
    }

}
