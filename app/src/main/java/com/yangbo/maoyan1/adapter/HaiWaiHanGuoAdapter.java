package com.yangbo.maoyan1.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.yangbo.maoyan1.R;
import com.yangbo.maoyan1.bean.HanGuoBean;

import java.util.List;

/**
 * Created by sdf on 2016/6/28.
 */
public class HaiWaiHanGuoAdapter  extends BaseAdapter{
    private Context context;
    private List<HanGuoBean.DataBean.HotBean> arrhot;

    public void setArrhot(List<HanGuoBean.DataBean.HotBean> arrhot) {
        this.arrhot = arrhot;
    }

    public HaiWaiHanGuoAdapter(Context context) {
        this.context=context;
    }

    @Override
    public int getCount() {
        if(arrhot!=null&&arrhot.size()>0){
            return arrhot.size();
        }
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return arrhot.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if(convertView==null){
            convertView=View.inflate(context, R.layout.haiwai_item_lv,null);
            holder=new ViewHolder();
            holder.iv_hw_movie = (ImageView) convertView.findViewById(R.id.iv_hw_movie);
            holder.iv_3d = (ImageView) convertView.findViewById(R.id.iv_3d);
            holder.tv_movie_name = (TextView) convertView.findViewById(R.id.tv_movie_name);
            holder.tv_name_one = (TextView) convertView.findViewById(R.id.tv_name_one);
            holder.tv_name_two = (TextView) convertView.findViewById(R.id.tv_name_two);
            holder.btn_imax = (Button) convertView.findViewById(R.id.btn_imax);
            holder.tv_pingfen = (TextView) convertView.findViewById(R.id.tv_pingfen);
            holder.btn_yushou = (Button) convertView.findViewById(R.id.btn_yushou);
            holder.btn_xiangkan = (Button) convertView.findViewById(R.id.btn_xiangkan);
            holder.btn_goupiao= (Button) convertView.findViewById(R.id.btn_goupiao);
            holder.tv_teying= (TextView) convertView.findViewById(R.id.tv_teying);
            holder.tv_chankan= (TextView) convertView.findViewById(R.id.tv_chankan);
            holder.view_line= (View) convertView.findViewById(R.id.view_line);
            convertView.setTag(holder);
        }else{
            holder= (ViewHolder) convertView.getTag();
        }
        HanGuoBean.DataBean.HotBean comingBean = arrhot.get(position);
        holder.tv_movie_name.setText(comingBean.getNm());
        holder.tv_name_one.setText(comingBean.getOverseaTime()+"美国上映");
        holder.tv_name_two.setText(comingBean.getDesc());
        holder.tv_pingfen.setText(comingBean.getWish()+"");
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
        return convertView;
    }
    //替换字符串
    private String replace(String img) {
        String replace = img.replace("w.h", "165.220");
        return replace;
    }

    static class ViewHolder{
        ImageView iv_hw_movie,iv_3d;
        TextView tv_movie_name,tv_name_one,tv_name_two;
        Button btn_imax;
        TextView tv_pingfen;
        Button btn_yushou,btn_xiangkan,btn_goupiao;
        View view_line;
        TextView tv_teying,tv_chankan;
    }
}
