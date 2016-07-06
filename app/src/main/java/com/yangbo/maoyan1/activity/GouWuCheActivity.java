package com.yangbo.maoyan1.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import com.yangbo.maoyan1.R;
import com.yangbo.maoyan1.ShopCart.ShoppingCartTop100;
import com.yangbo.maoyan1.adapter.GovaffairPagerAdapter;
import com.yangbo.maoyan1.utils.CartProviderTop100;

import org.xutils.common.util.LogUtil;

import java.util.List;

public class GouWuCheActivity extends Activity {
    private RecyclerView rv_gova_pager;
    private CheckBox checkbox_all;
    private TextView tv_total_price;
    private Button btn_order;
    private Button btn_delete;
    private Button btn_cart;

    private static final int ACTION_EDIT = 1;
    private static final int ACTION_COMPLETE = 2;


    private CartProviderTop100 cartProvider;
    private List<ShoppingCartTop100> datas;
    private GovaffairPagerAdapter adapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gou_wu_che);

        cartProvider= new CartProviderTop100(this);

        rv_gova_pager = (RecyclerView) findViewById(R.id.rv_gova_pager);
        rv_gova_pager = (RecyclerView) findViewById(R.id.rv_gova_pager);
        checkbox_all = (CheckBox) findViewById(R.id.checkbox_all);
        tv_total_price = (TextView) findViewById(R.id.tv_total_price);
        btn_order = (Button) findViewById(R.id.btn_order);
        btn_delete = (Button) findViewById(R.id.btn_delete);
        btn_cart = (Button) findViewById(R.id.btn_cart);
        btn_cart.setVisibility(View.VISIBLE);
        //视图添加到FrameLayout

        btn_cart.setTag(ACTION_EDIT);
        btn_cart.setText("编辑");
        btn_cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int action = (int) btn_cart.getTag();
                if (action == ACTION_EDIT) {
                    //显示删除按钮
                    showDeleteButton();
                } else if (action == ACTION_COMPLETE) {
                    //隐藏删除按钮
                    LogUtil.e("action == ACTION_COMPLETE!!!!!!!!!!!!!!!");
                    hideDeleteButton();
                }
            }
        });
        /**
         * 删除某条购物信息
         */
        btn_delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.deleteData();
            }
        });

        showData();
    }

    //显示删除按钮
    private void showDeleteButton() {
        //1.设置文本为完成
        btn_cart.setText("完成");
        //2.全部为非勾选
        adapter.checkAllOrNo(false);
        checkbox_all.setChecked(false);
        //3.隐藏价格
        tv_total_price.setVisibility(View.GONE);
        //4.显示删除按钮
        btn_delete.setVisibility(View.VISIBLE);
        //5.隐藏结算按钮
        btn_order.setVisibility(View.GONE);
        //6.设置状态
        btn_cart.setTag(ACTION_COMPLETE);
    }

    private void hideDeleteButton() {
        //1.设置文本为完成
        btn_cart.setText("编辑");
        //2.全部为非勾选
        adapter.checkAllOrNo(true);
        checkbox_all.setChecked(true);
        //3.隐藏价格
        tv_total_price.setVisibility(View.VISIBLE);
        //4.显示删除按钮
        btn_delete.setVisibility(View.GONE);
        //5.隐藏结算按钮
        btn_order.setVisibility(View.VISIBLE);
        //6.设置状态
        btn_cart.setTag(ACTION_EDIT);
    }

    private void showData() {
        //得到数据
        datas = cartProvider.getAllData();
        //设置适配器
        adapter = new GovaffairPagerAdapter(this, datas, checkbox_all, tv_total_price);
        rv_gova_pager.setAdapter(adapter);
        //设置布局管理者
        rv_gova_pager.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        //设置动画 （默认的）
        rv_gova_pager.setItemAnimator(new DefaultItemAnimator());
    }
}