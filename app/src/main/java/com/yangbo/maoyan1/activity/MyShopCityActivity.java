package com.yangbo.maoyan1.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Window;
import android.widget.ImageView;

import com.google.gson.Gson;
import com.yangbo.maoyan1.R;
import com.yangbo.maoyan1.adapter.ShapCityAdapter;
import com.yangbo.maoyan1.bean.ShopCityVpBean;
import com.yangbo.maoyan1.utils.UrlUtils;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import java.util.List;

import okhttp3.Call;

public class MyShopCityActivity extends Activity {
    private RecyclerView rcl_shop_city;
    private ImageView iv_back,iv_sousuo;

    private List<ShopCityVpBean.DataBean> beans;
    private  ShapCityAdapter shapAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_my_shop_city);
        rcl_shop_city = (RecyclerView)findViewById(R.id.rcl_shop_city);
        iv_back = (ImageView)findViewById(R.id.iv_back);
        iv_sousuo = (ImageView)findViewById(R.id.iv_sousuo);
        //联网请求数据
        getHttpVP();
        //设置布局管理器
        rcl_shop_city.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        shapAdapter=new ShapCityAdapter(this);
        rcl_shop_city.setAdapter(shapAdapter);
    }

    public void getHttpVP() {
        //联网获取viewpager数据
        OkHttpUtils
                .get()
                .url(UrlUtils.URL_SHOP_VP)

                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(Call call, Exception e, int id) {
                        Log.e("TAG", "商城VIewPager数据请求失败" + e.getMessage());
                    }

                    @Override
                    public void onResponse(String response, int id) {
                        Log.e("TAG", "商城VIewPager数据请求成功");
                        parseData(response);
                    }
                });
    }

    private void parseData(String data) {
        ShopCityVpBean cityVpBean = parseJson(data);
        beans = cityVpBean.getData();
        if(beans!=null&&beans.size()>0){
            shapAdapter.setBeans(beans);
            shapAdapter.notifyItemRangeChanged(0,1);
        }
    }

    private ShopCityVpBean parseJson(String json) {
        Gson gson=new Gson();
        ShopCityVpBean cityVpBean = gson.fromJson(json, ShopCityVpBean.class);
        return cityVpBean;
    }
}
