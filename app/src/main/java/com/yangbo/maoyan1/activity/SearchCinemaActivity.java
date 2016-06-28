package com.yangbo.maoyan1.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.Window;
import android.widget.EditText;

import com.google.gson.Gson;
import com.yangbo.maoyan1.R;
import com.yangbo.maoyan1.adapter.MyCinemaAdapter;
import com.yangbo.maoyan1.bean.CinemaBean;

import org.xutils.common.util.LogUtil;

import java.util.ArrayList;
import java.util.List;

public class SearchCinemaActivity extends Activity {
    //输入框
    EditText et_seach_cinema;

    RecyclerView rv_search_cinema;
    List datas;
    private List<CinemaBean.DataBean.changpingquBean> changpingqu;
    private MyCinemaAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_cinema);
        //初始化视图
        findView();
        initView();

    }

    private void initView() {

        adapter = new MyCinemaAdapter(this, 2);
        rv_search_cinema.setAdapter(adapter);

        et_seach_cinema.addTextChangedListener(watcher);

    }

    //描述EditView监听
    private TextWatcher watcher = new TextWatcher() {

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
//            searchData(s+"");
        }


        public void beforeTextChanged(CharSequence s, int start, int count,
                                      int after) {

        }

        @Override
        public void afterTextChanged(Editable s) {
        }
    };

    private void findView() {
        //初始化
        et_seach_cinema = (EditText) findViewById(R.id.et_seach_cinema);
        rv_search_cinema = (RecyclerView) findViewById(R.id.rv_search_cinema);
    }
    //查询数据
    private void searchData(String s) {

        String result = getIntent().getStringExtra("tt");
        LogUtil.e("=================="+ result);

        Gson gson = new Gson();
        CinemaBean cinemaBean = gson.fromJson(result, CinemaBean.class);
        List<CinemaBean.DataBean.changpingquBean> changpingqu;
        if(cinemaBean!=null) {
            changpingqu = cinemaBean.getData().getchangpingqu();
//        LogUtil.e(changpingqu.get(1).getNm());


            datas = new ArrayList<CinemaBean.DataBean.changpingquBean>();
            if (!TextUtils.isEmpty(s)) {
                for (int i = 0; i < changpingqu.size(); i++) {
                    if (changpingqu.get(i).getNm().contains(s)) {
                        datas.add(changpingqu.get(i));
                    }
                }

            }
        }


        //设置适配器的数据
        adapter.setCinemaBean(datas);
        adapter.notifyItemRangeChanged(1,datas.size());

    }

}
