package com.yangbo.maoyan1.bean;

import java.util.List;

/**
 * Created by sdf on 2016/7/1.
 */
public class ShopFenLeiBean {

    /**
     * list : [{"dealid":37323387,"pic":"http://p0.meituan.net/348.348/movie/3c9e4fece8bf3928b15ae89ef9555907287908.jpg@60q","price":29.9,"shortTitle":"","title":"正版复仇者联盟美国队长3钥匙扣","value":39},{"dealid":35901907,"pic":"http://p0.meituan.net/348.348/movie/0b9faee2813125f84633b22c518f590d67269.jpg@60q","price":29.8,"shortTitle":"","title":"疯狂动物城系列 卡通眼罩","value":39},{"dealid":31608427,"pic":"http://p0.meituan.net/348.348.60/movie/c6c8d1733e1fefe56ddfebbe15e1a69e320408.jpg","price":59,"shortTitle":"","title":"小黄人超萌公仔存钱罐","value":128},{"dealid":33412941,"pic":"http://p1.meituan.net/348.348/movie/c14b4916914608d8bb200dc390329b6f186123.jpg@60q","price":9.9,"shortTitle":"","title":"QQ游戏苹果手机防爆钢化膜","value":109},{"dealid":31774424,"pic":"http://p1.meituan.net/348.348.60/movie/eae5a755812f0b657bced63324293015340251.jpg","price":30,"shortTitle":"","title":"《港囧》官方正版 钥匙链组合","value":99},{"dealid":30475164,"pic":"http://p1.meituan.net/348.348.60/movie/16bfafa4cc84f23d40c4ea7d3c6e968f105019.jpg","price":28,"shortTitle":"","title":"《捉妖记》 萌妖胡巴款 快乐台历","value":49},{"dealid":38471243,"pic":"http://p0.meituan.net/348.348/movie/56cef8342b8ecb4f291aec3edb9cf7e9141568.jpg@60q","price":28,"shortTitle":"","title":"魔兽 部落3D眼镜","value":99},{"dealid":33241182,"pic":"http://p0.meituan.net/348.348.60/movie/a168f7ce703133d97d876e38888996ba163164.jpg","price":49,"shortTitle":"","title":"《美国队长》盾牌造型固体香薰","value":69},{"dealid":35901953,"pic":"http://p1.meituan.net/348.348/movie/a34c9d90f8daa486e1bdb1ef0748b091128500.jpg@60q","price":29.8,"shortTitle":"","title":"疯狂动物城双面小圆镜","value":39},{"dealid":33450513,"pic":"http://p1.meituan.net/348.348.60/movie/16026ac964f15715d239745b97b0d4b6346781.jpg","price":29.9,"shortTitle":"","title":"格多维寻龙诀偏光3D眼镜","value":68}]
     * total : 205
     */

    private DataBean data;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        private int total;
        /**
         * dealid : 37323387
         * pic : http://p0.meituan.net/348.348/movie/3c9e4fece8bf3928b15ae89ef9555907287908.jpg@60q
         * price : 29.9
         * shortTitle :
         * title : 正版复仇者联盟美国队长3钥匙扣
         * value : 39
         */

        private List<ListBean> list;

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class ListBean {
            private int dealid;
            private String pic;
            private double price;
            private String shortTitle;
            private String title;
            private int value;

            public int getDealid() {
                return dealid;
            }

            public void setDealid(int dealid) {
                this.dealid = dealid;
            }

            public String getPic() {
                return pic;
            }

            public void setPic(String pic) {
                this.pic = pic;
            }

            public double getPrice() {
                return price;
            }

            public void setPrice(double price) {
                this.price = price;
            }

            public String getShortTitle() {
                return shortTitle;
            }

            public void setShortTitle(String shortTitle) {
                this.shortTitle = shortTitle;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public int getValue() {
                return value;
            }

            public void setValue(int value) {
                this.value = value;
            }
        }
    }
}
