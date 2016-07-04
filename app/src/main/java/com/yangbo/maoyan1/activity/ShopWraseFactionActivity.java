package com.yangbo.maoyan1.activity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.widget.GridLayoutManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.yangbo.maoyan1.R;
import com.yangbo.maoyan1.adapter.ShopFenLeiAdapter;
import com.yangbo.maoyan1.bean.ShopFenLeiBean;
import com.yangbo.maoyan1.refresh.PRecycleview;
import com.yangbo.maoyan1.utils.UrlUtils;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import java.util.ArrayList;
import java.util.List;

import okhttp3.Call;

public class ShopWraseFactionActivity extends Activity implements View.OnClickListener, PRecycleview.OnRefreshAndLoadMoreListener {
    private ImageView iv_back;
    private LinearLayout ll_them,ll_shuma,ll_sort;
    private PRecycleview rcl_shop_fication;
    private String sUrl;

    private List<ShopFenLeiBean.DataBean.ListBean> list;

    private TextView tv_them;
    private TextView tv_moddle;
    private TextView tv_sort;

    private int width;
    private int height;

    private ImageView iv_shop_cart;

    String[] them={"数码","高玩专区","玩具","生活","服饰","超蝙","机器猫","魔兽","美队","星球大战"};
    String[] type={"玩具","生活","服饰","3C配件","箱包","手办公仔","电影原著","配饰","家纺","文具","毛绒公仔"};
    String[] sort={"价格从高到低","价格从低到高","销量最多","销量最少","最近更新","最远更新"};

    private ArrayList<String> arrThem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_shop_wrase_faction);
        //获取屏幕宽高
        WindowManager wm = this.getWindowManager();
        width = wm.getDefaultDisplay().getWidth();
        height = wm.getDefaultDisplay().getHeight();

        findViews();
        int id = getIntent().getIntExtra("id", 0);
        getUrl(id);
        if(sUrl!=null){
            getHttp();
        }
    }
    private void findViews() {
        iv_back = (ImageView)findViewById(R.id.iv_back);
        ll_them = (LinearLayout)findViewById(R.id.ll_them);
        ll_shuma = (LinearLayout)findViewById(R.id.ll_shuma);
        ll_sort = (LinearLayout)findViewById(R.id.ll_sort);
        rcl_shop_fication = (PRecycleview) findViewById(R.id.rcl_shop_fication);

        tv_them = (TextView)findViewById(R.id.tv_them);
        tv_moddle = (TextView)findViewById(R.id.tv_moddle);
        tv_sort = (TextView)findViewById(R.id.tv_sort);
        //购物车
        iv_shop_cart = (ImageView)findViewById(R.id.iv_shop_cart);
        iv_shop_cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ShopWraseFactionActivity.this,shoppingCarsActivity.class));
            }
        });
        iv_back.setOnClickListener(this);
        ll_them.setOnClickListener(this);
        ll_shuma.setOnClickListener(this);
        ll_sort.setOnClickListener(this);
        rcl_shop_fication.setOnClickListener(this);
        //刷新监听
        rcl_shop_fication.setRefreshAndLoadMoreListener(this);
    }
    private void getUrl(int id) {
       if(id==1){
           sUrl= UrlUtils.S_URL_1;
           tv_moddle.setText(them[0]);
       }else if(id==2){
           sUrl= UrlUtils.G_URL_2;
           tv_moddle.setText(them[1]);
       }else if(id==3){
           sUrl= UrlUtils.W_URL_3;
           tv_moddle.setText(them[2]);
       }else if(id==4){
           sUrl= UrlUtils.H_URL_4;
           tv_moddle.setText(them[3]);
       }else if(id==5){
           sUrl= UrlUtils.F_URL_5;
           tv_moddle.setText(them[4]);
       }else if(id==6){
           sUrl= UrlUtils.C_URL_6;
           tv_them.setText(them[5]);
       }else if(id==7){
           sUrl= UrlUtils.J_URL_7;
           tv_them.setText(them[6]);
       }else if(id==8){
           sUrl= UrlUtils.M_URL_8;
           tv_them.setText(them[7]);
       }else if(id==9){
           sUrl= UrlUtils.USA_URL_9;
           tv_them.setText(them[8]);
       }else if(id==10){
           sUrl= UrlUtils.X_URL_10;
           tv_them.setText(them[9]);
       }
    }

    private void ShowPoPupWindow(int i) {
        ListView pop_lv;
        // 一个自定义的布局，作为显示的内容
        View contentView = LayoutInflater.from(this).inflate(
                R.layout.pop_window, null);
        pop_lv = (ListView) contentView.findViewById(R.id.pop_lv);

        //new一个popupWindow
        PopupWindow popupWindow = new PopupWindow(contentView,
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT, true);

        // 如果不设置PopupWindow的背景，无论是点击外部区域还是Back键都无法dismiss弹框
        popupWindow.setBackgroundDrawable(getResources().getDrawable(
                R.drawable.fenlei_bg));
        //位于哪个控件的正下方
        popupWindow.showAsDropDown(ll_them);
        String[] arr;
        if(i==1){
            arr=them;
        }else if(i==2){
            arr=type;
        }else{
            arr=sort;
        }
        if(arr!=null){
            pop_lv.setAdapter(new PoPAdapter(arr));
        }
    }



    @Override
    public void onClick(View v) {
        tv_them.setTextColor(Color.BLACK);
        tv_moddle.setTextColor(Color.BLACK);
        tv_sort.setTextColor(Color.BLACK);
        switch (v.getId()) {
            case R.id.iv_back :
                finish();
                break;
            case R.id.ll_them :
                ShowPoPupWindow(1);
                tv_them.setTextColor(Color.RED);
                Toast.makeText(ShopWraseFactionActivity.this, "主题", Toast.LENGTH_SHORT).show();
                break;
            case R.id.ll_shuma :
                ShowPoPupWindow(2);
                tv_moddle.setTextColor(Color.RED);
                Toast.makeText(ShopWraseFactionActivity.this, "数码", Toast.LENGTH_SHORT).show();
                break;
            case R.id.ll_sort :
                ShowPoPupWindow(3);
                tv_sort.setTextColor(Color.RED);
                Toast.makeText(ShopWraseFactionActivity.this, "排序", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    public void getHttp() {
        //联网获取viewpager数据
        OkHttpUtils
                .get()
                .url(sUrl)
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(Call call, Exception e, int id) {
                        Log.e("TAG", "商城数据分类请求失败" + e.getMessage());
                    }

                    @Override
                    public void onResponse(String response, int id) {
                        Log.e("TAG", "商城数据分类请求成功");
                        parseData(response);
                    }
                });
    }

    private void parseData(String data) {
        ShopFenLeiBean shopFenLeiBean = parseJson(data);
        list = shopFenLeiBean.getData().getList();
        if(list!=null&&list.size()>0){
            GridLayoutManager gv=new GridLayoutManager(this,2);
            rcl_shop_fication.setLayoutManager(gv);
            rcl_shop_fication.setAdapter(new ShopFenLeiAdapter(this,list,width));
        }
    }

    private ShopFenLeiBean parseJson(String json) {
        Gson gson=new Gson();
        ShopFenLeiBean fenLeiBean = gson.fromJson(json, ShopFenLeiBean.class);
        return fenLeiBean;
    }

    private Handler handler=new Handler();
    @Override
    public void onRefresh() {
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                //设置刷新完成
                rcl_shop_fication.setReFreshComplete();
                Toast.makeText(ShopWraseFactionActivity.this, "刷新完成", Toast.LENGTH_SHORT).show();
            }
        },4000);
    }

    @Override
    public void onLoadMore() {
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
//                加载完成
                rcl_shop_fication.setloadMoreComplete();
                Toast.makeText(ShopWraseFactionActivity.this, "加载完成", Toast.LENGTH_SHORT).show();
            }
        },4000);
    }

    private class PoPAdapter extends BaseAdapter {
        String[] arri;
        public PoPAdapter(String[] arr) {
            arri=arr;
        }

        @Override
        public int getCount() {
            if(arri!=null&&arri.length>0){
                return arri.length;
            }
            return 0;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ViewHolder holder;
            if(convertView==null){
                convertView=LayoutInflater.from(ShopWraseFactionActivity.this).inflate(R.layout.item_fenlei_lv,parent,false);
                holder=new ViewHolder();
                holder.tv_name= (TextView) convertView.findViewById(R.id.tv_name);
                convertView.setTag(holder);
            }else{
                holder= (ViewHolder) convertView.getTag();
            }
            holder.tv_name.setText(arri[position]);
            return convertView;
        }
        class ViewHolder{
            TextView tv_name;
        }
    }
}
