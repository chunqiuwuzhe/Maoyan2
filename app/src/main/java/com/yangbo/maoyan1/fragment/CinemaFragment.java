package com.yangbo.maoyan1.fragment;

import android.view.View;

import com.yangbo.maoyan1.R;
import com.yangbo.maoyan1.activity.MainActivity;
import com.yangbo.maoyan1.base.BaseFragment;


/**
 * Created by yangbo on 2016/6/22.
 */
public class CinemaFragment extends BaseFragment {


    public CinemaFragment(MainActivity context) {
        super();
    }

    @Override
    public View initView() {

        View view = View.inflate(context, R.layout.fragment_cinema,null);
        return view;
    }

    @Override
    public void initDate() {
        super.initDate();

    }
}
