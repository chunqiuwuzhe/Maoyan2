package com.yangbo.maoyan1.adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.yangbo.maoyan1.R;
import com.yangbo.maoyan1.bean.CinemaViewPagerBean;

import java.util.List;

/**
 * Created by yangbo on 2016/6/26.
 */
public class MyCinemaHeaderAdapter extends PagerAdapter{

    private final List<CinemaViewPagerBean.DataBean> viewPagerDatas;
    private Context context;

    public MyCinemaHeaderAdapter(Context context, List<CinemaViewPagerBean.DataBean> viewPagerDatas) {
        this.context = context;
        this.viewPagerDatas = viewPagerDatas;
    }

    @Override
    public int getCount() {
        return viewPagerDatas.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        ImageView imageView;
        imageView = new ImageView(context);
        String imgUrl = viewPagerDatas.get(position).getImgUrl();
        Glide.with(context).load(imgUrl)
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
//            super.destroyItem(container, position, object);
        container.removeView((View) object);
    }

}
