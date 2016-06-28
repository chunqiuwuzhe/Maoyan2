package com.yangbo.maoyan1.adapter;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.yangbo.maoyan1.R;
import com.yangbo.maoyan1.activity.SouSuoActivity;
import com.yangbo.maoyan1.bean.ReYingListViewBean;
import com.yangbo.maoyan1.bean.ReYing_ViewPager_bean;

import java.util.List;

/**
 * Created by sdf on 2016/6/24.
 */
public class Rcl_Reying_Adapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context context;
    public List<ReYing_ViewPager_bean.DataBean> arr;
    private List<ReYingListViewBean.DataBean.HotBean> lv_movies;

    private List<ReYingListViewBean.DataBean.HotBean.NewsHeadlinesBean> newsHeadlines;

    //vp的适配器
    private ReYing_title_Adapter vp_adapter;
    private ViewPager viewPager;

//    private ListView ry_listview;

    public Rcl_Reying_Adapter(Context context) {
        this.context = context;
    }

    public void setArr(List<ReYing_ViewPager_bean.DataBean> arr) {
        this.arr = arr;
    }

    public void setLv_movies(List<ReYingListViewBean.DataBean.HotBean> lv_movies) {
        this.lv_movies = lv_movies;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (viewType == 0) {

            View view = LayoutInflater.from(context).inflate(R.layout.reying_item_sou_vp, parent, false);

            return new Ry_HeadHolder(view);
        }
        View view = LayoutInflater.from(context).inflate(R.layout.item_reying_rcl, parent, false);
        return new Ry_RclViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder holder, int position) {
        if (position == 0 && arr != null && arr.size() > 0) {
            //设置适配器装载数据
            vp_adapter = new ReYing_title_Adapter(context, arr);
            viewPager=((Ry_HeadHolder) holder).vp_reying_title;
            ((Ry_HeadHolder) holder).vp_reying_title.setAdapter(vp_adapter);
            //定位到中间
            viewPager.setCurrentItem(500);
            if(internalHandler==null){
                internalHandler = new InternalHandler();
                internalHandler.removeCallbacksAndMessages(null);
                internalHandler.postDelayed(new MyRun(),2000);
            }
            return;
        }
        //设置数据
        if (lv_movies != null && lv_movies.size() > 0) {
            if(holder instanceof Ry_RclViewHolder){
                ReYingListViewBean.DataBean.HotBean hotBean = lv_movies.get(position-1);
                ((Ry_RclViewHolder) holder).tv_movie_name.setText(hotBean.getNm());
                ((Ry_RclViewHolder) holder).tv_name_one.setText(hotBean.getScm());
                ((Ry_RclViewHolder) holder).tv_name_two.setText(hotBean.getShowInfo());
                ((Ry_RclViewHolder) holder).tv_pingfen.setText(hotBean.getMk()+"");
                ((Ry_RclViewHolder) holder).ll_one.setVisibility(View.GONE);
                ((Ry_RclViewHolder) holder).ll_two.setVisibility(View.GONE);
                ((Ry_RclViewHolder) holder).ll_two.setVisibility(View.GONE);
                isVisibility((Ry_RclViewHolder) holder, position, hotBean);

                String img = hotBean.getImg();
                //替换字符串
                img = replace(img);
                //联网请求图片
                Glide.with(context).load(img)
                        .placeholder(R.drawable.kg)
                        .error(R.drawable.kg)
                        .diskCacheStrategy(DiskCacheStrategy.ALL)
                        .into(((Ry_RclViewHolder) holder).iv_ry_movie);
                //设置显示或者不显示3d
                isContains((Ry_RclViewHolder) holder, hotBean);
            }
        }
    }



    private void isContains(Ry_RclViewHolder holder, ReYingListViewBean.DataBean.HotBean hotBean) {
        //如果包含其中的字符床就显示反之不显示
        if(hotBean.getVer().contains("2D/3D")){//显示3d
            holder.btn_imax.setVisibility(View.GONE);

        }else if(hotBean.getVer().contains("2D")){//不显示
            holder.btn_imax.setVisibility(View.GONE);
            holder.iv_3d.setVisibility(View.GONE);
        }
    }
    //替换字符串
    private String replace(String img) {
        String replace = img.replace("w.h", "165.220");
        return replace;
    }

    @Override
    public int getItemViewType(int position) {
        if (position == 0) {
            return 0;
        }
        return 1;
    }

    @Override
    public int getItemCount() {
        if(lv_movies!=null&&lv_movies.size()>0) {
            return lv_movies.size()+1;
        }
        return 0;
    }
    private InternalHandler internalHandler;
    //轮播图
    class InternalHandler extends Handler {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            int item = viewPager.getCurrentItem()+1;
            viewPager.setCurrentItem(item);
            internalHandler.removeCallbacksAndMessages(null);
            internalHandler.postDelayed(new MyRun(),2000);
        }
    }
    /*
    * 热映recylerView
    * */
    class Ry_RclViewHolder extends RecyclerView.ViewHolder {
        ImageView iv_ry_movie;
        TextView tv_movie_name, tv_name_one, tv_name_two, tv_pingfen;
        Button btn_goupiao;
        ImageView iv_3d;
        Button btn_imax;

        LinearLayout ll_one,ll_two,ll_three;
        Button btn_one,btn_two,btn_three;
        TextView tv_one,tv_two,tv_three;

        public Ry_RclViewHolder(View itemView) {
            super(itemView);
            iv_ry_movie = (ImageView) itemView.findViewById(R.id.iv_ry_movie);
            tv_movie_name = (TextView) itemView.findViewById(R.id.tv_movie_name);
            tv_name_one = (TextView) itemView.findViewById(R.id.tv_name_one);
            tv_name_two = (TextView) itemView.findViewById(R.id.tv_name_two);
            tv_pingfen = (TextView) itemView.findViewById(R.id.tv_pingfen);
            btn_goupiao = (Button) itemView.findViewById(R.id.btn_goupiao);
            iv_3d = (ImageView) itemView.findViewById(R.id.iv_3d);
            btn_imax = (Button) itemView.findViewById(R.id.btn_imax);

            ll_one = (LinearLayout) itemView.findViewById(R.id.ll_one);
            ll_two = (LinearLayout) itemView.findViewById(R.id.ll_two);
            ll_three = (LinearLayout) itemView.findViewById(R.id.ll_three);
            btn_one = (Button) itemView.findViewById(R.id.btn_one);
            btn_two = (Button) itemView.findViewById(R.id.btn_two);
            btn_three = (Button) itemView.findViewById(R.id.btn_three);
            tv_one = (TextView) itemView.findViewById(R.id.tv_one);
            tv_two = (TextView) itemView.findViewById(R.id.tv_two);
            tv_three = (TextView) itemView.findViewById(R.id.tv_three);


        }
    }
    /*
* 热映ViewPager
* */
    class Ry_HeadHolder extends RecyclerView.ViewHolder {
        public LinearLayout ll_sousou;
        public ViewPager vp_reying_title;
        public Ry_HeadHolder(View itemView) {
            super(itemView);
            ll_sousou = (LinearLayout) itemView.findViewById(R.id.ll_sousou);
            vp_reying_title = (ViewPager) itemView.findViewById(R.id.vp_reying_title);
            ll_sousou.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    context.startActivity(new Intent(context,SouSuoActivity.class));
                }
            });
        }
    }

    private class MyRun implements Runnable {
        @Override
        public void run() {
//            internalHandler.removeCallbacksAndMessages(null);
            internalHandler.sendEmptyMessage(0);
        }
    }
    private void isVisibility(Ry_RclViewHolder holder, int position, ReYingListViewBean.DataBean.HotBean hotBean) {
        if(hotBean.getNewsHeadlines()!=null&&
                hotBean.getNewsHeadlines().size()> 0){

            int size = hotBean.getNewsHeadlines().size();
            Log.e("TAG-----------",size+"");
            Log.e("TAG-----------",position+"");
            List<ReYingListViewBean.DataBean.HotBean.NewsHeadlinesBean> newsHeadlines = hotBean.getNewsHeadlines();

            if(size==1){
                //设置布局为显示
                holder.ll_one.setVisibility(View.VISIBLE);
                //装载数据
                holder.btn_one.setText(newsHeadlines.get(position-1).getType());
                holder.tv_one.setText(newsHeadlines.get(position-1).getTitle());
            }else if(size==2){
                //设置布局为显示
                holder.ll_one.setVisibility(View.VISIBLE);
                //装载数据
                holder.btn_one.setText(newsHeadlines.get(position-1).getType());
                holder.tv_one.setText(newsHeadlines.get(position-1).getTitle());
                //设置布局为显示
                holder.ll_two.setVisibility(View.VISIBLE);
                //装载数据
                holder.btn_two.setText(newsHeadlines.get(position).getType());
                holder.tv_two.setText(newsHeadlines.get(position).getTitle());
            }else if(size==3){
                //设置布局为显示
                holder.ll_one.setVisibility(View.VISIBLE);
                //装载数据
                holder.btn_one.setText(newsHeadlines.get(position-1).getType());
                holder.tv_one.setText(newsHeadlines.get(position-1).getTitle());
                //设置布局为显示
                holder.ll_two.setVisibility(View.VISIBLE);
                //装载数据
                holder.btn_two.setText(newsHeadlines.get(position).getType());
                holder.tv_two.setText(newsHeadlines.get(position).getTitle());
                //设置布局为显示
                holder.ll_three.setVisibility(View.VISIBLE);
                //装载数据
                holder.btn_three.setText(newsHeadlines.get(position+1).getType());
                holder.tv_three.setText(newsHeadlines.get(position+1).getTitle());
            }
        }
    }
}





