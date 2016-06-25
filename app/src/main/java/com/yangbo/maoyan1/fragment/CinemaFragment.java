package com.yangbo.maoyan1.fragment;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.yangbo.maoyan1.R;
<<<<<<< HEAD
import com.yangbo.maoyan1.adapter.MyCinemaAdapter;
=======
import com.yangbo.maoyan1.activity.MainActivity;
>>>>>>> 54459bcd894fef6464d230b8bd9d2580e733849e
import com.yangbo.maoyan1.base.BaseFragment;


/**
 * Created by yangbo on 2016/6/22.
 */
public class CinemaFragment extends BaseFragment {

    TextView tv_moive_city;//城市

<<<<<<< HEAD
    TextView tv_cinema_dress;//底部地址

    private ImageView iv_cinema_select;//右上角选择

    private ImageView iv_cinema_search;//右上角搜素
    //RecyclerView
    private RecyclerView rv_cinema;
    //RececleView的适配器
    MyCinemaAdapter myCinemaAdapter;

    //构造器
    public CinemaFragment( ) {
=======
    public CinemaFragment(MainActivity context) {
>>>>>>> 54459bcd894fef6464d230b8bd9d2580e733849e
        super();
    }
    //初始化布局  重写父类的方法
    @Override
    public View initView() {

        View view = View.inflate(context, R.layout.fragment_cinema,null);
        //初始化
        tv_moive_city = (TextView) view.findViewById(R.id.tv_moive_city);
        tv_cinema_dress = (TextView) view.findViewById(R.id.tv_cinema_dress);
        iv_cinema_select = (ImageView) view.findViewById(R.id.iv_cinema_select);
        iv_cinema_search = (ImageView) view.findViewById(R.id.iv_cinema_search);
        rv_cinema = (RecyclerView) view.findViewById(R.id.rv_cinema);

        return view;

    }

    //初始化数据 重写父类的方法
    @Override
    public void initDate() {
        super.initDate();
        //设置布局管理者
        rv_cinema.setLayoutManager(new LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false));

        //设置适配器
        myCinemaAdapter = new MyCinemaAdapter(context);

        rv_cinema.setAdapter(myCinemaAdapter);

    }
}
