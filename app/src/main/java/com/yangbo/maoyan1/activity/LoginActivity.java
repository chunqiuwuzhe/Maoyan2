package com.yangbo.maoyan1.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.yangbo.maoyan1.R;

import org.xutils.common.util.LogUtil;

import java.util.HashMap;

import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.PlatformActionListener;
import cn.sharesdk.framework.ShareSDK;
import cn.sharesdk.sina.weibo.SinaWeibo;

public class LoginActivity extends AppCompatActivity {
    ImageView iv_weixin;
    ImageView iv_qq;
    ImageView iv_weibo;
    ImageView iv_kongjian;
    private MyOnClickListener myOnClickListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        findView();
    }

    private void findView() {
        iv_weixin = (ImageView) findViewById(R.id.iv_weixin);
        iv_qq = (ImageView) findViewById(R.id.iv_qq);
        iv_weibo = (ImageView) findViewById(R.id.iv_weibo);
        iv_kongjian = (ImageView) findViewById(R.id.iv_kongjian);
        myOnClickListener = new MyOnClickListener();
        iv_weixin.setOnClickListener(myOnClickListener);
        iv_qq.setOnClickListener(myOnClickListener);
        iv_weibo.setOnClickListener(myOnClickListener);
        iv_kongjian.setOnClickListener(myOnClickListener);


    }


    class MyOnClickListener implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            ShareSDK.initSDK(LoginActivity.this);
            switch (v.getId()) {
                case R.id.iv_weixin:

                    break;
                case R.id.iv_qq:

                    break;
                case R.id.iv_weibo:

                    Platform weibo = ShareSDK.getPlatform(SinaWeibo.NAME);
                    weibo.setPlatformActionListener(new PlatformActionListener() {
                        @Override
                        public void onComplete(Platform platform, int i, HashMap<String, Object> hashMap) {
                            LogUtil.e("授权成功");
                        }

                        @Override
                        public void onError(Platform platform, int i, Throwable throwable) {
                            LogUtil.e("授权失败");
                        }

                        @Override
                        public void onCancel(Platform platform, int i) {
                            LogUtil.e("授权取消");
                        }
                    });
                    weibo.authorize();
                    //移除授权
//                    weibo.removeAccount(true);
                    break;
                case R.id.iv_kongjian:

                    break;
            }
        }
    }


}
