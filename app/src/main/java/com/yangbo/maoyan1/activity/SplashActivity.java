package com.yangbo.maoyan1.activity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.Window;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.google.gson.Gson;
import com.yangbo.maoyan1.R;
import com.yangbo.maoyan1.bean.SplashBean;
import com.yangbo.maoyan1.utils.UrlUtils;

import org.xutils.common.Callback;
import org.xutils.common.util.LogUtil;
import org.xutils.http.RequestParams;
import org.xutils.image.ImageOptions;
import org.xutils.x;

import java.util.List;

/**
 * Created by yangbo on 2016/6/22.
 */
public class SplashActivity extends Activity{

    private ImageView iv_splash;

    private RelativeLayout rl_splash;
    String result1;

    private Handler handler = new Handler(){
        public void handleMessage(Message msg){
            switch (msg.what) {
                case 1 :
                    handler.removeCallbacksAndMessages(null);

                    startActivity(new Intent(SplashActivity.this,MainActivity.class));
                    finish();
                    break;
                case 2:
                    handler.removeCallbacksAndMessages(null);
                    iv_splash.setVisibility(View.VISIBLE);
                    processData(result1);
                    ScaleAnimation scaleAnimation = new ScaleAnimation(1,1.1f,1,1.1f, Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.8f);
                    scaleAnimation.setDuration(2000);
                    iv_splash.startAnimation(scaleAnimation);
                    sendEmptyMessageDelayed(1,2000);
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        rl_splash = (RelativeLayout)findViewById(R.id.rl_splash);
        iv_splash = (ImageView)findViewById(R.id.iv_splash);
        handler.sendEmptyMessageDelayed(1,2000);

        AlphaAnimation alphaAnimation = new AlphaAnimation(0, 1);

        rl_splash.startAnimation(alphaAnimation);

        getDataFromNet();

    }

    private void getDataFromNet() {
        String url = UrlUtils.URL_SPLASH;
        RequestParams params = new RequestParams(url);
//        params.addQueryStringParameter("wd", "xUtils");
        x.http().get(params, new Callback.CommonCallback<String>() {
            @Override
            public void onSuccess(String result) {
                LogUtil.e("请求成功"+result);
                result1 = result;
                handler.sendEmptyMessageDelayed(2,1000);



            }

            @Override
            public void onError(Throwable ex, boolean isOnCallback) {
                LogUtil.e("请求失败");
            }

            @Override
            public void onCancelled(CancelledException cex) {

            }

            @Override
            public void onFinished() {

            }
        });
    }

    private void processData(String result) {
        Gson gson = new Gson();
        String pic = "";
        SplashBean splashBean = gson.fromJson(result, SplashBean.class);
        if(splashBean!=null) {
            List<SplashBean.PostersBean> posters = splashBean.getPosters();
            if(posters!=null) {
                pic =   posters.get(0).getPic();
            }

        }


        LogUtil.e(pic);
        // 设置加载图片的参数
        ImageOptions options = new ImageOptions.Builder()
                // 是否忽略GIF格式的图片
                .setIgnoreGif(false)
                // 图片缩放模式
                .setImageScaleType(ImageView.ScaleType.CENTER_CROP)
                // 下载中显示的图片
//                .setLoadingDrawableId(R.drawable.y9)
                // 下载失败显示的图片
//                .setFailureDrawableId(R.drawable.yc)
                // 得到ImageOptions对象
                .build();
        // 加载图片
        x.image().bind(iv_splash, pic, options, new Callback.CommonCallback<Drawable>() {
            @Override
            public void onSuccess(Drawable arg0) {
                LogUtil.e("jiazao成功");
            }
            @Override
            public void onFinished() {
                LogUtil.e("下载完成");
            }
            @Override
            public void onError(Throwable arg0, boolean arg1) {
                LogUtil.e("下载出错，" + arg0.getMessage());
            }
            @Override
            public void onCancelled(CancelledException arg0) {
                LogUtil.e("下载取消");
            }
        });

    }
}
