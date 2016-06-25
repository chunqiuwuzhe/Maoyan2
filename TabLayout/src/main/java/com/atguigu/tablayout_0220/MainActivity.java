package com.atguigu.tablayout_0220;

import android.annotation.TargetApi;
import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private String names[] = {
       "tablayout","imageTabLayout","TabToolBar","转场动画"
    } ;
    private ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        initData();
    }

    private void initData() {

    }

    private void initView() {
        ListView lv = (ListView) findViewById(R.id.lv);
        lv.setAdapter(new MyAdapter());
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @TargetApi(Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        startActivity(new Intent(MainActivity.this,TablayoutActivity.class));
                        break;
                    case 1:
                        startActivity(new Intent(MainActivity.this,ImageTabLayoutActivity.class));
                        break;
                    case 2:
                        startActivity(new Intent(MainActivity.this,TabToolBarActivity.class));
                        break;
                    case 3:
                        Intent intent = new Intent(MainActivity.this,TranActivity.class);
                        //iv 加载当前的View控件的实例化对象
                        //tran_view 两个View的android:transitionName 的名字
                        startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(MainActivity.this,
                                        iv, "tran_view").toBundle());
                        break;

                }
            }
        });
    }

    class MyAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return names.length;
        }

        @Override
        public Object getItem(int position) {
            return names[position];
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            if (position==3){
                View view = View.inflate(MainActivity.this,R.layout.image_item,null);
                iv = (ImageView) view.findViewById(R.id.iv);
                return view;
            }
            View view = View.inflate(MainActivity.this,R.layout.main_item,null);
            TextView tv = (TextView) view.findViewById(R.id.tv);
            tv.setText(names[position]);
            return view;
        }
    }
}
