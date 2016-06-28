package com.yangbo.maoyan1.HaiwaiChildView;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import com.google.gson.Gson;
import com.yangbo.maoyan1.R;
import com.yangbo.maoyan1.adapter.HaiWaiHanGuoAdapter;
import com.yangbo.maoyan1.base.BaseFireFragment;
import com.yangbo.maoyan1.bean.HanGuoBean;
import com.yangbo.maoyan1.utils.UrlUtils;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import java.util.List;

import okhttp3.Call;

/**
 * Created by sdf on 2016/6/25.
 */
public class HanguoPager extends BaseFireFragment {
    private ListView lv_hanguo;

    private List<HanGuoBean.DataBean.HotBean> arrhot;

    public HanguoPager(Context context) {
        super(context);
    }

    @Override
    public View initView() {
        View view=View.inflate(context, R.layout.haiwai_hanguo_pager, null);
        lv_hanguo = (ListView) view.findViewById(R.id.lv_hanguo);
        return view;
    }

    @Override
    public void initData() {
        super.initData();
        //联网获取viewpager数据
        OkHttpUtils
                .get()
                .url(UrlUtils.URL_HAIWAI_HG_LV)
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(Call call, Exception e, int id) {
                        Log.e("TAG", "ListView韩国数据请求失败" + e.getMessage());
                    }

                    @Override
                    public void onResponse(String response, int id) {
                        Log.e("TAG", "ListView韩国数据请求成功");
                        Log.e("TAG--response", response);
                        parselvData(response);
                    }
                });
    }

    private void parselvData(String data) {
        HanGuoBean hanGuoBean = parseJson(data);
        arrhot = hanGuoBean.getData().getHot();
        if(arrhot!=null&&arrhot.size()>0){
            HaiWaiHanGuoAdapter hwH=new HaiWaiHanGuoAdapter(context);
            hwH.setArrhot(arrhot);
            lv_hanguo.setAdapter(hwH);
        }
    }

    private HanGuoBean parseJson(String json) {
        Gson gosn=new Gson();
        HanGuoBean hanGuoBean = gosn.fromJson(json, HanGuoBean.class);
        return hanGuoBean;
    }
}
