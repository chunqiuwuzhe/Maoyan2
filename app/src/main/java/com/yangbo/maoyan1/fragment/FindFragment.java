package com.yangbo.maoyan1.fragment;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.yangbo.maoyan1.R;
import com.yangbo.maoyan1.adapter.MyFindAdapter;
import com.yangbo.maoyan1.base.BaseFragment;


/**
 * Created by yangbo on 2016/6/22.
 */
public class FindFragment extends BaseFragment {
    private RecyclerView rv_find;

//    public FindFragment(Context context) {
//        super();
//    }

    @Override
    public View initView() {

        View view = View.inflate(context, R.layout.fragment_find,null);
        rv_find = (RecyclerView) view.findViewById(R.id.rv_find);
        //设置布局管理器
        rv_find.setLayoutManager(new LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false));
        //设置适配器
        MyFindAdapter myFindAdapter = new MyFindAdapter(context);
        rv_find.setAdapter(myFindAdapter);
        return view;
    }

    @Override
    public void initDate() {
        super.initDate();

    }
}
