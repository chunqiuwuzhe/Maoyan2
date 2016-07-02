package com.yangbo.maoyan1.fragment;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.yangbo.maoyan1.R;
import com.yangbo.maoyan1.activity.CinemaDetailActivity;
import com.yangbo.maoyan1.activity.SearchCinemaActivity;
import com.yangbo.maoyan1.adapter.MyCinemaAdapter;
import com.yangbo.maoyan1.base.BaseFragment;
import com.yangbo.maoyan1.bean.CinemaBean;
import com.yangbo.maoyan1.bean.CinemaDiZhiBean;
import com.yangbo.maoyan1.bean.CinemaViewPagerBean;
import com.yangbo.maoyan1.utils.CacheUtils;
import com.yangbo.maoyan1.utils.UrlUtils;
import com.yangbo.maoyan1.utils.UrlUtilsFind;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import org.xutils.common.util.DensityUtil;
import org.xutils.common.util.LogUtil;

import java.util.List;

import droid.Activity01;
import okhttp3.Call;


/**
 * Created by yangbo on 2016/6/22.
 */
public class CinemaFragment extends BaseFragment {

    TextView tv_cinena_city;//城市

    TextView tv_cinema_dress;//底部地址
    RelativeLayout rl_cinema_dress;//底部地址

    private ImageView iv_cinema_select;//右上角选择

    private ImageView iv_cinema_search;//右上角搜素
    //传到搜索栏 de 数据
    String jsonData;
    //请求的数据
    List datas;


    //RecyclerView
    private RecyclerView rv_cinema;
    //RececleView的适配器
    MyCinemaAdapter myCinemaAdapter;
    private String url;

//    public CinemaFragment(Context context) {
//        super();
//    }

    //初始化布局  重写父类的方法
    @Override
    public View initView() {

        View view = View.inflate(context, R.layout.fragment_cinema, null);
        //初始化
        tv_cinena_city = (TextView) view.findViewById(R.id.tv_cinena_city);
        tv_cinema_dress = (TextView) view.findViewById(R.id.tv_cinema_dress);
        iv_cinema_select = (ImageView) view.findViewById(R.id.iv_cinema_select);
        iv_cinema_search = (ImageView) view.findViewById(R.id.iv_cinema_search);
        rv_cinema = (RecyclerView) view.findViewById(R.id.rv_cinema);
        rl_cinema_dress = (RelativeLayout) view.findViewById(R.id.rl_cinema_dress);


        initonclike();
        //设置布局管理者
        rv_cinema.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false));
        //设置适配器
        myCinemaAdapter = new MyCinemaAdapter(context);
        rv_cinema.setAdapter(myCinemaAdapter);

        //设置item的点击事件
        myCinemaAdapter.setOnItemClickListener(new MyCinemaAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(CinemaBean.DataBean.changpingquBean changpingquBean) {
                Toast.makeText(context, changpingquBean.getDealPrice()+"", Toast.LENGTH_SHORT).show();
                //得到要跳转页面的网址
                url = "http://m.maoyan.com/showtime/wrap.json？cinemaid=11533&movieid=request";
                url = UrlUtilsFind.URL_CINEMA_DETAIL + (changpingquBean.getId() + "").trim();
                //跳转到新页面
                Intent intent = new Intent(context,CinemaDetailActivity.class);
                intent.putExtra("url",url);
                startActivity(intent);
            }
        });


//        initonclike();
        //设置底部显示和消失
        rv_cinema.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:

                        break;
                    case MotionEvent.ACTION_MOVE:
                        rl_cinema_dress.setVisibility(View.GONE);
                        break;
                    case MotionEvent.ACTION_UP:
                        rl_cinema_dress.setVisibility(View.VISIBLE);
                        break;
                }
                return false;
            }
        });

        return view;

    }

    /**
     * 设置顶部的点击事件
     */
    private void initonclike() {
        MyOnClickListener myOnClickListener = new MyOnClickListener();
        tv_cinena_city.setOnClickListener(myOnClickListener);
        iv_cinema_select.setOnClickListener(myOnClickListener);
        iv_cinema_search.setOnClickListener(myOnClickListener);
    }

    /**
     * 顶部的点击事件
     */
    class MyOnClickListener implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.tv_cinena_city:
                    Toast.makeText(context, "tv_moive_city", Toast.LENGTH_SHORT).show();
                    Intent intent1 = new Intent(context, Activity01.class);
                    context.startActivity(intent1);
                    break;
                case R.id.iv_cinema_select:
//                    Toast.makeText(context, "iv_cinema_select", Toast.LENGTH_SHORT).show();
                    showPopupWindow(v);
                    break;
                case R.id.iv_cinema_search:
//                    Toast.makeText(context, "iv_cinema_search", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(context, SearchCinemaActivity.class);
                    intent.putExtra("tt", jsonData);
                    startActivity(intent);


                    break;
            }
        }
    }

    /**
     * 弹窗PopupWindow
     *
     * @param v
     */
    private void showPopupWindow(View v) {
        // 一个自定义的布局，作为显示的内容

        View contentView = LayoutInflater.from(context).inflate(R.layout.cinema_popupwindow, null);
        //初始化
        final View vi_pop_line = (View) contentView.findViewById(R.id.vi_pop_line);
        RadioGroup rg_cinema_pw = (RadioGroup) contentView.findViewById(R.id.rg_cinema_pw);
        final ListView lv_pop01 = (ListView) contentView.findViewById(R.id.lv_pop01);
        final ListView lv_pop02 = (ListView) contentView.findViewById(R.id.lv_pop02);
        final PopupWindow popupWindow = new PopupWindow(contentView,
                LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT, true);

        rg_cinema_pw.check(R.id.rb_000);
        final String[] XingzhengQus = {"朝阳区", "海淀区", "东城区", "丰台区", "大兴区",
                "通州区", "昌平区", "房山区"};
        lv_pop01.setAdapter(new MypopListAdapter(XingzhengQus));
        //监听变化
        rg_cinema_pw.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.rb_000:


                        lv_pop01.setAdapter(new MypopListAdapter(XingzhengQus));
                        lv_pop02.setVisibility(View.GONE);
                        vi_pop_line.setVisibility(View.GONE);
                        break;
                    case R.id.rb_001:
                        final String[] diTie = {"1号线", "2号线", "10号线", "4号线", "5号线", "6号线",
                                "7号线", "8号线", "9号线"};
                        final String[][] xingzhengQus = {{"东单", "王府井", "天安门东", "国贸", "西单", "军博"}, {"雍和宫", "北京站",
                                "车公庄", "安定门", "西直门"}, {"东单", "王府井", "天安门东", "国贸", "西单", "军博"}, {"雍和宫", "北京站",
                                "车公庄", "安定门", "西直门"}, {"东单", "王府井", "天安门东", "国贸", "西单", "军博"}, {"雍和宫", "北京站",
                                "车公庄", "安定门", "西直门"}, {"东单", "王府井", "天安门东", "国贸", "西单", "军博"}, {"雍和宫", "北京站",
                                "车公庄", "安定门", "西直门"}, {"东单", "王府井", "天安门东", "国贸", "西单", "军博"}, {"雍和宫", "北京站",
                                "车公庄", "安定门", "西直门"}};
                        lv_pop01.setAdapter(new MypopListAdapter(diTie));
                        lv_pop02.setVisibility(View.VISIBLE);
                        lv_pop02.setAdapter(new MypopListAdapter(xingzhengQus[0]));
                        vi_pop_line.setVisibility(View.VISIBLE);
                        lv_pop01.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                                switch (position) {
                                    case 0:
                                        lv_pop02.setAdapter(new MypopListAdapter(xingzhengQus[0]));
                                        break;
                                    case 1:
                                        lv_pop02.setAdapter(new MypopListAdapter(xingzhengQus[1]));
                                        break;
                                    case 2:
                                        lv_pop02.setAdapter(new MypopListAdapter(xingzhengQus[2]));
                                        break;
                                    case 3:
                                        lv_pop02.setAdapter(new MypopListAdapter(xingzhengQus[3]));
                                        break;
                                    case 4:
                                        lv_pop02.setAdapter(new MypopListAdapter(xingzhengQus[4]));
                                        break;
                                    case 5:
                                        lv_pop02.setAdapter(new MypopListAdapter(xingzhengQus[5]));
                                        break;
                                    case 6:
                                        lv_pop02.setAdapter(new MypopListAdapter(xingzhengQus[6]));
                                        break;
                                    case 7:
                                        lv_pop02.setAdapter(new MypopListAdapter(xingzhengQus[7]));
                                        break;
                                    case 8:
                                        lv_pop02.setAdapter(new MypopListAdapter(xingzhengQus[8]));
                                        break;
                                    case 9:
                                        lv_pop02.setAdapter(new MypopListAdapter(xingzhengQus[9]));
                                        break;
                                }
                            }
                        });

                        break;
                    case R.id.rb_002:
                        final String[] XingzhengQus1 = {"4K厅", "中国巨幕厅", "4Dx厅", "巨幕厅"};
                        lv_pop01.setAdapter(new MypopListAdapter(XingzhengQus1));
                        lv_pop02.setVisibility(View.GONE);
                        vi_pop_line.setVisibility(View.GONE);
                        break;
                    case R.id.rb_003:
                        final String[] XingzhengQus2 = {"17.5影城", "星美国际", "万达", "博纳"};
                        lv_pop01.setAdapter(new MypopListAdapter(XingzhengQus2));
                        lv_pop02.setVisibility(View.GONE);
                        vi_pop_line.setVisibility(View.GONE);
                        break;
                    case R.id.rb_004:
                        final String[] XingzhengQus3 = {"17.小吃", "可退票", "可改签", "会员卡"};
                        lv_pop01.setAdapter(new MypopListAdapter(XingzhengQus3));
                        lv_pop02.setVisibility(View.GONE);
                        vi_pop_line.setVisibility(View.GONE);
                        break;
                }
            }
        });
        popupWindow.setTouchable(true);

        popupWindow.setTouchInterceptor(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Log.i("mengdd", "onTouch : ");
                return false;
                // 这里如果返回true的话，touch事件将被拦截
                // 拦截后 PopupWindow的onTouchEvent不被调用，这样点击外部区域无法dismiss
            }
        });

        // 如果不设置PopupWindow的背景，无论是点击外部区域还是Back键都无法dismiss弹框
        // 我觉得这里是API的一个bug
        popupWindow.setBackgroundDrawable(getResources().getDrawable(
                R.drawable.cinema_popupwindow1));
        popupWindow.setWidth(rv_cinema.getWidth());
        popupWindow.setHeight(DensityUtil.dip2px(350));
        // 设置好参数之后再show
        popupWindow.showAsDropDown(v);
//        popupWindow.setFocusable();
    }

    /**
     * pupWindow里的ListView的适配器
     */
    class MypopListAdapter extends BaseAdapter {

        private final String[] xingzhengQus;

        public MypopListAdapter(String[] xingzhengQus) {
            this.xingzhengQus = xingzhengQus;
        }

        @Override
        public int getCount() {
            return xingzhengQus.length;
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
            TextView textView = new TextView(context);
            textView.setHeight(DensityUtil.dip2px(55));
            textView.setTextSize(14);
            textView.setTextColor(Color.argb(255,0,0,0));
            textView.setGravity(Gravity.CENTER);
            textView.setText(xingzhengQus[position]);
            return textView;
        }
    }

    //初始化数据 重写父类的方法
    @Override
    public void initDate() {


        super.initDate();

        url = UrlUtils.URL_CINEMA;

        //取出缓存的数据
//        String saveJson = CacheUtils.getString(context, url);
//        //判断是否有本地数据
//        if (!TextUtils.isEmpty(saveJson)) {
//            processData(saveJson);
//        }

        // 联网请求数据


        getDataFromNet();


    }

    /**
     * 联网请求数据
     */
    private void getDataFromNet() {
        //获取list数据
        url = UrlUtils.URL_CINEMA;

        OkHttpUtils
                .get()
                .url(url)
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(Call call, Exception e, int id) {
                    }

                    @Override
                    public void onResponse(String response, int id) {
                        LogUtil.e("请求成功！！！！" + response);

                        CacheUtils.putString(context, url, response);
                        //解析数据
                        processData(response);


                    }
                });
        //获取头部数据
        url = UrlUtils.URL_CINEMA_HEADER;

        OkHttpUtils
                .get()
                .url(url)
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(Call call, Exception e, int id) {
                    }

                    @Override
                    public void onResponse(String response, int id) {
                        LogUtil.e("请求成功！！！！" + response);
                        //解析数据
                        processViewPagerData(response);

                        CacheUtils.putString(context, url, response);
                    }
                });

        //获取头部数据
        url = UrlUtilsFind.Url_dizhi;

        OkHttpUtils
                .get()
                .url(url)
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(Call call, Exception e, int id) {
                    }

                    @Override
                    public void onResponse(String response, int id) {
                        LogUtil.e("请求成功！！！！" + response);
                        //解析数据
                        processDiZhiData(response);

                        CacheUtils.putString(context, url, response);
                    }
                });


        MyOnClickListener myOnClickListener = new MyOnClickListener();


    }

    /**
     * 解析当前位置
     * @param response
     */
    private void processDiZhiData(String response) {
        CinemaDiZhiBean cinemaDiZhiBean = new Gson().fromJson(response, CinemaDiZhiBean.class);
        String detail = cinemaDiZhiBean.getData().getDetail();
        tv_cinema_dress.setText(detail);
        myCinemaAdapter.setDiZhiData(cinemaDiZhiBean);
    }

    private void processViewPagerData(String response) {
        Gson gson = new Gson();
        CinemaViewPagerBean cinemaViewPagerBean = gson.fromJson(response, CinemaViewPagerBean.class);
        List<CinemaViewPagerBean.DataBean> data = cinemaViewPagerBean.getData();
        myCinemaAdapter.setViewPagerData(data);
        myCinemaAdapter.notifyItemRangeChanged(0, 1);

    }

    private void processData(String result) {
        LogUtil.e("youmeiyou123 " + result);
        //转化成英文，不然会报错
        result = result.replace("朝阳区", "chaoyangqu");
        result = result.replace("海淀区", "haidianqu");
        result = result.replace("东城区", "dongchengqu");
        result = result.replace("丰台区", "fengtaiqu");
        result = result.replace("大兴区", "daxingqu");
        result = result.replace("西城区", "xichengqu");
        result = result.replace("通州区", "tongzhouqu");
        result = result.replace("昌平区", "changpingqu");
        result = result.replace("房山区", "fangshanqu");
        result = result.replace("顺义区", "shunyiqu");
        result = result.replace("门头沟区", "mentougouqu");
        result = result.replace("石景山区", "shijingshanqu");
        result = result.replace("怀柔区", "huairouqu");
        result = result.replace("平谷区", "pingguqu");
        result = result.replace("密云县", "miyunxian");
        result = result.replace("延庆县", "yanqingxian");

//        jsonData =result;
        LogUtil.e("youmeiyou " + result);
        Gson gson = new Gson();
        CinemaBean cinemaBean = gson.fromJson(result, CinemaBean.class);

        List<CinemaBean.DataBean.changpingquBean> changpingqu = cinemaBean.getData().getchangpingqu();
//        LogUtil.e(changpingqu.get(1).getNm());

        datas =changpingqu;
//        LogUtil.e(changpingqu.get(0).getNm());


        //设置适配器的数据
        myCinemaAdapter.setCinemaBean(changpingqu);
        myCinemaAdapter.notifyItemRangeChanged(1,changpingqu.size());
//


    }


}
