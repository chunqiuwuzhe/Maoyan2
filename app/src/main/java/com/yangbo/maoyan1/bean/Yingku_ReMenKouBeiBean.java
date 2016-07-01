package com.yangbo.maoyan1.bean;

import java.util.List;

/**
 * Created by yangbo on 2016/6/30.
 */
public class Yingku_ReMenKouBeiBean {

    /**
     * boardtype : 7
     * content : 《每日热映口碑榜》——将昨日国内热映的影片，按照评分从高到低排列，取前10名，每天上午10点更新，相关数据来源于“猫眼票房分析”及“猫眼电影库”。
     * created : 2016-06-30
     * id : 7
     * movies : [{"dir":"邓肯·琼斯","id":78421,"img":"http://p0.meituan.net/w.h/movie/f94e67dcd5b48f034bd7adc892f1b20695854.jpeg","nm":"魔兽","rt":"2016-06-08","sc":9.2,"star":"崔维斯·费米尔,宝拉·巴顿,本·福斯特","wish":479894},{"dir":"吴天明","id":248260,"img":"http://p1.meituan.net/w.h/movie/ef968fd382173c45b0c2d10572ca10b8354896.jpg","nm":"百鸟朝凤","rt":"2016-05-06","sc":9.2,"star":"陶泽如,郑伟,李岷城","wish":3981},{"dir":"布莱恩·辛格","id":246177,"img":"http://p1.meituan.net/w.h/movie/ba2386a26648c1875e3fc780950f0ae0144875.jpg","nm":"X战警：天启","rt":"2016-06-03","sc":9.1,"star":"詹姆斯·麦卡沃伊,迈克尔·法斯宾德,詹妮弗·劳伦斯","wish":559919},{"dir":"费格尔·雷利,克莱·凯蒂","id":246188,"img":"http://p0.meituan.net/w.h/movie/b721e73740601799c065affb619d837e151622.jpg","nm":"愤怒的小鸟","rt":"2016-05-20","sc":8.9,"star":"杰森·苏戴奇斯,乔什·盖德,丹尼·麦克布耐德","wish":123045},{"dir":"金帝荣","id":343379,"img":"http://p1.meituan.net/w.h/movie/79311d41bea3be8f1677c0b69a5868fa289298.jpg","nm":"所以\u2026\u2026和黑粉结婚了","rt":"2016-06-30","sc":8.8,"star":"朴灿烈,袁姗姗,姜潮","wish":101609},{"dir":"安德鲁·斯坦顿,安格斯·麦克莱恩","id":246366,"img":"http://p0.meituan.net/w.h/movie/4c20a91505854dcd0f9617069c5fec21843230.jpg","nm":"海底总动员2：多莉去哪儿","rt":"2016-06-17","sc":8.7,"star":"艾伦·德詹尼丝,徐帆,艾伯特·布鲁克斯","wish":144949},{"dir":"朱浩伟","id":246333,"img":"http://p1.meituan.net/w.h/movie/2e0b5b5c6c086cc93068fbc212f9f6b0142193.jpg","nm":"惊天魔盗团2","rt":"2016-06-24","sc":8.6,"star":"杰西·艾森伯格,马克·鲁法洛,伍迪·哈里森","wish":513937},{"dir":"罗兰·艾默里奇","id":246375,"img":"http://p1.meituan.net/w.h/movie/b408a9322cd0da51d4bdd3261ba3d1c0278866.jpg","nm":"独立日：卷土重来","rt":"2016-06-24","sc":8.5,"star":"利亚姆·海姆斯沃斯,杰夫·高布伦,杰西·厄舍","wish":164747},{"dir":"薛晓路","id":247575,"img":"http://p1.meituan.net/w.h/movie/fe80bc40822d0a5f3168b73089c47d71101133.jpg","nm":"北京遇上西雅图之不二情书","rt":"2016-04-29","sc":8.5,"star":"汤唯,吴秀波,惠英红","wish":307383},{"dir":"核桃","id":246045,"img":"http://p0.meituan.net/w.h/movie/73f6abbb90259d1fa8a88fa907ca3062587352.jpg","nm":"我叫MT之山口山战记","rt":"2016-06-17","sc":7.7,"star":"奶茶,YOYO,CBI","wish":43480}]
     * paging : {"hasMore":false,"limit":10,"offset":0,"total":10}
     * shareHidden : 1
     * title : 每日热映口碑榜
     */

    private DataBean data;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        private int boardtype;
        private String content;
        private String created;
        private int id;
        /**
         * hasMore : false
         * limit : 10
         * offset : 0
         * total : 10
         */

        private PagingBean paging;
        private int shareHidden;
        private String title;
        /**
         * dir : 邓肯·琼斯
         * id : 78421
         * img : http://p0.meituan.net/w.h/movie/f94e67dcd5b48f034bd7adc892f1b20695854.jpeg
         * nm : 魔兽
         * rt : 2016-06-08
         * sc : 9.2
         * star : 崔维斯·费米尔,宝拉·巴顿,本·福斯特
         * wish : 479894
         */

        private List<MoviesBean> movies;

        public int getBoardtype() {
            return boardtype;
        }

        public void setBoardtype(int boardtype) {
            this.boardtype = boardtype;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getCreated() {
            return created;
        }

        public void setCreated(String created) {
            this.created = created;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public PagingBean getPaging() {
            return paging;
        }

        public void setPaging(PagingBean paging) {
            this.paging = paging;
        }

        public int getShareHidden() {
            return shareHidden;
        }

        public void setShareHidden(int shareHidden) {
            this.shareHidden = shareHidden;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public List<MoviesBean> getMovies() {
            return movies;
        }

        public void setMovies(List<MoviesBean> movies) {
            this.movies = movies;
        }

        public static class PagingBean {
            private boolean hasMore;
            private int limit;
            private int offset;
            private int total;

            public boolean isHasMore() {
                return hasMore;
            }

            public void setHasMore(boolean hasMore) {
                this.hasMore = hasMore;
            }

            public int getLimit() {
                return limit;
            }

            public void setLimit(int limit) {
                this.limit = limit;
            }

            public int getOffset() {
                return offset;
            }

            public void setOffset(int offset) {
                this.offset = offset;
            }

            public int getTotal() {
                return total;
            }

            public void setTotal(int total) {
                this.total = total;
            }
        }

        public static class MoviesBean {
            private String dir;
            private int id;
            private String img;
            private String nm;
            private String rt;
            private double sc;
            private String star;
            private int wish;

            public String getDir() {
                return dir;
            }

            public void setDir(String dir) {
                this.dir = dir;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getImg() {
                return img;
            }

            public void setImg(String img) {
                this.img = img;
            }

            public String getNm() {
                return nm;
            }

            public void setNm(String nm) {
                this.nm = nm;
            }

            public String getRt() {
                return rt;
            }

            public void setRt(String rt) {
                this.rt = rt;
            }

            public double getSc() {
                return sc;
            }

            public void setSc(double sc) {
                this.sc = sc;
            }

            public String getStar() {
                return star;
            }

            public void setStar(String star) {
                this.star = star;
            }

            public int getWish() {
                return wish;
            }

            public void setWish(int wish) {
                this.wish = wish;
            }
        }
    }
}
