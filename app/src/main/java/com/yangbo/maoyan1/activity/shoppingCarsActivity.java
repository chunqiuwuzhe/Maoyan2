package com.yangbo.maoyan1.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import com.yangbo.maoyan1.R;
import com.yangbo.maoyan1.ShopCart.ShoppingCart;
import com.yangbo.maoyan1.adapter.shopCarsAdapter;
import com.yangbo.maoyan1.utils.CartProvider;

import java.util.Iterator;
import java.util.List;

public class shoppingCarsActivity extends Activity {
    private CartProvider cartProvider;

    private RecyclerView rcl_shoppingcar;
    private CheckBox checkbox_all;
    private TextView tv_total_price;
    private Button btn_order;
    private Button btn_delete;
    private Button btn_cart;
    private List<ShoppingCart> datas;

    private shopCarsAdapter carsAdapter;
    private boolean checkAll;

    private static final int EDIT=1;
    private static final int FINISH=2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_shopping_cars);
        this.cartProvider=new CartProvider(this);
        datas = cartProvider.getAllData();
        findViews();
        isCheckAll();

    }

    private void findViews() {
        rcl_shoppingcar = (RecyclerView)findViewById(R.id.rcl_shoppingcar);
        checkbox_all = (CheckBox) findViewById(R.id.checkbox_all);
        tv_total_price = (TextView) findViewById(R.id.tv_total_price);
        btn_order = (Button) findViewById(R.id.btn_order);
        btn_delete = (Button) findViewById(R.id.btn_delete);
        btn_cart = (Button)findViewById(R.id.btn_cart);
        //设置适配器
        carsAdapter = new shopCarsAdapter(this,datas,checkbox_all,tv_total_price);
        //设置布局管理器
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        rcl_shoppingcar.setLayoutManager(layoutManager);
        rcl_shoppingcar.setAdapter(carsAdapter);
        //某一个item的点击事件
        carsAdapter.setMyItemOnClickLinsster(new shopCarsAdapter.MyItemOnClickLinsster() {
            @Override
            public void itemOnClickLinster(View view, int position) {
                //把当前item的状态取反
                ShoppingCart cart = datas.get(position);
                cart.setIsCheck(!cart.isCheck());
                //刷新
                carsAdapter.notifyItemChanged(position);
                //设置全选的状态
                isCheckAll();
                //刷新价格
                carsAdapter.showTotalPrice();
            }
        });
        //全选按钮的点击事件
        checkbox_all.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(shoppingCarsActivity.this, "全选", Toast.LENGTH_SHORT).show();
                //得到全选按钮的状态
                boolean flag = checkbox_all.isChecked();
                //设置全选或全不选的方法
                checkboxAll(flag);
                //刷新价格
                carsAdapter.showTotalPrice();
            }
        });
        btn_cart.setTag(EDIT);
        //编辑的点击事件
        btn_cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btn_cart.getTag()==EDIT){//编辑状态
                    //显示删除按钮
                    showDelete();
                }else if(btn_cart.getTag()==FINISH){//完成状态
                    //隐藏删除按钮
                    hideDelete();
                }
                //刷新价格
                carsAdapter.showTotalPrice();
            }
        });
        //删除的点击事件
        btn_delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                deleteMethod();
            }
        });
    }

    private void deleteMethod() {
        if(datas.size()>0&&datas!=null){
            for(Iterator iterator=datas.iterator();iterator.hasNext();){
                ShoppingCart cart= (ShoppingCart) iterator.next();
                if(cart.isCheck()){
                    //获取当前item的位置
                    int position = datas.indexOf(cart);
                    //移除数据
                    iterator.remove();
                    //更新本地
                    cartProvider.delete(cart);

                    //刷新
                    carsAdapter.notifyItemRemoved(position);
                }
            }

        }
    }

    private void hideDelete() {
        //设置文本为编辑
        btn_cart.setText("编辑");
        //隐藏删除按钮
        btn_delete.setVisibility(View.GONE);
        //显示结算按钮
        btn_order.setVisibility(View.VISIBLE);
        //设置全选为选中
        checkboxAll(true);
        checkbox_all.setChecked(true);
        //显示价格
        tv_total_price.setVisibility(View.VISIBLE);
        //设置状态为edit
        btn_cart.setTag(EDIT);
    }

    private void showDelete() {
        //设置文本为完成
        btn_cart.setText("完成");
        //显示删除按钮
        btn_delete.setVisibility(View.VISIBLE);
        //隐藏结算按钮
        btn_order.setVisibility(View.GONE);
        //设置全选为不选中
        checkboxAll(false);
        checkbox_all.setChecked(false);
        //隐藏价格
        tv_total_price.setVisibility(View.GONE);
        //设置状态为finish
        btn_cart.setTag(FINISH);
    }

    private void checkboxAll(boolean flag) {
        if(datas!=null&&datas.size()>0){
            for(int i=0;i<datas.size();i++){
                ShoppingCart cart = datas.get(i);
                cart.setIsCheck(flag);
                //刷新状态
                carsAdapter.notifyItemChanged(i);
            }
        }
    }

    public boolean isCheckAll() {
        if(datas!=null&&datas.size()>0){
            int number=0;
            for(int i=0;i<datas.size();i++){
                ShoppingCart cart = datas.get(i);
                if(!cart.isCheck()){
                    checkbox_all.setChecked(false);
                }else{
                    number+=1;
                }
            }
            if(number==datas.size()){
                checkbox_all.setChecked(true);
            }
        }
        return checkAll;
    }
}
