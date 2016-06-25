package com.yangbo.maoyan1.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.Window;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.yangbo.maoyan1.R;
import com.yangbo.maoyan1.base.BaseFragment;
import com.yangbo.maoyan1.fragment.CinemaFragment;
import com.yangbo.maoyan1.fragment.FindFragment;
import com.yangbo.maoyan1.fragment.MoiveFragment;
import com.yangbo.maoyan1.fragment.MyFragment;

import java.util.ArrayList;


public class MainActivity extends FragmentActivity {

    private RadioGroup rg_main;
    private RadioButton rb_moive;
    private ArrayList<BaseFragment> list;
    private MainActivity context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context =this;
        findView();
        initView();
    }
    int cur = 0;
    private void findView() {
        rg_main = (RadioGroup)findViewById(R.id.rg_main);
        rb_moive = (RadioButton)findViewById(R.id.rb_moive);
    }

    private void initView() {
        list = new ArrayList<BaseFragment>();
        list.add(new MoiveFragment());
        list.add(new CinemaFragment());
        list.add(new FindFragment());
        list.add(new MyFragment());

        rg_main.check(0);

        rb_moive.setChecked(true);
        //默认替换第一个
//         FragmentManager manager = getSupportFragmentManager();
//         FragmentTransaction ft = manager.beginTransaction();
//        ft.replace(R.id.fl_main,new MoiveFragment());
//        ft.commit();
        switchFragment(0);

        rg_main.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                switch (checkedId) {
                    case R.id.rb_moive :
                            cur = 0;
//                        ft.replace(R.id.fl_main,new MoiveFragment());
//                        ft.commit();
                        break;
                    case R.id.rb_cinema :
                        cur = 1;
//                        ft.replace(R.id.fl_main,new CinemaFragment());
//                        ft.commit();
                        break;
                    case R.id.rb_find :
                        cur = 2;
//                        ft.replace(R.id.fl_main,new FindFragment());
//                        ft.commit();
                        break;
                    case R.id.rb_my :
                        cur = 3;
//                        ft.replace(R.id.fl_main,new MyFragment());
//                        ft.commit();
                        break;

                }
                switchFragment(cur);
            }
        });
    }

    private void switchFragment(int cur) {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction ft = manager.beginTransaction();
        ft.replace(R.id.fl_main,list.get(cur));
//            @Nullable
//            @Override
//            public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//                BaseFragment fragment = getFragment();
//                if(fragment != null) {
//                    return  fragment.initView();
//                }
//                return null;
//            }
//        });
        ft.commit();
    }

//    private BaseFragment getFragment() {
//        BaseFragment fragment = list.get(cur);
//        if(fragment != null) {
//            fragment.initDate();
//            return fragment;
//        }
//        return null;
//    }
}
