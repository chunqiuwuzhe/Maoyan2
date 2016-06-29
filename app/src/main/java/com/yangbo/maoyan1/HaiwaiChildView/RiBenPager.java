package com.yangbo.maoyan1.HaiwaiChildView;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;

import com.google.gson.Gson;
import com.yangbo.maoyan1.R;
import com.yangbo.maoyan1.adapter.HwaiRibenAdapter;
import com.yangbo.maoyan1.base.BaseFireFragment;
import com.yangbo.maoyan1.bean.HaiWaiRiBenBean;
import com.yangbo.maoyan1.utils.UrlUtils;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import java.util.List;

import okhttp3.Call;

/**
 * Created by sdf on 2016/6/25.
 */
public class RiBenPager extends BaseFireFragment {
    private ListView lv_riben;

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
        lv_riben = (ListView) view.findViewById(R.id.lv_riben);
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
            lv_riben.setAdapter(ribenAdapter);
        }

    }

    private HaiWaiRiBenBean parseJson(String json) {
        Gson gson=new Gson();
        HaiWaiRiBenBean haiWaiRiBenBean = gson.fromJson(json, HaiWaiRiBenBean.class);
        return haiWaiRiBenBean;
    }
}
