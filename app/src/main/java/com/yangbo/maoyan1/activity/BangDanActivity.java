package com.yangbo.maoyan1.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.yangbo.maoyan1.R;
import com.yangbo.maoyan1.bean.Yingku_ReMenKouBeiBean;
import com.yangbo.maoyan1.utils.UrlUtilsFind;

import org.xutils.common.util.LogUtil;

import java.io.Serializable;
import java.util.List;

public class BangDanActivity extends Activity {

    LinearLayout ll_bangdan;
    TextView tv_bangdan_tou;
    TextView tv_bangdan;
    ListView lv_bangdan;
    private List<Yingku_ReMenKouBeiBean.DataBean.MoviesBean> movies;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bang_dan);



        Serializable yk = getIntent().getSerializableExtra("yk");
//        String title = ((Yingku_ReMenKouBeiBean) yk).getData().getTitle();
//        LogUtil.e(title);
        movies = ((Yingku_ReMenKouBeiBean) yk).getData().getMovies();

        ll_bangdan = (LinearLayout)findViewById(R.id.ll_bangdan);
        tv_bangdan_tou = (TextView)findViewById(R.id.tv_bangdan_tou);
        tv_bangdan = (TextView) findViewById(R.id.tv_bangdan);
        lv_bangdan = (ListView) findViewById(R.id.lv_bangdan);
        LinearLayout.LayoutParams ff=new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
//        lv_bangdan.addHeaderView(ll_bangdan);
        tv_bangdan.setText(((Yingku_ReMenKouBeiBean) yk).getData().getContent());
        tv_bangdan_tou.setText(((Yingku_ReMenKouBeiBean) yk).getData().getCreated());
        lv_bangdan.setAdapter(new MyBangdanAdapter());
//        ListView.LayoutParams LP=new ListView.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);


        ll_bangdan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //分享文本
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT, "我用手机测试分享内容");
                sendIntent.setType("text/plain");
                startActivity(Intent.createChooser(sendIntent, "我是弹出框的标题"));

            }
        });

        lv_bangdan.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(BangDanActivity.this, ""+position, Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(BangDanActivity.this,H5FindActivity.class);
                intent.putExtra("url", UrlUtilsFind.URL_MOVIE_H5+movies.get(position).getId());
                LogUtil.e(UrlUtilsFind.URL_MOVIE_H5+movies.get(position).getId());
                startActivity(intent);
            }
        });
    }

    class MyBangdanAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return movies.size();
        }

        @Override
        public Object getItem(int position) {
            return movies.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            Holder holder;
            if (convertView == null) {
                holder = new Holder();
                convertView = View.inflate(BangDanActivity.this, R.layout.item_bangdan, null);
                holder.iv_ry_movie = (ImageView) convertView.findViewById(R.id.iv_ry_movie);
                holder.tv_movie_name = (TextView) convertView.findViewById(R.id.tv_movie_name);
                holder.tv_name_one = (TextView) convertView.findViewById(R.id.tv_name_one);
                holder.tv_name_two = (TextView) convertView.findViewById(R.id.tv_name_two);
                holder.tv_pingfen = (TextView) convertView.findViewById(R.id.tv_pingfen);
                holder.btn_goupiao = (Button) convertView.findViewById(R.id.btn_goupiao);
                convertView.setTag(holder);
            } else {
                holder = (Holder) convertView.getTag();
            }
            Yingku_ReMenKouBeiBean.DataBean.MoviesBean moviesBean = movies.get(position);
            holder.tv_movie_name.setText(moviesBean.getNm());
            holder.tv_name_one.setText(moviesBean.getStar());
            holder.tv_name_two.setText(moviesBean.getRt());
            holder.tv_pingfen.setText(moviesBean.getSc()+"");

            Glide.with(BangDanActivity.this).load(moviesBean.getImg().replace("w.h", "165.220"))
                    .diskCacheStrategy(DiskCacheStrategy.ALL).into(holder.iv_ry_movie);
            holder.btn_goupiao.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(BangDanActivity.this, "想看", Toast.LENGTH_SHORT).show();
                }
            });

            return convertView;
        }
    }

    static class Holder {
        ImageView iv_ry_movie;
        TextView tv_movie_name;
        TextView tv_name_one;
        TextView tv_name_two;
        TextView tv_pingfen;
        Button btn_goupiao;

    }
}
