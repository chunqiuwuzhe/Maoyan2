package com.yangbo.maoyan1.adapter;

import android.content.Context;
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
import com.yangbo.maoyan1.bean.HanGuoBean;

import java.util.List;

/**
 * Created by sdf on 2016/6/28.
 */
public class HaiWaiHanGuoAdapter  extends RecyclerView.Adapter<HaiWaiHanGuoAdapter.ViewHolder>{
    private Context context;
    private List<HanGuoBean.DataBean.HotBean> arrhot;

    public void setArrhot(List<HanGuoBean.DataBean.HotBean> arrhot) {
        this.arrhot = arrhot;
    }

    public HaiWaiHanGuoAdapter(Context context) {
        this.context=context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.haiwai_item_lv,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.tv_haiwai_guojia.setVisibility(View.VISIBLE);
        holder.tv_haiwai_guojia.setText("韩国");
        if(position!=0){
            holder.tv_haiwai_guojia.setVisibility(View.GONE);
        }
        HanGuoBean.DataBean.HotBean comingBean = arrhot.get(position);
        holder.tv_movie_name.setText(comingBean.getNm());
        holder.tv_name_one.setText(comingBean.getOverseaTime()+"美国上映");
        holder.tv_name_two.setText(comingBean.getDesc());
        holder.tv_pingfen.setText(comingBean.getWish()+"");
        //显示附带专题数据
        holder.ll_one.setVisibility(View.GONE);
        holder.ll_two.setVisibility(View.GONE);
        holder.ll_three.setVisibility(View.GONE);
        isVisibility(holder, position, comingBean);
        //图片地址
        String img = comingBean.getImg();
        //替换字符串
        img = replace(img);
        //联网请求图片
        Glide.with(context).load(img)
                .placeholder(R.drawable.kg)
                .error(R.drawable.kg)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(holder.iv_hw_movie);
        //显示查看全部影片
        holder.view_line.setVisibility(View.GONE);
        holder.tv_chankan.setVisibility(View.GONE);
        if(position==arrhot.size()-1){
            holder.view_line.setVisibility(View.VISIBLE);
            holder.tv_chankan.setVisibility(View.VISIBLE);
        }
        //设置显示或者不显示3d
        holder.btn_imax.setVisibility(View.VISIBLE);
        holder.iv_3d.setVisibility(View.VISIBLE);
        isContains(holder, comingBean);
        //设置显示想看或者预售
        isButton(holder, comingBean);
    }

    @Override
    public int getItemCount() {
        if(arrhot!=null&&arrhot.size()>0){
            return arrhot.size();
        }
        return 0;
    }

        
    //替换字符串
    private String replace(String img) {
        String replace = img.replace("w.h", "165.220");
        return replace;
    }
    private void isContains(ViewHolder holder, HanGuoBean.DataBean.HotBean hotBean) {
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
    private void isButton(ViewHolder holder, HanGuoBean.DataBean.HotBean comingBean) {
        int showst = comingBean.getShowst();
        if(showst==1){
            //隐藏预售
            holder.btn_yushou.setVisibility(View.GONE);
            //隐藏购票
            holder.btn_goupiao.setVisibility(View.GONE);
            // 显示想看
            holder.btn_xiangkan.setVisibility(View.VISIBLE);
        }else if(showst==4){
            //隐藏想看
            holder.btn_xiangkan.setVisibility(View.GONE);
            //隐藏购票
            holder.btn_goupiao.setVisibility(View.GONE);
            //显示预售
            holder.btn_yushou.setVisibility(View.VISIBLE);
        }else{
            //隐藏预售
            holder.btn_yushou.setVisibility(View.GONE);
            //隐藏想看
            holder.btn_xiangkan.setVisibility(View.GONE);
            //显示购票
            holder.btn_goupiao.setVisibility(View.VISIBLE);
        }
    }
    class ViewHolder extends RecyclerView.ViewHolder{
        ImageView iv_hw_movie,iv_3d;
        TextView tv_movie_name,tv_name_one,tv_name_two;
        Button btn_imax;
        TextView tv_pingfen;
        Button btn_yushou,btn_xiangkan,btn_goupiao;
        View view_line;
        TextView tv_teying,tv_chankan;

        LinearLayout ll_one,ll_two,ll_three;
        Button btn_one,btn_two,btn_three;
        TextView tv_one,tv_two,tv_three;

        TextView tv_haiwai_guojia;

        public ViewHolder(View itemView) {
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
           btn_goupiao= (Button) itemView.findViewById(R.id.btn_goupiao);
            tv_teying= (TextView) itemView.findViewById(R.id.tv_teying);
            tv_chankan= (TextView) itemView.findViewById(R.id.tv_chankan);
            view_line= (View) itemView.findViewById(R.id.view_line);

            tv_haiwai_guojia = (TextView) itemView.findViewById(R.id.tv_haiwai_guojia);

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
    private void isVisibility(ViewHolder holder, int position, HanGuoBean.DataBean.HotBean hotBean) {
        if(hotBean.getHeadLinesVO()!=null&&
                hotBean.getHeadLinesVO().size()> 0){

            int size = hotBean.getHeadLinesVO().size();
            Log.e("size+++++",size+"");
            Log.e("position+++++",position+"");
            List<HanGuoBean.DataBean.HotBean.HeadLinesVOBean> newsHeadlines = hotBean.getHeadLinesVO();
            if(size==1){
                position=0;
                //设置布局为显示
                holder.ll_one.setVisibility(View.VISIBLE);
                //装载数据
                holder.btn_one.setText(newsHeadlines.get(position).getType());
                holder.tv_one.setText(newsHeadlines.get(position).getTitle());
            }else if(size==2){
                position=0;
                //设置布局为显示
                holder.ll_one.setVisibility(View.VISIBLE);
                //装载数据
                holder.btn_one.setText(newsHeadlines.get(position).getType());
                holder.tv_one.setText(newsHeadlines.get(position).getTitle());
                //设置布局为显示
                holder.ll_two.setVisibility(View.VISIBLE);
                //装载数据
                holder.btn_two.setText(newsHeadlines.get(position+1).getType());
                holder.tv_two.setText(newsHeadlines.get(position+1).getTitle());
            }else if(size==3){
                position=0;
                //设置布局为显示
                holder.ll_one.setVisibility(View.VISIBLE);
                //装载数据
                holder.btn_one.setText(newsHeadlines.get(position).getType());
                holder.tv_one.setText(newsHeadlines.get(position).getTitle());
                //设置布局为显示
                holder.ll_two.setVisibility(View.VISIBLE);
                //装载数据
                holder.btn_two.setText(newsHeadlines.get(position+1).getType());
                holder.tv_two.setText(newsHeadlines.get(position+1).getTitle());
                //设置布局为显示
                holder.ll_three.setVisibility(View.VISIBLE);
                //装载数据
                holder.btn_three.setText(newsHeadlines.get(position+2).getType());
                holder.tv_three.setText(newsHeadlines.get(position+2).getTitle());
            }
        }
    }
}
