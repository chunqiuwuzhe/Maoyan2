package com.yangbo.maoyan1.adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.yangbo.maoyan1.R;
import com.yangbo.maoyan1.bean.ShopCityVpBean;

import java.util.List;

/**
 * Created by sdf on 2016/6/29.
 */
public class ShopVPAdapter extends PagerAdapter {
    private Context context;
    List<ShopCityVpBean.DataBean> beans;
    public ShopVPAdapter(Context context, List<ShopCityVpBean.DataBean> beans) {
        this.context=context;
        this.beans=beans;
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
        ImageView imageView=new ImageView(context);
        int i = position % beans.size();
        String imgUrl = beans.get(i).getImgUrl();
        //联网请求图片
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
//        super.destroyItem(container, position, object);
        container.removeView((View) object);
    }
}
