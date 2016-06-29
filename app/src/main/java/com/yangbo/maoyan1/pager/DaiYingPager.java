package com.yangbo.maoyan1.pager;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.google.gson.Gson;
import com.yangbo.maoyan1.R;
import com.yangbo.maoyan1.adapter.Rcl_Daiying_Adapter;
import com.yangbo.maoyan1.base.BasePager;
import com.yangbo.maoyan1.bean.DaiYIngRcViewBean;
import com.yangbo.maoyan1.ui.RecyclerViewItemDecoration;
import com.yangbo.maoyan1.utils.UrlUtils;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import java.util.ArrayList;
import java.util.List;

import okhttp3.Call;


/**
 * Created by yangbo on 2016/6/22.
 */
public class DaiYingPager extends BasePager {
//    View recylerViewlist= LayoutInflater.from(context).inflate( R.layout.pager_reying,parent,false);

    private RecyclerView rlv_daiying;
    //布局管理器
    private LinearLayoutManager manager;
    //适配器
    private Rcl_Daiying_Adapter rcl_adapter;
    //假数据
    private ArrayList<ImageView> arr;

    private View progressBar;
    private Button btn_flush;
    private LinearLayout ll_flush;

    private List<DaiYIngRcViewBean.DataBean.ComingBean> coming;

    public DaiYingPager(Context context) {
        super(context);
    }

    @Override
    public View initView() {
        View recylerViewlist=View.inflate(context, R.layout.daiying_rv_paer, null);
        progressBar = recylerViewlist.findViewById(R.id.progressBar);
        rlv_daiying = (RecyclerView) recylerViewlist.findViewById(R.id.rlv_daiying);

        ll_flush = (LinearLayout) recylerViewlist.findViewById(R.id.ll_flush);
        btn_flush = (Button) recylerViewlist.findViewById(R.id.btn_flush);
        btn_flush.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                initData();
            }
        });

        //设置布局管理器
        manager = new LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false);
        rlv_daiying.setLayoutManager(manager);
        //加分割线
        rlv_daiying.addItemDecoration(new RecyclerViewItemDecoration(RecyclerViewItemDecoration.MODE_HORIZONTAL,"#44000000",0,1,0));
        //设置适配器
        rcl_adapter=new Rcl_Daiying_Adapter(context);
        rlv_daiying.setAdapter(rcl_adapter);
        return recylerViewlist;
    }

    @Override
    public void initData() {
        super.initData();
        progressBar.setVisibility(View.VISIBLE);
        ll_flush.setVisibility(View.GONE);
        //联网获取viewpager数据
        OkHttpUtils
                .get()
                .url(UrlUtils.UrL_DAIYING_RECYLERVIEW)
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(Call call, Exception e, int id) {
                        Log.e("TAG", "待映数据请求失败" + e.getMessage());
                        ll_flush.setVisibility(View.VISIBLE);
                        progressBar.setVisibility(View.GONE);
                    }

                    @Override
                    public void onResponse(String response, int id) {
                        Log.e("TAG", "待映数据请求成功");
                        parseRLData(response);
                        progressBar.setVisibility(View.GONE);
                    }
                });
    }
    private void parseRLData(String data) {
        DaiYIngRcViewBean rcViewBean = parseRLJson(data);
        coming = rcViewBean.getData().getComing();
        if(coming!=null&&coming.size()>0){
            rcl_adapter.setComing(coming);
            rcl_adapter.notifyItemRangeChanged(0,coming.size());
        }

    }

    private DaiYIngRcViewBean parseRLJson(String json) {
        Gson gson=new Gson();
        DaiYIngRcViewBean rcViewBean = gson.fromJson(json, DaiYIngRcViewBean.class);
        return rcViewBean;
    }
}
