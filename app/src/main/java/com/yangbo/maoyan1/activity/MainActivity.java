package com.yangbo.maoyan1.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.yangbo.maoyan1.R;
import com.yangbo.maoyan1.fragment.CinemaFragment;
import com.yangbo.maoyan1.fragment.FindFragment;
import com.yangbo.maoyan1.fragment.MoiveFragment;
import com.yangbo.maoyan1.fragment.MyFragment;


public class MainActivity extends FragmentActivity {

    private RadioGroup rg_main;
    private RadioButton rb_moive;
    private FrameLayout fl_main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findView();
        initView();
    }
    private void findView() {
        rg_main = (RadioGroup)findViewById(R.id.rg_main);
        fl_main = (FrameLayout)findViewById(R.id.fl_main);
        rb_moive = (RadioButton)findViewById(R.id.rb_moive);
    }
    private void initView() {
        rg_main.check(0);

        rb_moive.setChecked(true);
        //默认替换第一个
         FragmentManager manager = getSupportFragmentManager();
         FragmentTransaction ft = manager.beginTransaction();
        ft.replace(R.id.fl_main,new MoiveFragment());
        ft.commit();

        rg_main.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                FragmentManager manager = getSupportFragmentManager();
                FragmentTransaction ft = manager.beginTransaction();
                switch (checkedId) {
                    case R.id.rb_moive :

                        ft.replace(R.id.fl_main,new MoiveFragment());
                        ft.commit();
                        break;
                    case R.id.rb_cinema :

                        ft.replace(R.id.fl_main,new CinemaFragment());
                        ft.commit();
                        break;
                    case R.id.rb_find :
                        ft.replace(R.id.fl_main,new FindFragment());
                        ft.commit();
                        break;
                    case R.id.rb_my :
                        ft.replace(R.id.fl_main,new MyFragment());
                        ft.commit();
                        break;

                }
            }
        });
    }
}
