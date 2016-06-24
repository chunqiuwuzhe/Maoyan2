package com.atguigu.android50_0220;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.atguigu.android50_0220.ainterface.OnItemClickListener;

import java.util.ArrayList;
import java.util.List;

public class TypeActivity extends AppCompatActivity implements View.OnClickListener {

    private List<String> list;
    private RecyclerView rv;
    private MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type);

        Button btn1 = (Button) findViewById(R.id.btn1);
        Button btn2 = (Button) findViewById(R.id.btn2);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);

        rv = (RecyclerView) findViewById(R.id.rv);
        setData();
        rv.setLayoutManager(new LinearLayoutManager(this));
        adapter = new MyAdapter();
        rv.setAdapter(adapter);
    }

    private void setData() {

        list = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            list.add("宋老师好坏" + i);
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn1:
                list.add("同学们很COOL");
                adapter.notifyItemInserted(list.size());
                break;
            case R.id.btn2:

                break;
        }
    }


    class MyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

            //viewtype分类型的值 （getItemViewType返回的类型值）
            if (viewType==0){

                View view = LayoutInflater.from(TypeActivity.this).inflate(R.layout.image_item,parent,false);

                return new HeadHolder(view);
            }
            View view = LayoutInflater.from(TypeActivity.this).inflate(R.layout.main_item,parent,false);

            return new MyHolder(view);
        }

        @Override
        public void onBindViewHolder(final RecyclerView.ViewHolder holder, int position) {

            if (position==0){
                return;
            }

            ((MyHolder)holder).setData(list.get(position));
        }

        @Override
        public int getItemCount() {
            return list.size();
        }

        @Override
        public int getItemViewType(int position) {
            if (position==0){
                return 0;
            }
            return 1;
        }
    }

    class MyHolder extends RecyclerView.ViewHolder{

        private TextView tv;

        public MyHolder(View itemView) {
            super(itemView);
            tv = (TextView) itemView.findViewById(R.id.tv);
        }

        public void setData(String data) {
            tv.setText(data);
        }
    }
    class HeadHolder extends RecyclerView.ViewHolder{

        private TextView tv;

        public HeadHolder(View itemView) {
            super(itemView);

        }

    }
}
