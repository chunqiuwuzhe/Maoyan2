package com.atguigu.android50_0220;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.atguigu.android50_0220.ainterface.OnItemClickListener;
import com.atguigu.android50_0220.ui.RecyclerViewItemDecoration;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private List<String> list;
    private RecyclerView rv;
    private SwipeRefreshLayout swip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        initView();
        initData();
    }

    private void initData() {
        //设置布局管理器
//        LinearLayoutManager 现行管理器，支持横向、纵向。
//        GridLayoutManager 网格布局管理器
//        StaggeredGridLayoutManager 瀑布流式布局管理器

        //第二个参数 垂直排列 或者 横向排列
        //第三个参数 从头显示 还是 从尾显示
        LinearLayoutManager manager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,true);

        //加分割线
        rv.addItemDecoration(new RecyclerViewItemDecoration
                (RecyclerViewItemDecoration.MODE_HORIZONTAL, Color.RED, 10, 5, 10));

        //设置适配器
        rv.setLayoutManager(manager);


        MyAdapter adapter = new MyAdapter();
        rv.setAdapter(adapter);
        //调用adapter的item单击事件
        adapter.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onClick(View v, int position) {
                Toast.makeText(MainActivity.this,"同学们好帅"+position,Toast.LENGTH_SHORT).show();
            }
        });

        setData();
    }

    private void setData() {

        list = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            list.add("宋老师好坏"+i);
        }
    }

    private void initView() {
        //初始化控件
        rv = (RecyclerView) findViewById(R.id.rv);
        Button btn1 = (Button) findViewById(R.id.btn1);
        Button btn2 = (Button) findViewById(R.id.btn2);
        Button btn3 = (Button)findViewById(R.id.btn3);
        Button btn4 = (Button)findViewById(R.id.btn4);
        Button btn5 = (Button) findViewById(R.id.btn5);
        btn5.setOnClickListener(this);
        swip = (SwipeRefreshLayout) findViewById(R.id.swipe);
        swip.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {

                Toast.makeText(MainActivity.this,"小爷刷新完了",Toast.LENGTH_SHORT).show();
                //下拉刷新调此方法
                swip.setRefreshing(false);
            }
        });
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn1:
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MainActivity.this);
                rv.setLayoutManager(linearLayoutManager);
                break;
            case R.id.btn2:
                GridLayoutManager manager = new GridLayoutManager(MainActivity.this,3);
                rv.setLayoutManager(manager);
                break;
            case R.id.btn3:
                GridLayoutManager manager2 = new GridLayoutManager(MainActivity.this,3);
                manager2.setOrientation(GridLayoutManager.HORIZONTAL);
                rv.setLayoutManager(manager2);
                break;
            case R.id.btn4:
                startActivity(new Intent(MainActivity.this, StaggeredActivity.class));
                break;
            case R.id.btn5:
                startActivity(new Intent(MainActivity.this,TypeActivity.class));
                break;
        }
    }

    class MyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{

        private OnItemClickListener onItemClickListener;

        public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
            this.onItemClickListener = onItemClickListener;
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

            //View view = View.inflate(MainActivity.this,R.layout.main_item,null);
            //加载布局
            View view = LayoutInflater.from(MainActivity.this).inflate(R.layout.main_item,parent,false);

            return new MyHolder(view);
        }

        @Override
        public void onBindViewHolder(final RecyclerView.ViewHolder holder, int position) {
            if (onItemClickListener != null){
                holder.itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int layoutPosition = holder.getLayoutPosition();
                        onItemClickListener.onClick(v, layoutPosition);
                    }
                });
            }
            ((MyHolder)holder).setData(list.get(position));
        }

        @Override
        public int getItemCount() {
            return list.size();
        }

        @Override
        public int getItemViewType(int position) {
            return super.getItemViewType(position);
        }
    }

    class MyHolder extends RecyclerView.ViewHolder{

        private  TextView tv;

        public MyHolder(View itemView) {
            super(itemView);
            tv = (TextView) itemView.findViewById(R.id.tv);
        }

        public void setData(String data) {
            tv.setText(data);
        }
    }


}
