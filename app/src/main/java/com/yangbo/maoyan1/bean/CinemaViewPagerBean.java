package com.yangbo.maoyan1.bean;

import java.util.List;

/**
 * Created by yangbo on 2016/6/27.
 */
public class CinemaViewPagerBean {

    /**
     * app : movie
     * bigImgTypeUrl :
     * bigImgUrlSize : (0, 0)
     * businessIds :
     * businessName :
     * channelListMap : {}
     * channelType : 0
     * closable : 2
     * commonTitle : 全国六月爆米花节
     * endTime : 1466956740000
     * id : 14713
     * imgUrl : http://p1.meituan.net/mmc/288edd16c08aad41109067912b341f7857957.jpg
     * imgUrlSize : (640, 150)
     * level : 3
     * movieIdList : []
     * name : 全国六月爆米花节
     * newUser : -1
     * standIdList : [12]
     * startTime : 1465833600000
     * type : 3
     * typeDesc : 链接到应用内部页面
     * url : meituanmovie://www.meituan.com/web?url=http://m.maoyan.com/newGuide/popcorn
     */

    private List<DataBean> data;

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        private String app;
        private String bigImgTypeUrl;
        private String bigImgUrlSize;
        private String businessIds;
        private String businessName;
        private int channelType;
        private int closable;
        private String commonTitle;
        private long endTime;
        private int id;
        private String imgUrl;
        private String imgUrlSize;
        private int level;
        private String name;
        private int newUser;
        private long startTime;
        private int type;
        private String typeDesc;
        private String url;
        private List<?> movieIdList;
        private List<Integer> standIdList;

        public String getApp() {
            return app;
        }

        public void setApp(String app) {
            this.app = app;
        }

        public String getBigImgTypeUrl() {
            return bigImgTypeUrl;
        }

        public void setBigImgTypeUrl(String bigImgTypeUrl) {
            this.bigImgTypeUrl = bigImgTypeUrl;
        }

        public String getBigImgUrlSize() {
            return bigImgUrlSize;
        }

        public void setBigImgUrlSize(String bigImgUrlSize) {
            this.bigImgUrlSize = bigImgUrlSize;
        }

        public String getBusinessIds() {
            return businessIds;
        }

        public void setBusinessIds(String businessIds) {
            this.businessIds = businessIds;
        }

        public String getBusinessName() {
            return businessName;
        }

        public void setBusinessName(String businessName) {
            this.businessName = businessName;
        }

        public int getChannelType() {
            return channelType;
        }

        public void setChannelType(int channelType) {
            this.channelType = channelType;
        }

        public int getClosable() {
            return closable;
        }

        public void setClosable(int closable) {
            this.closable = closable;
        }

        public String getCommonTitle() {
            return commonTitle;
        }

        public void setCommonTitle(String commonTitle) {
            this.commonTitle = commonTitle;
        }

        public long getEndTime() {
            return endTime;
        }

        public void setEndTime(long endTime) {
            this.endTime = endTime;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getImgUrl() {
            return imgUrl;
        }

        public void setImgUrl(String imgUrl) {
            this.imgUrl = imgUrl;
        }

        public String getImgUrlSize() {
            return imgUrlSize;
        }

        public void setImgUrlSize(String imgUrlSize) {
            this.imgUrlSize = imgUrlSize;
        }

        public int getLevel() {
            return level;
        }

        public void setLevel(int level) {
            this.level = level;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getNewUser() {
            return newUser;
        }

        public void setNewUser(int newUser) {
            this.newUser = newUser;
        }

        public long getStartTime() {
            return startTime;
        }

        public void setStartTime(long startTime) {
            this.startTime = startTime;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public String getTypeDesc() {
            return typeDesc;
        }

        public void setTypeDesc(String typeDesc) {
            this.typeDesc = typeDesc;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public List<?> getMovieIdList() {
            return movieIdList;
        }

        public void setMovieIdList(List<?> movieIdList) {
            this.movieIdList = movieIdList;
        }

        public List<Integer> getStandIdList() {
            return standIdList;
        }

        public void setStandIdList(List<Integer> standIdList) {
            this.standIdList = standIdList;
        }
    }
}
