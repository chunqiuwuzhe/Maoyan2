package com.yangbo.maoyan1.fragment;

import android.content.Intent;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.gson.Gson;
import com.yangbo.maoyan1.R;
import com.yangbo.maoyan1.activity.H5FindActivity;
import com.yangbo.maoyan1.adapter.MyFindAdapter;
import com.yangbo.maoyan1.base.BaseFragment;
import com.yangbo.maoyan1.bean.FindListBean;
import com.yangbo.maoyan1.bean.FindViewPagerBean;
import com.yangbo.maoyan1.refresh.PRecycleview;
import com.yangbo.maoyan1.utils.CacheUtils;
import com.yangbo.maoyan1.utils.UrlUtilsFind;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import java.util.List;

import okhttp3.Call;


/**
 * Created by yangbo on 2016/6/22.
 */
public class FindFragment extends BaseFragment {
    private PRecycleview rv_find;
    //list的数据
    private String url;
    private String url2;
    private MyFindAdapter myFindAdapter;
    private ProgressBar pb_loading;

//    public FindFragment(Context context) {
//        super();
//    }

    @Override
    public View initView() {

        View view = View.inflate(context, R.layout.fragment_find,null);
        rv_find = (PRecycleview) view.findViewById(R.id.rv_find);
        pb_loading = (ProgressBar) view.findViewById(R.id.pb_loading123);
        pb_loading.setVisibility(View.VISIBLE);
        //设置布局管理器
        rv_find.setLayoutManager(new LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false));
        //设置适配器
       myFindAdapter = new MyFindAdapter(context);
        rv_find.setAdapter(myFindAdapter);
        rv_find.setRefreshAndLoadMoreListener(new PRecycleview.OnRefreshAndLoadMoreListener() {
            @Override
            public void onRefresh() {
                getListDataFromNet();


            }
            @Override
            public void onLoadMore() {
                rv_find.setloadMoreComplete();
                Toast.makeText(context, "loadmore", Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }

    @Override
    public void initDate() {
        super.initDate();

        url = UrlUtilsFind.URL_FIND_LIST;
//        String string = CacheUtils.getString(context, url);
//        if(!TextUtils.isEmpty(string)) {
//            processData(string);
//        }

        url2 = UrlUtilsFind.URL_FIND_VIEWPAGER;
//        String string1 = CacheUtils.getString(context, url2);
//        if(!TextUtils.isEmpty(string1)) {
//            processData(string1);
//        }
        getListDataFromNet();
    }

    private void getListDataFromNet() {
        //list的数据
        OkHttpUtils
                .get()
                .url(url)
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(Call call, Exception e, int id) {
                        rv_find.setReFreshComplete();
                    }

                    @Override
                    public void onResponse(String response, int id) {
//                        LogUtil.e("请求成功！！！！" + response);
                        //存储
                        rv_find.setReFreshComplete();
                        pb_loading.setVisibility(View.GONE);
                        CacheUtils.putString(context, url,response);
                        //解析数据
                        processData(response);
                    }
                });


        OkHttpUtils
                .get()
                .url(url2)
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(Call call, Exception e, int id) {

                    }

                    @Override
                    public void onResponse(String response, int id) {

//                        LogUtil.e("请求成功！！！！" + response);
                        //存储
                        CacheUtils.putString(context, url2,response);
                        //解析数据
                        processpagerData(response);
                    }
                });
    }

    private void processData(String response) {
        FindListBean findListBean = new Gson().fromJson(response, FindListBean.class);
        final List<FindListBean.DataBean.FeedsBean> feeds = findListBean.getData().getFeeds();

        //把数据传递给适配器，并刷新适配器
        myFindAdapter.setFeeds(feeds);
        myFindAdapter.notifyItemRangeChanged(2,feeds.size());
        //设置item的点击事件
        myFindAdapter.setOnItemClickListener(new MyFindAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View v, int layoutPosition) {
                int targetId = feeds.get(layoutPosition - 2).getImages().get(0).getTargetId();
                String urlFindListH5 = UrlUtilsFind.URL_FIND_LIST_H5.replace("12498",targetId+"");
                Intent intent = new Intent(context, H5FindActivity.class);
                intent.putExtra("url",urlFindListH5);
                startActivity(intent);
            }
        });
    }
    private void processpagerData(String response) {
        FindViewPagerBean findViewPagerBean = new Gson().fromJson(response, FindViewPagerBean.class);
//        findViewPagerBean.getData().get(1).getImgUrl();
        List<FindViewPagerBean.DataBean> datas = findViewPagerBean.getData();
        if(datas!=null){
            myFindAdapter.setDatas(datas);
            myFindAdapter.notifyItemRangeChanged(1,1);
        }
    }
}
