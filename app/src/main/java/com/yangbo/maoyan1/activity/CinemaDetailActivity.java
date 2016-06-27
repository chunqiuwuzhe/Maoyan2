package com.yangbo.maoyan1.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.yangbo.maoyan1.R;

public class CinemaDetailActivity extends Activity {

    ImageView iv_cinema_detail_back;
    TextView tv_cinema_detail_name;
    ImageView iv_cinema_detail_search;
    private String url;
    WebView wv_cinema_detail;
    ProgressBar pb_loading;
    private WebSettings settings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cinema_detail);

        iv_cinema_detail_back = (ImageView)findViewById(R.id.iv_cinema_detail_back);
        tv_cinema_detail_name = (TextView)findViewById(R.id.tv_cinema_detail_name);
        iv_cinema_detail_search = (ImageView)findViewById(R.id.iv_cinema_detail_search);
        wv_cinema_detail = (WebView)findViewById(R.id.wv_cinema_detail);
        pb_loading = (ProgressBar)findViewById(R.id.pb_loading);

        url = getIntent().getStringExtra("url");
        wv_cinema_detail.loadUrl(url);
        settings = wv_cinema_detail.getSettings();
        //设置WebView支持javaScript
        settings.setJavaScriptEnabled(true);
        //用户双击页面页面变大变小-页面要支持才可以
        settings.setUseWideViewPort(true);
        //增加缩放按钮 --页面要支持才可以
        settings.setBuiltInZoomControls(true);

        pb_loading.setVisibility(View.GONE);
        wv_cinema_detail.setWebViewClient(new WebViewClient(){
            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);

                pb_loading.setVisibility(View.GONE);
            }
        });

        iv_cinema_detail_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

}
