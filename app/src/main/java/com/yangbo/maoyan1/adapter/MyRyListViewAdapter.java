package com.yangbo.maoyan1.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import com.yangbo.maoyan1.R;
import com.yangbo.maoyan1.bean.ReYingListViewBean;

import java.util.List;

/**
 * Created by sdf on 2016/6/27.
 */
public class MyRyListViewAdapter extends BaseAdapter {
    private Context context;
    private List<ReYingListViewBean.DataBean.HotBean.NewsHeadlinesBean> newsHeadlines;
    public MyRyListViewAdapter(Context context, List<ReYingListViewBean.DataBean.HotBean.NewsHeadlinesBean> newsHeadlines) {
        this.context=context;
        this.newsHeadlines=newsHeadlines;
    }

    @Override
    public int getCount() {
        return newsHeadlines.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if(convertView==null){
            convertView=View.inflate(context, R.layout.ry_lv_item,null);
            holder=new ViewHolder();
            holder.btn_zhaun= (Button) convertView.findViewById(R.id.btn_zhaun);
            holder.tv_name= (TextView) convertView.findViewById(R.id.tv_name);

            convertView.setTag(holder);
        }else {
            holder= (ViewHolder) convertView.getTag();
        }
        ReYingListViewBean.DataBean.HotBean.NewsHeadlinesBean newsHeadlinesBean = newsHeadlines.get(position);

        holder.tv_name.setText(newsHeadlinesBean.getTitle());
        holder.btn_zhaun.setText(newsHeadlinesBean.getType());
        return convertView;
    }
    class ViewHolder{
        Button btn_zhaun;
        TextView tv_name;
    }
}
