package com.yangbo.maoyan1.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.ProgressBar;

import com.yangbo.maoyan1.R;

public class H5FindActivity extends Activity {
   ImageView iv_h5_find;
    WebView wv_find;
    ProgressBar pb_find_web_loading;
    private String url;
    private WebSettings settings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_h5_find);

        wv_find = (WebView)findViewById(R.id.wv_find);
        pb_find_web_loading = (ProgressBar)findViewById(R.id.pb_find_web_loading);
        iv_h5_find = (ImageView)findViewById(R.id.iv_h5_find);

        initView();
    }

    private void initView() {

        /**
         * 加载H5页面
         */
        url = getIntent().getStringExtra( "url");
        wv_find .loadUrl(url) ;
        settings = wv_find .getSettings();
//设置WebView 支持javaScript
        settings.setJavaScriptEnabled(true );
//用户双击页面页面变大变小 -页面要支持才可以
        settings.setUseWideViewPort(true );
//增加缩放按钮 --页面要支持才可以
        settings.setBuiltInZoomControls(true );

//        pb_find_web_loading.setVisibility(View.GONE);
        wv_find .setWebViewClient(new WebViewClient(){
            @Override
            public void onPageFinished(WebView view, String url) {
                super .onPageFinished(view, url) ;

                pb_find_web_loading .setVisibility(View.GONE) ;
            }
        });



        iv_h5_find.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}
