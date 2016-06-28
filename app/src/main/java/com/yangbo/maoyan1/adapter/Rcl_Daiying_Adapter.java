package com.yangbo.maoyan1.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
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
import com.yangbo.maoyan1.bean.DaiYIngRcViewBean;

import java.util.List;


/**
 * Created by sdf on 2016/6/24.
 */
public class Rcl_Daiying_Adapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public Context context;

    private List<DaiYIngRcViewBean.DataBean.ComingBean> coming;

    public void setComing(List<DaiYIngRcViewBean.DataBean.ComingBean> coming) {
        this.coming = coming;
    }

    public Rcl_Daiying_Adapter(Context context) {
        this.context=context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (viewType==0){

            View view = LayoutInflater.from(context).inflate(R.layout.daiying_item_sou_vp,parent,false);

            return new Dy_HeadHolder(view);
        }
        if(viewType==1){
            View view = LayoutInflater.from(context).inflate(R.layout.daiying_item_rcl_one,null);
            return new Dy_TwoHeadHolder(view);
        }
        View view = LayoutInflater.from(context).inflate(R.layout.item_daiying_rcl,parent,false);
        return new Dy_RclViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (position==0){
            //设置布局管理器
            ((Dy_HeadHolder) holder).manager = new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false);
            ((Dy_HeadHolder) holder).rcl_haiwai_title.setLayoutManager(((Dy_HeadHolder) holder).manager);
            RclDayingOneAdapter rclDayingOneAdapter = new RclDayingOneAdapter(context);
            ((Dy_HeadHolder) holder).rcl_haiwai_title.setAdapter(rclDayingOneAdapter);
            return ;
        }
        if(position==1){
            ((Dy_TwoHeadHolder) holder).manager = new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false);
            ((Dy_TwoHeadHolder) holder).rcl_haiwai_title_two.setLayoutManager(((Dy_TwoHeadHolder) holder).manager);
            RclDayingTwoAdapter rclDayingTwoAdapter = new RclDayingTwoAdapter(context);
            ((Dy_TwoHeadHolder) holder).rcl_haiwai_title_two.setAdapter(rclDayingTwoAdapter);
            return ;
        }
        if(coming!=null&&coming.size()>0){
            if(holder instanceof Dy_RclViewHolder){
                DaiYIngRcViewBean.DataBean.ComingBean comingBean = coming.get(position - 2);
                ((Dy_RclViewHolder) holder).tv_movie_name.setText(comingBean.getNm());
                ((Dy_RclViewHolder) holder).tv_name_one.setText(comingBean.getScm());
                ((Dy_RclViewHolder) holder).tv_name_two.setText(comingBean.getShowInfo());
                ((Dy_RclViewHolder) holder).tv_pingfen.setText(comingBean.getWish() + "");
                ((Dy_RclViewHolder) holder).ll_one.setVisibility(View.GONE);
                ((Dy_RclViewHolder) holder).ll_two.setVisibility(View.GONE);
                ((Dy_RclViewHolder) holder).ll_two.setVisibility(View.GONE);
                //显示附带专题数据
                isVisibility((Dy_RclViewHolder) holder, position, comingBean);

                String img = comingBean.getImg();
                //替换字符串
                img = replace(img);
                //联网请求图片
                Glide.with(context).load(img)
                        .placeholder(R.drawable.kg)
                        .error(R.drawable.kg)
                        .diskCacheStrategy(DiskCacheStrategy.ALL)
                        .into(((Dy_RclViewHolder) holder).iv_hw_movie);
                //设置显示或者不显示3d
                ((Dy_RclViewHolder) holder).btn_imax.setVisibility(View.VISIBLE);
                ((Dy_RclViewHolder) holder).iv_3d.setVisibility(View.VISIBLE);
                isContains((Dy_RclViewHolder) holder, comingBean);
                //设置显示想看或者预售
                isButton((Dy_RclViewHolder) holder, comingBean);
            }
        }
    }

    private void isButton(Dy_RclViewHolder holder, DaiYIngRcViewBean.DataBean.ComingBean comingBean) {
        int showst = comingBean.getShowst();
        if(showst==1){
            //隐藏预售
            holder.btn_yushou.setVisibility(View.GONE);
            // 显示想看
            holder.btn_xiangkan.setVisibility(View.VISIBLE);
        }else{
            //显示预售
            holder.btn_yushou.setVisibility(View.VISIBLE);
            //隐藏想看
            holder.btn_xiangkan.setVisibility(View.GONE);
        }
    }

    private void isContains(Dy_RclViewHolder holder, DaiYIngRcViewBean.DataBean.ComingBean hotBean) {
        //如果包含其中的字符床就显示反之不显示
        if(hotBean.getVer().contains("3D/IMAX 3D")){//显示3d2D/3D
            holder.iv_3d.setVisibility(View.VISIBLE);
            holder.btn_imax.setVisibility(View.VISIBLE);
        }else if(hotBean.getVer().contains("2D/3D")){//不显示
            holder.iv_3d.setVisibility(View.VISIBLE);
            holder.btn_imax.setVisibility(View.GONE);
        } else {
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
    public int getItemCount() {
        if(coming!=null&&coming.size()>0){
            return coming.size()+2;
        }
        return 0;
    }
    @Override
    public int getItemViewType(int position) {
        if (position==0){
            return 0;
        }
        if(position==1){
            return 1;
        }
        return 2;
    }
    class Dy_RclViewHolder extends RecyclerView.ViewHolder{
       ImageView iv_hw_movie,iv_3d;
        TextView tv_movie_name,tv_name_one,tv_name_two;
        Button btn_imax;
        TextView tv_pingfen;
        Button btn_yushou,btn_xiangkan;

        LinearLayout ll_one,ll_two,ll_three;
        Button btn_one,btn_two,btn_three;
        TextView tv_one,tv_two,tv_three;

        TextView tv_date;

        public Dy_RclViewHolder(View itemView) {
            super(itemView);
            iv_hw_movie = (ImageView) itemView.findViewById(R.id.iv_hw_movie);
            iv_3d = (ImageView) itemView.findViewById(R.id.iv_3d);
            tv_movie_name = (TextView) itemView.findViewById(R.id.tv_movie_name);
            tv_name_one = (TextView) itemView.findViewById(R.id.tv_name_one);
            tv_name_two = (TextView) itemView.findViewById(R.id.tv_name_two);
            btn_imax = (Button) itemView.findViewById(R.id.btn_imax);
            tv_pingfen = (TextView) itemView.findViewById(R.id.tv_pingfen);
            btn_yushou = (Button) itemView.findViewById(R.id.btn_yushou);
            btn_xiangkan = (Button) itemView.findViewById(R.id.btn_xiangkan);

            tv_date = (TextView) itemView.findViewById(R.id.tv_date);

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
    class Dy_HeadHolder extends RecyclerView.ViewHolder{
        LinearLayout ll_sousou;
        RecyclerView rcl_haiwai_title;
        LinearLayoutManager manager;
        public Dy_HeadHolder(View itemView) {
            super(itemView);
            rcl_haiwai_title = (RecyclerView) itemView.findViewById(R.id.rcl_haiwai_title);
            ll_sousou = (LinearLayout) itemView.findViewById(R.id.ll_sousou);
            ll_sousou.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    context.startActivity(new Intent(context,SouSuoActivity.class));
                }
            });
        }

    }
    class Dy_TwoHeadHolder extends RecyclerView.ViewHolder{
        RecyclerView rcl_haiwai_title_two;
        LinearLayoutManager manager;
        public Dy_TwoHeadHolder(View itemView) {
            super(itemView);
            rcl_haiwai_title_two = (RecyclerView) itemView.findViewById(R.id.rcl_haiwai_title_two);
        }

    }
    private void isVisibility(Dy_RclViewHolder holder, int position, DaiYIngRcViewBean.DataBean.ComingBean hotBean) {
        if(hotBean.getHeadLinesVO()!=null&&
                hotBean.getHeadLinesVO().size()> 0){

            int size = hotBean.getHeadLinesVO().size();
            List<DaiYIngRcViewBean.DataBean.ComingBean.HeadLinesVOBean> newsHeadlines = hotBean.getHeadLinesVO();
            if(size==1){
                //设置布局为显示
                holder.ll_one.setVisibility(View.VISIBLE);
                //装载数据
                holder.btn_one.setText(newsHeadlines.get(position-2).getType());
                holder.tv_one.setText(newsHeadlines.get(position-2).getTitle());
            }else if(size==2){
                //设置布局为显示
                holder.ll_one.setVisibility(View.VISIBLE);
                //装载数据
                holder.btn_one.setText(newsHeadlines.get(position-2).getType());
                holder.tv_one.setText(newsHeadlines.get(position-2).getTitle());
                //设置布局为显示
                holder.ll_two.setVisibility(View.VISIBLE);
                //装载数据
                holder.btn_two.setText(newsHeadlines.get(position-1).getType());
                holder.tv_two.setText(newsHeadlines.get(position-1).getTitle());
            }else if(size==3){
                //设置布局为显示
                holder.ll_one.setVisibility(View.VISIBLE);
                //装载数据
                holder.btn_one.setText(newsHeadlines.get(position-2).getType());
                holder.tv_one.setText(newsHeadlines.get(position-2).getTitle());
                //设置布局为显示
                holder.ll_two.setVisibility(View.VISIBLE);
                //装载数据
                holder.btn_two.setText(newsHeadlines.get(position-1).getType());
                holder.tv_two.setText(newsHeadlines.get(position-1).getTitle());
                //设置布局为显示
                holder.ll_three.setVisibility(View.VISIBLE);
                //装载数据
                holder.btn_three.setText(newsHeadlines.get(position).getType());
                holder.tv_three.setText(newsHeadlines.get(position).getTitle());
            }
        }
    }

}



