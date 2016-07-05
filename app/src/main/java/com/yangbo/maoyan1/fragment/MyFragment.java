package com.yangbo.maoyan1.fragment;

import android.content.Intent;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.yangbo.maoyan1.R;
import com.yangbo.maoyan1.activity.LoginActivity;
import com.yangbo.maoyan1.activity.MainActivity;
import com.yangbo.maoyan1.activity.MyShopCityActivity;
import com.yangbo.maoyan1.base.BaseFragment;

import org.xutils.common.util.LogUtil;


/**
 * Created by yangbo on 2016/6/22.
 */
public class MyFragment extends BaseFragment {
   TextView tv_my_denglu;
    private RelativeLayout rl_shopCity;

//        public MoiveFragment(Context context) {
//        super();
//    }
    @Override
    public View initView() {

        View view = View.inflate(context, R.layout.fragment_my, null);
        rl_shopCity = (RelativeLayout) view.findViewById(R.id.rl_shopCity);
        tv_my_denglu = (TextView) view.findViewById(R.id.tv_my_denglu);
        rl_shopCity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context, MyShopCityActivity.class));
            }
        });
        tv_my_denglu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
        Intent intent =new Intent(context, LoginActivity.class);
        ((MainActivity)context).startActivityForResult(intent,3);

            }
        });
        ((MainActivity) context).setMyHuidiaoListener1(new MainActivity.MyHuidiaoListener1() {
            @Override
            public void myHuidiao1(String key) {
                LogUtil.e(key);
                tv_my_denglu.setText(key);
            }
        });
        return view;
    }

    @Override
    public void initDate() {
        super.initDate();
    }
}
