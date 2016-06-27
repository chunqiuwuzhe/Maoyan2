package com.yangbo.maoyan1.utils;

/**
 * Created by yangbo on 2016/6/23.
 */
public class UrlUtils {

    public static final String URL_SPLASH = "http://api.meituan.com/dianying/posters.json?city_id=1&poster_type=1&__vhost=api.maoyan.com&utm_campaign=AmovieBmovieCD-1&movieBundleVersion=6801&utm_source=hiapk&utm_medium=android&utm_term=6.8.0&utm_content=860311023305964&ci=1&net=255&dModel=MI%203&uuid=F096369352E4004DD3758BF83FE24AC312445F9B51AD3D8FCE2A0CD57754F6E4&lat=0.0&lng=0.0&__skck=6a375bce8c66a0dc293860dfa83833ef&__skts=1463656383990&__skua=7e01cf8dd30a179800a7a93979b430b2&__skno=09cbe8d3-3cb0-4e54-bc41-8f0b3387cdf2&__skcy=RbOZVh%2BK%2Bf86K3WlGJYg4ls7DIU%3D";
    public static final String URL_CINEMA = "http://m.maoyan.com/cinemas.json";
    //热映viewpager请求地址
    public static final String URL_REYING_VIEWPAGER="http://advert.mobile.meituan.com/api/v3/adverts?cityid=1&category=11&version=6.8.0&new=0&app=movie&clienttp=android&uuid=FCFAB9D8DD339645D629C8372A29A2C6AD16F9C9E87AF9AC0D656B29DD5AC6DE&devid=866641027400542&uid=&movieid=&partner=1&apptype=1&smId=&utm_campaign=AmovieBmovieCD-1&movieBundleVersion=6801&utm_source=qq&utm_medium=android&utm_term=6.8.0&utm_content=866641027400542&ci=1&net=255&dModel=HM%20NOTE%201LTETD&lat=40.100855&lng=116.378273&__skck=6a375bce8c66a0dc293860dfa83833ef&__skts=1463730432992&__skua=7e01cf8dd30a179800a7a93979b430b2&__skno=01f9c5c0-eb56-4e19-92fb-b86b16ad79da&__skcy=5K8wRR%2FKYAZDTgmAzbhrXi%2FomzU%3D";
    //热映listview请求地址
//    public static final String URL_REYING_LISTVIEW="http://m.maoyan.com/movie/list.json?type=hot&offset=0&limit=1000";
    public static final String URL_REYING_LISTVIEW="http://api.meituan.com/mmdb/movie/v3/list/hot.json?ci=1&limit=12&token=khqtetvUORxgrW0qNK8CwQSM0A4AAAAAYAIAADDnHoQR8o9sEPycPV7_k2R8lC7ClkidRlDZ6kvQ4pBrFeBMV-e7Cen9-NP-33PtIA&__vhost=api.maoyan.com&utm_campaign=AmovieBmovieCD100&movieBundleVersion=6901&utm_source=baidumobile1&utm_medium=android&utm_term=6.9.0&utm_content=869402021153646&net=255&dModel=m1%20metal&uuid=28C0DE2C5A3F109C808BE007F1011AE88795D9EFF3B99C9B3601DCF7840739F9&lat=0.0&lng=0.0&__skck=6a375bce8c66a0dc293860dfa83833ef&__skts=1466919017564&__skua=7e01cf8dd30a179800a7a93979b430b2&__skno=1821587c-057d-477b-a36c-69837c2874b6&__skcy=a37Ln0qItaxew3QND9GY4MfQzg8%3D%E5%BD%AD%E4%BF%8A%E5%B1%B1%2014:31:15http://api.meituan.com/mmdb/movie/v3/list/hot.json?ci=1&limit=12&token=khqtetvUORxgrW0qNK8CwQSM0A4AAAAAYAIAADDnHoQR8o9sEPycPV7_k2R8lC7ClkidRlDZ6kvQ4pBrFeBMV-e7Cen9-NP-33PtIA&__vhost=api.maoyan.com&utm_campaign=AmovieBmovieCD100&movieBundleVersion=6901&utm_source=baidumobile1&utm_medium=android&utm_term=6.9.0&utm_content=869402021153646&net=255&dModel=m1%20metal&uuid=28C0DE2C5A3F109C808BE007F1011AE88795D9EFF3B99C9B3601DCF7840739F9&lat=0.0&lng=0.0&__skck=6a375bce8c66a0dc293860dfa83833ef&__skts=1466919017564&__skua=7e01cf8dd30a179800a7a93979b430b2&__skno=1821587c-057d-477b-a36c-69837c2874b6&__skcy=a37Ln0qItaxew3QND9GY4MfQzg8%3D%E5%BD%AD%E4%BF%8A%E5%B1%B1%2014:31:46http://api.meituan.com/mmdb/movie/v3/list/hot.json?ci=1&limit=12&token=khqtetvUORxgrW0qNK8CwQSM0A4AAAAAYAIAADDnHoQR8o9sEPycPV7_k2R8lC7ClkidRlDZ6kvQ4pBrFeBMV-e7Cen9-NP-33PtIA&__vhost=api.maoyan.com&utm_campaign=AmovieBmovieCD100&movieBundleVersion=6901&utm_source=baidumobile1&utm_medium=android&utm_term=6.9.0&utm_content=869402021153646&net=255&dModel=m1%20metal&uuid=28C0DE2C5A3F109C808BE007F1011AE88795D9EFF3B99C9B3601DCF7840739F9&lat=0.0&lng=0.0&__skck=6a375bce8c66a0dc293860dfa83833ef&__skts=1466919017564&__skua=7e01cf8dd30a179800a7a93979b430b2&__skno=1821587c-057d-477b-a36c-69837c2874b6&__skcy=a37Ln0qItaxew3QND9GY4MfQzg8%3D";
    //海外tablayout请求地址
    public static final String URL_HAIWAI_TABLAYOUT="http://api.meituan.com/mmdb/movie/oversea/areas.json?token=&__vhost=api.maoyan.com&utm_campaign=AmovieBmovieC110189035496448D-1&movieBundleVersion=6901&utm_source=qihu360-dy&utm_medium=android&utm_term=6.9.0&utm_content=864394109418758&ci=1&net=255&dModel=GT-N7100&uuid=34E86498880DD102B3AE536CBD0B91E1FD30B5FF25EDC8F741AABB39C2662094&lat=39.906899375649395&lng=116.39723909965588&__skck=6a375bce8c66a0dc293860dfa83833ef&__skts=1466990757555&__skua=7e01cf8dd30a179800a7a93979b430b2&__skno=83f55f8b-5984-4568-a366-d748aa285ccc&__skcy=sB5kpKy%2BoWuWv%2FMk2gvkOdDDUXg%3D";
    public static final String URL_CINEMA_HEADER = "http://advert.mobile.meituan.com/api/v3/adverts?cityid=1&category=12&version=6.8.0&new=0&app=movie&clienttp=android&uuid=2C2C0ECD557F366849954BEF88D0017AE8F745F113619A0301F4E4E123A4CD7E&devid=000000000000000&uid=&movieid=&partner=1&apptype=1&smId=&utm_campaign=AmovieBpushC110189035496448D-1&movieBundleVersion=6801&utm_source=hiapk&utm_medium=android&utm_term=6.8.0&utm_content=000000000000000&ci=1&net=255&dModel=Google%20Nexus%204%20-%204.3%20-%20API%2018%20-%20768x1280_1&lat=0.0&lng=0.0&__skck=6a375bce8c66a0dc293860dfa83833ef&__skts=1466950481658&__skua=7e01cf8dd30a179800a7a93979b430b2&__skno=376da951-e975-440d-82b9-f4ac14788679&__skcy=a51B0teaxlLzzW5QEnyfCrcq2S0%3D";
    //待映listview数据
    public static final String UrL_DAIYING_RECYLERVIEW="http://api.meituan.com/mmdb/movie/v2/list/rt/order/coming.json?ci=1&limit=12&token=&__vhost=api.maoyan.com&utm_campaign=AmovieBmovieCD-1&movieBundleVersion=6801&utm_source=xiaomi&utm_medium=android&utm_term=6.8.0&utm_content=868030022327462&net=255&dModel=MI%205&uuid=0894DE03C76F6045D55977B6D4E32B7F3C6AAB02F9CEA042987B380EC5687C43&lat=40.100673&lng=116.378619&__skck=6a375bce8c66a0dc293860dfa83833ef&__skts=1463704714271&__skua=7e01cf8dd30a179800a7a93979b430b2&__skno=1a0b4a9b-44ec-42fc-b110-ead68bcc2824&__skcy=sXcDKbGi20CGXQPPZvhCU3%2FkzdE%3D";
}
