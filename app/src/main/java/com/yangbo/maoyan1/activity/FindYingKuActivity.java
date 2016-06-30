package com.yangbo.maoyan1.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.ProgressBar;

import com.yangbo.maoyan1.R;
import com.yangbo.maoyan1.adapter.MyFindYingKuAdapter;
import com.yangbo.maoyan1.utils.CacheUtils;
import com.yangbo.maoyan1.utils.UrlUtilsFind;
import com.yangbo.maoyan1.view.FullLinearLayou;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import org.xutils.common.util.LogUtil;

import okhttp3.Call;

public class FindYingKuActivity extends Activity {

    private ImageView iv_yingku_find;
    private ProgressBar pb_find_yingku_loading;
    private RecyclerView rv_find_yingku;
    //头部图片url
    private String url_head;
    private String url_RMKB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_ying_ku);
        findView();
        initView();
    }

    private void findView() {
        iv_yingku_find = (ImageView) findViewById(R.id.iv_yingku_find);
        rv_find_yingku = (RecyclerView) findViewById(R.id.rv_find_yingku);
        pb_find_yingku_loading = (ProgressBar) findViewById(R.id.pb_find_yingku_loading);
    }

    private void initView() {
        //布局管理器
        rv_find_yingku.setLayoutManager(new FullLinearLayou(this, FullLinearLayou.HORIZONTAL, false));


        rv_find_yingku.setAdapter(new MyFindYingKuAdapter(this));
        iv_yingku_find.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        getDataFromNet();
    }


    private void getDataFromNet() {
        url_head = UrlUtilsFind.URL_FIND_YINGKU_HEAD;


        OkHttpUtils
                .get()
                .url(url_head)
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(Call call, Exception e, int id) {
                    }

                    @Override
                    public void onResponse(String response, int id) {
                        LogUtil.e("请求成功！！！！" + response);

                        CacheUtils.putString(FindYingKuActivity.this, url_head, response);
                        //解析数据
                        processHeadData(response);
                    }
                });

        url_RMKB = UrlUtilsFind.URL_FIND_YINGKU_RMKB;
        OkHttpUtils
                .get()
                .url(url_RMKB)
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(Call call, Exception e, int id) {
                    }

                    @Override
                    public void onResponse(String response, int id) {
                        LogUtil.e("请求成功！！！！" + response);

                        CacheUtils.putString(FindYingKuActivity.this, url_RMKB, response);
                        //解析数据
                        processRMKBData(response);
                    }
                });
    }

    private void processHeadData(String response) {

    }

    private void processRMKBData(String response) {

    }
}

