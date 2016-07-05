package com.yangbo.maoyan1.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.yangbo.maoyan1.R;

import org.xutils.common.util.LogUtil;

import java.util.HashMap;

import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.PlatformActionListener;
import cn.sharesdk.framework.PlatformDb;
import cn.sharesdk.framework.ShareSDK;
import cn.sharesdk.sina.weibo.SinaWeibo;
import cn.sharesdk.tencent.qq.QQ;
import cn.sharesdk.tencent.qzone.QZone;
import cn.sharesdk.wechat.friends.Wechat;

public class LoginActivity extends Activity {
    ImageView iv_weixin;
    ImageView iv_qq;
    ImageView iv_weibo;
    ImageView iv_kongjian;
    ImageView iv_back;
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
        iv_back = (ImageView)findViewById(R.id.iv_back);
        myOnClickListener = new MyOnClickListener();
        iv_weixin.setOnClickListener(myOnClickListener);
        iv_qq.setOnClickListener(myOnClickListener);
        iv_weibo.setOnClickListener(myOnClickListener);
        iv_kongjian.setOnClickListener(myOnClickListener);
        iv_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }


    class MyOnClickListener implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            ShareSDK.initSDK(LoginActivity.this);
            Platform weibo = null;
            switch (v.getId()) {
                case R.id.iv_weixin:
                    weibo = ShareSDK.getPlatform(Wechat.NAME);
                    break;
                case R.id.iv_qq:
                    weibo = ShareSDK.getPlatform(LoginActivity.this,QQ.NAME);
                    break;
                case R.id.iv_weibo:

                    weibo = ShareSDK.getPlatform(SinaWeibo.NAME);

                    break;
                case R.id.iv_kongjian:
                    weibo = ShareSDK.getPlatform(QZone.NAME);
                    break;
            }
            weibo.setPlatformActionListener(new PlatformActionListener() {
                @Override
                public void onComplete(Platform platform, int action, HashMap<String, Object> res) {
                    LogUtil.e("授权成功"+res.toString());
                    String id,name,description,profile_image_url;
//                    id=res.get("id").toString();//ID
                    name=res.get("nickname").toString();//用户名
//                    description=res.get("description").toString();//描述
//                    profile_image_url=res.get("profile_image_url").toString();//头像链接
//                    String str="ID: "+id+";\n"+
//                            "用户名： "+name+";\n"+
//                            "描述："+description+";\n"+
//                            "用户头像地址："+profile_image_url;
                    LogUtil.e("用户资料: "+name);
                    //通过打印res数据看看有哪些数据是你想要的
                    if (action == Platform.ACTION_USER_INFOR) {
                        PlatformDb platDB = platform.getDb();//获取数平台数据DB
                        //通过DB获取各种数据
                        String token = platDB.getToken();
                        platDB.getUserGender();
                        platDB.getUserIcon();
                        String userId = platDB.getUserId();
                        platDB.getUserName();
                        LogUtil.e("userId="+userId+"##token="+token);
                    }
                    Intent intent = getIntent();
                    intent.putExtra("name",name);
                    setResult(3,intent);
                    finish();

                }

                @Override
                public void onError(Platform platform, int i, Throwable throwable) {
                    LogUtil.e("授权失败"+throwable);
                }

                @Override
                public void onCancel(Platform platform, int i) {
                    LogUtil.e("授权取消");
                }
            });
            weibo.authorize();
            //移除授权
//                    weibo.removeAccount(true);

            weibo.showUser(null);//执行登录，登录后在回调里面获取用户资料
//weibo.showUser(“3189087725”);//获取账号为“3189087725”的资料
        }
    }


}
