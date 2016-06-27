package com.yangbo.maoyan1.adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.yangbo.maoyan1.R;
import com.yangbo.maoyan1.bean.ReYing_ViewPager_bean;

import java.util.List;

/**
 * Created by sdf on 2016/6/25.
 */
public class ReYing_title_Adapter extends PagerAdapter {
    private Context context;
    private List<ReYing_ViewPager_bean.DataBean> vpData;
    public ReYing_title_Adapter(Context context,List<ReYing_ViewPager_bean.DataBean> imageUrl) {
        this.context=context;
        this.vpData=imageUrl;
        Log.e("imagerUrl+++",imageUrl.toString());
    }

    @Override
    public int getCount() {
        return 1000;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        int i = position % vpData.size();
        //获取图片URL路径 动态创建一个imageView 将获取的图片赋值给imageView 添加到ViewPager中 返回
        String imgurl = vpData.get(i).getImgUrl();
        ImageView imageView=new ImageView(context);
        Glide.with(context).load(imgurl)
                .placeholder(R.drawable.kg)
                .error(R.drawable.kg)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(imageView);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        container.addView(imageView);
        return imageView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
//        super.destroyItem(container, position, object);
        container.removeView((View) object);
    }
}
