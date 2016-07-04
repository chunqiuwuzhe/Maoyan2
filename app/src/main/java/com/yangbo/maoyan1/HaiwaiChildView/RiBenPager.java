package com.yangbo.maoyan1.HaiwaiChildView;

import android.content.Context;
import android.os.Handler;
import android.support.v7.widget.LinearLayoutManager;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.gson.Gson;
import com.yangbo.maoyan1.R;
import com.yangbo.maoyan1.adapter.HwaiRibenAdapter;
import com.yangbo.maoyan1.base.BaseFireFragment;
import com.yangbo.maoyan1.bean.HaiWaiRiBenBean;
import com.yangbo.maoyan1.refresh.PRecycleview;
import com.yangbo.maoyan1.ui.RecyclerViewItemDecoration;
import com.yangbo.maoyan1.utils.UrlUtils;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import java.util.List;

import okhttp3.Call;

/**
 * Created by sdf on 2016/6/25.
 */
public class RiBenPager extends BaseFireFragment implements PRecycleview.OnRefreshAndLoadMoreListener {
    private PRecycleview lv_riben;

    private List<HaiWaiRiBenBean.DataBean.HotBean> hot;

    private ProgressBar progressBar;
    private LinearLayout ll_flush;
    private Button btn_flush;

    public RiBenPager(Context context) {
        super(context);
    }

    @Override
    public View initView() {
        View view=View.inflate(context, R.layout.haiwai_riebn_pager,null);
        progressBar = (ProgressBar) view.findViewById(R.id.progressBar);
        ll_flush = (LinearLayout) view.findViewById(R.id.ll_flush);
        lv_riben = (PRecycleview) view.findViewById(R.id.lv_riben);
        //设置刷新监听
        lv_riben.setRefreshAndLoadMoreListener(this);
        btn_flush = (Button) view.findViewById(R.id.btn_flush);

        btn_flush.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                initData();
            }
        });
        return view;
    }

    @Override
    public void initData() {
        super.initData();
        progressBar.setVisibility(View.VISIBLE);
        ll_flush.setVisibility(View.GONE);
        //联网获取viewpager数据
        OkHttpUtils
                .get()
                .url(UrlUtils.URL_HAIWAI_RB_LV)
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(Call call, Exception e, int id) {
                        Log.e("TAG", "ListView日本数据请求失败" + e.getMessage());
                        ll_flush.setVisibility(View.VISIBLE);
                        progressBar.setVisibility(View.GONE);
                    }

                    @Override
                    public void onResponse(String response, int id) {
                        Log.e("TAG", "ListView日本数据请求成功");
                        Log.e("TAG--response", response);
                        parselvData(response);
                        progressBar.setVisibility(View.GONE);
                    }
                });
    }

    private void parselvData(String data) {
        HaiWaiRiBenBean riBenBean = parseJson(data);
        hot = riBenBean.getData().getHot();
        if(hot!=null&&hot.size()>0){
            HwaiRibenAdapter ribenAdapter = new HwaiRibenAdapter(context);
            ribenAdapter.setArrhot(hot);
            lv_riben.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false));
            //加分割线
            lv_riben.addItemDecoration(new RecyclerViewItemDecoration(RecyclerViewItemDecoration.MODE_HORIZONTAL, "#22000000", 0, 1, 0));
            lv_riben.setAdapter(ribenAdapter);
        }

    }

    private HaiWaiRiBenBean parseJson(String json) {
        Gson gson=new Gson();
        HaiWaiRiBenBean haiWaiRiBenBean = gson.fromJson(json, HaiWaiRiBenBean.class);
        return haiWaiRiBenBean;
    }

    private Handler handler=new Handler();
    @Override
    public void onRefresh() {
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                lv_riben.setReFreshComplete();
                Toast.makeText(context, "刷新完成", Toast.LENGTH_SHORT).show();
            }
        },2000);
    }

    @Override
    public void onLoadMore() {
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                lv_riben.setloadMoreComplete();
                Toast.makeText(context, "加载完成", Toast.LENGTH_SHORT).show();
            }
        },2000);
    }
}
