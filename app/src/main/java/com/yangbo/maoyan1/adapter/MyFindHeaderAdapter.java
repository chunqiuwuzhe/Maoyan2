package com.yangbo.maoyan1.adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.yangbo.maoyan1.R;
import com.yangbo.maoyan1.bean.FindViewPagerBean;

import java.util.List;

/**
 * Created by yangbo on 2016/6/28.
 */
public class MyFindHeaderAdapter extends PagerAdapter {
    //数据集合
    private final List<FindViewPagerBean.DataBean> datas;
    private final Context context;

    public MyFindHeaderAdapter(Context context, List<FindViewPagerBean.DataBean> datas) {
        this.context = context;
        this.datas = datas;
    }

    @Override
    public int getCount() {
        return 1000;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        ImageView imageView = new ImageView(context);
        int i = position % datas.size();
        String imgUrl = datas.get(i).getImgUrl();

        Glide.with(context).load(imgUrl)
                .placeholder(R.drawable.kg)
                .error(R.drawable.kg)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(imageView);
        //拉伸
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
