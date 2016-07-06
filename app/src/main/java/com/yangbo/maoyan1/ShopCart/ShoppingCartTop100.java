package com.yangbo.maoyan1.ShopCart;

import com.yangbo.maoyan1.bean.Yingku_ReMenKouBeiBean;

import java.io.Serializable;

/**
 * Created by yangbo on 2016/7/5.
 */
public class ShoppingCartTop100 extends Yingku_ReMenKouBeiBean.DataBean.MoviesBean implements Serializable{
    private int count;//数量
    private boolean isChecked;//是否选中

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean checked) {
        isChecked = checked;
    }

    @Override
    public String toString() {
        return "ShoppingCartTop100{" +
                "count=" + count +
                ", isChecked=" + isChecked +
                '}';
    }
}
