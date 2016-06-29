package com.yangbo.maoyan1.fragment;

import android.content.Intent;
import android.view.View;
import android.widget.RelativeLayout;

import com.yangbo.maoyan1.R;
import com.yangbo.maoyan1.activity.MyShopCityActivity;
import com.yangbo.maoyan1.base.BaseFragment;


/**
 * Created by yangbo on 2016/6/22.
 */
public class MyFragment extends BaseFragment {

    private RelativeLayout rl_shopCity;

//        public MoiveFragment(Context context) {
//        super();
//    }
    @Override
    public View initView() {

        View view = View.inflate(context, R.layout.fragment_my,null);
        rl_shopCity = (RelativeLayout) view.findViewById(R.id.rl_shopCity);
        rl_shopCity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context,MyShopCityActivity.class));
            }
        });
        return view;
    }

    @Override
    public void initDate() {
        super.initDate();
    }
}
