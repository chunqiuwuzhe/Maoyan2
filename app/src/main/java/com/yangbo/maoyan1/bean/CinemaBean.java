//package com.yangbo.maoyan1.bean;
//
//import java.util.List;
//
///**
// * Created by yangbo on 2016/6/24.
// */
//public class CinemaBean {
//
//    /**
//     * expires : 43200
//     */
//
//    private ControlBean control;
//    /**
//     * control : {"expires":43200}
//     * status : 0
//     * data : {"朝阳区":[{"poiId":75603,"nm":"17.5影城(比如世界店)","sellmin":0,"sell":true,"preferential":0,"addr":"朝阳区京顺路111号比如世界购物中心1层（近太阳宫北街）","area":"朝阳区","ct":"","lat":39.9684,"lng":116.46204,"brd":"17.5影城","dis":"望京","deal":0,"distance":0,"follow":0,"imax":0,"sellPrice":22,"dealPrice":0,"referencePrice":70,"showCount":0,"brdId":23854,"id":48},{"poiId":1677952,"nm":"17.5影城(管庄店)","sellmin":0,"sell":true,"preferential":0,"addr":"朝阳区朝阳路京通苑30号楼L307PLus365购物中心三层","area":"朝阳区","ct":"","lat":39.912422,"lng":116.596085,"brd":"17.5影城","dis":"管庄","deal":0,"distance":0,"follow":0,"imax":0,"sellPrice":27,"dealPrice":0,"referencePrice":60,"showCount":0,"brdId":23854,"id":2243},{"poiId":360511,"nm":"CGV星聚汇星星影城(奥体店)","sellmin":0,"sell":true,"preferential":0,"addr":"朝阳区湖景东路11号新奥购物中心B1-B2楼","area":"朝阳区","ct":"","lat":39.999462,"lng":116.39392,"brd":"CGV星聚汇影城","dis":"亚运村","deal":0,"distance":0,"foll
//     */
//
//    private int status;
//    private DataBean data;
//
//    public ControlBean getControl() {
//        return control;
//    }
//
//    public void setControl(ControlBean control) {
//        this.control = control;
//    }
//
//    public int getStatus() {
//        return status;
//    }
//
//    public void setStatus(int status) {
//        this.status = status;
//    }
//
//    public DataBean getData() {
//        return data;
//    }
//
//    public void setData(DataBean data) {
//        this.data = data;
//    }
//
//    public static class ControlBean {
//        private int expires;
//
//        public int getExpires() {
//            return expires;
//        }
//
//        public void setExpires(int expires) {
//            this.expires = expires;
//        }
//    }
//
//    public static class DataBean {
//        /**
//         * poiId : 75603
//         * nm : 17.5影城(比如世界店)
//         * sellmin : 0
//         * sell : true
//         * preferential : 0
//         * addr : 朝阳区京顺路111号比如世界购物中心1层（近太阳宫北街）
//         * area : 朝阳区
//         * ct :
//         * lat : 39.9684
//         * lng : 116.46204
//         * brd : 17.5影城
//         * dis : 望京
//         * deal : 0
//         * distance : 0
//         * follow : 0
//         * imax : 0
//         * sellPrice : 22.0
//         * dealPrice : 0.0
//         * referencePrice : 70.0
//         * showCount : 0
//         * brdId : 23854
//         * id : 48
//         */
//
//        private List<朝阳区Bean> 朝阳区;
//        /**
//         * poiId : 273950
//         * nm : 17.5影城(今典花园店)
//         * sellmin : 0
//         * sell : true
//         * preferential : 0
//         * addr : 海淀区文慧园路9号今典花园9号楼空间蒙太奇大厦1层
//         * area : 海淀区
//         * ct :
//         * lat : 39.95334
//         * lng : 116.36104
//         * brd : 17.5影城
//         * dis : 北太平庄
//         * deal : 1
//         * distance : 0
//         * follow : 0
//         * imax : 0
//         * sellPrice : 27.0
//         * dealPrice : 30.0
//         * referencePrice : 60.0
//         * showCount : 0
//         * brdId : 23854
//         * id : 154
//         */
//
//        private List<海淀区Bean> 海淀区;
//        /**
//         * poiId : 94496
//         * nm : UME国际影城(安贞店)
//         * sellmin : 0
//         * sell : true
//         * preferential : 0
//         * addr : 东城区北三环安贞桥环球贸易中心E座
//         * area : 东城区
//         * ct :
//         * lat : 39.966072
//         * lng : 116.41096
//         * brd : UME国际影城
//         * dis : 安贞
//         * deal : 0
//         * distance : 0
//         * follow : 0
//         * imax : 0
//         * sellPrice : 39.5
//         * dealPrice : 0.0
//         * referencePrice : 70.0
//         * showCount : 0
//         * brdId : 24071
//         * id : 99
//         */
//
//        private List<东城区Bean> 东城区;
//        /**
//         * poiId : 339944
//         * nm : 保利国际影城(凯德MALL·大峡谷店)
//         * sellmin : 0
//         * sell : true
//         * preferential : 0
//         * addr : 丰台区南三环西路16号凯德大峡谷购物中心5楼
//         * area : 丰台区
//         * ct :
//         * lat : 39.854645
//         * lng : 116.36706
//         * brd : 保利国际影城
//         * dis : 草桥
//         * deal : 0
//         * distance : 0
//         * follow : 0
//         * imax : 0
//         * sellPrice : 39.0
//         * dealPrice : 0.0
//         * referencePrice : 40.0
//         * showCount : 0
//         * brdId : 24472
//         * id : 42
//         */
//
//        private List<丰台区Bean> 丰台区;
//        /**
//         * poiId : 1481117
//         * nm : 保利国际影城(绿地缤纷城店)
//         * sellmin : 0
//         * sell : true
//         * preferential : 0
//         * addr : 大兴区金星西路3号绿地缤纷城购物中心4层
//         * area : 大兴区
//         * ct :
//         * lat : 39.764683
//         * lng : 116.33354
//         * brd : 保利国际影城
//         * dis : 绿地缤纷城
//         * deal : 0
//         * distance : 0
//         * follow : 0
//         * imax : 0
//         * sellPrice : 39.0
//         * dealPrice : 0.0
//         * referencePrice : 70.0
//         * showCount : 0
//         * brdId : 24472
//         * id : 2392
//         */
//
//        private List<大兴区Bean> 大兴区;
//        /**
//         * poiId : 271434
//         * nm : 北京青年宫
//         * sellmin : 0
//         * sell : true
//         * preferential : 0
//         * addr : 西城区西直门南小街68号
//         * area : 西城区
//         * ct :
//         * lat : 39.93531
//         * lng : 116.35955
//         * brd : 其它
//         * dis : 西直门
//         * deal : 0
//         * distance : 0
//         * follow : 0
//         * imax : 0
//         * sellPrice : 38.0
//         * dealPrice : 0.0
//         * referencePrice : 50.0
//         * showCount : 0
//         * brdId : 0
//         * id : 260
//         */
//
//        private List<西城区Bean> 西城区;
//        /**
//         * poiId : 363447
//         * nm : 博纳国际影城(通州北苑店)
//         * sellmin : 0
//         * sell : true
//         * preferential : 0
//         * addr : 通州区杨庄北里52号华联天时名苑购物中心4楼（近通州北苑地铁站）
//         * area : 通州区
//         * ct :
//         * lat : 39.903496
//         * lng : 116.6367
//         * brd : 博纳国际影城
//         * dis : 新华联
//         * deal : 0
//         * distance : 0
//         * follow : 0
//         * imax : 0
//         * sellPrice : 39.0
//         * dealPrice : 0.0
//         * referencePrice : 80.0
//         * showCount : 0
//         * brdId : 24595
//         * id : 2
//         */
//
//        private List<通州区Bean> 通州区;
//        /**
//         * poiId : 3320660
//         * nm : 保利国际影城(龙旗广场店)
//         * sellmin : 0
//         * sell : true
//         * preferential : 0
//         * addr : 昌平区黄平路19号院3号楼龙旗广场购物中心3层（地铁8号线育新站路北600米，近永辉超市）
//         * area : 昌平区
//         * ct :
//         * lat : 40.066605
//         * lng : 116.34672
//         * brd : 保利国际影城
//         * dis : 回龙观
//         * deal : 1
//         * distance : 0
//         * follow : 0
//         * imax : 0
//         * sellPrice : 39.0
//         * dealPrice : 40.0
//         * referencePrice : 100.0
//         * showCount : 0
//         * brdId : 24472
//         * id : 5502
//         */
//
//        private List<昌平区Bean> 昌平区;
//        /**
//         * poiId : 52294367
//         * nm : SFC上影(房山店)
//         * sellmin : 0
//         * sell : true
//         * preferential : 0
//         * addr : 房山区黄辛庄路口绿地缤纷城3层
//         * area : 房山区
//         * ct :
//         * lat : 39.756683
//         * lng : 116.160515
//         * brd : 其它
//         * dis :
//         * deal : 0
//         * distance : 0
//         * follow : 0
//         * imax : 0
//         * sellPrice : 38.0
//         * dealPrice : 0.0
//         * referencePrice : 0.0
//         * showCount : 0
//         * brdId : 0
//         * id : 13618
//         */
//
//        private List<房山区Bean> 房山区;
//        /**
//         * poiId : 6448554
//         * nm : CGV星聚汇影城(顺义店)
//         * sellmin : 0
//         * sell : true
//         * preferential : 0
//         * addr : 顺义区新顺南大街8号华联购物中心4层CGV星聚汇国际影城
//         * area : 顺义区
//         * ct :
//         * lat : 40.12897
//         * lng : 116.65173
//         * brd : CGV星聚汇影城
//         * dis :
//         * deal : 0
//         * distance : 0
//         * follow : 0
//         * imax : 0
//         * sellPrice : 43.0
//         * dealPrice : 0.0
//         * referencePrice : 0.0
//         * showCount : 0
//         * brdId : 2020418
//         * id : 8111
//         */
//
//        private List<顺义区Bean> 顺义区;
//        /**
//         * poiId : 3260641
//         * nm : 门头沟影剧院
//         * sellmin : 0
//         * sell : true
//         * preferential : 0
//         * addr : 门头沟区新桥大街12号
//         * area : 门头沟区
//         * ct :
//         * lat : 39.9425
//         * lng : 116.10049
//         * brd : 其它
//         * dis : 门头沟
//         * deal : 0
//         * distance : 0
//         * follow : 0
//         * imax : 0
//         * sellPrice : 33.0
//         * dealPrice : 0.0
//         * referencePrice : 0.0
//         * showCount : 0
//         * brdId : 0
//         * id : 182
//         */
//
//        private List<门头沟区Bean> 门头沟区;
//        /**
//         * poiId : 6596632
//         * nm : 保利国际影城(苹果园店)
//         * sellmin : 0
//         * sell : true
//         * preferential : 0
//         * addr : 石景山区阜石路300号喜隆多三层
//         * area : 石景山区
//         * ct :
//         * lat : 39.92295
//         * lng : 116.17175
//         * brd : 保利国际影城
//         * dis :
//         * deal : 0
//         * distance : 0
//         * follow : 0
//         * imax : 0
//         * sellPrice : 38.0
//         * dealPrice : 0.0
//         * referencePrice : 0.0
//         * showCount : 0
//         * brdId : 24472
//         * id : 10294
//         */
//
//        private List<石景山区Bean> 石景山区;
//        /**
//         * poiId : 3260663
//         * nm : 传奇瑞丽影城
//         * sellmin : 0
//         * sell : true
//         * preferential : 0
//         * addr : 怀柔区青春路15号四层
//         * area : 怀柔区
//         * ct :
//         * lat : 40.317955
//         * lng : 116.62985
//         * brd : 其它
//         * dis : 怀柔
//         * deal : 0
//         * distance : 0
//         * follow : 0
//         * imax : 0
//         * sellPrice : 43.0
//         * dealPrice : 0.0
//         * referencePrice : 35.0
//         * showCount : 0
//         * brdId : 0
//         * id : 55
//         */
//
//        private List<怀柔区Bean> 怀柔区;
//        /**
//         * poiId : 97314976
//         * nm : 耀莱成龙国际影城(平谷店)
//         * sellmin : 0
//         * sell : true
//         * preferential : 0
//         * addr : 平谷区迎宾路1号院22号楼五层F5-13
//         * area : 平谷区
//         * ct :
//         * lat : 40.14356
//         * lng : 117.093155
//         * brd : 耀莱成龙国际影城
//         * dis :
//         * deal : 0
//         * distance : 0
//         * follow : 0
//         * imax : 0
//         * sellPrice : 38.0
//         * dealPrice : 0.0
//         * referencePrice : 0.0
//         * showCount : 0
//         * brdId : 30227
//         * id : 15082
//         */
//
//        private List<平谷区Bean> 平谷区;
//        /**
//         * poiId : 1436412
//         * nm : 密云大剧院
//         * sellmin : 0
//         * sell : true
//         * preferential : 0
//         * addr : 密云县鼓楼西大街1号
//         * area : 密云县
//         * ct :
//         * lat : 40.377117
//         * lng : 116.84507
//         * brd : 其它
//         * dis : 密云县
//         * deal : 0
//         * distance : 0
//         * follow : 0
//         * imax : 0
//         * sellPrice : 33.0
//         * dealPrice : 0.0
//         * referencePrice : 60.0
//         * showCount : 0
//         * brdId : 0
//         * id : 183
//         */
//
//        private List<密云县Bean> 密云县;
//        /**
//         * poiId : 1366944
//         * nm : 大地影院(延庆金锣湾店)
//         * sellmin : 0
//         * sell : true
//         * preferential : 0
//         * addr : 延庆县妫水北街39号1幢H座首楼金锣湾商业中心沃尔玛旁
//         * area : 延庆县
//         * ct :
//         * lat : 40.461918
//         * lng : 115.97629
//         * brd : 大地影院
//         * dis : 延庆
//         * deal : 1
//         * distance : 0
//         * follow : 0
//         * imax : 0
//         * sellPrice : 43.0
//         * dealPrice : 39.0
//         * referencePrice : 40.0
//         * showCount : 0
//         * brdId : 384262
//         * id : 13
//         */
//
//        private List<延庆县Bean> 延庆县;
//
//        public List<朝阳区Bean> get朝阳区() {
//            return 朝阳区;
//        }
//
//        public void set朝阳区(List<朝阳区Bean> 朝阳区) {
//            this.朝阳区 = 朝阳区;
//        }
//
//        public List<海淀区Bean> get海淀区() {
//            return 海淀区;
//        }
//
//        public void set海淀区(List<海淀区Bean> 海淀区) {
//            this.海淀区 = 海淀区;
//        }
//
//        public List<东城区Bean> get东城区() {
//            return 东城区;
//        }
//
//        public void set东城区(List<东城区Bean> 东城区) {
//            this.东城区 = 东城区;
//        }
//
//        public List<丰台区Bean> get丰台区() {
//            return 丰台区;
//        }
//
//        public void set丰台区(List<丰台区Bean> 丰台区) {
//            this.丰台区 = 丰台区;
//        }
//
//        public List<大兴区Bean> get大兴区() {
//            return 大兴区;
//        }
//
//        public void set大兴区(List<大兴区Bean> 大兴区) {
//            this.大兴区 = 大兴区;
//        }
//
//        public List<西城区Bean> get西城区() {
//            return 西城区;
//        }
//
//        public void set西城区(List<西城区Bean> 西城区) {
//            this.西城区 = 西城区;
//        }
//
//        public List<通州区Bean> get通州区() {
//            return 通州区;
//        }
//
//        public void set通州区(List<通州区Bean> 通州区) {
//            this.通州区 = 通州区;
//        }
//
//        public List<昌平区Bean> get昌平区() {
//            return 昌平区;
//        }
//
//        public void set昌平区(List<昌平区Bean> 昌平区) {
//            this.昌平区 = 昌平区;
//        }
//
//        public List<房山区Bean> get房山区() {
//            return 房山区;
//        }
//
//        public void set房山区(List<房山区Bean> 房山区) {
//            this.房山区 = 房山区;
//        }
//
//        public List<顺义区Bean> get顺义区() {
//            return 顺义区;
//        }
//
//        public void set顺义区(List<顺义区Bean> 顺义区) {
//            this.顺义区 = 顺义区;
//        }
//
//        public List<门头沟区Bean> get门头沟区() {
//            return 门头沟区;
//        }
//
//        public void set门头沟区(List<门头沟区Bean> 门头沟区) {
//            this.门头沟区 = 门头沟区;
//        }
//
//        public List<石景山区Bean> get石景山区() {
//            return 石景山区;
//        }
//
//        public void set石景山区(List<石景山区Bean> 石景山区) {
//            this.石景山区 = 石景山区;
//        }
//
//        public List<怀柔区Bean> get怀柔区() {
//            return 怀柔区;
//        }
//
//        public void set怀柔区(List<怀柔区Bean> 怀柔区) {
//            this.怀柔区 = 怀柔区;
//        }
//
//        public List<平谷区Bean> get平谷区() {
//            return 平谷区;
//        }
//
//        public void set平谷区(List<平谷区Bean> 平谷区) {
//            this.平谷区 = 平谷区;
//        }
//
//        public List<密云县Bean> get密云县() {
//            return 密云县;
//        }
//
//        public void set密云县(List<密云县Bean> 密云县) {
//            this.密云县 = 密云县;
//        }
//
//        public List<延庆县Bean> get延庆县() {
//            return 延庆县;
//        }
//
//        public void set延庆县(List<延庆县Bean> 延庆县) {
//            this.延庆县 = 延庆县;
//        }
//
//        public static class 朝阳区Bean {
//            private int poiId;
//            private String nm;
//            private int sellmin;
//            private boolean sell;
//            private int preferential;
//            private String addr;
//            private String area;
//            private String ct;
//            private double lat;
//            private double lng;
//            private String brd;
//            private String dis;
//            private int deal;
//            private int distance;
//            private int follow;
//            private int imax;
//            private double sellPrice;
//            private double dealPrice;
//            private double referencePrice;
//            private int showCount;
//            private int brdId;
//            private int id;
//
//            public int getPoiId() {
//                return poiId;
//            }
//
//            public void setPoiId(int poiId) {
//                this.poiId = poiId;
//            }
//
//            public String getNm() {
//                return nm;
//            }
//
//            public void setNm(String nm) {
//                this.nm = nm;
//            }
//
//            public int getSellmin() {
//                return sellmin;
//            }
//
//            public void setSellmin(int sellmin) {
//                this.sellmin = sellmin;
//            }
//
//            public boolean isSell() {
//                return sell;
//            }
//
//            public void setSell(boolean sell) {
//                this.sell = sell;
//            }
//
//            public int getPreferential() {
//                return preferential;
//            }
//
//            public void setPreferential(int preferential) {
//                this.preferential = preferential;
//            }
//
//            public String getAddr() {
//                return addr;
//            }
//
//            public void setAddr(String addr) {
//                this.addr = addr;
//            }
//
//            public String getArea() {
//                return area;
//            }
//
//            public void setArea(String area) {
//                this.area = area;
//            }
//
//            public String getCt() {
//                return ct;
//            }
//
//            public void setCt(String ct) {
//                this.ct = ct;
//            }
//
//            public double getLat() {
//                return lat;
//            }
//
//            public void setLat(double lat) {
//                this.lat = lat;
//            }
//
//            public double getLng() {
//                return lng;
//            }
//
//            public void setLng(double lng) {
//                this.lng = lng;
//            }
//
//            public String getBrd() {
//                return brd;
//            }
//
//            public void setBrd(String brd) {
//                this.brd = brd;
//            }
//
//            public String getDis() {
//                return dis;
//            }
//
//            public void setDis(String dis) {
//                this.dis = dis;
//            }
//
//            public int getDeal() {
//                return deal;
//            }
//
//            public void setDeal(int deal) {
//                this.deal = deal;
//            }
//
//            public int getDistance() {
//                return distance;
//            }
//
//            public void setDistance(int distance) {
//                this.distance = distance;
//            }
//
//            public int getFollow() {
//                return follow;
//            }
//
//            public void setFollow(int follow) {
//                this.follow = follow;
//            }
//
//            public int getImax() {
//                return imax;
//            }
//
//            public void setImax(int imax) {
//                this.imax = imax;
//            }
//
//            public double getSellPrice() {
//                return sellPrice;
//            }
//
//            public void setSellPrice(double sellPrice) {
//                this.sellPrice = sellPrice;
//            }
//
//            public double getDealPrice() {
//                return dealPrice;
//            }
//
//            public void setDealPrice(double dealPrice) {
//                this.dealPrice = dealPrice;
//            }
//
//            public double getReferencePrice() {
//                return referencePrice;
//            }
//
//            public void setReferencePrice(double referencePrice) {
//                this.referencePrice = referencePrice;
//            }
//
//            public int getShowCount() {
//                return showCount;
//            }
//
//            public void setShowCount(int showCount) {
//                this.showCount = showCount;
//            }
//
//            public int getBrdId() {
//                return brdId;
//            }
//
//            public void setBrdId(int brdId) {
//                this.brdId = brdId;
//            }
//
//            public int getId() {
//                return id;
//            }
//
//            public void setId(int id) {
//                this.id = id;
//            }
//        }
//
//        public static class 海淀区Bean {
//            private int poiId;
//            private String nm;
//            private int sellmin;
//            private boolean sell;
//            private int preferential;
//            private String addr;
//            private String area;
//            private String ct;
//            private double lat;
//            private double lng;
//            private String brd;
//            private String dis;
//            private int deal;
//            private int distance;
//            private int follow;
//            private int imax;
//            private double sellPrice;
//            private double dealPrice;
//            private double referencePrice;
//            private int showCount;
//            private int brdId;
//            private int id;
//
//            public int getPoiId() {
//                return poiId;
//            }
//
//            public void setPoiId(int poiId) {
//                this.poiId = poiId;
//            }
//
//            public String getNm() {
//                return nm;
//            }
//
//            public void setNm(String nm) {
//                this.nm = nm;
//            }
//
//            public int getSellmin() {
//                return sellmin;
//            }
//
//            public void setSellmin(int sellmin) {
//                this.sellmin = sellmin;
//            }
//
//            public boolean isSell() {
//                return sell;
//            }
//
//            public void setSell(boolean sell) {
//                this.sell = sell;
//            }
//
//            public int getPreferential() {
//                return preferential;
//            }
//
//            public void setPreferential(int preferential) {
//                this.preferential = preferential;
//            }
//
//            public String getAddr() {
//                return addr;
//            }
//
//            public void setAddr(String addr) {
//                this.addr = addr;
//            }
//
//            public String getArea() {
//                return area;
//            }
//
//            public void setArea(String area) {
//                this.area = area;
//            }
//
//            public String getCt() {
//                return ct;
//            }
//
//            public void setCt(String ct) {
//                this.ct = ct;
//            }
//
//            public double getLat() {
//                return lat;
//            }
//
//            public void setLat(double lat) {
//                this.lat = lat;
//            }
//
//            public double getLng() {
//                return lng;
//            }
//
//            public void setLng(double lng) {
//                this.lng = lng;
//            }
//
//            public String getBrd() {
//                return brd;
//            }
//
//            public void setBrd(String brd) {
//                this.brd = brd;
//            }
//
//            public String getDis() {
//                return dis;
//            }
//
//            public void setDis(String dis) {
//                this.dis = dis;
//            }
//
//            public int getDeal() {
//                return deal;
//            }
//
//            public void setDeal(int deal) {
//                this.deal = deal;
//            }
//
//            public int getDistance() {
//                return distance;
//            }
//
//            public void setDistance(int distance) {
//                this.distance = distance;
//            }
//
//            public int getFollow() {
//                return follow;
//            }
//
//            public void setFollow(int follow) {
//                this.follow = follow;
//            }
//
//            public int getImax() {
//                return imax;
//            }
//
//            public void setImax(int imax) {
//                this.imax = imax;
//            }
//
//            public double getSellPrice() {
//                return sellPrice;
//            }
//
//            public void setSellPrice(double sellPrice) {
//                this.sellPrice = sellPrice;
//            }
//
//            public double getDealPrice() {
//                return dealPrice;
//            }
//
//            public void setDealPrice(double dealPrice) {
//                this.dealPrice = dealPrice;
//            }
//
//            public double getReferencePrice() {
//                return referencePrice;
//            }
//
//            public void setReferencePrice(double referencePrice) {
//                this.referencePrice = referencePrice;
//            }
//
//            public int getShowCount() {
//                return showCount;
//            }
//
//            public void setShowCount(int showCount) {
//                this.showCount = showCount;
//            }
//
//            public int getBrdId() {
//                return brdId;
//            }
//
//            public void setBrdId(int brdId) {
//                this.brdId = brdId;
//            }
//
//            public int getId() {
//                return id;
//            }
//
//            public void setId(int id) {
//                this.id = id;
//            }
//        }
//
//        public static class 东城区Bean {
//            private int poiId;
//            private String nm;
//            private int sellmin;
//            private boolean sell;
//            private int preferential;
//            private String addr;
//            private String area;
//            private String ct;
//            private double lat;
//            private double lng;
//            private String brd;
//            private String dis;
//            private int deal;
//            private int distance;
//            private int follow;
//            private int imax;
//            private double sellPrice;
//            private double dealPrice;
//            private double referencePrice;
//            private int showCount;
//            private int brdId;
//            private int id;
//
//            public int getPoiId() {
//                return poiId;
//            }
//
//            public void setPoiId(int poiId) {
//                this.poiId = poiId;
//            }
//
//            public String getNm() {
//                return nm;
//            }
//
//            public void setNm(String nm) {
//                this.nm = nm;
//            }
//
//            public int getSellmin() {
//                return sellmin;
//            }
//
//            public void setSellmin(int sellmin) {
//                this.sellmin = sellmin;
//            }
//
//            public boolean isSell() {
//                return sell;
//            }
//
//            public void setSell(boolean sell) {
//                this.sell = sell;
//            }
//
//            public int getPreferential() {
//                return preferential;
//            }
//
//            public void setPreferential(int preferential) {
//                this.preferential = preferential;
//            }
//
//            public String getAddr() {
//                return addr;
//            }
//
//            public void setAddr(String addr) {
//                this.addr = addr;
//            }
//
//            public String getArea() {
//                return area;
//            }
//
//            public void setArea(String area) {
//                this.area = area;
//            }
//
//            public String getCt() {
//                return ct;
//            }
//
//            public void setCt(String ct) {
//                this.ct = ct;
//            }
//
//            public double getLat() {
//                return lat;
//            }
//
//            public void setLat(double lat) {
//                this.lat = lat;
//            }
//
//            public double getLng() {
//                return lng;
//            }
//
//            public void setLng(double lng) {
//                this.lng = lng;
//            }
//
//            public String getBrd() {
//                return brd;
//            }
//
//            public void setBrd(String brd) {
//                this.brd = brd;
//            }
//
//            public String getDis() {
//                return dis;
//            }
//
//            public void setDis(String dis) {
//                this.dis = dis;
//            }
//
//            public int getDeal() {
//                return deal;
//            }
//
//            public void setDeal(int deal) {
//                this.deal = deal;
//            }
//
//            public int getDistance() {
//                return distance;
//            }
//
//            public void setDistance(int distance) {
//                this.distance = distance;
//            }
//
//            public int getFollow() {
//                return follow;
//            }
//
//            public void setFollow(int follow) {
//                this.follow = follow;
//            }
//
//            public int getImax() {
//                return imax;
//            }
//
//            public void setImax(int imax) {
//                this.imax = imax;
//            }
//
//            public double getSellPrice() {
//                return sellPrice;
//            }
//
//            public void setSellPrice(double sellPrice) {
//                this.sellPrice = sellPrice;
//            }
//
//            public double getDealPrice() {
//                return dealPrice;
//            }
//
//            public void setDealPrice(double dealPrice) {
//                this.dealPrice = dealPrice;
//            }
//
//            public double getReferencePrice() {
//                return referencePrice;
//            }
//
//            public void setReferencePrice(double referencePrice) {
//                this.referencePrice = referencePrice;
//            }
//
//            public int getShowCount() {
//                return showCount;
//            }
//
//            public void setShowCount(int showCount) {
//                this.showCount = showCount;
//            }
//
//            public int getBrdId() {
//                return brdId;
//            }
//
//            public void setBrdId(int brdId) {
//                this.brdId = brdId;
//            }
//
//            public int getId() {
//                return id;
//            }
//
//            public void setId(int id) {
//                this.id = id;
//            }
//        }
//
//        public static class 丰台区Bean {
//            private int poiId;
//            private String nm;
//            private int sellmin;
//            private boolean sell;
//            private int preferential;
//            private String addr;
//            private String area;
//            private String ct;
//            private double lat;
//            private double lng;
//            private String brd;
//            private String dis;
//            private int deal;
//            private int distance;
//            private int follow;
//            private int imax;
//            private double sellPrice;
//            private double dealPrice;
//            private double referencePrice;
//            private int showCount;
//            private int brdId;
//            private int id;
//
//            public int getPoiId() {
//                return poiId;
//            }
//
//            public void setPoiId(int poiId) {
//                this.poiId = poiId;
//            }
//
//            public String getNm() {
//                return nm;
//            }
//
//            public void setNm(String nm) {
//                this.nm = nm;
//            }
//
//            public int getSellmin() {
//                return sellmin;
//            }
//
//            public void setSellmin(int sellmin) {
//                this.sellmin = sellmin;
//            }
//
//            public boolean isSell() {
//                return sell;
//            }
//
//            public void setSell(boolean sell) {
//                this.sell = sell;
//            }
//
//            public int getPreferential() {
//                return preferential;
//            }
//
//            public void setPreferential(int preferential) {
//                this.preferential = preferential;
//            }
//
//            public String getAddr() {
//                return addr;
//            }
//
//            public void setAddr(String addr) {
//                this.addr = addr;
//            }
//
//            public String getArea() {
//                return area;
//            }
//
//            public void setArea(String area) {
//                this.area = area;
//            }
//
//            public String getCt() {
//                return ct;
//            }
//
//            public void setCt(String ct) {
//                this.ct = ct;
//            }
//
//            public double getLat() {
//                return lat;
//            }
//
//            public void setLat(double lat) {
//                this.lat = lat;
//            }
//
//            public double getLng() {
//                return lng;
//            }
//
//            public void setLng(double lng) {
//                this.lng = lng;
//            }
//
//            public String getBrd() {
//                return brd;
//            }
//
//            public void setBrd(String brd) {
//                this.brd = brd;
//            }
//
//            public String getDis() {
//                return dis;
//            }
//
//            public void setDis(String dis) {
//                this.dis = dis;
//            }
//
//            public int getDeal() {
//                return deal;
//            }
//
//            public void setDeal(int deal) {
//                this.deal = deal;
//            }
//
//            public int getDistance() {
//                return distance;
//            }
//
//            public void setDistance(int distance) {
//                this.distance = distance;
//            }
//
//            public int getFollow() {
//                return follow;
//            }
//
//            public void setFollow(int follow) {
//                this.follow = follow;
//            }
//
//            public int getImax() {
//                return imax;
//            }
//
//            public void setImax(int imax) {
//                this.imax = imax;
//            }
//
//            public double getSellPrice() {
//                return sellPrice;
//            }
//
//            public void setSellPrice(double sellPrice) {
//                this.sellPrice = sellPrice;
//            }
//
//            public double getDealPrice() {
//                return dealPrice;
//            }
//
//            public void setDealPrice(double dealPrice) {
//                this.dealPrice = dealPrice;
//            }
//
//            public double getReferencePrice() {
//                return referencePrice;
//            }
//
//            public void setReferencePrice(double referencePrice) {
//                this.referencePrice = referencePrice;
//            }
//
//            public int getShowCount() {
//                return showCount;
//            }
//
//            public void setShowCount(int showCount) {
//                this.showCount = showCount;
//            }
//
//            public int getBrdId() {
//                return brdId;
//            }
//
//            public void setBrdId(int brdId) {
//                this.brdId = brdId;
//            }
//
//            public int getId() {
//                return id;
//            }
//
//            public void setId(int id) {
//                this.id = id;
//            }
//        }
//
//        public static class 大兴区Bean {
//            private int poiId;
//            private String nm;
//            private int sellmin;
//            private boolean sell;
//            private int preferential;
//            private String addr;
//            private String area;
//            private String ct;
//            private double lat;
//            private double lng;
//            private String brd;
//            private String dis;
//            private int deal;
//            private int distance;
//            private int follow;
//            private int imax;
//            private double sellPrice;
//            private double dealPrice;
//            private double referencePrice;
//            private int showCount;
//            private int brdId;
//            private int id;
//
//            public int getPoiId() {
//                return poiId;
//            }
//
//            public void setPoiId(int poiId) {
//                this.poiId = poiId;
//            }
//
//            public String getNm() {
//                return nm;
//            }
//
//            public void setNm(String nm) {
//                this.nm = nm;
//            }
//
//            public int getSellmin() {
//                return sellmin;
//            }
//
//            public void setSellmin(int sellmin) {
//                this.sellmin = sellmin;
//            }
//
//            public boolean isSell() {
//                return sell;
//            }
//
//            public void setSell(boolean sell) {
//                this.sell = sell;
//            }
//
//            public int getPreferential() {
//                return preferential;
//            }
//
//            public void setPreferential(int preferential) {
//                this.preferential = preferential;
//            }
//
//            public String getAddr() {
//                return addr;
//            }
//
//            public void setAddr(String addr) {
//                this.addr = addr;
//            }
//
//            public String getArea() {
//                return area;
//            }
//
//            public void setArea(String area) {
//                this.area = area;
//            }
//
//            public String getCt() {
//                return ct;
//            }
//
//            public void setCt(String ct) {
//                this.ct = ct;
//            }
//
//            public double getLat() {
//                return lat;
//            }
//
//            public void setLat(double lat) {
//                this.lat = lat;
//            }
//
//            public double getLng() {
//                return lng;
//            }
//
//            public void setLng(double lng) {
//                this.lng = lng;
//            }
//
//            public String getBrd() {
//                return brd;
//            }
//
//            public void setBrd(String brd) {
//                this.brd = brd;
//            }
//
//            public String getDis() {
//                return dis;
//            }
//
//            public void setDis(String dis) {
//                this.dis = dis;
//            }
//
//            public int getDeal() {
//                return deal;
//            }
//
//            public void setDeal(int deal) {
//                this.deal = deal;
//            }
//
//            public int getDistance() {
//                return distance;
//            }
//
//            public void setDistance(int distance) {
//                this.distance = distance;
//            }
//
//            public int getFollow() {
//                return follow;
//            }
//
//            public void setFollow(int follow) {
//                this.follow = follow;
//            }
//
//            public int getImax() {
//                return imax;
//            }
//
//            public void setImax(int imax) {
//                this.imax = imax;
//            }
//
//            public double getSellPrice() {
//                return sellPrice;
//            }
//
//            public void setSellPrice(double sellPrice) {
//                this.sellPrice = sellPrice;
//            }
//
//            public double getDealPrice() {
//                return dealPrice;
//            }
//
//            public void setDealPrice(double dealPrice) {
//                this.dealPrice = dealPrice;
//            }
//
//            public double getReferencePrice() {
//                return referencePrice;
//            }
//
//            public void setReferencePrice(double referencePrice) {
//                this.referencePrice = referencePrice;
//            }
//
//            public int getShowCount() {
//                return showCount;
//            }
//
//            public void setShowCount(int showCount) {
//                this.showCount = showCount;
//            }
//
//            public int getBrdId() {
//                return brdId;
//            }
//
//            public void setBrdId(int brdId) {
//                this.brdId = brdId;
//            }
//
//            public int getId() {
//                return id;
//            }
//
//            public void setId(int id) {
//                this.id = id;
//            }
//        }
//
//        public static class 西城区Bean {
//            private int poiId;
//            private String nm;
//            private int sellmin;
//            private boolean sell;
//            private int preferential;
//            private String addr;
//            private String area;
//            private String ct;
//            private double lat;
//            private double lng;
//            private String brd;
//            private String dis;
//            private int deal;
//            private int distance;
//            private int follow;
//            private int imax;
//            private double sellPrice;
//            private double dealPrice;
//            private double referencePrice;
//            private int showCount;
//            private int brdId;
//            private int id;
//
//            public int getPoiId() {
//                return poiId;
//            }
//
//            public void setPoiId(int poiId) {
//                this.poiId = poiId;
//            }
//
//            public String getNm() {
//                return nm;
//            }
//
//            public void setNm(String nm) {
//                this.nm = nm;
//            }
//
//            public int getSellmin() {
//                return sellmin;
//            }
//
//            public void setSellmin(int sellmin) {
//                this.sellmin = sellmin;
//            }
//
//            public boolean isSell() {
//                return sell;
//            }
//
//            public void setSell(boolean sell) {
//                this.sell = sell;
//            }
//
//            public int getPreferential() {
//                return preferential;
//            }
//
//            public void setPreferential(int preferential) {
//                this.preferential = preferential;
//            }
//
//            public String getAddr() {
//                return addr;
//            }
//
//            public void setAddr(String addr) {
//                this.addr = addr;
//            }
//
//            public String getArea() {
//                return area;
//            }
//
//            public void setArea(String area) {
//                this.area = area;
//            }
//
//            public String getCt() {
//                return ct;
//            }
//
//            public void setCt(String ct) {
//                this.ct = ct;
//            }
//
//            public double getLat() {
//                return lat;
//            }
//
//            public void setLat(double lat) {
//                this.lat = lat;
//            }
//
//            public double getLng() {
//                return lng;
//            }
//
//            public void setLng(double lng) {
//                this.lng = lng;
//            }
//
//            public String getBrd() {
//                return brd;
//            }
//
//            public void setBrd(String brd) {
//                this.brd = brd;
//            }
//
//            public String getDis() {
//                return dis;
//            }
//
//            public void setDis(String dis) {
//                this.dis = dis;
//            }
//
//            public int getDeal() {
//                return deal;
//            }
//
//            public void setDeal(int deal) {
//                this.deal = deal;
//            }
//
//            public int getDistance() {
//                return distance;
//            }
//
//            public void setDistance(int distance) {
//                this.distance = distance;
//            }
//
//            public int getFollow() {
//                return follow;
//            }
//
//            public void setFollow(int follow) {
//                this.follow = follow;
//            }
//
//            public int getImax() {
//                return imax;
//            }
//
//            public void setImax(int imax) {
//                this.imax = imax;
//            }
//
//            public double getSellPrice() {
//                return sellPrice;
//            }
//
//            public void setSellPrice(double sellPrice) {
//                this.sellPrice = sellPrice;
//            }
//
//            public double getDealPrice() {
//                return dealPrice;
//            }
//
//            public void setDealPrice(double dealPrice) {
//                this.dealPrice = dealPrice;
//            }
//
//            public double getReferencePrice() {
//                return referencePrice;
//            }
//
//            public void setReferencePrice(double referencePrice) {
//                this.referencePrice = referencePrice;
//            }
//
//            public int getShowCount() {
//                return showCount;
//            }
//
//            public void setShowCount(int showCount) {
//                this.showCount = showCount;
//            }
//
//            public int getBrdId() {
//                return brdId;
//            }
//
//            public void setBrdId(int brdId) {
//                this.brdId = brdId;
//            }
//
//            public int getId() {
//                return id;
//            }
//
//            public void setId(int id) {
//                this.id = id;
//            }
//        }
//
//        public static class 通州区Bean {
//            private int poiId;
//            private String nm;
//            private int sellmin;
//            private boolean sell;
//            private int preferential;
//            private String addr;
//            private String area;
//            private String ct;
//            private double lat;
//            private double lng;
//            private String brd;
//            private String dis;
//            private int deal;
//            private int distance;
//            private int follow;
//            private int imax;
//            private double sellPrice;
//            private double dealPrice;
//            private double referencePrice;
//            private int showCount;
//            private int brdId;
//            private int id;
//
//            public int getPoiId() {
//                return poiId;
//            }
//
//            public void setPoiId(int poiId) {
//                this.poiId = poiId;
//            }
//
//            public String getNm() {
//                return nm;
//            }
//
//            public void setNm(String nm) {
//                this.nm = nm;
//            }
//
//            public int getSellmin() {
//                return sellmin;
//            }
//
//            public void setSellmin(int sellmin) {
//                this.sellmin = sellmin;
//            }
//
//            public boolean isSell() {
//                return sell;
//            }
//
//            public void setSell(boolean sell) {
//                this.sell = sell;
//            }
//
//            public int getPreferential() {
//                return preferential;
//            }
//
//            public void setPreferential(int preferential) {
//                this.preferential = preferential;
//            }
//
//            public String getAddr() {
//                return addr;
//            }
//
//            public void setAddr(String addr) {
//                this.addr = addr;
//            }
//
//            public String getArea() {
//                return area;
//            }
//
//            public void setArea(String area) {
//                this.area = area;
//            }
//
//            public String getCt() {
//                return ct;
//            }
//
//            public void setCt(String ct) {
//                this.ct = ct;
//            }
//
//            public double getLat() {
//                return lat;
//            }
//
//            public void setLat(double lat) {
//                this.lat = lat;
//            }
//
//            public double getLng() {
//                return lng;
//            }
//
//            public void setLng(double lng) {
//                this.lng = lng;
//            }
//
//            public String getBrd() {
//                return brd;
//            }
//
//            public void setBrd(String brd) {
//                this.brd = brd;
//            }
//
//            public String getDis() {
//                return dis;
//            }
//
//            public void setDis(String dis) {
//                this.dis = dis;
//            }
//
//            public int getDeal() {
//                return deal;
//            }
//
//            public void setDeal(int deal) {
//                this.deal = deal;
//            }
//
//            public int getDistance() {
//                return distance;
//            }
//
//            public void setDistance(int distance) {
//                this.distance = distance;
//            }
//
//            public int getFollow() {
//                return follow;
//            }
//
//            public void setFollow(int follow) {
//                this.follow = follow;
//            }
//
//            public int getImax() {
//                return imax;
//            }
//
//            public void setImax(int imax) {
//                this.imax = imax;
//            }
//
//            public double getSellPrice() {
//                return sellPrice;
//            }
//
//            public void setSellPrice(double sellPrice) {
//                this.sellPrice = sellPrice;
//            }
//
//            public double getDealPrice() {
//                return dealPrice;
//            }
//
//            public void setDealPrice(double dealPrice) {
//                this.dealPrice = dealPrice;
//            }
//
//            public double getReferencePrice() {
//                return referencePrice;
//            }
//
//            public void setReferencePrice(double referencePrice) {
//                this.referencePrice = referencePrice;
//            }
//
//            public int getShowCount() {
//                return showCount;
//            }
//
//            public void setShowCount(int showCount) {
//                this.showCount = showCount;
//            }
//
//            public int getBrdId() {
//                return brdId;
//            }
//
//            public void setBrdId(int brdId) {
//                this.brdId = brdId;
//            }
//
//            public int getId() {
//                return id;
//            }
//
//            public void setId(int id) {
//                this.id = id;
//            }
//        }
//
//        public static class 昌平区Bean {
//            private int poiId;
//            private String nm;
//            private int sellmin;
//            private boolean sell;
//            private int preferential;
//            private String addr;
//            private String area;
//            private String ct;
//            private double lat;
//            private double lng;
//            private String brd;
//            private String dis;
//            private int deal;
//            private int distance;
//            private int follow;
//            private int imax;
//            private double sellPrice;
//            private double dealPrice;
//            private double referencePrice;
//            private int showCount;
//            private int brdId;
//            private int id;
//
//            public int getPoiId() {
//                return poiId;
//            }
//
//            public void setPoiId(int poiId) {
//                this.poiId = poiId;
//            }
//
//            public String getNm() {
//                return nm;
//            }
//
//            public void setNm(String nm) {
//                this.nm = nm;
//            }
//
//            public int getSellmin() {
//                return sellmin;
//            }
//
//            public void setSellmin(int sellmin) {
//                this.sellmin = sellmin;
//            }
//
//            public boolean isSell() {
//                return sell;
//            }
//
//            public void setSell(boolean sell) {
//                this.sell = sell;
//            }
//
//            public int getPreferential() {
//                return preferential;
//            }
//
//            public void setPreferential(int preferential) {
//                this.preferential = preferential;
//            }
//
//            public String getAddr() {
//                return addr;
//            }
//
//            public void setAddr(String addr) {
//                this.addr = addr;
//            }
//
//            public String getArea() {
//                return area;
//            }
//
//            public void setArea(String area) {
//                this.area = area;
//            }
//
//            public String getCt() {
//                return ct;
//            }
//
//            public void setCt(String ct) {
//                this.ct = ct;
//            }
//
//            public double getLat() {
//                return lat;
//            }
//
//            public void setLat(double lat) {
//                this.lat = lat;
//            }
//
//            public double getLng() {
//                return lng;
//            }
//
//            public void setLng(double lng) {
//                this.lng = lng;
//            }
//
//            public String getBrd() {
//                return brd;
//            }
//
//            public void setBrd(String brd) {
//                this.brd = brd;
//            }
//
//            public String getDis() {
//                return dis;
//            }
//
//            public void setDis(String dis) {
//                this.dis = dis;
//            }
//
//            public int getDeal() {
//                return deal;
//            }
//
//            public void setDeal(int deal) {
//                this.deal = deal;
//            }
//
//            public int getDistance() {
//                return distance;
//            }
//
//            public void setDistance(int distance) {
//                this.distance = distance;
//            }
//
//            public int getFollow() {
//                return follow;
//            }
//
//            public void setFollow(int follow) {
//                this.follow = follow;
//            }
//
//            public int getImax() {
//                return imax;
//            }
//
//            public void setImax(int imax) {
//                this.imax = imax;
//            }
//
//            public double getSellPrice() {
//                return sellPrice;
//            }
//
//            public void setSellPrice(double sellPrice) {
//                this.sellPrice = sellPrice;
//            }
//
//            public double getDealPrice() {
//                return dealPrice;
//            }
//
//            public void setDealPrice(double dealPrice) {
//                this.dealPrice = dealPrice;
//            }
//
//            public double getReferencePrice() {
//                return referencePrice;
//            }
//
//            public void setReferencePrice(double referencePrice) {
//                this.referencePrice = referencePrice;
//            }
//
//            public int getShowCount() {
//                return showCount;
//            }
//
//            public void setShowCount(int showCount) {
//                this.showCount = showCount;
//            }
//
//            public int getBrdId() {
//                return brdId;
//            }
//
//            public void setBrdId(int brdId) {
//                this.brdId = brdId;
//            }
//
//            public int getId() {
//                return id;
//            }
//
//            public void setId(int id) {
//                this.id = id;
//            }
//        }
//
//        public static class 房山区Bean {
//            private int poiId;
//            private String nm;
//            private int sellmin;
//            private boolean sell;
//            private int preferential;
//            private String addr;
//            private String area;
//            private String ct;
//            private double lat;
//            private double lng;
//            private String brd;
//            private String dis;
//            private int deal;
//            private int distance;
//            private int follow;
//            private int imax;
//            private double sellPrice;
//            private double dealPrice;
//            private double referencePrice;
//            private int showCount;
//            private int brdId;
//            private int id;
//
//            public int getPoiId() {
//                return poiId;
//            }
//
//            public void setPoiId(int poiId) {
//                this.poiId = poiId;
//            }
//
//            public String getNm() {
//                return nm;
//            }
//
//            public void setNm(String nm) {
//                this.nm = nm;
//            }
//
//            public int getSellmin() {
//                return sellmin;
//            }
//
//            public void setSellmin(int sellmin) {
//                this.sellmin = sellmin;
//            }
//
//            public boolean isSell() {
//                return sell;
//            }
//
//            public void setSell(boolean sell) {
//                this.sell = sell;
//            }
//
//            public int getPreferential() {
//                return preferential;
//            }
//
//            public void setPreferential(int preferential) {
//                this.preferential = preferential;
//            }
//
//            public String getAddr() {
//                return addr;
//            }
//
//            public void setAddr(String addr) {
//                this.addr = addr;
//            }
//
//            public String getArea() {
//                return area;
//            }
//
//            public void setArea(String area) {
//                this.area = area;
//            }
//
//            public String getCt() {
//                return ct;
//            }
//
//            public void setCt(String ct) {
//                this.ct = ct;
//            }
//
//            public double getLat() {
//                return lat;
//            }
//
//            public void setLat(double lat) {
//                this.lat = lat;
//            }
//
//            public double getLng() {
//                return lng;
//            }
//
//            public void setLng(double lng) {
//                this.lng = lng;
//            }
//
//            public String getBrd() {
//                return brd;
//            }
//
//            public void setBrd(String brd) {
//                this.brd = brd;
//            }
//
//            public String getDis() {
//                return dis;
//            }
//
//            public void setDis(String dis) {
//                this.dis = dis;
//            }
//
//            public int getDeal() {
//                return deal;
//            }
//
//            public void setDeal(int deal) {
//                this.deal = deal;
//            }
//
//            public int getDistance() {
//                return distance;
//            }
//
//            public void setDistance(int distance) {
//                this.distance = distance;
//            }
//
//            public int getFollow() {
//                return follow;
//            }
//
//            public void setFollow(int follow) {
//                this.follow = follow;
//            }
//
//            public int getImax() {
//                return imax;
//            }
//
//            public void setImax(int imax) {
//                this.imax = imax;
//            }
//
//            public double getSellPrice() {
//                return sellPrice;
//            }
//
//            public void setSellPrice(double sellPrice) {
//                this.sellPrice = sellPrice;
//            }
//
//            public double getDealPrice() {
//                return dealPrice;
//            }
//
//            public void setDealPrice(double dealPrice) {
//                this.dealPrice = dealPrice;
//            }
//
//            public double getReferencePrice() {
//                return referencePrice;
//            }
//
//            public void setReferencePrice(double referencePrice) {
//                this.referencePrice = referencePrice;
//            }
//
//            public int getShowCount() {
//                return showCount;
//            }
//
//            public void setShowCount(int showCount) {
//                this.showCount = showCount;
//            }
//
//            public int getBrdId() {
//                return brdId;
//            }
//
//            public void setBrdId(int brdId) {
//                this.brdId = brdId;
//            }
//
//            public int getId() {
//                return id;
//            }
//
//            public void setId(int id) {
//                this.id = id;
//            }
//        }
//
//        public static class 顺义区Bean {
//            private int poiId;
//            private String nm;
//            private int sellmin;
//            private boolean sell;
//            private int preferential;
//            private String addr;
//            private String area;
//            private String ct;
//            private double lat;
//            private double lng;
//            private String brd;
//            private String dis;
//            private int deal;
//            private int distance;
//            private int follow;
//            private int imax;
//            private double sellPrice;
//            private double dealPrice;
//            private double referencePrice;
//            private int showCount;
//            private int brdId;
//            private int id;
//
//            public int getPoiId() {
//                return poiId;
//            }
//
//            public void setPoiId(int poiId) {
//                this.poiId = poiId;
//            }
//
//            public String getNm() {
//                return nm;
//            }
//
//            public void setNm(String nm) {
//                this.nm = nm;
//            }
//
//            public int getSellmin() {
//                return sellmin;
//            }
//
//            public void setSellmin(int sellmin) {
//                this.sellmin = sellmin;
//            }
//
//            public boolean isSell() {
//                return sell;
//            }
//
//            public void setSell(boolean sell) {
//                this.sell = sell;
//            }
//
//            public int getPreferential() {
//                return preferential;
//            }
//
//            public void setPreferential(int preferential) {
//                this.preferential = preferential;
//            }
//
//            public String getAddr() {
//                return addr;
//            }
//
//            public void setAddr(String addr) {
//                this.addr = addr;
//            }
//
//            public String getArea() {
//                return area;
//            }
//
//            public void setArea(String area) {
//                this.area = area;
//            }
//
//            public String getCt() {
//                return ct;
//            }
//
//            public void setCt(String ct) {
//                this.ct = ct;
//            }
//
//            public double getLat() {
//                return lat;
//            }
//
//            public void setLat(double lat) {
//                this.lat = lat;
//            }
//
//            public double getLng() {
//                return lng;
//            }
//
//            public void setLng(double lng) {
//                this.lng = lng;
//            }
//
//            public String getBrd() {
//                return brd;
//            }
//
//            public void setBrd(String brd) {
//                this.brd = brd;
//            }
//
//            public String getDis() {
//                return dis;
//            }
//
//            public void setDis(String dis) {
//                this.dis = dis;
//            }
//
//            public int getDeal() {
//                return deal;
//            }
//
//            public void setDeal(int deal) {
//                this.deal = deal;
//            }
//
//            public int getDistance() {
//                return distance;
//            }
//
//            public void setDistance(int distance) {
//                this.distance = distance;
//            }
//
//            public int getFollow() {
//                return follow;
//            }
//
//            public void setFollow(int follow) {
//                this.follow = follow;
//            }
//
//            public int getImax() {
//                return imax;
//            }
//
//            public void setImax(int imax) {
//                this.imax = imax;
//            }
//
//            public double getSellPrice() {
//                return sellPrice;
//            }
//
//            public void setSellPrice(double sellPrice) {
//                this.sellPrice = sellPrice;
//            }
//
//            public double getDealPrice() {
//                return dealPrice;
//            }
//
//            public void setDealPrice(double dealPrice) {
//                this.dealPrice = dealPrice;
//            }
//
//            public double getReferencePrice() {
//                return referencePrice;
//            }
//
//            public void setReferencePrice(double referencePrice) {
//                this.referencePrice = referencePrice;
//            }
//
//            public int getShowCount() {
//                return showCount;
//            }
//
//            public void setShowCount(int showCount) {
//                this.showCount = showCount;
//            }
//
//            public int getBrdId() {
//                return brdId;
//            }
//
//            public void setBrdId(int brdId) {
//                this.brdId = brdId;
//            }
//
//            public int getId() {
//                return id;
//            }
//
//            public void setId(int id) {
//                this.id = id;
//            }
//        }
//
//        public static class 门头沟区Bean {
//            private int poiId;
//            private String nm;
//            private int sellmin;
//            private boolean sell;
//            private int preferential;
//            private String addr;
//            private String area;
//            private String ct;
//            private double lat;
//            private double lng;
//            private String brd;
//            private String dis;
//            private int deal;
//            private int distance;
//            private int follow;
//            private int imax;
//            private double sellPrice;
//            private double dealPrice;
//            private double referencePrice;
//            private int showCount;
//            private int brdId;
//            private int id;
//
//            public int getPoiId() {
//                return poiId;
//            }
//
//            public void setPoiId(int poiId) {
//                this.poiId = poiId;
//            }
//
//            public String getNm() {
//                return nm;
//            }
//
//            public void setNm(String nm) {
//                this.nm = nm;
//            }
//
//            public int getSellmin() {
//                return sellmin;
//            }
//
//            public void setSellmin(int sellmin) {
//                this.sellmin = sellmin;
//            }
//
//            public boolean isSell() {
//                return sell;
//            }
//
//            public void setSell(boolean sell) {
//                this.sell = sell;
//            }
//
//            public int getPreferential() {
//                return preferential;
//            }
//
//            public void setPreferential(int preferential) {
//                this.preferential = preferential;
//            }
//
//            public String getAddr() {
//                return addr;
//            }
//
//            public void setAddr(String addr) {
//                this.addr = addr;
//            }
//
//            public String getArea() {
//                return area;
//            }
//
//            public void setArea(String area) {
//                this.area = area;
//            }
//
//            public String getCt() {
//                return ct;
//            }
//
//            public void setCt(String ct) {
//                this.ct = ct;
//            }
//
//            public double getLat() {
//                return lat;
//            }
//
//            public void setLat(double lat) {
//                this.lat = lat;
//            }
//
//            public double getLng() {
//                return lng;
//            }
//
//            public void setLng(double lng) {
//                this.lng = lng;
//            }
//
//            public String getBrd() {
//                return brd;
//            }
//
//            public void setBrd(String brd) {
//                this.brd = brd;
//            }
//
//            public String getDis() {
//                return dis;
//            }
//
//            public void setDis(String dis) {
//                this.dis = dis;
//            }
//
//            public int getDeal() {
//                return deal;
//            }
//
//            public void setDeal(int deal) {
//                this.deal = deal;
//            }
//
//            public int getDistance() {
//                return distance;
//            }
//
//            public void setDistance(int distance) {
//                this.distance = distance;
//            }
//
//            public int getFollow() {
//                return follow;
//            }
//
//            public void setFollow(int follow) {
//                this.follow = follow;
//            }
//
//            public int getImax() {
//                return imax;
//            }
//
//            public void setImax(int imax) {
//                this.imax = imax;
//            }
//
//            public double getSellPrice() {
//                return sellPrice;
//            }
//
//            public void setSellPrice(double sellPrice) {
//                this.sellPrice = sellPrice;
//            }
//
//            public double getDealPrice() {
//                return dealPrice;
//            }
//
//            public void setDealPrice(double dealPrice) {
//                this.dealPrice = dealPrice;
//            }
//
//            public double getReferencePrice() {
//                return referencePrice;
//            }
//
//            public void setReferencePrice(double referencePrice) {
//                this.referencePrice = referencePrice;
//            }
//
//            public int getShowCount() {
//                return showCount;
//            }
//
//            public void setShowCount(int showCount) {
//                this.showCount = showCount;
//            }
//
//            public int getBrdId() {
//                return brdId;
//            }
//
//            public void setBrdId(int brdId) {
//                this.brdId = brdId;
//            }
//
//            public int getId() {
//                return id;
//            }
//
//            public void setId(int id) {
//                this.id = id;
//            }
//        }
//
//        public static class 石景山区Bean {
//            private int poiId;
//            private String nm;
//            private int sellmin;
//            private boolean sell;
//            private int preferential;
//            private String addr;
//            private String area;
//            private String ct;
//            private double lat;
//            private double lng;
//            private String brd;
//            private String dis;
//            private int deal;
//            private int distance;
//            private int follow;
//            private int imax;
//            private double sellPrice;
//            private double dealPrice;
//            private double referencePrice;
//            private int showCount;
//            private int brdId;
//            private int id;
//
//            public int getPoiId() {
//                return poiId;
//            }
//
//            public void setPoiId(int poiId) {
//                this.poiId = poiId;
//            }
//
//            public String getNm() {
//                return nm;
//            }
//
//            public void setNm(String nm) {
//                this.nm = nm;
//            }
//
//            public int getSellmin() {
//                return sellmin;
//            }
//
//            public void setSellmin(int sellmin) {
//                this.sellmin = sellmin;
//            }
//
//            public boolean isSell() {
//                return sell;
//            }
//
//            public void setSell(boolean sell) {
//                this.sell = sell;
//            }
//
//            public int getPreferential() {
//                return preferential;
//            }
//
//            public void setPreferential(int preferential) {
//                this.preferential = preferential;
//            }
//
//            public String getAddr() {
//                return addr;
//            }
//
//            public void setAddr(String addr) {
//                this.addr = addr;
//            }
//
//            public String getArea() {
//                return area;
//            }
//
//            public void setArea(String area) {
//                this.area = area;
//            }
//
//            public String getCt() {
//                return ct;
//            }
//
//            public void setCt(String ct) {
//                this.ct = ct;
//            }
//
//            public double getLat() {
//                return lat;
//            }
//
//            public void setLat(double lat) {
//                this.lat = lat;
//            }
//
//            public double getLng() {
//                return lng;
//            }
//
//            public void setLng(double lng) {
//                this.lng = lng;
//            }
//
//            public String getBrd() {
//                return brd;
//            }
//
//            public void setBrd(String brd) {
//                this.brd = brd;
//            }
//
//            public String getDis() {
//                return dis;
//            }
//
//            public void setDis(String dis) {
//                this.dis = dis;
//            }
//
//            public int getDeal() {
//                return deal;
//            }
//
//            public void setDeal(int deal) {
//                this.deal = deal;
//            }
//
//            public int getDistance() {
//                return distance;
//            }
//
//            public void setDistance(int distance) {
//                this.distance = distance;
//            }
//
//            public int getFollow() {
//                return follow;
//            }
//
//            public void setFollow(int follow) {
//                this.follow = follow;
//            }
//
//            public int getImax() {
//                return imax;
//            }
//
//            public void setImax(int imax) {
//                this.imax = imax;
//            }
//
//            public double getSellPrice() {
//                return sellPrice;
//            }
//
//            public void setSellPrice(double sellPrice) {
//                this.sellPrice = sellPrice;
//            }
//
//            public double getDealPrice() {
//                return dealPrice;
//            }
//
//            public void setDealPrice(double dealPrice) {
//                this.dealPrice = dealPrice;
//            }
//
//            public double getReferencePrice() {
//                return referencePrice;
//            }
//
//            public void setReferencePrice(double referencePrice) {
//                this.referencePrice = referencePrice;
//            }
//
//            public int getShowCount() {
//                return showCount;
//            }
//
//            public void setShowCount(int showCount) {
//                this.showCount = showCount;
//            }
//
//            public int getBrdId() {
//                return brdId;
//            }
//
//            public void setBrdId(int brdId) {
//                this.brdId = brdId;
//            }
//
//            public int getId() {
//                return id;
//            }
//
//            public void setId(int id) {
//                this.id = id;
//            }
//        }
//
//        public static class 怀柔区Bean {
//            private int poiId;
//            private String nm;
//            private int sellmin;
//            private boolean sell;
//            private int preferential;
//            private String addr;
//            private String area;
//            private String ct;
//            private double lat;
//            private double lng;
//            private String brd;
//            private String dis;
//            private int deal;
//            private int distance;
//            private int follow;
//            private int imax;
//            private double sellPrice;
//            private double dealPrice;
//            private double referencePrice;
//            private int showCount;
//            private int brdId;
//            private int id;
//
//            public int getPoiId() {
//                return poiId;
//            }
//
//            public void setPoiId(int poiId) {
//                this.poiId = poiId;
//            }
//
//            public String getNm() {
//                return nm;
//            }
//
//            public void setNm(String nm) {
//                this.nm = nm;
//            }
//
//            public int getSellmin() {
//                return sellmin;
//            }
//
//            public void setSellmin(int sellmin) {
//                this.sellmin = sellmin;
//            }
//
//            public boolean isSell() {
//                return sell;
//            }
//
//            public void setSell(boolean sell) {
//                this.sell = sell;
//            }
//
//            public int getPreferential() {
//                return preferential;
//            }
//
//            public void setPreferential(int preferential) {
//                this.preferential = preferential;
//            }
//
//            public String getAddr() {
//                return addr;
//            }
//
//            public void setAddr(String addr) {
//                this.addr = addr;
//            }
//
//            public String getArea() {
//                return area;
//            }
//
//            public void setArea(String area) {
//                this.area = area;
//            }
//
//            public String getCt() {
//                return ct;
//            }
//
//            public void setCt(String ct) {
//                this.ct = ct;
//            }
//
//            public double getLat() {
//                return lat;
//            }
//
//            public void setLat(double lat) {
//                this.lat = lat;
//            }
//
//            public double getLng() {
//                return lng;
//            }
//
//            public void setLng(double lng) {
//                this.lng = lng;
//            }
//
//            public String getBrd() {
//                return brd;
//            }
//
//            public void setBrd(String brd) {
//                this.brd = brd;
//            }
//
//            public String getDis() {
//                return dis;
//            }
//
//            public void setDis(String dis) {
//                this.dis = dis;
//            }
//
//            public int getDeal() {
//                return deal;
//            }
//
//            public void setDeal(int deal) {
//                this.deal = deal;
//            }
//
//            public int getDistance() {
//                return distance;
//            }
//
//            public void setDistance(int distance) {
//                this.distance = distance;
//            }
//
//            public int getFollow() {
//                return follow;
//            }
//
//            public void setFollow(int follow) {
//                this.follow = follow;
//            }
//
//            public int getImax() {
//                return imax;
//            }
//
//            public void setImax(int imax) {
//                this.imax = imax;
//            }
//
//            public double getSellPrice() {
//                return sellPrice;
//            }
//
//            public void setSellPrice(double sellPrice) {
//                this.sellPrice = sellPrice;
//            }
//
//            public double getDealPrice() {
//                return dealPrice;
//            }
//
//            public void setDealPrice(double dealPrice) {
//                this.dealPrice = dealPrice;
//            }
//
//            public double getReferencePrice() {
//                return referencePrice;
//            }
//
//            public void setReferencePrice(double referencePrice) {
//                this.referencePrice = referencePrice;
//            }
//
//            public int getShowCount() {
//                return showCount;
//            }
//
//            public void setShowCount(int showCount) {
//                this.showCount = showCount;
//            }
//
//            public int getBrdId() {
//                return brdId;
//            }
//
//            public void setBrdId(int brdId) {
//                this.brdId = brdId;
//            }
//
//            public int getId() {
//                return id;
//            }
//
//            public void setId(int id) {
//                this.id = id;
//            }
//        }
//
//        public static class 平谷区Bean {
//            private int poiId;
//            private String nm;
//            private int sellmin;
//            private boolean sell;
//            private int preferential;
//            private String addr;
//            private String area;
//            private String ct;
//            private double lat;
//            private double lng;
//            private String brd;
//            private String dis;
//            private int deal;
//            private int distance;
//            private int follow;
//            private int imax;
//            private double sellPrice;
//            private double dealPrice;
//            private double referencePrice;
//            private int showCount;
//            private int brdId;
//            private int id;
//
//            public int getPoiId() {
//                return poiId;
//            }
//
//            public void setPoiId(int poiId) {
//                this.poiId = poiId;
//            }
//
//            public String getNm() {
//                return nm;
//            }
//
//            public void setNm(String nm) {
//                this.nm = nm;
//            }
//
//            public int getSellmin() {
//                return sellmin;
//            }
//
//            public void setSellmin(int sellmin) {
//                this.sellmin = sellmin;
//            }
//
//            public boolean isSell() {
//                return sell;
//            }
//
//            public void setSell(boolean sell) {
//                this.sell = sell;
//            }
//
//            public int getPreferential() {
//                return preferential;
//            }
//
//            public void setPreferential(int preferential) {
//                this.preferential = preferential;
//            }
//
//            public String getAddr() {
//                return addr;
//            }
//
//            public void setAddr(String addr) {
//                this.addr = addr;
//            }
//
//            public String getArea() {
//                return area;
//            }
//
//            public void setArea(String area) {
//                this.area = area;
//            }
//
//            public String getCt() {
//                return ct;
//            }
//
//            public void setCt(String ct) {
//                this.ct = ct;
//            }
//
//            public double getLat() {
//                return lat;
//            }
//
//            public void setLat(double lat) {
//                this.lat = lat;
//            }
//
//            public double getLng() {
//                return lng;
//            }
//
//            public void setLng(double lng) {
//                this.lng = lng;
//            }
//
//            public String getBrd() {
//                return brd;
//            }
//
//            public void setBrd(String brd) {
//                this.brd = brd;
//            }
//
//            public String getDis() {
//                return dis;
//            }
//
//            public void setDis(String dis) {
//                this.dis = dis;
//            }
//
//            public int getDeal() {
//                return deal;
//            }
//
//            public void setDeal(int deal) {
//                this.deal = deal;
//            }
//
//            public int getDistance() {
//                return distance;
//            }
//
//            public void setDistance(int distance) {
//                this.distance = distance;
//            }
//
//            public int getFollow() {
//                return follow;
//            }
//
//            public void setFollow(int follow) {
//                this.follow = follow;
//            }
//
//            public int getImax() {
//                return imax;
//            }
//
//            public void setImax(int imax) {
//                this.imax = imax;
//            }
//
//            public double getSellPrice() {
//                return sellPrice;
//            }
//
//            public void setSellPrice(double sellPrice) {
//                this.sellPrice = sellPrice;
//            }
//
//            public double getDealPrice() {
//                return dealPrice;
//            }
//
//            public void setDealPrice(double dealPrice) {
//                this.dealPrice = dealPrice;
//            }
//
//            public double getReferencePrice() {
//                return referencePrice;
//            }
//
//            public void setReferencePrice(double referencePrice) {
//                this.referencePrice = referencePrice;
//            }
//
//            public int getShowCount() {
//                return showCount;
//            }
//
//            public void setShowCount(int showCount) {
//                this.showCount = showCount;
//            }
//
//            public int getBrdId() {
//                return brdId;
//            }
//
//            public void setBrdId(int brdId) {
//                this.brdId = brdId;
//            }
//
//            public int getId() {
//                return id;
//            }
//
//            public void setId(int id) {
//                this.id = id;
//            }
//        }
//
//        public static class 密云县Bean {
//            private int poiId;
//            private String nm;
//            private int sellmin;
//            private boolean sell;
//            private int preferential;
//            private String addr;
//            private String area;
//            private String ct;
//            private double lat;
//            private double lng;
//            private String brd;
//            private String dis;
//            private int deal;
//            private int distance;
//            private int follow;
//            private int imax;
//            private double sellPrice;
//            private double dealPrice;
//            private double referencePrice;
//            private int showCount;
//            private int brdId;
//            private int id;
//
//            public int getPoiId() {
//                return poiId;
//            }
//
//            public void setPoiId(int poiId) {
//                this.poiId = poiId;
//            }
//
//            public String getNm() {
//                return nm;
//            }
//
//            public void setNm(String nm) {
//                this.nm = nm;
//            }
//
//            public int getSellmin() {
//                return sellmin;
//            }
//
//            public void setSellmin(int sellmin) {
//                this.sellmin = sellmin;
//            }
//
//            public boolean isSell() {
//                return sell;
//            }
//
//            public void setSell(boolean sell) {
//                this.sell = sell;
//            }
//
//            public int getPreferential() {
//                return preferential;
//            }
//
//            public void setPreferential(int preferential) {
//                this.preferential = preferential;
//            }
//
//            public String getAddr() {
//                return addr;
//            }
//
//            public void setAddr(String addr) {
//                this.addr = addr;
//            }
//
//            public String getArea() {
//                return area;
//            }
//
//            public void setArea(String area) {
//                this.area = area;
//            }
//
//            public String getCt() {
//                return ct;
//            }
//
//            public void setCt(String ct) {
//                this.ct = ct;
//            }
//
//            public double getLat() {
//                return lat;
//            }
//
//            public void setLat(double lat) {
//                this.lat = lat;
//            }
//
//            public double getLng() {
//                return lng;
//            }
//
//            public void setLng(double lng) {
//                this.lng = lng;
//            }
//
//            public String getBrd() {
//                return brd;
//            }
//
//            public void setBrd(String brd) {
//                this.brd = brd;
//            }
//
//            public String getDis() {
//                return dis;
//            }
//
//            public void setDis(String dis) {
//                this.dis = dis;
//            }
//
//            public int getDeal() {
//                return deal;
//            }
//
//            public void setDeal(int deal) {
//                this.deal = deal;
//            }
//
//            public int getDistance() {
//                return distance;
//            }
//
//            public void setDistance(int distance) {
//                this.distance = distance;
//            }
//
//            public int getFollow() {
//                return follow;
//            }
//
//            public void setFollow(int follow) {
//                this.follow = follow;
//            }
//
//            public int getImax() {
//                return imax;
//            }
//
//            public void setImax(int imax) {
//                this.imax = imax;
//            }
//
//            public double getSellPrice() {
//                return sellPrice;
//            }
//
//            public void setSellPrice(double sellPrice) {
//                this.sellPrice = sellPrice;
//            }
//
//            public double getDealPrice() {
//                return dealPrice;
//            }
//
//            public void setDealPrice(double dealPrice) {
//                this.dealPrice = dealPrice;
//            }
//
//            public double getReferencePrice() {
//                return referencePrice;
//            }
//
//            public void setReferencePrice(double referencePrice) {
//                this.referencePrice = referencePrice;
//            }
//
//            public int getShowCount() {
//                return showCount;
//            }
//
//            public void setShowCount(int showCount) {
//                this.showCount = showCount;
//            }
//
//            public int getBrdId() {
//                return brdId;
//            }
//
//            public void setBrdId(int brdId) {
//                this.brdId = brdId;
//            }
//
//            public int getId() {
//                return id;
//            }
//
//            public void setId(int id) {
//                this.id = id;
//            }
//        }
//
//        public static class 延庆县Bean {
//            private int poiId;
//            private String nm;
//            private int sellmin;
//            private boolean sell;
//            private int preferential;
//            private String addr;
//            private String area;
//            private String ct;
//            private double lat;
//            private double lng;
//            private String brd;
//            private String dis;
//            private int deal;
//            private int distance;
//            private int follow;
//            private int imax;
//            private double sellPrice;
//            private double dealPrice;
//            private double referencePrice;
//            private int showCount;
//            private int brdId;
//            private int id;
//
//            public int getPoiId() {
//                return poiId;
//            }
//
//            public void setPoiId(int poiId) {
//                this.poiId = poiId;
//            }
//
//            public String getNm() {
//                return nm;
//            }
//
//            public void setNm(String nm) {
//                this.nm = nm;
//            }
//
//            public int getSellmin() {
//                return sellmin;
//            }
//
//            public void setSellmin(int sellmin) {
//                this.sellmin = sellmin;
//            }
//
//            public boolean isSell() {
//                return sell;
//            }
//
//            public void setSell(boolean sell) {
//                this.sell = sell;
//            }
//
//            public int getPreferential() {
//                return preferential;
//            }
//
//            public void setPreferential(int preferential) {
//                this.preferential = preferential;
//            }
//
//            public String getAddr() {
//                return addr;
//            }
//
//            public void setAddr(String addr) {
//                this.addr = addr;
//            }
//
//            public String getArea() {
//                return area;
//            }
//
//            public void setArea(String area) {
//                this.area = area;
//            }
//
//            public String getCt() {
//                return ct;
//            }
//
//            public void setCt(String ct) {
//                this.ct = ct;
//            }
//
//            public double getLat() {
//                return lat;
//            }
//
//            public void setLat(double lat) {
//                this.lat = lat;
//            }
//
//            public double getLng() {
//                return lng;
//            }
//
//            public void setLng(double lng) {
//                this.lng = lng;
//            }
//
//            public String getBrd() {
//                return brd;
//            }
//
//            public void setBrd(String brd) {
//                this.brd = brd;
//            }
//
//            public String getDis() {
//                return dis;
//            }
//
//            public void setDis(String dis) {
//                this.dis = dis;
//            }
//
//            public int getDeal() {
//                return deal;
//            }
//
//            public void setDeal(int deal) {
//                this.deal = deal;
//            }
//
//            public int getDistance() {
//                return distance;
//            }
//
//            public void setDistance(int distance) {
//                this.distance = distance;
//            }
//
//            public int getFollow() {
//                return follow;
//            }
//
//            public void setFollow(int follow) {
//                this.follow = follow;
//            }
//
//            public int getImax() {
//                return imax;
//            }
//
//            public void setImax(int imax) {
//                this.imax = imax;
//            }
//
//            public double getSellPrice() {
//                return sellPrice;
//            }
//
//            public void setSellPrice(double sellPrice) {
//                this.sellPrice = sellPrice;
//            }
//
//            public double getDealPrice() {
//                return dealPrice;
//            }
//
//            public void setDealPrice(double dealPrice) {
//                this.dealPrice = dealPrice;
//            }
//
//            public double getReferencePrice() {
//                return referencePrice;
//            }
//
//            public void setReferencePrice(double referencePrice) {
//                this.referencePrice = referencePrice;
//            }
//
//            public int getShowCount() {
//                return showCount;
//            }
//
//            public void setShowCount(int showCount) {
//                this.showCount = showCount;
//            }
//
//            public int getBrdId() {
//                return brdId;
//            }
//
//            public void setBrdId(int brdId) {
//                this.brdId = brdId;
//            }
//
//            public int getId() {
//                return id;
//            }
//
//            public void setId(int id) {
//                this.id = id;
//            }
//        }
//    }
//}
