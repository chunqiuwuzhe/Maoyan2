package com.yangbo.maoyan1.pager;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.yangbo.maoyan1.R;
import com.yangbo.maoyan1.adapter.Rcl_Reying_Adapter;
import com.yangbo.maoyan1.base.BasePager;
import com.yangbo.maoyan1.ui.RecyclerViewItemDecoration;

import java.util.ArrayList;


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
    //假数据
    private ArrayList<String> arr;
    public ReYingPager(Context context) {
        super(context);
    }

    @Override
    public View initView() {

        View recylerViewlist=View.inflate(context,R.layout.reying_rv_paer,null);
        rlv_reying = (RecyclerView) recylerViewlist.findViewById(R.id.rlv_reying);

        setData();
        //设置布局管理器
        manager = new LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false);
        rlv_reying.setLayoutManager(manager);
        //加分割线
        rlv_reying.addItemDecoration(new RecyclerViewItemDecoration(RecyclerViewItemDecoration.MODE_HORIZONTAL,"#44000000",0,1,0));
        //设置适配器
        rcl_adapter=new Rcl_Reying_Adapter(context,arr);
        rlv_reying.setAdapter(rcl_adapter);
        return recylerViewlist;
    }
    /*
    * 获取数据
    * */
    private void setData() {
//        //联网获取数据
//        OkHttpUtils.get().url(UrlUtils.URL_REYING_VIEWPAGER).build().execute(new StringCallback() {
//            //请求成功
//            @Override
//            public void onError(Request request, Exception e) {
//                Log.e("TAG","请求是失败");
//
//            }
//            //请求失败
//            @Override
//            public void onResponse(String response) {
//                Log.e("TAG","请求成功");
//
//            }
//        });
    }
}
