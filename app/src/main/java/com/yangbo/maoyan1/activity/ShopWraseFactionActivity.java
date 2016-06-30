package com.yangbo.maoyan1.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.yangbo.maoyan1.R;

public class ShopWraseFactionActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView iv_back;
    private LinearLayout ll_them,ll_shuma,ll_sort;
    private RecyclerView rcl_shop_fication;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_shop_wrase_faction);
        findViews();

    }

    private void findViews() {
        iv_back = (ImageView)findViewById(R.id.iv_back);
        ll_them = (LinearLayout)findViewById(R.id.ll_them);
        ll_shuma = (LinearLayout)findViewById(R.id.ll_shuma);
        ll_sort = (LinearLayout)findViewById(R.id.ll_sort);
        rcl_shop_fication = (RecyclerView)findViewById(R.id.rcl_shop_fication);

        iv_back.setOnClickListener(this);
        ll_them.setOnClickListener(this);
        ll_shuma.setOnClickListener(this);
        ll_sort.setOnClickListener(this);
        rcl_shop_fication.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.iv_back :
            Toast.makeText(ShopWraseFactionActivity.this, "返回", Toast.LENGTH_SHORT).show();
                finish();
                break;
            case R.id.ll_them :
                Toast.makeText(ShopWraseFactionActivity.this, "主题", Toast.LENGTH_SHORT).show();
                break;
            case R.id.ll_shuma :
                Toast.makeText(ShopWraseFactionActivity.this, "数码", Toast.LENGTH_SHORT).show();
                break;
            case R.id.ll_sort :
                Toast.makeText(ShopWraseFactionActivity.this, "排序", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
