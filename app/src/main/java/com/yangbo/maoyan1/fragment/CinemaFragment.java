package com.yangbo.maoyan1.fragment;

import android.content.Intent;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
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
import com.yangbo.maoyan1.bean.CinemaViewPagerBean;
import com.yangbo.maoyan1.utils.CacheUtils;
import com.yangbo.maoyan1.utils.UrlUtils;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import org.xutils.common.util.LogUtil;

import java.util.List;

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
                //跳转到新页面
                Intent intent = new Intent(context,CinemaDetailActivity.class);
                intent.putExtra("url",url);
                startActivity(intent);
            }
        });

//        initonclike();
        //
        rv_cinema.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN :

                        break;
                    case MotionEvent.ACTION_MOVE :
                        rl_cinema_dress.setVisibility(View.GONE);
                        break;
                    case MotionEvent.ACTION_UP :
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
    class MyOnClickListener implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.tv_cinena_city :
                    Toast.makeText(context, "tv_moive_city", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.iv_cinema_select :
                    Toast.makeText(context, "iv_cinema_select", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.iv_cinema_search :
//                    Toast.makeText(context, "iv_cinema_search", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(context,SearchCinemaActivity.class);
                    intent.putExtra("tt",jsonData);
                    startActivity(intent);


                    break;
            }
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

                        CacheUtils.putString(context, url,response);
                        //解析数据
                        processData(response);


                    }
                });

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

                        CacheUtils.putString(context, url,response);
                    }
                });


        MyOnClickListener myOnClickListener = new MyOnClickListener();



    }

    private void processViewPagerData(String response) {
        Gson gson = new Gson();
        CinemaViewPagerBean cinemaViewPagerBean = gson.fromJson(response, CinemaViewPagerBean.class);
        List<CinemaViewPagerBean.DataBean> data = cinemaViewPagerBean.getData();
        myCinemaAdapter.setViewPagerData(data);
        myCinemaAdapter.notifyItemRangeChanged(0,1);

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

    }


}
