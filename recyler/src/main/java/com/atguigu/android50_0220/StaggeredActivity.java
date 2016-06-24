package com.atguigu.android50_0220;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;
import java.util.List;

public class StaggeredActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_staggered);

        //初始化控件
        RecyclerView rv = (RecyclerView) findViewById(R.id.rv);
        //设置Manager
        rv.setLayoutManager(
                new StaggeredGridLayoutManager(3,
                        StaggeredGridLayoutManager.VERTICAL));
        //初始化数据
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 120; i++) {

            list.add("飞龙老师好帅啊"+i);
        }

        rv.setAdapter(new StaggeredHomeAdapter(this, list));
    }
}
