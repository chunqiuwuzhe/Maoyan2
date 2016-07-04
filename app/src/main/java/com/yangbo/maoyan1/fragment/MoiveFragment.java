package com.yangbo.maoyan1.fragment;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.yangbo.maoyan1.R;
import com.yangbo.maoyan1.activity.MainActivity;
import com.yangbo.maoyan1.base.BaseFragment;
import com.yangbo.maoyan1.base.BasePager;
import com.yangbo.maoyan1.pager.DaiYingPager;
import com.yangbo.maoyan1.pager.HaiWaiPager;
import com.yangbo.maoyan1.pager.ReYingPager;

import java.util.ArrayList;

import droid.Activity01;

/**
 * Created by yangbo on 2016/6/22.
 */
public class MoiveFragment extends BaseFragment {
    private ViewPager vp_moive_da;
    private LinearLayout ll_moive_zi;
    private LinearLayout ll_moive_bai;
    private TextView tv1;
    private TextView tv2;
    private TextView tv3;

    private MyDaViewPagerAdapter adapter;
    private ArrayList<BasePager> pagers;

    private TextView tv_moive_city;

    int leftMargin1;
    private ImageView iv_red_point;

//    public MoiveFragment(Context context) {
//        super();
//    }

    @Override
    public View initView() {

        View view = View.inflate(context, R.layout.fragment_moive, null);
        //
        vp_moive_da = (ViewPager) view.findViewById(R.id.vp_moive_da);
        ll_moive_zi = (LinearLayout) view.findViewById(R.id.ll_moive_zi);
        ll_moive_bai = (LinearLayout) view.findViewById(R.id.ll_moive_bai);
        iv_red_point = (ImageView) view.findViewById(R.id.iv_red_point);
        tv_moive_city = (TextView) view.findViewById(R.id.tv_moive_city);
        tv1 = (TextView) view.findViewById(R.id.tv1);
        tv2 = (TextView) view.findViewById(R.id.tv2);
        tv3 = (TextView) view.findViewById(R.id.tv3);

        tv_moive_city.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(context, Activity01.class);
                ((MainActivity)context).startActivityForResult(intent1,1);
            }
        });
        //调自己别的回调方法，取得城市的信息
        ( (MainActivity) context).setMyHuidiaoListener(new MainActivity.MyHuidiaoListener() {
            @Override
            public void myHuidiao(final String key) {


                if(key != tv_moive_city.getText()) {
                    TextView textView = new TextView(context);
                    textView.setText("你选择的城市与定位城市不同，是否切换？");
                    new AlertDialog.Builder(context)
                            .setTitle("提示")
                            .setView(textView)
                            .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    tv_moive_city.setText(key);
                                }
                            })
                            .setNegativeButton("取消", null)
                            .show();
                }

            }
        });

        return view;
    }

    @Override
    public void initDate() {
        super.initDate();
        adapter = new MyDaViewPagerAdapter();

        pagers = new ArrayList<BasePager>();

        //装数据
        pagers.add(new ReYingPager(context));
        pagers.add(new DaiYingPager(context));
        pagers.add(new HaiWaiPager(context));
        //适配器
        vp_moive_da.setAdapter(adapter);
        //默认加载热映界面
        vp_moive_da.setCurrentItem(0);
        pagers.get(0).initData();
        vp_moive_da.addOnPageChangeListener(new MtOnPageChangeListener());

        //得到总间距
        //监听onlayout的执行
        iv_red_point.getViewTreeObserver().addOnGlobalLayoutListener(new MyOnGlobalLayoutListener());

        //监听ViewPager的滑动
        vp_moive_da.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                int instance = (int) ((positionOffset + position) * leftMargin1);
                if (instance < leftMargin1) {
                    tv1.setAlpha(positionOffset);
                    tv2.setAlpha(positionOffset);
                }
                if (leftMargin1 < instance && instance < leftMargin1 * 2) {
                    tv3.setAlpha(positionOffset);
                    tv2.setAlpha(positionOffset);
                }
                if (instance == leftMargin1 || instance == 0 || instance == leftMargin1 * 2) {
                    tv1.setAlpha(1);
                    tv2.setAlpha(1);
                    tv3.setAlpha(1);
                }

//                iv_red_point.setLeft(instance);
                //得到红点的属性
                LinearLayout.LayoutParams redParams = (LinearLayout.LayoutParams) iv_red_point.getLayoutParams();
                redParams.leftMargin = instance;
                iv_red_point.setLayoutParams(redParams);//不加会出现直接跳过去的效果
            }

            @Override
            public void onPageSelected(int position) {
                //设置导航栏字体的颜色
                for (int i = 0; i < 3; i++) {
                    ((TextView) (ll_moive_zi.getChildAt(i))).setTextColor(Color.WHITE);
                }
                ((TextView) (ll_moive_zi.getChildAt(position))).setTextColor(Color.RED);
            }

            @Override
            public void onPageScrollStateChanged(int state) {
            }
        });
        /**
         * 导航栏的点击事件
         */
        daoHangClick();
    }

    /**
     * 导航栏的点击事件
     */
    private void daoHangClick() {
        DaoHangOnClickListener listener = new DaoHangOnClickListener();
        tv1.setOnClickListener(listener);
        tv2.setOnClickListener(listener);
        tv3.setOnClickListener(listener);
    }
    //导航栏的点击事件
    class DaoHangOnClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.tv1:
                    vp_moive_da.setCurrentItem(0);
                    break;
                case R.id.tv2:
                    vp_moive_da.setCurrentItem(1);
                    break;
                case R.id.tv3:
                    vp_moive_da.setCurrentItem(2);
                    break;
            }
        }
    }

    class MyOnGlobalLayoutListener implements ViewTreeObserver.OnGlobalLayoutListener {

        @Override
        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                iv_red_point.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
            leftMargin1 = ll_moive_zi.getChildAt(1).getLeft() - ll_moive_zi.getChildAt(0).getLeft();
        }
    }


    //ViewPager的适配器
    class MyDaViewPagerAdapter extends PagerAdapter {

        @Override
        public int getCount() {
            return pagers.size();
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view == object;
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            BasePager baseFragment = pagers.get(position);
            View rootView = baseFragment.rootView;
            container.addView(rootView);
            return rootView;
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
//            super.destroyItem(container, position, object);
            container.removeView((View) object);
        }
    }

    private class MtOnPageChangeListener implements ViewPager.OnPageChangeListener {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int position) {
            pagers.get(position).initData();
        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    }
}
