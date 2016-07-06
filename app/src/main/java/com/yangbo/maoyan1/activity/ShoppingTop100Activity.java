package com.yangbo.maoyan1.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

import com.yangbo.maoyan1.R;
import com.yangbo.maoyan1.adapter.MyBangdanAdapter;
import com.yangbo.maoyan1.bean.Yingku_ReMenKouBeiBean;
import com.yangbo.maoyan1.utils.UrlUtilsFind;

import org.xutils.common.util.LogUtil;

import java.io.Serializable;
import java.util.List;

/**
 * Created by yangbo on 2016/7/5.
 */
public class ShoppingTop100Activity extends Activity {
    ListView lv_bangdan;
    ImageView iv_shopping100_che;
    private List<Yingku_ReMenKouBeiBean.DataBean.MoviesBean> movies;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping_top100);


        Serializable yk = getIntent().getSerializableExtra("yk");
        String title = ((Yingku_ReMenKouBeiBean) yk).getData().getTitle();
        LogUtil.e(title);
        movies = ((Yingku_ReMenKouBeiBean) yk).getData().getMovies();
        //初始化视图
        lv_bangdan = (ListView) findViewById(R.id.lv_bangdan);
        iv_shopping100_che = (ImageView)findViewById(R.id.iv_shopping100_che);
        LinearLayout.LayoutParams ff = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
//        lv_bangdan.addHeaderView(ll_bangdan);
        lv_bangdan.setAdapter(new MyBangdanAdapter(this,movies));
//        ListView.LayoutParams LP=new ListView.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);


        //listview的监听
        lv_bangdan.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ShoppingTop100Activity.this, "" + position, Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(ShoppingTop100Activity.this, H5FindActivity.class);
                intent.putExtra("url", UrlUtilsFind.URL_MOVIE_H5 + movies.get(position).getId());
                LogUtil.e(UrlUtilsFind.URL_MOVIE_H5 + movies.get(position).getId());
                startActivity(intent);
            }
        });
        //购物车回调
        iv_shopping100_che.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ShoppingTop100Activity.this,GouWuCheActivity.class));
            }
        });
    }


}
