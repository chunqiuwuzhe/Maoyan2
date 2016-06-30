package com.yangbo.maoyan1.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

import com.yangbo.maoyan1.R;
import com.yangbo.maoyan1.utils.UrlUtils;

public class ShopH5Activity extends Activity {
    private WebView webview;
    private ProgressBar progressBar;
    private WebSettings webSettings;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop_h5);

        progressBar = (ProgressBar)findViewById(R.id.progressBar);
        webview = (WebView) findViewById(R.id.webview);

        int id= getIntent().getIntExtra("id", 0);
        String url="";
        if(id==1){
            url= UrlUtils.URL_SHOP_MONTH1;
        }else if(id==2){
            url= UrlUtils.URL_SHOP_MONTH2;
        }else if(id==3){
            url= UrlUtils.URL_SHOP_MONTH3;
        }else if(id==4){
            url= UrlUtils.URL_SHOP_MONTH4;
        }else if(id==5){
            url= UrlUtils.URL_SHOP_MONTH5;
        }else if(id==6){
            url= UrlUtils.URL_SHOP_MONTH6;
        }
        HtmlPage(url);
    }

    private void HtmlPage(String url) {
        webview.loadUrl(url);

        webSettings = webview.getSettings();
        //设置WebView支持javaScript
        webSettings.setJavaScriptEnabled(true);
        //用户双击页面页面变大变小-页面要支持才可以
        webSettings.setUseWideViewPort(true);
        //增加缩放按钮 --页面要支持才可以
        webSettings.setBuiltInZoomControls(true);

        webview.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);

                progressBar.setVisibility(View.GONE);
            }
        });
    }
}
