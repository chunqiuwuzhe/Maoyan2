package com.yangbo.maoyan1.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

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
            ((Ry_HeadHolder) holder).vp_reying_title.setAdapter(vp_adapter);

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
//            if(lv_movies.get(position).getNewsHeadlines()==null){
//                return;
//            }
//            newsHeadlines = lv_movies.get(position).getNewsHeadlines();
//            if(newsHeadlines!=null&&newsHeadlines.size()>0){
//                View view=View.inflate(context,R.layout.reying_lv_zhuanti,null);
//                ry_listview = (ListView) view.findViewById(R.id.ry_listview);
//                ry_listview.setAdapter(new MyRyListViewAdapter(context,newsHeadlines));
//            }
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
    /*
    * 热映recylerView
    * */
    class Ry_RclViewHolder extends RecyclerView.ViewHolder {
        ImageView iv_ry_movie;
        TextView tv_movie_name, tv_name_one, tv_name_two, tv_pingfen;
        Button btn_goupiao;
        ImageView iv_3d;
        Button btn_imax;

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
                    Toast.makeText(context, "搜索框被点击了", Toast.LENGTH_SHORT).show();
                    context.startActivity(new Intent(context,SouSuoActivity.class));
                }
            });
        }
    }
}





