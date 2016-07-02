package com.yangbo.maoyan1.activity;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.widget.LinearLayoutManager;
import android.util.Log;
import android.view.Window;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.yangbo.maoyan1.R;
import com.yangbo.maoyan1.adapter.ShapCityAdapter;
import com.yangbo.maoyan1.bean.ShopBean;
import com.yangbo.maoyan1.bean.ShopCityVpBean;
import com.yangbo.maoyan1.refresh.PRecycleview;
import com.yangbo.maoyan1.utils.UrlUtils;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import java.util.List;

import okhttp3.Call;

public class MyShopCityActivity extends Activity implements PRecycleview.OnRefreshAndLoadMoreListener {
    private PRecycleview rcl_shop_city;
    private ImageView iv_back,iv_sousuo;

    private List<ShopCityVpBean.DataBean> beans;
    private  ShapCityAdapter shapAdapter;

    List<ShopBean.DataBean.ListBean> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_my_shop_city);
        rcl_shop_city = (PRecycleview) findViewById(R.id.rcl_shop_city);
        iv_back = (ImageView)findViewById(R.id.iv_back);
        iv_sousuo = (ImageView)findViewById(R.id.iv_sousuo);
        //联网请求数据
        getHttpVP();
        //设置布局管理器
        rcl_shop_city.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        shapAdapter=new ShapCityAdapter(this);
        rcl_shop_city.setAdapter(shapAdapter);
        //设置刷新监听
        rcl_shop_city.setRefreshAndLoadMoreListener(this);
        //商城数据
        setData();
    }

    private void setData() {
        Gson gson=new Gson();
        ShopBean shopBean = gson.fromJson(UrlUtils.SHOP_DATA, ShopBean.class);
        list = shopBean.getData().getList();
        if(list!=null&&list.size()>0){
            shapAdapter.setList(list);
            shapAdapter.notifyItemRangeChanged(5,6);
        }

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
            shapAdapter.notifyItemRangeChanged(1,0);
        }
    }

    private ShopCityVpBean parseJson(String json) {
        Gson gson=new Gson();
        ShopCityVpBean cityVpBean = gson.fromJson(json, ShopCityVpBean.class);
        return cityVpBean;
    }
    private Handler handler=new Handler();
    @Override
    public void onRefresh() {
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                //设置刷新完成
                rcl_shop_city.setReFreshComplete();
                Toast.makeText(MyShopCityActivity.this, "刷新完成", Toast.LENGTH_SHORT).show();
            }
        },4000);
    }

    @Override
    public void onLoadMore() {
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
//                加载完成
                rcl_shop_city.setloadMoreComplete();
                Toast.makeText(MyShopCityActivity.this, "加载完成", Toast.LENGTH_SHORT).show();
            }
        },4000);
    }
}
