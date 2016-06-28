package com.yangbo.maoyan1.adapter;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.yangbo.maoyan1.R;
import com.yangbo.maoyan1.bean.HaiWaiRiBenBean;

import java.util.List;

/**
 * Created by sdf on 2016/6/28.
 */
public class HwaiRibenAdapter extends BaseAdapter{
    private Context context;

    private List<HaiWaiRiBenBean.DataBean.HotBean> hot;

    public void setArrhot(List<HaiWaiRiBenBean.DataBean.HotBean> hot) {
        this.hot = hot;
    }

    public HwaiRibenAdapter(Context context) {
        this.context=context;
    }
    @Override
    public int getCount() {
        if(hot!=null&&hot.size()>0){
            return hot.size();
        }
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return hot.get(position);
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

            holder.ll_one = (LinearLayout) convertView.findViewById(R.id.ll_one);
            holder.ll_two = (LinearLayout) convertView.findViewById(R.id.ll_two);
            holder.ll_three = (LinearLayout) convertView.findViewById(R.id.ll_three);
            holder.btn_one = (Button) convertView.findViewById(R.id.btn_one);
            holder.btn_two = (Button) convertView.findViewById(R.id.btn_two);
            holder.btn_three = (Button) convertView.findViewById(R.id.btn_three);
            holder.tv_one = (TextView) convertView.findViewById(R.id.tv_one);
            holder.tv_two = (TextView) convertView.findViewById(R.id.tv_two);
            holder.tv_three = (TextView) convertView.findViewById(R.id.tv_three);
            convertView.setTag(holder);
        }else{
            holder= (ViewHolder) convertView.getTag();
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
        return convertView;
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
    static class ViewHolder{
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
