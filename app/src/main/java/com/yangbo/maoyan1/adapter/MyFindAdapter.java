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
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.yangbo.maoyan1.R;
import com.yangbo.maoyan1.activity.FindYingKuActivity;
import com.yangbo.maoyan1.activity.H5FindActivity;
import com.yangbo.maoyan1.bean.FindListBean;
import com.yangbo.maoyan1.bean.FindViewPagerBean;
import com.yangbo.maoyan1.utils.UrlUtilsFind;

import org.xutils.common.util.DensityUtil;

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

    //上一次 红点的位置
    private int prePosition = 0;

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
            View view = LayoutInflater.from(context).inflate(R.layout.item_find_body2, parent, false);
            return new MyFindHolder2(view);
        }
        if (viewType == 3) {
            View view = LayoutInflater.from(context).inflate(R.layout.item_find_body1, parent, false);
            return new MyFindHolder1(view);
        }
        if (viewType == 4) {
            View view = LayoutInflater.from(context).inflate(R.layout.item_find_body4, parent, false);
            return new MyFindHolder4(view);
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
            View view = LayoutInflater.from(context).inflate(R.layout.item_find_body7, parent, false);
            return new MyFindHolder7(view);
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
            //得到点的LinearLayout
            final LinearLayout ll_find_vp_point = ((MyFindHolder0) holder).ll_find_vp_point;
            //得到ViewPager
            ((MyFindHolder0) holder).vp_find_vp.setAdapter(myFindHeaderAdapter);

            //设置点
            //移除所有的点
            ll_find_vp_point .removeAllViews();
            for ( int i = 0 ; i < datas .size(); i++) {
                ImageView point = new ImageView( context);
                point.setBackgroundResource(R.drawable. point_bg_selector);

                LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(DensityUtil. dip2px( 5), DensityUtil.dip2px(5 ));
                if (i == 0 ) {
                    point.setEnabled( true);
                } else {
                    point.setEnabled( false);

                }
                if (i != 0) {
                    params. leftMargin = DensityUtil.dip2px (5 );
                }
                point.setLayoutParams(params) ;
                ll_find_vp_point.addView(point) ;

            }
//            tv_tittle.setText(datas .get(prePosition).getTitle()) ;
            ll_find_vp_point.getChildAt(prePosition ).setEnabled(true) ;

            //监听页面的改变
            vp_find_vp1.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
                @Override
                public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                    if(position != prePosition) {


                        //设置高亮点
                        ll_find_vp_point.getChildAt(position%datas.size()).setEnabled(true);
                        ll_find_vp_point.getChildAt(prePosition).setEnabled(false);
                    }
                    prePosition = position%datas.size();
                }

                @Override
                public void onPageSelected(int position) {

                }

                @Override
                public void onPageScrollStateChanged(int state) {

                }
            });

            //发消息，实现自动播放
            handler.sendEmptyMessageDelayed(1, 2000);

        }
        if (feeds != null && feeds.size() > 0&&(getItemViewType(position) == 8 ||getItemViewType(position) == 2||
                getItemViewType(position) == 4)||getItemViewType(position) == 7) {


            //第八种的绑定
            if (getItemViewType(position) == 8 && feeds != null && feeds.size() > 0) {
                //设置图片
                List<FindListBean.DataBean.FeedsBean.ImagesBean> images = feeds.get(position - 1).getImages();
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

//                ((MyFindHolder8) holder).tv_find8_tittle.setText(feeds.get(position - 1).getTitle());//设置标题
                ((MyFindHolder8) holder).tv_find8_piece.setText(feeds.get(position - 1).getImageCount() + "");//图片数量
//                ((MyFindHolder8) holder).tv_find8_foot1.setText(feeds.get(position - 1).getUser().getNickName());//电影快运
//                ((MyFindHolder8) holder).tv_find8_foot2.setText(feeds.get(position - 1).getViewCount() + "");//电影快运
//                ((MyFindHolder8) holder).tv_find8_foot3.setText(feeds.get(position - 1).getCommentCount() + "");//电影快运

            }

            //第2种的绑定
            if (getItemViewType(position) == 2 && feeds != null && feeds.size() > 0) {
                //设置图片
                List<FindListBean.DataBean.FeedsBean.ImagesBean> images = feeds.get(position - 1).getImages();
                Glide.with(context).load(images.get(0).getUrl())
                        .placeholder(R.drawable.kg)
                        .error(R.drawable.kg)
                        .diskCacheStrategy(DiskCacheStrategy.ALL)
                        .into(((MyFindHolder2) holder).iv_find8_iv01);

                Glide.with(context).load(images.get(1).getUrl())
                        .placeholder(R.drawable.kg)
                        .error(R.drawable.kg)
                        .diskCacheStrategy(DiskCacheStrategy.ALL)
                        .into(((MyFindHolder2) holder).iv_find8_iv02);

                Glide.with(context).load(images.get(2).getUrl())
                        .placeholder(R.drawable.kg)
                        .error(R.drawable.kg)
                        .diskCacheStrategy(DiskCacheStrategy.ALL)
                        .into(((MyFindHolder2) holder).iv_find8_iv03);
//
//                ((MyFindHolder2) holder).tv_find8_tittle.setText(feeds.get(position - 1).getTitle());//设置标题
//                ((MyFindHolder2) holder).tv_find8_foot1.setText(feeds.get(position - 1).getUser().getNickName());//电影快运
//                ((MyFindHolder2) holder).tv_find8_foot2.setText(feeds.get(position - 1).getViewCount() + "");//电影快运
//                ((MyFindHolder2) holder).tv_find8_foot3.setText(feeds.get(position - 1).getCommentCount() + "");//电影快运

            }

            //第四种的绑定
            if (getItemViewType(position) == 4 && feeds != null && feeds.size() > 0) {
                List<FindListBean.DataBean.FeedsBean.ImagesBean> images = feeds.get(position - 1).getImages();
                Glide.with(context).load(images.get(0).getUrl())
                        .placeholder(R.drawable.kg)
                        .error(R.drawable.kg)
                        .diskCacheStrategy(DiskCacheStrategy.ALL)
                        .into(((MyFindHolder4) holder).iv_find4_body);

//                ((MyFindHolder4) holder).tv_find8_tittle.setText(feeds.get(position - 1).getTitle());//设置标题
//                ((MyFindHolder4) holder).tv_find8_foot1.setText(feeds.get(position - 1).getUser().getNickName());//电影快运
//                ((MyFindHolder4) holder).tv_find8_foot2.setText(feeds.get(position - 1).getViewCount() + "");//电影快运
//                ((MyFindHolder4) holder).tv_find8_foot3.setText(feeds.get(position - 1).getCommentCount() + "");//电影快运
            }

            //第七种的绑定
            if (getItemViewType(position) == 7 && feeds != null && feeds.size() > 0) {
                List<FindListBean.DataBean.FeedsBean.ImagesBean> images = feeds.get(position - 1).getImages();
                Glide.with(context).load(images.get(0).getUrl())
                        .placeholder(R.drawable.kg)
                        .error(R.drawable.kg)
                        .diskCacheStrategy(DiskCacheStrategy.ALL)
                        .into(((MyFindHolder7) holder).iv_find4_body);
//
//            ((MyFindHolder7) holder).tv_find8_tittle.setText(feeds.get(position-1).getTitle());//设置标题
//            ((MyFindHolder7) holder).tv_find8_foot1.setText(feeds.get(position-1).getUser().getNickName());//电影快运
//            ((MyFindHolder7) holder).tv_find8_foot2.setText(feeds.get(position-1).getViewCount()+"");//电影快运
//            ((MyFindHolder7) holder).tv_find8_foot3.setText(feeds.get(position-1).getCommentCount()+"");//电影快运


            }
            if(position==1) {
                ((MyFindHolderParent) holder).tv_find8_date.setText("今天");
                ((MyFindHolderParent) holder).tv_find8_date.setVisibility(View.VISIBLE);
            }else {
                ((MyFindHolderParent) holder).tv_find8_date.setVisibility(View.GONE);
            }
            ((MyFindHolderParent) holder).tv_find8_tittle.setText(feeds.get(position - 1).getTitle());//设置标题
            ((MyFindHolderParent) holder).tv_find8_foot1.setText(feeds.get(position - 1).getUser().getNickName());//电影快运
            ((MyFindHolderParent) holder).tv_find8_foot2.setText(feeds.get(position - 1).getViewCount() + "");//电影快运
            ((MyFindHolderParent) holder).tv_find8_foot3.setText(feeds.get(position - 1).getCommentCount() + "");//电影快运
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
            return feeds.get(position - 1).getFeedType();
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
        LinearLayout ll_find_vp_point;


        public MyFindHolder0(View itemView) {
            super(itemView);
            vp_find_vp = (ViewPager) itemView.findViewById(R.id.vp_find_vp);
            tv_find_huati = (TextView) itemView.findViewById(R.id.tv_find_huati);
            tv_find_zixun = (TextView) itemView.findViewById(R.id.tv_find_zixun);
            tv_find_yingku = (TextView) itemView.findViewById(R.id.tv_find_yingku);
            tv_find_piaofang = (TextView) itemView.findViewById(R.id.tv_find_piaofang);
            ll_find_vp_point = (LinearLayout) itemView.findViewById(R.id.ll_find_vp_point);

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
    class MyFindHolder8 extends MyFindHolderParent {
//        TextView tv_find8_date;//顶部今天
//        TextView tv_find8_tittle;//标题
        TextView tv_find8_piece;//图片张数
        ImageView iv_find8_iv01;//图片
        ImageView iv_find8_iv02;
        ImageView iv_find8_iv03;
//        TextView tv_find8_foot1;//底部
//        TextView tv_find8_foot2;//底部
//        TextView tv_find8_foot3;//底部

        public MyFindHolder8(View itemView) {
            super(itemView);
//            tv_find8_date = (TextView) itemView.findViewById(R.id.tv_find8_date);
//            tv_find8_tittle = (TextView) itemView.findViewById(R.id.tv_find8_tittle);
            tv_find8_piece = (TextView) itemView.findViewById(R.id.tv_find8_piece);
            iv_find8_iv01 = (ImageView) itemView.findViewById(R.id.iv_find8_iv01);
            iv_find8_iv02 = (ImageView) itemView.findViewById(R.id.iv_find8_iv02);
            iv_find8_iv03 = (ImageView) itemView.findViewById(R.id.iv_find8_iv03);
//            tv_find8_foot1 = (TextView) itemView.findViewById(R.id.tv_find8_foot1);
//            tv_find8_foot2 = (TextView) itemView.findViewById(R.id.tv_find8_foot2);
//            tv_find8_foot3 = (TextView) itemView.findViewById(R.id.tv_find8_foot3);
        }
    }

    /**
     * 样式8的holder
     */
    class MyFindHolder2 extends MyFindHolderParent {
//        TextView tv_find8_date;//顶部今天
//        TextView tv_find8_tittle;//标题
        TextView tv_find8_piece;//图片张数
        ImageView iv_find8_iv01;//图片
        ImageView iv_find8_iv02;
        ImageView iv_find8_iv03;
//        TextView tv_find8_foot1;//底部
//        TextView tv_find8_foot2;//底部
//        TextView tv_find8_foot3;//底部

        public MyFindHolder2(View itemView) {
            super(itemView);
//            tv_find8_date = (TextView) itemView.findViewById(R.id.tv_find8_date);
//            tv_find8_tittle = (TextView) itemView.findViewById(R.id.tv_find8_tittle);
            tv_find8_piece = (TextView) itemView.findViewById(R.id.tv_find8_piece);
            iv_find8_iv01 = (ImageView) itemView.findViewById(R.id.iv_find8_iv01);
            iv_find8_iv02 = (ImageView) itemView.findViewById(R.id.iv_find8_iv02);
            iv_find8_iv03 = (ImageView) itemView.findViewById(R.id.iv_find8_iv03);
//            tv_find8_foot1 = (TextView) itemView.findViewById(R.id.tv_find8_foot1);
//            tv_find8_foot2 = (TextView) itemView.findViewById(R.id.tv_find8_foot2);
//            tv_find8_foot3 = (TextView) itemView.findViewById(R.id.tv_find8_foot3);
        }
    }

    /**
     * 样式4的holder
     */
    class MyFindHolder4 extends MyFindHolderParent {
//        TextView tv_find8_date;//顶部今天
//        TextView tv_find8_tittle;//标题
//
//        TextView tv_find8_foot1;//底部
//        TextView tv_find8_foot2;//底部
//        TextView tv_find8_foot3;//底部

        ImageView iv_find4_body;//中间图片

        public MyFindHolder4(View itemView) {
            super(itemView);
//            tv_find8_date = (TextView) itemView.findViewById(R.id.tv_find8_date);
//            tv_find8_tittle = (TextView) itemView.findViewById(R.id.tv_find8_tittle);

//            tv_find8_foot1 = (TextView) itemView.findViewById(R.id.tv_find8_foot1);
//            tv_find8_foot2 = (TextView) itemView.findViewById(R.id.tv_find8_foot2);
//            tv_find8_foot3 = (TextView) itemView.findViewById(R.id.tv_find8_foot3);
            iv_find4_body = (ImageView) itemView.findViewById(R.id.iv_find4_body);
        }
    }

    /**
     * 样式7的holder
     */
    class MyFindHolder7 extends MyFindHolderParent {
//        TextView tv_find8_date;//顶部今天
//        TextView tv_find8_tittle;//标题
//
//        TextView tv_find8_foot1;//底部
//        TextView tv_find8_foot2;//底部
//        TextView tv_find8_foot3;//底部

        ImageView iv_find4_body;//中间图片

        public MyFindHolder7(View itemView) {
            super(itemView);
//            tv_find8_date = (TextView) itemView.findViewById(R.id.tv_find8_date);
//            tv_find8_tittle = (TextView) itemView.findViewById(R.id.tv_find8_tittle);
//
//            tv_find8_foot1 = (TextView) itemView.findViewById(R.id.tv_find8_foot1);
//            tv_find8_foot2 = (TextView) itemView.findViewById(R.id.tv_find8_foot2);
//            tv_find8_foot3 = (TextView) itemView.findViewById(R.id.tv_find8_foot3);
            iv_find4_body = (ImageView) itemView.findViewById(R.id.iv_find4_body);
        }
    }

    /**
     * 样式7的holder
     */
    class MyFindHolderParent extends RecyclerView.ViewHolder {
        TextView tv_find8_date;//顶部今天
        TextView tv_find8_tittle;//标题

        TextView tv_find8_foot1;//底部
        TextView tv_find8_foot2;//底部
        TextView tv_find8_foot3;//底部

        public MyFindHolderParent(View itemView) {
            super(itemView);
            tv_find8_date = (TextView) itemView.findViewById(R.id.tv_find8_date);
            tv_find8_tittle = (TextView) itemView.findViewById(R.id.tv_find8_tittle);

            tv_find8_foot1 = (TextView) itemView.findViewById(R.id.tv_find8_foot1);
            tv_find8_foot2 = (TextView) itemView.findViewById(R.id.tv_find8_foot2);
            tv_find8_foot3 = (TextView) itemView.findViewById(R.id.tv_find8_foot3);
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
                    context.startActivity(intent);
                    break;
                case R.id.tv_find_zixun:
                    intent.putExtra("url", UrlUtilsFind.URL_FIND_ZIXUN);
                    context.startActivity(intent);

                    break;
                case R.id.tv_find_yingku:
                    Intent intent1 = new Intent(context, FindYingKuActivity.class);
                    context.startActivity(intent1);
                    break;
                case R.id.tv_find_piaofang:
                    intent.putExtra("url", "");
                    break;
            }

        }
    }


}
