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
import com.yangbo.maoyan1.adapter.HaiWaiHanGuoAdapter;
import com.yangbo.maoyan1.base.BaseFireFragment;
import com.yangbo.maoyan1.bean.HanGuoBean;
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
public class HanguoPager extends BaseFireFragment implements PRecycleview.OnRefreshAndLoadMoreListener {
    private PRecycleview lv_hanguo;

    private List<HanGuoBean.DataBean.HotBean> arrhot;

    private ProgressBar progressBar;
    private Button btn_flush;
    private LinearLayout ll_flush;

    public HanguoPager(Context context) {
        super(context);
    }

    @Override
    public View initView() {
        View view=View.inflate(context, R.layout.haiwai_hanguo_pager, null);
        lv_hanguo = (PRecycleview) view.findViewById(R.id.lv_hanguo);
        //设置刷新监听
        lv_hanguo.setRefreshAndLoadMoreListener(this);
        progressBar = (ProgressBar) view.findViewById(R.id.progressBar);
        ll_flush = (LinearLayout) view.findViewById(R.id.ll_flush);
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
                .url(UrlUtils.URL_HAIWAI_HG_LV)
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(Call call, Exception e, int id) {
                        Log.e("TAG", "ListView韩国数据请求失败" + e.getMessage());
                        ll_flush.setVisibility(View.VISIBLE);
                        progressBar.setVisibility(View.GONE);
                    }

                    @Override
                    public void onResponse(String response, int id) {
                        Log.e("TAG", "ListView韩国数据请求成功");
                        Log.e("TAG--response", response);
                        parselvData(response);
                        progressBar.setVisibility(View.GONE);
                    }
                });
    }

    private void parselvData(String data) {
        HanGuoBean hanGuoBean = parseJson(data);
        arrhot = hanGuoBean.getData().getHot();
        if(arrhot!=null&&arrhot.size()>0){
            HaiWaiHanGuoAdapter hwH=new HaiWaiHanGuoAdapter(context);
            hwH.setArrhot(arrhot);
            lv_hanguo.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false));
            //加分割线
            lv_hanguo.addItemDecoration(new RecyclerViewItemDecoration(RecyclerViewItemDecoration.MODE_HORIZONTAL, "#22000000", 0, 1, 0));
            lv_hanguo.setAdapter(hwH);
        }
    }

    private HanGuoBean parseJson(String json) {
        Gson gosn=new Gson();
        HanGuoBean hanGuoBean = gosn.fromJson(json, HanGuoBean.class);
        return hanGuoBean;
    }
    private Handler handler=new Handler();
    @Override
    public void onRefresh() {
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                lv_hanguo.setReFreshComplete();
                Toast.makeText(context, "刷新完成", Toast.LENGTH_SHORT).show();
            }
        },2000);
    }

    @Override
    public void onLoadMore() {
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                lv_hanguo.setloadMoreComplete();
                Toast.makeText(context, "加载完成", Toast.LENGTH_SHORT).show();
            }
        },2000);
    }
}
