package com.yangbo.maoyan1.pager;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.cjj.MaterialRefreshLayout;
import com.cjj.MaterialRefreshListener;
import com.google.gson.Gson;
import com.yangbo.maoyan1.R;
import com.yangbo.maoyan1.adapter.Rcl_Reying_Adapter;
import com.yangbo.maoyan1.base.BasePager;
import com.yangbo.maoyan1.bean.ReYingListViewBean;
import com.yangbo.maoyan1.bean.ReYing_ViewPager_bean;
import com.yangbo.maoyan1.ui.RecyclerViewItemDecoration;
import com.yangbo.maoyan1.utils.UrlUtils;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import java.util.List;

import okhttp3.Call;


/**
 * Created by yangbo on 2016/6/22.
 */
public class ReYingPager extends BasePager {
//    View recylerViewlist= LayoutInflater.from(context).inflate( R.layout.pager_reying,parent,false);

    private RecyclerView rlv_reying;
    //布局管理器
    private LinearLayoutManager manager;
    //适配器
    private Rcl_Reying_Adapter rcl_adapter;
    //json数据
    private List<ReYing_ViewPager_bean.DataBean> vp_data;

    private String url_vp;
    private List<ReYingListViewBean.DataBean.HotBean> lv_movies;

    private String url_listview;

    private MaterialRefreshLayout materialrefresh;


    public ReYingPager(Context context) {
        super(context);
    }

    @Override
    public View initView() {

        View recylerViewlist=View.inflate(context,R.layout.reying_rv_paer,null);
        rlv_reying = (RecyclerView) recylerViewlist.findViewById(R.id.rlv_reying);
        materialrefresh = (MaterialRefreshLayout) recylerViewlist.findViewById(R.id.materialrefresh);
        setData();

        //设置布局管理器
        manager = new LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false);
        rlv_reying.setLayoutManager(manager);
        //加分割线
        rlv_reying.addItemDecoration(new RecyclerViewItemDecoration(RecyclerViewItemDecoration.MODE_HORIZONTAL, "#44000000", 0, 1, 0));
        rcl_adapter=new Rcl_Reying_Adapter(context);
        rlv_reying.setAdapter(rcl_adapter);
        //刷新
        materialrefresh.setSunStyle(true);
        materialrefresh.setMaterialRefreshListener(new MaterialRefreshListener() {
            @Override
            public void onRefresh(final MaterialRefreshLayout materialRefreshLayout) {
                materialRefreshLayout.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        materialRefreshLayout.finishRefresh();
                    }
                }, 3000);
            }
            @Override
            public void onfinish() {
                Toast.makeText(context, "finish", Toast.LENGTH_LONG).show();
            }
        });
        return recylerViewlist;
    }
    /*
    * 获取数据
    * */
    private void setData() {
        Log.e("TAG", "VIewPager数据请求数据");
        url_vp = UrlUtils.URL_REYING_VIEWPAGER;
        url_listview=UrlUtils.URL_REYING_LISTVIEW;
        //联网获取viewpager数据
        OkHttpUtils
                .get()
                .url(url_vp)
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(Call call, Exception e, int id) {
                        Log.e("TAG", "VIewPager数据请求失败" + e.getMessage());
                    }

                    @Override
                    public void onResponse(String response, int id) {
                        Log.e("TAG", "VIewPager数据请求成功");
                        parseViewPagerData(response);
                    }
                });
        //联网获取listview数据
        OkHttpUtils
                .get()
                .url(url_listview)
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(Call call, Exception e, int id) {
                        Log.e("TAG", "LIstView数据请求失败" + e.getMessage());
                    }

                    @Override
                    public void onResponse(String response, int id) {
                        Log.e("TAG", "LIstView数据请求成功");
                        Log.e("TAG:LIstView数据请求成功+++", response);
                        parseListViewData(response);
                    }
                });


    }
    /*
    * 解析ListVIew数据
    * */
    private void parseListViewData(String data) {
        ReYingListViewBean reYingListViewBean = parseLVJson(data);
        lv_movies = reYingListViewBean.getData().getHot();
        if(lv_movies.size()>0&&lv_movies!=null){
            //设置适配器
            rcl_adapter.setLv_movies(lv_movies);
            rcl_adapter.notifyItemRangeChanged(1, lv_movies.size());
        }
    }
    /*
    * 解析listViewjson
    * */
    private ReYingListViewBean parseLVJson(String json) {
        Gson gson=new Gson();
        ReYingListViewBean listViewBean = gson.fromJson(json, ReYingListViewBean.class);
        return listViewBean;
    }

    //解析viewpager数据
    private void parseViewPagerData(String data) {
        ReYing_ViewPager_bean jsonObject = parseVPJson(data);
        vp_data = jsonObject.getData();
        //设置适配器
        if(vp_data!=null&&vp_data.size()>0){
            rcl_adapter.setArr(vp_data);
            rcl_adapter.notifyItemRangeChanged(0, 1);
        }

    }
    //解析viewpagerJson
    private ReYing_ViewPager_bean parseVPJson(String json) {
        Gson gson=new Gson();
        ReYing_ViewPager_bean data = gson.fromJson(json, ReYing_ViewPager_bean.class);
        return data;
    }
}
