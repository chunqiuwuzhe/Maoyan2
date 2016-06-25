package com.yangbo.maoyan1.pager;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.yangbo.maoyan1.R;
import com.yangbo.maoyan1.adapter.Rcl_Daiying_Adapter;
import com.yangbo.maoyan1.base.BasePager;
import com.yangbo.maoyan1.ui.RecyclerViewItemDecoration;

import java.util.ArrayList;


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
    private ArrayList<String> arr;

    public DaiYingPager(Context context) {
        super(context);
    }

    @Override
    public View initView() {

        View recylerViewlist=View.inflate(context,R.layout.daiying_rv_paer,null);
        rlv_daiying = (RecyclerView) recylerViewlist.findViewById(R.id.rlv_daiying);

        setData();
        //设置布局管理器
        manager = new LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false);
        rlv_daiying.setLayoutManager(manager);
        //加分割线
        rlv_daiying.addItemDecoration(new RecyclerViewItemDecoration(RecyclerViewItemDecoration.MODE_HORIZONTAL,"#44000000",0,1,0));
        //设置适配器
        rcl_adapter=new Rcl_Daiying_Adapter(context,arr);
        rlv_daiying.setAdapter(rcl_adapter);
        return recylerViewlist;
    }
    /*
    * 获取数据
    * */
    private void setData() {
        arr=new ArrayList<>();
        for(int i = 0; i < 50; i++) {
            arr.add("RCL***daiying"+i);
        }
    }
}
