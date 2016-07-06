package com.yangbo.maoyan1.utils;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.yangbo.maoyan1.ShopCart.ShoppingCartTop100;
import com.yangbo.maoyan1.bean.Yingku_ReMenKouBeiBean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yangbo on 2016/7/5.
 */
public class CartProviderTop100 {
    private static final String CART_JSON = "cart_json";
    private final Context context;
    /**
     * 性能比HashMap好的一个类
     */
    private SparseArray<ShoppingCartTop100> datas;//当前内存

    public CartProviderTop100(Context context) {
        //默认长度为10
        this.context = context;
        datas = new SparseArray<>(10);
        listToSparse();
    }

    /**
     * 把List中的数据赋值到SparseArray<ShoppingCartTop100> datas 的列表中！
     */
    private void listToSparse() {
        List<ShoppingCartTop100> carts = getAllData();
        if (carts != null && carts.size() > 0) {
            for (int i = 0; i < carts.size(); i++) {
                ShoppingCartTop100 cart = carts.get(i);

                datas.put(cart.getId(), cart);
            }
        }
    }

    /**
     * 得到所有数据
     *
     * @return
     */
    public List<ShoppingCartTop100> getAllData() {
        return getDateFromLocal();
    }

    /**
     * 从本地获取数据
     * @return
     */
    private List<ShoppingCartTop100> getDateFromLocal() {
        List<ShoppingCartTop100> list = new ArrayList<>();
        //获取本地的json数据
        String json = CacheUtils.getString(context, CART_JSON);
        if (!TextUtils.isEmpty(json)) {
            //把json解析成集合
            list = new Gson().fromJson(json, new TypeToken<List<ShoppingCartTop100>>() {
            }.getType());
        }
        return list;
    }

    /**
     * 增
     *
     * @param cart
     */
    public void addData(ShoppingCartTop100 cart) {
        //1.添加到当前内存中datas
        //1.当前内存中datas修改
        ShoppingCartTop100 temp = datas.get(cart.getId());
        if (temp != null) {//已经存在
            temp.setCount(temp.getCount() + 1);
        } else {
            temp = cart;
            temp.setCount(1);
        }
//        cart.getData().getMovies().get(1).getId()
        datas.put(cart.getId(), temp);
        //2.保存到本地中
        commit();
    }


    /**
     * 删
     *
     * @param cart
     */
    public void deleleData(ShoppingCartTop100 cart) {
        //1.当前内存中datas删除数据
        datas.delete(cart.getId());
        //2.保存到本地中
        commit();
    }

    /**
     * 改
     *
     * @param cart
     *
     *  //1.在内存中添加
    ShoppingCartTop100 temp = datas.get(cart.getId());
    if (temp != null) {
    temp.setCount(temp.getCount() + 1);
    } else {
    temp = cart;
    temp.setCount(1);
    }
    datas.put(cart.getId(), temp);

     */
    public void updateData(ShoppingCartTop100 cart) {

        datas.put(cart.getId(), cart);
        //2.保存到本地中
        commit();
    }

    /**
     * 把内存中的数据保存到本地
     * 把Sparse转化成List
     * 把List转化成String
     * 保存到本地
     */
    private void commit() {
        List<ShoppingCartTop100> carts = SparseToList();
        String json = new Gson().toJson(carts);
        CacheUtils.putString(context,CART_JSON,json);
    }

    private List<ShoppingCartTop100> SparseToList() {
        List<ShoppingCartTop100> list = new ArrayList<>();
        if (datas != null && datas.size() > 0) {
            for (int i = 0; i < datas.size(); i++) {
                //使用的方法是valueAt(i)
                list.add(datas.valueAt(i));//注意：：：：：：：valueAt()
            }
        }
        return list;
    }


    public ShoppingCartTop100 conversion(Yingku_ReMenKouBeiBean.DataBean.MoviesBean wares) {
        ShoppingCartTop100 cart = new ShoppingCartTop100();
        cart.setId(wares.getId());
        cart.setImg(wares.getImg());
        cart.setNm(wares.getNm());
        cart.setStar(wares.getStar());
        cart.setRt(wares.getRt());
        cart.setSc(wares.getSc());
//        cart.setCount(1);
//        cart.setChacked(true);
        return cart;
    }

}
