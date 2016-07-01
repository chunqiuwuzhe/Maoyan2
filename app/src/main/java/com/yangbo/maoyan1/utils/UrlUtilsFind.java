package com.yangbo.maoyan1.utils;

/**
 * Created by yangbo on 2016/6/28.
 */
public class UrlUtilsFind {
    //影院详情
    public static final String URL_CINEMA_DETAIL ="http://m.maoyan.com/showtime/wrap.json%EF%BC%9Fcinemaid=65&movieid=request#tmp=showtime&cinemaid=";

    //发现界面 话题页面
    public static final String URL_FIND_HUATI ="http://m.maoyan.com/groups?_v_=yes&f=android&userid=-1&pushToken=7e6bd5fe73912116ed3ca24d473265cc37ad738879f590efaf0a436f905b945b103b4d6d4a8cb7a6cd70f822f26ffff9&cityId=1";
    //发现 资讯
    public static final String URL_FIND_ZIXUN="http://m.maoyan.com/groups?_v_=yes&f=android&userid=-1&pushToken=7e6bd5fe73912116ed3ca24d473265cc37ad738879f590efaf0a436f905b945b103b4d6d4a8cb7a6cd70f822f26ffff9&cityId=1";
    //发现 票房
    public static final String URL_FIND_PIAOFANG="http://m.maoyan.com/newGuide/maoyanpiaofang?f=nohdft";
    //发现 list
    public static final String URL_FIND_LIST="http://api.meituan.com/sns/v2/feed.json?offset=0&limit=10&timestamp=0&__vhost=api.maoyan.com&utm_campaign=AmovieBmovieC110189035496448D-1&movieBundleVersion=6801&utm_source=baidumobile1&utm_medium=android&utm_term=6.8.0&utm_content=863777020121611&ci=1&net=255";
    //发现viewpager
    public static final String URL_FIND_VIEWPAGER="http://advert.mobile.meituan.com/api/v3/adverts?cityid=1&category=14&version=6.8.0&new=0&app=movie&clienttp=android&uuid=22C117E01E15F95B04242F2BFCC4575F5F5EA8EDB0193ED973FED7FA7B2829BD&devid=353918059801163&uid=&movieid=&partner=1&apptype=1&smId=&utm_campaign=AmovieBmovieCD-1&movieBundleVersion=6801&utm_source=goapk&utm_medium=android&utm_term=6.8.0&utm_content=353918059801163&ci=1&net=255&dModel=Nexus%204&lat=40.100654&lng=116.37805&__skck=6a375bce8c66a0dc293860dfa83833ef&__skts=1463655698510&__skua=7e01cf8dd30a179800a7a93979b430b2&__skno=d4f1e217-fd38-4cda-8d82-ef52b331a71a&__skcy=PL%2BjGyr5ANh3wbigOteOnFr7PLU%3D";

    //发现 影库 最上面的图片
    public static final String URL_FIND_YINGKU_HEAD ="http://api.maoyan.com/mmdb/daily/recommend/latest/list.json?utm_campaign=AmovieBmovieCD-1&movieBundleVersion=6801&utm_source=xiaomi&utm_medium=android&utm_term=6.8.0&utm_content";
    //热门口碑
    public static final String URL_FIND_YINGKU_RMKB ="http://api.meituan.com/mmdb/movieboard/fixedboard/7.json?offset=0&limit=10&__vhost=api.maoyan.com&utm_campaign=AmovieBmovieC110189035496448D-1&movieBundleVersion=6801&utm_source=hiapk&utm_medium=android&utm_term=6.8.0&utm_content=000000000000000&ci=1&net=255&dModel=Custom%20Phone%20-%204.3%20-%20API%2018%20-%20768x1280&uuid=2C2C0ECD557F366849954BEF88D0017AC98AD8183EC9108E7D92853C8D3EF972&lat=0.0&lng=0.0&__skck=6a375bce8c66a0dc293860dfa83833ef&__skts=1463727372645&__skua=7e01cf8dd30a179800a7a93979b430b2&__skno=26a19547-c4ad-438f-96af-0feadadba2b0&__skcy=S9pqtpXxrUm%2BgC2THRjoEuUzJoY%3D";
    //最受期待
    public static final String URL_ZUISHOUQIDAI ="http://api.meituan.com/mmdb/movieboard/fixedboard/6.json?offset=0&limit=10&__vhost=api.maoyan.com&utm_campaign=AmovieBmovieC110189035496448D-1&movieBundleVersion=6801&utm_source=hiapk&utm_medium=android&utm_term=6.8.0&utm_content=000000000000000&ci=1&net=255&dModel=Custom%20Phone%20-%204.3%20-%20API%2018%20-%20768x1280&uuid=2C2C0ECD557F366849954BEF88D0017AC98AD8183EC9108E7D92853C8D3EF972&lat=0.0&lng=0.0&__skck=6a375bce8c66a0dc293860dfa83833ef&__skts=1463727423837&__skua=7e01cf8dd30a179800a7a93979b430b2&__skno=bbd36610-f22a-4523-bcfb-59658c25056e&__skcy=Phj0IYaOnVVHPXIHPumsV6vBBrg%3D";
    //北美票房
    public static final String  URL_BEIMEIPIAOFANG="http://api.meituan.com/mmdb/movieboard/fixedboard/2.json?offset=0&limit=10&__vhost=api.maoyan.com&utm_campaign=AmovieBmovieCD-1&movieBundleVersion=6801&utm_source=hiapk&utm_medium=android&utm_term=6.8.0&utm_content=000000000000000&ci=1&net=255&dModel=Custom%20Phone%20-%204.3%20-%20API%2018%20-%20768x1280&uuid=2C2C0ECD557F366849954BEF88D0017AC98AD8183EC9108E7D92853C8D3EF972&lat=0.0&lng=0.0&__skck=6a375bce8c66a0dc293860dfa83833ef&__skts=1463712271641&__skua=7e01cf8dd30a179800a7a93979b430b2&__skno=0002470d-9e88-412f-a300-2a6e651a7e3e&__skcy=FN%2Ff1xBS0AohUxjhP7FKLe2JNlo%3D";
    //Top100
    public static final String  URL_Top100 ="http://api.meituan.com/mmdb/movieboard/fixedboard/4.json?offset=0&limit=10&__vhost=api.maoyan.com&utm_campaign=AmovieBmovieCD-1&movieBundleVersion=6801&utm_source=hiapk&utm_medium=android&utm_term=6.8.0&utm_content=000000000000000&ci=1&net=255&dModel=Custom%20Phone%20-%204.3%20-%20API%2018%20-%20768x1280&uuid=2C2C0ECD557F366849954BEF88D0017AC98AD8183EC9108E7D92853C8D3EF972&lat=0.0&lng=0.0&__skck=6a375bce8c66a0dc293860dfa83833ef&__skts=1463712334518&__skua=7e01cf8dd30a179800a7a93979b430b2&__skno=7a1d1ed9-473e-49e9-ad52-b1b7bbd5a5b7&__skcy=nXjScwb2c0H8dO0LxNXZGfODzoI%3D";
}
