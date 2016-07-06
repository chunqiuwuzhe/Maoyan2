package com.yangbo.maoyan1.adapter;

import android.content.Context;
import android.content.Intent;
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
import com.yangbo.maoyan1.SystemVideoActvity;
import com.yangbo.maoyan1.bean.HaiWaiRiBenBean;

import java.util.List;

/**
 * Created by sdf on 2016/6/28.
 */
public class HwaiRibenAdapter extends RecyclerView.Adapter<HwaiRibenAdapter.ViewHolder>{
    private Context context;

    private List<HaiWaiRiBenBean.DataBean.HotBean> hot;

    public void setArrhot(List<HaiWaiRiBenBean.DataBean.HotBean> hot) {
        this.hot = hot;
    }

    public HwaiRibenAdapter(Context context) {
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
        holder.tv_haiwai_guojia.setText("日本");
        if(position!=0){
            holder.tv_haiwai_guojia.setVisibility(View.GONE);
        }
        HaiWaiRiBenBean.DataBean.HotBean comingBean = hot.get(position);
        holder.tv_movie_name.setText(comingBean.getNm());
        holder.tv_name_one.setText(comingBean.getOverseaTime() + "美国上映");
        holder.tv_name_two.setText(comingBean.getDesc());
        holder.tv_pingfen.setText(comingBean.getWish() + "");
        //显示附带专题数据
        holder.ll_one.setVisibility(View.GONE);
        holder.ll_two.setVisibility(View.GONE);
        holder.ll_three.setVisibility(View.GONE);
        isVisibility(holder, position, comingBean);
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
        if(position==hot.size()-1){
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
        if(hot!=null&&hot.size()>0){
            return hot.size();
        }
        return 0;
    }
    //替换字符串
    private String replace(String img) {
        String replace = img.replace("w.h", "165.220");
        return replace;
    }
    private void isContains(ViewHolder holder, HaiWaiRiBenBean.DataBean.HotBean hotBean) {
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
    private void isButton(ViewHolder holder, HaiWaiRiBenBean.DataBean.HotBean comingBean) {
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

            iv_hw_movie.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(context, SystemVideoActvity.class);
                    Log.e("TAG==url",getLayoutPosition()+"");
                    intent.putExtra("videoUrl",hot.get(getLayoutPosition()-1).getVideourl());
                    context.startActivity(intent);
                }
            });
        }
    }
    private void isVisibility(ViewHolder holder, int position, HaiWaiRiBenBean.DataBean.HotBean hotBean) {
        if(hotBean.getHeadLinesVO()!=null&&
                hotBean.getHeadLinesVO().size()> 0){

            int size = hotBean.getHeadLinesVO().size();
            Log.e("size+++++", size + "");
            Log.e("position+++++",position+"");
            List<HaiWaiRiBenBean.DataBean.HotBean.HeadLinesVOBean> newsHeadlines = hotBean.getHeadLinesVO();
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
