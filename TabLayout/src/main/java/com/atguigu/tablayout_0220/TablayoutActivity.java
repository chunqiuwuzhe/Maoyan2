package com.atguigu.tablayout_0220;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class TablayoutActivity extends AppCompatActivity {

    private TabLayout tb;
    private ViewPager vp;
    private List<Fragment> listFragment;
    private String names[] = {"宋仲基","高圆圆","刘涛"};
    private Toolbar toolbar;
    private ActionBarDrawerToggle toggle;
    private DrawerLayout dl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tablayout);

        initView();
        initData();

    }

    private void initData() {
        //填加tablayout的item
        tb.addTab(tb.newTab().setText(names[0]));
        tb.addTab(tb.newTab().setText(names[1]));
        tb.addTab(tb.newTab().setText(names[2]));

        ActionBar actionBar = getSupportActionBar();
        //设置当前的控件可用
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeButtonEnabled(true);
        //设置actionbar的一张图片
        //actionBar.setHomeAsUpIndicator(R.mipmap.ic_launcher);
        actionBar.setDisplayShowTitleEnabled(true);

        //第一个参数activity 第二个参数drawlayout 第三个参数Toolbar 第四个和第五个是打开和关闭的文字
        toggle = new ActionBarDrawerToggle(this, dl, toolbar,
                R.string.aa, R.string.bb);
        //该方法会自动和ToolBar关联
        toggle.syncState();

        dl.setDrawerListener(new DrawerLayout.DrawerListener() {
            @Override
            public void onDrawerSlide(View drawerView, float slideOffset) {
                toggle.onDrawerSlide(drawerView, slideOffset);
            }

            @Override
            public void onDrawerOpened(View drawerView) {
                toggle.onDrawerOpened(drawerView);
            }

            @Override
            public void onDrawerClosed(View drawerView) {
                toggle.onDrawerClosed(drawerView);
            }

            @Override
            public void onDrawerStateChanged(int newState) {
                toggle.onDrawerStateChanged(newState);
            }
        });

        setFragment();
        vp.setAdapter(new MyPager(getSupportFragmentManager()));
        //tablayout绑定viewPager
        tb.setupWithViewPager(vp);
    }

    private void setFragment() {
        listFragment = new ArrayList<>();
        listFragment.add(new HomeFragment());
        listFragment.add(new HomeFragment());
        listFragment.add(new HomeFragment());
    }

    private void initView() {
        tb = (TabLayout) findViewById(R.id.tb);
        vp = (ViewPager) findViewById(R.id.vp);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        dl = (DrawerLayout) findViewById(R.id.dl);
        setSupportActionBar(toolbar);
    }

    class MyPager extends FragmentPagerAdapter{

        public MyPager(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return listFragment.get(position);
        }

        @Override
        public int getCount() {
            return listFragment.size();
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return names[position];
        }
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return toggle.onOptionsItemSelected(item);
    }


}
