package com.yangbo.maoyan1.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.google.gson.Gson;
import com.yangbo.maoyan1.R;
import com.yangbo.maoyan1.adapter.MyFindYingKuAdapter;
import com.yangbo.maoyan1.bean.DaiYIngRcViewBean;
import com.yangbo.maoyan1.bean.YingkuHeaderBean;
import com.yangbo.maoyan1.bean.Yingku_ReMenKouBeiBean;
import com.yangbo.maoyan1.utils.CacheUtils;
import com.yangbo.maoyan1.utils.UrlUtils;
import com.yangbo.maoyan1.utils.UrlUtilsFind;
import com.yangbo.maoyan1.view.FullLinearLayou;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import okhttp3.Call;

public class FindYingKuActivity extends Activity implements View.OnClickListener {

    private ImageView iv_yingku_find;
    private ProgressBar pb_find_yingku_loading;
    private RecyclerView rv_find_yingku;
    //头部图片url
    private String url_head;
    private String url_RMKB;

    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

    private TextView llYingkuZi;
    private ImageView ivYingkuHeaher;
    private ImageView ivYingkuHeaherSmall;
    private TextView tvYingkuTou2;
    private TextView tvYingkuTou1;
    private TextView tvYingkuTou3;
    private LinearLayout llReyingkoubei;
    private TextView tvTeyingkoubei;
    private TextView tvTeyingkoubei2;
    private ImageView ivReyingkoubei;
    private LinearLayout llZuishouqidai;
    private TextView tvZuishouqidai;
    private TextView tvZuishouqidai2;
    private ImageView ivZuishouqidai;
    private LinearLayout llBeimeipiaofang;
    private TextView tvBeimeipiaofang;
    private TextView tvBeimeipiaofang2;
    private ImageView ivBeimeipiaofang;
    private LinearLayout llTop100;
    private TextView tvTop100;
    private TextView tvTop1002;
    private ImageView ivTop100;
    private ImageView ivTuijian1;
    private ImageView ivTuijian2;
    private ImageView ivTuijian3;
    private RecyclerView rvFindYingku;
    private TextView 全部电影奖项;
    private Button btnYingkuDonghua;
    private Button btnYingkuXiju;
    private Button btnYingkuKongbu;
    private Button btnYingkuAiqing;
    private Button btnYingkuKehuan;
    private Button btnYingkuDongzuo;
    private Button btnYingkuJuqing;
    private Button btnYingkuJingsong;
    private Button btnYingkuZhanzheng;
    private Button btnYingkuFanzui;
    private Button btnYingkuXuanyi;
    private Button btnYingkuMeiguo;
    private Button btnYingkuDalu;
    private Button btnYingkuRiben;
    private Button btnYingkuHanguo;
    private Button btnYingkuGangtai;
    private TextView tvQuanbufenlei;
    private ProgressBar pbFindYingkuLoading;
    private ArrayList list;
    private Yingku_ReMenKouBeiBean yingku_reMenKouBeiBean;

    /**
     * Find the Views in the layout<br />
     * <br />
     * Auto-created on 2016-06-30 11:59:38 by Android Layout Finder
     * (http://www.buzzingandroid.com/tools/android-layout-finder)
     */
    private void findViews() {
        iv_yingku_find = (ImageView) findViewById(R.id.iv_yingku_find);
        rv_find_yingku = (RecyclerView) findViewById(R.id.rv_find_yingku);
        pb_find_yingku_loading = (ProgressBar) findViewById(R.id.pb_find_yingku_loading);
        llYingkuZi = (TextView) findViewById(R.id.ll_yingku_zi);
        ivYingkuHeaher = (ImageView) findViewById(R.id.iv_yingku_heaher);
        ivYingkuHeaherSmall = (ImageView) findViewById(R.id.iv_yingku_heaher_small);
        tvYingkuTou2 = (TextView) findViewById(R.id.tv_yingku_tou2);
        tvYingkuTou1 = (TextView) findViewById(R.id.tv_yingku_tou1);
        tvYingkuTou3 = (TextView) findViewById(R.id.tv_yingku_tou3);
        llReyingkoubei = (LinearLayout) findViewById(R.id.ll_reyingkoubei);
        tvTeyingkoubei = (TextView) findViewById(R.id.tv_teyingkoubei);
        tvTeyingkoubei2 = (TextView) findViewById(R.id.tv_teyingkoubei2);
        ivReyingkoubei = (ImageView) findViewById(R.id.iv_reyingkoubei);
        llZuishouqidai = (LinearLayout) findViewById(R.id.ll_zuishouqidai);
        tvZuishouqidai = (TextView) findViewById(R.id.tv_zuishouqidai);
        tvZuishouqidai2 = (TextView) findViewById(R.id.tv_zuishouqidai2);
        ivZuishouqidai = (ImageView) findViewById(R.id.iv_zuishouqidai);
        llBeimeipiaofang = (LinearLayout) findViewById(R.id.ll_beimeipiaofang);
        tvBeimeipiaofang = (TextView) findViewById(R.id.tv_beimeipiaofang);
        tvBeimeipiaofang2 = (TextView) findViewById(R.id.tv_beimeipiaofang2);
        ivBeimeipiaofang = (ImageView) findViewById(R.id.iv_beimeipiaofang);
        llTop100 = (LinearLayout) findViewById(R.id.ll_top100);
        tvTop100 = (TextView) findViewById(R.id.tv_top100);
        tvTop1002 = (TextView) findViewById(R.id.tv_top1002);
        ivTop100 = (ImageView) findViewById(R.id.iv_top100);
        ivTuijian1 = (ImageView) findViewById(R.id.iv_tuijian_1);
        ivTuijian2 = (ImageView) findViewById(R.id.iv_tuijian_2);
        ivTuijian3 = (ImageView) findViewById(R.id.iv_tuijian_3);
        rvFindYingku = (RecyclerView) findViewById(R.id.rv_find_yingku);
        全部电影奖项 = (TextView) findViewById(R.id.全部电影奖项);
        btnYingkuDonghua = (Button) findViewById(R.id.btn_yingku_donghua);
        btnYingkuXiju = (Button) findViewById(R.id.btn_yingku_xiju);
        btnYingkuKongbu = (Button) findViewById(R.id.btn_yingku_kongbu);
        btnYingkuAiqing = (Button) findViewById(R.id.btn_yingku_aiqing);
        btnYingkuKehuan = (Button) findViewById(R.id.btn_yingku_kehuan);
        btnYingkuDongzuo = (Button) findViewById(R.id.btn_yingku_dongzuo);
        btnYingkuJuqing = (Button) findViewById(R.id.btn_yingku_juqing);
        btnYingkuJingsong = (Button) findViewById(R.id.btn_yingku_jingsong);
        btnYingkuZhanzheng = (Button) findViewById(R.id.btn_yingku_zhanzheng);
        btnYingkuFanzui = (Button) findViewById(R.id.btn_yingku_fanzui);
        btnYingkuXuanyi = (Button) findViewById(R.id.btn_yingku_xuanyi);
        btnYingkuMeiguo = (Button) findViewById(R.id.btn_yingku_meiguo);
        btnYingkuDalu = (Button) findViewById(R.id.btn_yingku_dalu);
        btnYingkuRiben = (Button) findViewById(R.id.btn_yingku_riben);
        btnYingkuHanguo = (Button) findViewById(R.id.btn_yingku_hanguo);
        btnYingkuGangtai = (Button) findViewById(R.id.btn_yingku_gangtai);
        tvQuanbufenlei = (TextView) findViewById(R.id.tv_quanbufenlei);
        pbFindYingkuLoading = (ProgressBar) findViewById(R.id.pb_find_yingku_loading);

        btnYingkuDonghua.setOnClickListener(this);
        btnYingkuXiju.setOnClickListener(this);
        btnYingkuKongbu.setOnClickListener(this);
        btnYingkuAiqing.setOnClickListener(this);
        btnYingkuKehuan.setOnClickListener(this);
        btnYingkuDongzuo.setOnClickListener(this);
        btnYingkuJuqing.setOnClickListener(this);
        btnYingkuJingsong.setOnClickListener(this);
        btnYingkuZhanzheng.setOnClickListener(this);
        btnYingkuFanzui.setOnClickListener(this);
        btnYingkuXuanyi.setOnClickListener(this);
        btnYingkuMeiguo.setOnClickListener(this);
        btnYingkuDalu.setOnClickListener(this);
        btnYingkuRiben.setOnClickListener(this);
        btnYingkuHanguo.setOnClickListener(this);
        btnYingkuGangtai.setOnClickListener(this);
    }

    /**
     * Handle button click events<br />
     * <br />
     * Auto-created on 2016-06-30 11:59:38 by Android Layout Finder
     * (http://www.buzzingandroid.com/tools/android-layout-finder)
     */
    @Override
    public void onClick(View v) {
        if (v == btnYingkuDonghua) {
        } else if (v == btnYingkuXiju) {
            // Handle clicks for btnYingkuXiju
        } else if (v == btnYingkuKongbu) {
            // Handle clicks for btnYingkuKongbu
        } else if (v == btnYingkuAiqing) {
            // Handle clicks for btnYingkuAiqing
        } else if (v == btnYingkuKehuan) {
            // Handle clicks for btnYingkuKehuan
        } else if (v == btnYingkuDongzuo) {
            // Handle clicks for btnYingkuDongzuo
        } else if (v == btnYingkuJuqing) {
            // Handle clicks for btnYingkuJuqing
        } else if (v == btnYingkuJingsong) {
            // Handle clicks for btnYingkuJingsong
        } else if (v == btnYingkuZhanzheng) {
            // Handle clicks for btnYingkuZhanzheng
        } else if (v == btnYingkuFanzui) {
            // Handle clicks for btnYingkuFanzui
        } else if (v == btnYingkuXuanyi) {
            // Handle clicks for btnYingkuXuanyi
        } else if (v == btnYingkuMeiguo) {
            // Handle clicks for btnYingkuMeiguo
        } else if (v == btnYingkuDalu) {
            // Handle clicks for btnYingkuDalu
        } else if (v == btnYingkuRiben) {
            // Handle clicks for btnYingkuRiben
        } else if (v == btnYingkuHanguo) {
            // Handle clicks for btnYingkuHanguo
        } else if (v == btnYingkuGangtai) {
            // Handle clicks for btnYingkuGangtai
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_ying_ku);
        findViews();
        initView();
    }


    private void initView() {
        //返回键
        iv_yingku_find.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        //设置显示ProgressBar
        pb_find_yingku_loading.setVisibility(View.VISIBLE);

        list = new ArrayList();
        //加数据 头部
        list.add(UrlUtilsFind.URL_FIND_YINGKU_HEAD);
        //热门口碑
        list.add(UrlUtilsFind.URL_FIND_YINGKU_RMKB);
        //北美票房
        list.add(UrlUtilsFind.URL_BEIMEIPIAOFANG);
        //最受期待3
        list.add(UrlUtilsFind.URL_ZUISHOUQIDAI);
        //top1004
        list.add(UrlUtilsFind.URL_Top100);
        //全球电影奖项5
        list.add( UrlUtils.UrL_DAIYING_RECYLERVIEW);
        //联网请求图片 循环
        for (int i = 0; i < list.size(); i++) {
            getFromNetData001((String) list.get(i), i);
        }

        //每日推荐
        setDataMeiRiTuiJian();


    }


    private void getFromNetData001(String url, final int i) {
        OkHttpUtils
                .get()
                .url(url)
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(Call call, Exception e, int id) {
                    }

                    @Override
                    public void onResponse(String response, int id) {
//                        LogUtil.e("请求成功！！！！" + response);

                        CacheUtils.putString(FindYingKuActivity.this, url_head, response);
                        //解析数据
                        pressData001(response, i);
                    }
                });
    }

    /**
     * 解析并显示数据
     *
     * @param response
     * @param i
     */
    private void pressData001(String response, int i) {
        MyOnClickListener myOnClickListener = new MyOnClickListener();
        if (i == 0) {//顶部图片设置
            pb_find_yingku_loading.setVisibility(View.GONE);
            Gson gson = new Gson();
            YingkuHeaderBean yingkuHeaderBean = gson.fromJson(response, YingkuHeaderBean.class);
            YingkuHeaderBean.DataBean dataBean = yingkuHeaderBean.getData().get(0);
            //设置文字
            tvYingkuTou2.setText(dataBean.getContent());
            tvYingkuTou3.setText("——" + dataBean.getObjectName() + " " + dataBean.getPubDate());
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy年MM月");
            Date curDate = new Date(System.currentTimeMillis());//获取当前时间
            String str = formatter.format(curDate);
            tvYingkuTou1.setText(str);

            //设置图片
            Glide.with(this).load(dataBean.getHorImg())
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                    .into(ivYingkuHeaher);
            ivYingkuHeaher.setScaleType(ImageView.ScaleType.FIT_XY);
            //设置旁边图片
            Glide.with(this).load(dataBean.getImg().replace("w.h", "165.220"))
//                .placeholder(R.drawable.kg)
//                .error(R.drawable.kg)
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                    .into(ivYingkuHeaherSmall);
            ivYingkuHeaherSmall.setScaleType(ImageView.ScaleType.FIT_XY);
            //热门口碑
        }else if(i==1) {
             yingku_reMenKouBeiBean = new Gson().fromJson(response, Yingku_ReMenKouBeiBean.class);
            Yingku_ReMenKouBeiBean.DataBean.MoviesBean moviesBean = yingku_reMenKouBeiBean.getData().getMovies().get(0);

            Glide.with(this).load(moviesBean.getImg().replace("w.h", "165.220"))
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                    .into(ivReyingkoubei);
            tvTeyingkoubei2.setText(moviesBean.getNm());
            //设置点击事件
            llReyingkoubei.setOnClickListener(myOnClickListener);
            //北美票房
        }else if(i==2) {
            Yingku_ReMenKouBeiBean yingku_reMenKouBeiBean = new Gson().fromJson(response, Yingku_ReMenKouBeiBean.class);
            Yingku_ReMenKouBeiBean.DataBean.MoviesBean moviesBean = yingku_reMenKouBeiBean.getData().getMovies().get(0);
            Glide.with(this).load(moviesBean.getImg().replace("w.h", "165.220"))
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                    .into(ivBeimeipiaofang);
            ivBeimeipiaofang.setScaleType(ImageView.ScaleType.FIT_XY);
            tvBeimeipiaofang2.setText(moviesBean.getNm());
            //最受期待
        }else if(i==3) {
            Yingku_ReMenKouBeiBean yingku_reMenKouBeiBean = new Gson().fromJson(response, Yingku_ReMenKouBeiBean.class);
            Yingku_ReMenKouBeiBean.DataBean.MoviesBean moviesBean = yingku_reMenKouBeiBean.getData().getMovies().get(0);
            Glide.with(this).load(moviesBean.getImg().replace("w.h", "165.220"))
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                    .into(ivZuishouqidai);
            ivZuishouqidai.setScaleType(ImageView.ScaleType.FIT_XY);
            tvZuishouqidai2.setText(moviesBean.getNm());
            //Top100
        } else if(i==4) {
            Yingku_ReMenKouBeiBean yingku_reMenKouBeiBean = new Gson().fromJson(response, Yingku_ReMenKouBeiBean.class);
            Yingku_ReMenKouBeiBean.DataBean.MoviesBean moviesBean = yingku_reMenKouBeiBean.getData().getMovies().get(0);
            Glide.with(this).load(moviesBean.getImg().replace("w.h", "165.220"))
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                    .into(ivTop100);
            ivTop100.setScaleType(ImageView.ScaleType.FIT_XY);
            tvTop1002.setText(moviesBean.getNm());
        } else if(i==5) {
            Gson gson = new Gson();
            DaiYIngRcViewBean daiYIngRcViewBean = gson.fromJson(response, DaiYIngRcViewBean.class);
            List<DaiYIngRcViewBean.DataBean.ComingBean> coming = daiYIngRcViewBean.getData().getComing();
            //布局管理器
            rv_find_yingku.setLayoutManager(new FullLinearLayou(this, FullLinearLayou.HORIZONTAL, false));
            rv_find_yingku.setAdapter(new MyFindYingKuAdapter(this, coming));
        }
    }
class MyOnClickListener implements View.OnClickListener {

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.ll_reyingkoubei :
//                yingku_reMenKouBeiBean
                Bundle bundle = new Bundle();
                Intent intent = new Intent(FindYingKuActivity.this,BangDanActivity.class);
                bundle.putSerializable("yk",yingku_reMenKouBeiBean);
                intent.putExtras(bundle);
                startActivity(intent);
                finish();
                break;
        }
    }
}

    //每日推荐
    private void setDataMeiRiTuiJian() {
        Glide.with(this).load("http://p1.meituan.net/movie/ba2386a26648c1875e3fc780950f0ae0144875.jpg.webp@86w_12h_1e_1c_1l")
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(ivTuijian1);
        Glide.with(this).load("http://p0.meituan.net/movie/a714b8a0d9cb0806e89c999b2cd9752e738417.jpg.webp@230w_320h_1e_1c_1l")
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(ivTuijian2);
        Glide.with(this).load("http://p0.meituan.net/movie/7659393df8997cd8ee84428062b41276336380.jpg.webp@230w_320h_1e_1c_1l")
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(ivTuijian3);
    }
}

