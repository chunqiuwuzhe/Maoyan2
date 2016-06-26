package com.yangbo.maoyan1.fragment;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.gson.Gson;
import com.yangbo.maoyan1.R;
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

    TextView tv_moive_city;//城市

    TextView tv_cinema_dress;//底部地址

    private ImageView iv_cinema_select;//右上角选择

    private ImageView iv_cinema_search;//右上角搜素
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
        tv_moive_city = (TextView) view.findViewById(R.id.tv_moive_city);
        tv_cinema_dress = (TextView) view.findViewById(R.id.tv_cinema_dress);
        iv_cinema_select = (ImageView) view.findViewById(R.id.iv_cinema_select);
        iv_cinema_search = (ImageView) view.findViewById(R.id.iv_cinema_search);
        rv_cinema = (RecyclerView) view.findViewById(R.id.rv_cinema);

        //设置布局管理者
        rv_cinema.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false));
        //设置适配器
        myCinemaAdapter = new MyCinemaAdapter(context);
        rv_cinema.setAdapter(myCinemaAdapter);

        return view;

    }

    //初始化数据 重写父类的方法
    @Override
    public void initDate() {
        super.initDate();

        url = UrlUtils.URL_CINEMA;

        //取出缓存的数据
        String saveJson = CacheUtils.getString(context, url);
        //判断是否有本地数据
        if (!TextUtils.isEmpty(saveJson)) {
            processData(saveJson);
        }

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
                        //解析数据
                        processData(response);

                        CacheUtils.putString(context, url,response);
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

    }

    private void processViewPagerData(String response) {
        Gson gson = new Gson();
        CinemaViewPagerBean cinemaViewPagerBean = gson.fromJson(response, CinemaViewPagerBean.class);
        List<CinemaViewPagerBean.DataBean> data = cinemaViewPagerBean.getData();
        myCinemaAdapter.setViewPagerData(data);
    }

    private void processData(String result) {
        LogUtil.e("youmeiyou " + result);
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
        LogUtil.e("youmeiyou " + result);
        Gson gson = new Gson();
        CinemaBean cinemaBean = gson.fromJson(result, CinemaBean.class);

        List<CinemaBean.DataBean.changpingquBean> changpingqu = cinemaBean.getData().getchangpingqu();
        LogUtil.e(changpingqu.get(1).getNm());

        List datas =changpingqu;


        //设置适配器
        myCinemaAdapter.setCinemaBean(changpingqu);
        myCinemaAdapter.notifyItemRangeChanged(1,changpingqu.size());

    }


}
