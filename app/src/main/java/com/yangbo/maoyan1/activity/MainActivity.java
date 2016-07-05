package com.yangbo.maoyan1.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.KeyEvent;
import android.view.Window;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.yangbo.maoyan1.R;
import com.yangbo.maoyan1.base.BaseFragment;
import com.yangbo.maoyan1.fragment.CinemaFragment;
import com.yangbo.maoyan1.fragment.FindFragment;
import com.yangbo.maoyan1.fragment.MoiveFragment;
import com.yangbo.maoyan1.fragment.MyFragment;

import org.xutils.common.util.LogUtil;
import org.xutils.x;

import java.util.ArrayList;


public class MainActivity extends FragmentActivity {

    private RadioGroup rg_main;
    private RadioButton rb_moive;
    private ArrayList<BaseFragment> list;
    private MainActivity context;

    private long firstTime; //第一次按下back键的时间
    private String key;

    public String getKey() {
        return key;
    }

    @Override
    public boolean onKeyUp(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            if ((System.currentTimeMillis() - firstTime) > 2000) {//当前是第一次
                //提示
                Toast.makeText(this, "再按一次退出", Toast.LENGTH_SHORT).show();
                //记录时间
                firstTime = System.currentTimeMillis();
                return true;
            } else {
                //清除缓存(内存)
                x.image().clearMemCache();
                //清除缓存(文件)
                //x.image().clearCacheFiles();
            }
        }
        return super.onKeyUp(keyCode, event);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        //注册EvenBus
//        EventBus.getDefault().register(this);

        context = this;
        findView();
        initView();
    }
//    public void onEventMainThread(FirstEvent event) {
//        String msg =  event.getMsg();
//        LogUtil.e(msg.toString());
//    }

    //    public void staAc(){
//        Intent intent= new Intent(this, Activity01.class);
//        startActivityForResult(intent,1);
//    }
    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==1&&requestCode==2) {
            data.getStringExtra("current");
        }
        if(requestCode==1&&requestCode==1) {
            key = data.getStringExtra("key");
            LogUtil.e(key + "!!!!!!!!!!!!!!!!!!!!!!!!");
            if(myHuidiaoListener!=null) {
                myHuidiaoListener.myHuidiao(key);
            }
        }
        if(requestCode==3&&requestCode==3) {
            String name = data.getStringExtra("name");
            LogUtil.e(name + "!!!!!!!!!!!!!!!!!!!!!!!!");
            if(myHuidiaoListener1!=null) {
                myHuidiaoListener1.myHuidiao1(name);
            }
        }

    }
    public interface MyHuidiaoListener{
        public void myHuidiao(String key);
    }

    public MyHuidiaoListener myHuidiaoListener;

    public void setMyHuidiaoListener(MyHuidiaoListener myHuidiaoListener) {
        this.myHuidiaoListener = myHuidiaoListener;
    }
    //登陆的回调
    public interface MyHuidiaoListener1{
        public void myHuidiao1(String key);
    }

    public MyHuidiaoListener1 myHuidiaoListener1;

    public void setMyHuidiaoListener1(MyHuidiaoListener1 myHuidiaoListener1) {
        this.myHuidiaoListener1 = myHuidiaoListener1;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        //解注册Evenbus
//        EventBus.getDefault().unregister(this);
    }

    int cur = 0;

    private void findView() {
        rg_main = (RadioGroup) findViewById(R.id.rg_main);
        rb_moive = (RadioButton) findViewById(R.id.rb_moive);
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
                    case R.id.rb_moive:
                        cur = 0;
//                        ft.replace(R.id.fl_main,new MoiveFragment());
//                        ft.commit();
                        break;
                    case R.id.rb_cinema:
                        cur = 1;
//                        ft.replace(R.id.fl_main,new CinemaFragment());
//                        ft.commit();
                        break;
                    case R.id.rb_find:
                        cur = 2;
//                        ft.replace(R.id.fl_main,new FindFragment());
//                        ft.commit();
                        break;
                    case R.id.rb_my:
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
        ft.replace(R.id.fl_main, list.get(cur));
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
