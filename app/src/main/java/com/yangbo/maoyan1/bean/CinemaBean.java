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
//     * data : {"朝阳区":[{"poiId":75603,"nm":"17.5影城(比如世界店)","sellmin":0,"sell":true,"preferential":0,"addr":"朝阳区京顺路111号比如世界购物中心1层（近太阳宫北街）","area":"朝阳区","ct":"","lat":39.9684,"lng":116.46204,"brd":"17.5影城","dis":"望京","deal":0,"distance":0,"follow":0,"imax":0,"sellPrice":22,"dealPrice":0,"referencePrice":70,"showCount":0,"brdId":23854,"id":48},{"poiId":1677952,"nm":"17.5影城(管庄店)","sellmin":0,"sell":true,"preferential":0,"addr":"朝阳区朝阳路京通苑30号楼L307PLus365购物中心三层","area":"朝阳区","ct":"","lat":39.912422,"lng":116.596085,"brd":"17.5影城","dis":"管庄","deal":0,"distance":0,"follow":0,"imax":0,"sellPrice":27,"dealPrice":0,"referencePrice":60,"showCount":0,"brdId":23854,"id":2243},{"poiId":360511,"nm":"CGV星聚汇星星影城(奥体店)","sellmin":0,"sell":true,"preferential":0,"addr":"朝阳区湖景东路11号新奥购物中心B1-B2楼","area":"朝阳区","ct":"","lat":39.999462,"lng":116.39392,"brd":"CGV星聚汇影城","dis":"亚运村","deal":0,"distance":0,"follow":0,"imax":0,"sellPrice":57,"dealPrice":0,"referencePrice":40,"showCount":0,"brdId":2020418,"id":65},{"poiId":1466992,"nm":"CGV星聚汇星星影城(颐堤港店)","sellmin":0,"sell":true,"preferential":0,"addr":"朝阳区酒仙桥路18号颐堤港4层","area":"朝阳区","ct":"","lat":39.96964,"lng":116.4909,"brd":"CGV星聚汇影城","dis":"酒仙桥","deal":0,"distance":0,"follow":0,"imax":0,"sellPrice":57,"dealPrice":0,"referencePrice":40,"showCount":0,"brdId":2020418,"id":8},{"poiId":796845,"nm":"K酷国际影城","sellmin":0,"sell":true,"preferential":0,"addr":"朝阳区北苑路42号卜峰莲花超市4楼（K酷时尚广场）","area":"朝阳区","ct":"","lat":40.033382,"lng":116.41916,"brd":"K酷国际影城","dis":"亚运村","deal":1,"distance":0,"follow":0,"imax":0,"sellPrice":38,"dealPrice":35.5,"referencePrice":80,"showCount":0,"brdId":24003,"id":21},{"poiId":291070,"nm":"UME国际影城(双井店)","sellmin":0,"sell":true,"preferential":0,"addr":"朝阳区东三环中路65号富力广场5楼（双井桥北）","area":"朝阳区","ct":"","lat":39.89536,"lng":116.46085,"brd":"UME国际影城","dis":"双井","deal":0,"distance":0,"follow":0,"imax":0,"sellPrice":39.5,"dealPrice":0,"referencePrice":70,"showCount":0,"brdId":24071,"id":135},{"poiId":42853106,"nm":"艾米·1895电影街","sellmin":0,"sell":true,"preferential":0,"addr":"朝阳区工体北路13号世茂工三3楼，艾米·1895电影街（三里屯商圈）","area":"朝阳区","ct":"","lat":39.93605,"lng":116.44939,"brd":"其它","dis":"","deal":1,"distance":0,"follow":0,"imax":0,"sellPrice":43,"dealPrice":100,"referencePrice":0,"showCount":0,"brdId":0,"id":13640},{"poiId":361205,"nm":"保利国际影城(北苑华贸店)","sellmin":0,"sell":true,"preferential":0,"addr":"朝阳区清河营南街7号院华贸天地B1楼","area":"朝阳区","ct":"","lat":40.047962,"lng":116.43101,"brd":"保利国际影城","dis":"北苑","deal":0,"distance":0,"follow":0,"imax":0,"sellPrice":39,"dealPrice":0,"referencePrice":25,"showCount":0,"brdId":24472,"id":2603},{"poiId":73452594,"nm":"保利国际影城(东坝店)","sellmin":0,"sell":true,"preferential":0,"addr":"朝阳区东坝中路38号金隅嘉品MALL5层","area":"朝阳区","ct":"","lat":39.951107,"lng":116.54848,"brd":"保利国际影城","dis":"","deal":0,"distance":0,"follow":0,"imax":0,"sellPrice":29,"dealPrice":0,"referencePrice":0,"showCount":0,"brdId":24472,"id":14430},{"poiId":1107541,"nm":"保利国际影城(望京店)","sellmin":0,"sell":true,"preferential":0,"addr":"朝阳区望京阜通西大街新荟城购物中心五层","area":"朝阳区","ct":"","lat":39.998497,"lng":116.481926,"brd":"保利国际影城","dis":"望京","deal":0,"distance":0,"follow":0,"imax":0,"sellPrice":39,"dealPrice":0,"referencePrice":70,"showCount":0,"brdId":24472,"id":39},{"poiId":61574,"nm":"保利国际影城(中国科技馆店)","sellmin":0,"sell":true,"preferential":0,"addr":"朝阳区北辰东路5号（鸟巢正北一公里）","area":"朝阳区","ct":"","lat":40.005745,"lng":116.39992,"brd":"保利国际影城","dis":"亚运村","deal":0,"distance":0,"follow":0,"imax":0,"sellPrice":34,"dealPrice":0,"referencePrice":80,"showCount":0,"brdId":24472,"id":40},{"poiId":3281398,"nm":"百丽宫影城(国贸店)","sellmin":0,"sell":true,"preferential":0,"addr":"朝阳区建国门外大街1号国贸商城区域三地下一层3B120","area":"朝阳区","ct":"","lat":39.91279,"lng":116.45982,"brd":"百老汇影城","dis":"国贸","deal":0,"distance":0,"follow":0,"imax":0,"sellPrice":48,"dealPrice":0,"referencePrice":90,"showCount":0,"brdId":24377,"id":23},{"poiId":63,"nm":"博纳国际影城(悠唐店)","sellmin":0,"sell":true,"preferential":0,"addr":"朝阳区三丰北里2号楼悠唐生活广场B1楼（近钱柜）","area":"朝阳区","ct":"","lat":39.922,"lng":116.44,"brd":"博纳国际影城","dis":"朝外大街","deal":0,"distance":0,"follow":0,"imax":1,"sellPrice":44,"dealPrice":0,"referencePrice":35,"showCount":0,"brdId":24595,"id":116},{"poiId":297916,"nm":"传奇时代影城(蓝色港湾店)","sellmin":0,"sell":true,"preferential":0,"addr":"朝阳区朝阳公园路6号蓝色港湾国际商区SA-42（朝阳公园西北角）","area":"朝阳区","ct":"","lat":39.949085,"lng":116.47616,"brd":"传奇时代影城","dis":"亮马桥","deal":0,"distance":0,"follow":0,"imax":0,"sellPrice":39.5,"dealPrice":0,"referencePrice":40,"showCount":0,"brdId":24804,"id":132},{"poiId":1465641,"nm":"橙天嘉禾影城(凤凰城店)","sellmin":0,"sell":true,"preferential":0,"addr":"朝阳区曙光西里甲5号院24号楼凤凰汇三层","area":"朝阳区","ct":"","lat":39.962627,"lng":116.45721,"brd":"橙天嘉禾影城","dis":"三元桥","deal":0,"distance":0,"follow":0,"imax":0,"sellPrice":33.5,"dealPrice":0,"referencePrice":80,"showCount":0,"brdId":24745,"id":2081},{"poiId":82595,"nm":"朝阳剧场","sellmin":0,"sell":true,"preferential":0,"addr":"朝阳区东三环北路36号呼家楼北（近朝阳北路）","area":"朝阳区","ct":"","lat":39.922314,"lng":116.462105,"brd":"朝阳剧场","dis":"亮马桥","deal":1,"distance":0,"follow":0,"imax":0,"sellPrice":33,"dealPrice":36,"referencePrice":60,"showCount":0,"brdId":635050,"id":249},{"poiId":4036242,"nm":"大地数字影院(望京新天地店)","sellmin":0,"sell":true,"preferential":0,"addr":"朝阳区望京阜安西街11号楼合生麒麟新天地2层","area":"朝阳区","ct":"","lat":39.99817,"lng":116.47787,"brd":"大地影院","dis":"","deal":1,"distance":0,"follow":0,"imax":0,"sellPrice":33,"dealPrice":40.5,"referencePrice":0,"showCount":0,"brdId":384262,"id":7881},{"poiId":30903,"nm":"东都影城","sellmin":0,"sell":true,"preferential":0,"addr":"朝阳区东四环中路195号华腾新天地五层","area":"朝阳区","ct":"","lat":39.885048,"lng":116.48847,"brd":"东都影城","dis":"大望路","deal":0,"distance":0,"follow":0,"imax":0,"sellPrice":43,"dealPrice":0,"referencePrice":43,"showCount":0,"brdId":133085,"id":262},{"poiId":41877507,"nm":"大地影院(垡头永辉店)","sellmin":0,"sell":true,"preferential":0,"addr":"朝阳区南杨庄路与武基街交叉口西南方向50米路南（垡头永辉超市，翠城馨园401号楼地下一层）","area":"朝阳区","ct":"","lat":39.856857,"lng":116.50524,"brd":"大地影院","dis":"","deal":1,"distance":0,"follow":0,"imax":0,"sellPrice":43,"dealPrice":40.5,"referencePrice":0,"showCount":0,"brdId":384262,"id":10954},{"poiId":40086376,"nm":"大地影院(十里河铭泽影院 )","sellmin":0,"sell":true,"preferential":0,"addr":"朝阳区西大望南路与弘燕南一路交叉口铭泽生活广场5层","area":"朝阳区","ct":"","lat":39.864407,"lng":116.47688,"brd":"大地影院","dis":"","deal":1,"distance":0,"follow":0,"imax":0,"sellPrice":33,"dealPrice":40.5,"referencePrice":0,"showCount":0,"brdId":384262,"id":10951},{"poiId":1098864,"nm":"海航文化天宝国际影城","sellmin":0,"sell":true,"preferential":0,"addr":"朝阳区祁家豁子8号健翔大厦家乐福超市B1层","area":"朝阳区","ct":"","lat":39.98034,"lng":116.38147,"brd":"其它","dis":"亚运村","deal":1,"distance":0,"follow":0,"imax":0,"sellPrice":33,"dealPrice":39.6,"referencePrice":80,"showCount":0,"brdId":0,"id":31},{"poiId":5948789,"nm":"红星太平洋电影城(爱琴海购物中心店)","sellmin":0,"sell":true,"preferential":0,"addr":"朝阳区七圣中街12号院爱琴海购物中心6层","area":"朝阳区","ct":"","lat":39.97224,"lng":116.436386,"brd":"太平洋电影城","dis":"","deal":0,"distance":0,"follow":0,"imax":0,"sellPrice":53,"dealPrice":0,"referencePrice":0,"showCount":0,"brdId":28975,"id":7619},{"poiId":2578227,"nm":"嘉华国际影城(活力东方店)","sellmin":0,"sell":true,"preferential":0,"addr":"朝阳区姚家园路甲1号活力东方奥特莱斯购物中心4楼","area":"朝阳区","ct":"","lat":39.940395,"lng":116.52246,"brd":"嘉华国际影城","dis":"","deal":1,"distance":0,"follow":0,"imax":0,"sellPrice":39,"dealPrice":30,"referencePrice":70,"showCount":0,"brdId":26413,"id":5987},{"poiId":89000,"nm":"金鸡百花影城","sellmin":0,"sell":true,"preferential":0,"addr":"朝阳区北三环东路22号","area":"朝阳区","ct":"","lat":39.96894,"lng":116.42397,"brd":"金鸡百花影城","dis":"左家庄","deal":0,"distance":0,"follow":0,"imax":0,"sellPrice":38,"dealPrice":0,"referencePrice":30,"showCount":0,"brdId":1082447,"id":256},{"poiId":82588,"nm":"劲松电影院","sellmin":0,"sell":true,"preferential":0,"addr":"朝阳区劲松中街404号","area":"朝阳区","ct":"","lat":39.88321,"lng":116.45597,"brd":"劲松电影院","dis":"劲松","deal":0,"distance":0,"follow":0,"imax":0,"sellPrice":33,"dealPrice":0,"referencePrice":30,"showCount":0,"brdId":252281,"id":236},{"poiId":1548100,"nm":"金逸影城(朝阳大悦城IMAX店)","sellmin":0,"sell":true,"preferential":0,"addr":"朝阳区朝阳北路101号朝阳大悦城商场8层","area":"朝阳区","ct":"","lat":39.924355,"lng":116.51871,"brd":"金逸影城","dis":"十里堡","deal":0,"distance":0,"follow":0,"imax":1,"sellPrice":39,"dealPrice":0,"referencePrice":80,"showCount":0,"brdId":1079568,"id":88},{"poiId":1439570,"nm":"金逸影城(双桥店)","sellmin":0,"sell":true,"preferential":0,"addr":"朝阳区双桥路3号东星时尚广场5层","area":"朝阳区","ct":"","lat":39.90879,"lng":116.57644,"brd":"金逸影城","dis":"管庄","deal":0,"distance":0,"follow":0,"imax":0,"sellPrice":29,"dealPrice":0,"referencePrice":0,"showCount":0,"brdId":1079568,"id":1692},{"poiId":332108,"nm":"卢米埃影城(芳草地店)","sellmin":0,"sell":true,"preferential":0,"addr":"朝阳区东大桥路9号侨福芳草地购物中心LG2-26（尚都SOHO对面）","area":"朝阳区","ct":"","lat":39.9192,"lng":116.4496,"brd":"卢米埃影城","dis":"","deal":0,"distance":0,"follow":0,"imax":0,"sellPrice":58,"dealPrice":0,"referencePrice":50,"showCount":0,"brdId":292030,"id":5736},{"poiId":52539636,"nm":"卢米埃影城(长楹天街IMAX店)","sellmin":0,"sell":true,"preferential":0,"addr":"朝阳区朝阳北路长楹天街购物中心东区5F-09","area":"朝阳区","ct":"","lat":39.92509,"lng":116.60262,"brd":"卢米埃影城","dis":"","deal":0,"distance":0,"follow":0,"imax":1,"sellPrice":43,"dealPrice":0,"referencePrice":0,"showCount":0,"brdId":292030,"id":13204},{"poiId":1541423,"nm":"鲁信影城(立水桥店)","sellmin":0,"sell":true,"preferential":0,"addr":"朝阳区立清路明天第一城7号院，蓝黛时空汇内","area":"朝阳区","ct":"","lat":40.04711,"lng":116.4083,"brd":"鲁信影城","dis":"北苑家园","deal":1,"distance":0,"follow":0,"imax":0,"sellPrice":33,"dealPrice":25,"referencePrice":70,"showCount":0,"brdId":27424,"id":1732},{"poiId":30915,"nm":"美嘉欢乐影城(三里屯店)","sellmin":0,"sell":true,"preferential":0,"addr":"朝阳区三里屯太古里地下一层（三里屯酒吧街南口西侧）","area":"朝阳区","ct":"","lat":39.934406,"lng":116.45507,"brd":"美嘉欢乐影城","dis":"三里屯","deal":0,"distance":0,"follow":0,"imax":0,"sellPrice":49,"dealPrice":0,"referencePrice":80,"showCount":0,"brdId":27617,"id":136},{"poiId":30863,"nm":"万达国际影城(CBD店)","sellmin":0,"sell":true,"preferential":0,"addr":"朝阳区建国路93号万达广场B座3层","area":"朝阳区","ct":"","lat":39.909027,"lng":116.4709,"brd":"万达影城","dis":"大望路","deal":0,"distance":0,"follow":0,"imax":1,"sellPrice":43,"dealPrice":0,"referencePrice":80,"showCount":0,"brdId":102642,"id":264},{"poiId":5529977,"nm":"沃美影城(常营店)","sellmin":0,"sell":true,"preferential":0,"addr":"朝阳区朝阳北路17号（地铁6号线常营站B出口）北京华联购物中心四层","area":"朝阳区","ct":"","lat":39.926224,"lng":116.598885,"brd":"沃美影城","dis":"","deal":0,"distance":0,"follow":0,"imax":0,"sellPrice":43,"dealPrice":0,"referencePrice":0,"showCount":0,"brdId":29462,"id":8065},{"poiId":3260787,"nm":"星环影城(立水桥店)","sellmin":0,"sell":true,"preferential":0,"addr":"朝阳区立汤路201号东亚奥北南区北门一楼（华泰汽车斜对面，立水桥地铁A口北行150米）","area":"朝阳区","ct":"","lat":40.05452,"lng":116.41205,"brd":"其它","dis":"","deal":1,"distance":0,"follow":0,"imax":0,"sellPrice":38,"dealPrice":25,"referencePrice":60,"showCount":0,"brdId":0,"id":9914},{"poiId":316112,"nm":"星美国际影城(世界城店)","sellmin":0,"sell":true,"preferential":0,"addr":"朝阳区金汇路8号世界城E座B1楼（世贸天阶商业街北侧）","area":"朝阳区","ct":"","lat":39.917755,"lng":116.45232,"brd":"星美国际影城","dis":"朝外大街","deal":0,"distance":0,"follow":0,"imax":0,"sellPrice":9,"dealPrice":0,"referencePrice":35,"showCount":0,"brdId":30032,"id":98},{"poiId":1558123,"nm":"星美国际影城(望京店)","sellmin":0,"sell":true,"preferential":0,"addr":"朝阳区望京街9号望京国际商业中心A座4楼","area":"朝阳区","ct":"","lat":39.990322,"lng":116.48359,"brd":"星美国际影城","dis":"望京","deal":0,"distance":0,"follow":0,"imax":0,"sellPrice":44,"dealPrice":0,"referencePrice":40,"showCount":0,"brdId":30032,"id":175},{"poiId":82583,"nm":"新影联·华谊兄弟影院(望京店)","sellmin":0,"sell":true,"preferential":0,"addr":"朝阳区广顺北大街16号望京华彩商业中心B1a","area":"朝阳区","ct":"","lat":40.01051,"lng":116.46821,"brd":"华谊兄弟影院","dis":"望京","deal":1,"distance":0,"follow":0,"imax":0,"sellPrice":44,"dealPrice":35,"referencePrice":80,"showCount":0,"brdId":275830,"id":72},{"poiId":90846,"nm":"阳光影城(安立路店)","sellmin":0,"sell":true,"preferential":0,"addr":"朝阳区安立路68号飘亮广场B1层","area":"朝阳区","ct":"","lat":39.997986,"lng":116.409164,"brd":"阳光影城","dis":"亚运村","deal":1,"distance":0,"follow":0,"imax":0,"sellPrice":43,"dealPrice":28,"referencePrice":70,"showCount":0,"brdId":30206,"id":174},{"poiId":4230363,"nm":"耀莱成龙国际影城(慈云寺店)","sellmin":0,"sell":true,"preferential":0,"addr":"朝阳区慈云寺北里209号未来汇二层","area":"朝阳区","ct":"","lat":39.916035,"lng":116.4922,"brd":"耀莱成龙国际影城","dis":"","deal":1,"distance":0,"follow":0,"imax":0,"sellPrice":43,"dealPrice":35,"referencePrice":0,"showCount":0,"brdId":30227,"id":9730},{"poiId":82596,"nm":"中国木偶艺术剧院","sellmin":0,"sell":true,"preferential":0,"addr":"朝阳区安华西里甲1号","area":"朝阳区","ct":"","lat":39.96802,"lng":116.40147,"brd":"其它","dis":"安贞","deal":1,"distance":0,"follow":0,"imax":0,"sellPrice":23,"dealPrice":31,"referencePrice":0,"showCount":0,"brdId":0,"id":252},{"poiId":3274641,"nm":"紫光影城(蓝岛店)","sellmin":0,"sell":true,"preferential":0,"addr":"朝阳区朝外大街8号（蓝岛大厦西区5-6层）","area":"朝阳区","ct":"","lat":39.922623,"lng":116.44817,"brd":"紫光影城","dis":"朝外大街","deal":1,"distance":0,"follow":0,"imax":0,"sellPrice":33,"dealPrice":21,"referencePrice":35,"showCount":0,"brdId":31014,"id":259},{"poiId":91811925,"nm":"北京东融国际影城","sellmin":0,"sell":false,"preferential":0,"addr":"朝阳区西直河商业广场华联购物广场1楼","area":"朝阳区","ct":"","lat":39.844444,"lng":116.52732,"brd":"其它","dis":"","deal":0,"distance":0,"follow":0,"imax":0,"sellPrice":0,"dealPrice":0,"referencePrice":0,"showCount":0,"brdId":0,"id":15415},{"poiId":82597,"nm":"北京剧院","sellmin":0,"sell":false,"preferential":0,"addr":"朝阳区安慧里三区10号","area":"朝阳区","ct":"","lat":39.990856,"lng":116.40813,"brd":"北京剧院","dis":"亚运村","deal":0,"distance":0,"follow":0,"imax":0,"sellPrice":38,"dealPrice":0,"referencePrice":80,"showCount":0,"brdId":254168,"id":248},{"poiId":271415,"nm":"枫花园汽车影院","sellmin":0,"sell":false,"preferential":0,"addr":"朝阳区亮马桥路21号（朝阳公园北门对面）","area":"朝阳区","ct":"","lat":39.958447,"lng":116.48107,"brd":"枫花园汽车影院","dis":"亮马桥","deal":0,"distance":0,"follow":0,"imax":0,"sellPrice":0,"dealPrice":0,"referencePrice":100,"showCount":0,"brdId":651783,"id":254},{"poiId":3305306,"nm":"曙光影院","sellmin":0,"sell":false,"preferential":0,"addr":"朝阳区垡头西里44号垡头文化中心B1","area":"朝阳区","ct":"","lat":39.861492,"lng":116.51347,"brd":"其它","dis":"垡头西里","deal":1,"distance":0,"follow":0,"imax":0,"sellPrice":0,"dealPrice":31,"referencePrice":0,"showCount":0,"brdId":0,"id":4548},{"poiId":1436410,"nm":"中国电影博物馆","sellmin":0,"sell":false,"preferential":0,"addr":"朝阳区南影路9号","area":"朝阳区","ct":"","lat":39.9962,"lng":116.521,"brd":"其它","dis":"草场地","deal":0,"distance":0,"follow":0,"imax":1,"sellPrice":0,"dealPrice":0,"referencePrice":40,"showCount":0,"brdId":0,"id":181}],"海淀区":[{"poiId":273950,"nm":"17.5影城(今典花园店)","sellmin":0,"sell":true,"preferential":0,"addr":"海淀区文慧园路9号今典花园9号楼空间蒙太奇大厦1层","area":"海淀区","ct":"","lat":39.95334,"lng":116.36104,"brd":"17.5影城","dis":"北太平庄","deal":1,"distance":0,"follow":0,"imax":0,"sellPrice":27,"dealPrice":30,"referencePrice":60,"showCount":0,"brdId":23854,"id":154},{"poiId":3260713,"nm":"17.5影城(今日家园店)","sellmin":0,"sell":true,"preferential":0,"addr":"海淀区西翠路5号今日家园8号楼苏宁电器地下一层（太平路沃尔玛超市旁）","area":"海淀区","ct":"","lat":39.900616,"lng":116.28245,"brd":"17.5影城","dis":"五棵松","deal":0,"distance":0,"follow":0,"imax":0,"sellPrice":22,"dealPrice":0,"referencePrice":70,"showCount":0,"brdId":23854,"id":102},{"poiId":48958,"nm":"17.5影城(四道口店)","sellmin":0,"sell":true,"preferential":0,"addr":"海淀区大钟寺四道口2号京果商厦B座三层北侧","area":"海淀区","ct":"","lat":39.960403,"lng":116.34541,"brd":"17.5影城","dis":"北下关","deal":0,"distance":0,"follow":0,"imax":0,"sellPrice":39,"dealPrice":0,"referencePrice":45,"showCount":0,"brdId":23854,"id":25},{"poiId":2374984,"nm":"CGV星聚汇影城(清河店)","sellmin":0,"sell":true,"preferential":0,"addr":"海淀区清河中街68号华润五彩城购物中心东区7层","area":"海淀区","ct":"","lat":40.030476,"lng":116.334724,"brd":"CGV星聚汇影城","dis":"","deal":0,"distance":0,"follow":0,"imax":0,"sellPrice":57,"dealPrice":0,"referencePrice":40,"showCount":0,"brdId":2020418,"id":5111},{"poiId":1436373,"nm":"UME国际影城(华星店)","sellmin":0,"sell":true,"preferential":0,"addr":"海淀区双榆树科学院南路44号（双安商场对面）","area":"海淀区","ct":"","lat":39.967793,"lng":116.326096,"brd":"UME国际影城","dis":"中关村","deal":0,"distance":0,"follow":0,"imax":1,"sellPrice":39.5,"dealPrice":0,"referencePrice":70,"showCount":0,"brdId":24071,"id":155},{"poiId":1460949,"nm":"博纳国际影城(万寿路店)","sellmin":0,"sell":true,"preferential":0,"addr":"海淀区复兴路51号凯德晶品购物中心4层","area":"海淀区","ct":"","lat":39.908405,"lng":116.29659,"brd":"博纳国际影城","dis":"万寿路","deal":0,"distance":0,"follow":0,"imax":0,"sellPrice":44,"dealPrice":0,"referencePrice":80,"showCount":0,"brdId":24595,"id":1624},{"poiId":2393106,"nm":"橙天嘉禾影城(吉彩店)","sellmin":0,"sell":true,"preferential":0,"addr":"海淀区玉海园五里22号配套商业楼（原吉彩体育馆）","area":"海淀区","ct":"","lat":39.922768,"lng":116.25956,"brd":"橙天嘉禾影城","dis":"","deal":0,"distance":0,"follow":0,"imax":0,"sellPrice":24.5,"dealPrice":0,"referencePrice":80,"showCount":0,"brdId":24745,"id":5313},{"poiId":14447,"nm":"橙天嘉禾影城(上地店)","sellmin":0,"sell":true,"preferential":0,"addr":"海淀区上地南口华联商厦4F","area":"海淀区","ct":"","lat":40.02865,"lng":116.31154,"brd":"橙天嘉禾影城","dis":"上地","deal":0,"distance":0,"follow":0,"imax":0,"sellPrice":33.5,"dealPrice":0,"referencePrice":80,"showCount":0,"brdId":24745,"id":130},{"poiId":3303603,"nm":"橙天嘉禾影城(万柳店)","sellmin":0,"sell":true,"preferential":0,"addr":"海淀区巴沟路2号华联万柳购物中心5层","area":"海淀区","ct":"","lat":39.97296,"lng":116.29486,"brd":"橙天嘉禾影城","dis":"苏州桥","deal":0,"distance":0,"follow":0,"imax":0,"sellPrice":33.5,"dealPrice":0,"referencePrice":80,"showCount":0,"brdId":24745,"id":86},{"poiId":4845675,"nm":"大地影院(西三旗物美店)","sellmin":0,"sell":true,"preferential":0,"addr":"海淀区悦秀路99号二层","area":"海淀区","ct":"","lat":40.04733,"lng":116.33703,"brd":"大地影院","dis":"","deal":1,"distance":0,"follow":0,"imax":0,"sellPrice":33,"dealPrice":40.5,"referencePrice":0,"showCount":0,"brdId":384262,"id":7433},{"poiId":294883,"nm":"国安剧院","sellmin":0,"sell":true,"preferential":0,"addr":"海淀区花园东路甲16号","area":"海淀区","ct":"","lat":39.981472,"lng":116.37021,"brd":"其它","dis":"北太平庄","deal":0,"distance":0,"follow":0,"imax":0,"sellPrice":38,"dealPrice":0,"referencePrice":80,"showCount":0,"brdId":0,"id":251},{"poiId":271442,"nm":"国图影院","sellmin":0,"sell":true,"preferential":0,"addr":"海淀区中关村南大街33号国家图书馆内","area":"海淀区","ct":"","lat":39.94304,"lng":116.32312,"brd":"其它","dis":"魏公村","deal":0,"distance":0,"follow":0,"imax":0,"sellPrice":28,"dealPrice":0,"referencePrice":60,"showCount":0,"brdId":0,"id":238},{"poiId":38025,"nm":"海淀工人文化宫","sellmin":0,"sell":true,"preferential":0,"addr":"海淀区万柳华府北街2号（万柳华联商城南门对面）","area":"海淀区","ct":"","lat":39.971443,"lng":116.295105,"brd":"其它","dis":"苏州桥","deal":1,"distance":0,"follow":0,"imax":0,"sellPrice":33,"dealPrice":28,"referencePrice":30,"showCount":0,"brdId":0,"id":141},{"poiId":17899,"nm":"海淀剧院","sellmin":0,"sell":true,"preferential":0,"addr":"海淀区中关村大街28号","area":"海淀区","ct":"","lat":39.97669,"lng":116.31822,"brd":"其它","dis":"中关村","deal":1,"distance":0,"follow":0,"imax":0,"sellPrice":38,"dealPrice":31,"referencePrice":80,"showCount":0,"brdId":0,"id":257},{"poiId":84440,"nm":"嘉华国际影城(学清路店)","sellmin":0,"sell":true,"preferential":0,"addr":"海淀区学清路甲8号圣熙8号购物中心5层西侧","area":"海淀区","ct":"","lat":40.008587,"lng":116.35387,"brd":"嘉华国际影城","dis":"五道口","deal":1,"distance":0,"follow":0,"imax":0,"sellPrice":44,"dealPrice":35,"referencePrice":70,"showCount":0,"brdId":26413,"id":70},{"poiId":1549060,"nm":"金逸影城(新都店)","sellmin":0,"sell":true,"preferential":0,"addr":"海淀区西三旗建材城中路6号新都购物广场1层","area":"海淀区","ct":"","lat":40.060005,"lng":116.36541,"brd":"金逸影城","dis":"清河","deal":0,"distance":0,"follow":0,"imax":0,"sellPrice":29,"dealPrice":0,"referencePrice":60,"showCount":0,"brdId":1079568,"id":58},{"poiId":276722,"nm":"金逸影城(中关村店)","sellmin":0,"sell":true,"preferential":0,"addr":"海淀区中关村大街19号新中关购物中心B1层","area":"海淀区","ct":"","lat":39.97841,"lng":116.31447,"brd":"金逸影城","dis":"中关村","deal":0,"distance":0,"follow":0,"imax":0,"sellPrice":59,"dealPrice":0,"referencePrice":80,"showCount":0,"brdId":1079568,"id":152},{"poiId":279439,"nm":"美嘉欢乐影城(中关村店)","sellmin":0,"sell":true,"preferential":0,"addr":"海淀区中关村大街15号中关村广场购物中心津乐汇3楼（地铁中关村站D口出西侧）","area":"海淀区","ct":"","lat":39.983105,"lng":116.31355,"brd":"美嘉欢乐影城","dis":"中关村","deal":1,"distance":0,"follow":0,"imax":0,"sellPrice":49,"dealPrice":43.9,"referencePrice":24,"showCount":0,"brdId":27617,"id":197},{"poiId":3251410,"nm":"世茂国际影城","sellmin":0,"sell":true,"preferential":0,"addr":"海淀区羊坊店路18号光耀东方4层","area":"海淀区","ct":"","lat":39.899376,"lng":116.32227,"brd":"世茂国际影城","dis":"","deal":0,"distance":0,"follow":0,"imax":0,"sellPrice":23,"dealPrice":0,"referencePrice":0,"showCount":0,"brdId":28741,"id":6483},{"poiId":4480546,"nm":"天幕新彩云国际影城","sellmin":0,"sell":true,"preferential":0,"addr":"海淀区北三环中路中视云投大厦","area":"海淀区","ct":"","lat":39.969345,"lng":116.3678,"brd":"其它","dis":"","deal":0,"distance":0,"follow":0,"imax":0,"sellPrice":33,"dealPrice":0,"referencePrice":0,"showCount":0,"brdId":0,"id":13003},{"poiId":82591,"nm":"五道口工人俱乐部电影院","sellmin":0,"sell":true,"preferential":0,"addr":"海淀区成府路23号（近五道口城铁站）","area":"海淀区","ct":"","lat":39.99351,"lng":116.33939,"brd":"其它","dis":"五道口","deal":1,"distance":0,"follow":0,"imax":0,"sellPrice":33,"dealPrice":31,"referencePrice":35,"showCount":0,"brdId":0,"id":258},{"poiId":41066531,"nm":"万画影城","sellmin":0,"sell":true,"preferential":0,"addr":"海淀区西四环北路金四季购物中心中段三层B003","area":"海淀区","ct":"","lat":39.94469,"lng":116.27137,"brd":"其它","dis":"","deal":0,"distance":0,"follow":0,"imax":0,"sellPrice":28,"dealPrice":0,"referencePrice":0,"showCount":0,"brdId":0,"id":13054},{"poiId":2408760,"nm":"新华国际影城(宝盛店)","sellmin":0,"sell":true,"preferential":0,"addr":"海淀区宝盛北里西区28号兴美生活广场5层","area":"海淀区","ct":"","lat":40.037056,"lng":116.370605,"brd":"新华国际影城","dis":"","deal":1,"distance":0,"follow":0,"imax":0,"sellPrice":38,"dealPrice":26,"referencePrice":70,"showCount":0,"brdId":29894,"id":5359},{"poiId":1524564,"nm":"新华国际影城(大钟寺店)","sellmin":0,"sell":true,"preferential":0,"addr":"海淀区北三环18号院大钟寺中坤广场C座3层（地铁13号线大钟寺站出站即到）","area":"海淀区","ct":"","lat":39.96573,"lng":116.34114,"brd":"新华国际影城","dis":"大钟寺","deal":0,"distance":0,"follow":0,"imax":0,"sellPrice":43,"dealPrice":0,"referencePrice":80,"showCount":0,"brdId":29894,"id":1589},{"poiId":271447,"nm":"星美国际影城(金源店)","sellmin":0,"sell":true,"preferential":0,"addr":"海淀区远大路1号金源时代购物中心5楼东首（近蓝靛厂北路）","area":"海淀区","ct":"","lat":39.95867,"lng":116.2889,"brd":"星美国际影城","dis":"远大路","deal":0,"distance":0,"follow":0,"imax":0,"sellPrice":60,"dealPrice":0,"referencePrice":35,"showCount":0,"brdId":30032,"id":271},{"poiId":335220,"nm":"耀莱成龙国际影城(五棵松店)","sellmin":0,"sell":true,"preferential":0,"addr":"海淀区复兴路69号卓展购物中心5层","area":"海淀区","ct":"","lat":39.913418,"lng":116.2794,"brd":"耀莱成龙国际影城","dis":"五棵松","deal":1,"distance":0,"follow":0,"imax":0,"sellPrice":38,"dealPrice":35,"referencePrice":70,"showCount":0,"brdId":30227,"id":87},{"poiId":4572438,"nm":"中间影院","sellmin":0,"sell":true,"preferential":0,"addr":"海淀区杏石口路中间艺术园区内","area":"海淀区","ct":"","lat":39.95388,"lng":116.23189,"brd":"其它","dis":"","deal":0,"distance":0,"follow":0,"imax":0,"sellPrice":23,"dealPrice":0,"referencePrice":0,"showCount":0,"brdId":0,"id":9459},{"poiId":82594,"nm":"中影电影院(新街口店)","sellmin":0,"sell":true,"preferential":0,"addr":"海淀区新街口外大街25号（小西天牌楼北侧）","area":"海淀区","ct":"","lat":39.95296,"lng":116.37117,"brd":"中影国际影城","dis":"","deal":0,"distance":0,"follow":0,"imax":0,"sellPrice":39,"dealPrice":0,"referencePrice":0,"showCount":0,"brdId":23745,"id":9916},{"poiId":4744457,"nm":"华影国际影城(花园路店)","sellmin":0,"sell":false,"preferential":0,"addr":"海淀区花园路甲13号庚坊国际发展中心B1层","area":"海淀区","ct":"","lat":39.972046,"lng":116.36422,"brd":"华影国际影城","dis":"","deal":0,"distance":0,"follow":0,"imax":0,"sellPrice":0,"dealPrice":0,"referencePrice":0,"showCount":0,"brdId":271399,"id":7985},{"poiId":1541424,"nm":"中国电影资料馆","sellmin":0,"sell":false,"preferential":0,"addr":"海淀区文慧园路3号","area":"海淀区","ct":"","lat":39.953133,"lng":116.36986,"brd":"其它","dis":"新街口","deal":0,"distance":0,"follow":0,"imax":0,"sellPrice":33,"dealPrice":0,"referencePrice":0,"showCount":0,"brdId":0,"id":2010}],"东城区":[{"poiId":94496,"nm":"UME国际影城(安贞店)","sellmin":0,"sell":true,"preferential":0,"addr":"东城区北三环安贞桥环球贸易中心E座","area":"东城区","ct":"","lat":39.966072,"lng":116.41096,"brd":"UME国际影城","dis":"安贞","deal":0,"distance":0,"follow":0,"imax":0,"sellPrice":39.5,"dealPrice":0,"referencePrice":70,"showCount":0,"brdId":24071,"id":99},{"poiId":1076058,"nm":"百丽宫影城(金宝汇店)","sellmin":0,"sell":true,"preferential":0,"addr":"东城区金宝街88号金宝汇7层","area":"东城区","ct":"","lat":39.9152,"lng":116.42129,"brd":"百老汇影城","dis":"王府井","deal":0,"distance":0,"follow":0,"imax":0,"sellPrice":33,"dealPrice":0,"referencePrice":80,"showCount":0,"brdId":24377,"id":122},{"poiId":1076062,"nm":"百老汇电影中心","sellmin":0,"sell":true,"preferential":0,"addr":"东城区香河园路1号当代MOMA北区T4座","area":"东城区","ct":"","lat":39.950455,"lng":116.43878,"brd":"百老汇影城","dis":"东直门","deal":0,"distance":0,"follow":0,"imax":0,"sellPrice":43,"dealPrice":0,"referencePrice":80,"showCount":0,"brdId":24377,"id":94},{"poiId":271444,"nm":"百老汇影城(apm购物中心店)","sellmin":0,"sell":true,"preferential":0,"addr":"东城区王府井大街138号北京apm6层","area":"东城区","ct":"","lat":39.914005,"lng":116.41193,"brd":"百老汇影城","dis":"王府井","deal":0,"distance":0,"follow":0,"imax":0,"sellPrice":38,"dealPrice":0,"referencePrice":70,"showCount":0,"brdId":24377,"id":267},{"poiId":271409,"nm":"百老汇影城(东方广场店)","sellmin":0,"sell":true,"preferential":0,"addr":"东城区东长安街1号东方广场地下1层","area":"东城区","ct":"","lat":39.909454,"lng":116.411934,"brd":"百老汇影城","dis":"王府井","deal":0,"distance":0,"follow":0,"imax":0,"sellPrice":33,"dealPrice":0,"referencePrice":40,"showCount":0,"brdId":24377,"id":269},{"poiId":1048975,"nm":"百老汇影城(国瑞购物中心店)","sellmin":0,"sell":true,"preferential":0,"addr":"东城区崇文门外大街18号国瑞城购物中心首层/-2层","area":"东城区","ct":"","lat":39.897575,"lng":116.420135,"brd":"百老汇影城","dis":"崇文门","deal":0,"distance":0,"follow":0,"imax":0,"sellPrice":43,"dealPrice":0,"referencePrice":80,"showCount":0,"brdId":24377,"id":119},{"poiId":60166,"nm":"东宫影剧院","sellmin":0,"sell":true,"preferential":0,"addr":"东城区隆福寺街47号东四工人文化宫","area":"东城区","ct":"","lat":39.9253,"lng":116.41552,"brd":"东宫影剧院","dis":"东四","deal":0,"distance":0,"follow":0,"imax":0,"sellPrice":31,"dealPrice":0,"referencePrice":30,"showCount":0,"brdId":125212,"id":242},{"poiId":43786,"nm":"东环影城","sellmin":0,"sell":true,"preferential":0,"addr":"东城区东中街9号东环广场B座B1楼","area":"东城区","ct":"","lat":39.936527,"lng":116.43607,"brd":"东环影城","dis":"东直门","deal":1,"distance":0,"follow":0,"imax":0,"sellPrice":43,"dealPrice":29,"referencePrice":80,"showCount":0,"brdId":25181,"id":265},{"poiId":1549949,"nm":"横店电影城(王府井店)","sellmin":0,"sell":true,"preferential":0,"addr":"东城区王府井大街251-253号8层","area":"东城区","ct":"","lat":39.91331,"lng":116.410545,"brd":"横店电影城","dis":"王府井","deal":1,"distance":0,"follow":0,"imax":0,"sellPrice":29,"dealPrice":31,"referencePrice":70,"showCount":0,"brdId":26045,"id":79},{"poiId":99389254,"nm":"青春光线电影院","sellmin":0,"sell":true,"preferential":0,"addr":"东城区东滨河路乙一号雍和航星园内","area":"东城区","ct":"","lat":39.95059,"lng":116.42174,"brd":"其它","dis":"","deal":0,"distance":0,"follow":0,"imax":0,"sellPrice":28,"dealPrice":0,"referencePrice":0,"showCount":0,"brdId":0,"id":15280},{"poiId":82579,"nm":"搜秀影城","sellmin":0,"sell":true,"preferential":0,"addr":"东城区崇外大街40号搜秀城9层","area":"东城区","ct":"","lat":39.896397,"lng":116.419266,"brd":"搜秀影城","dis":"崇文门","deal":1,"distance":0,"follow":0,"imax":0,"sellPrice":43,"dealPrice":36,"referencePrice":80,"showCount":0,"brdId":28916,"id":270},{"poiId":6074394,"nm":"耀莱成龙国际影城(王府井店)","sellmin":0,"sell":true,"preferential":0,"addr":"东城区王府井大街301号新燕莎购物中心地下一层西侧（地铁一号线王府井站出C2口向北步行200米路西）","area":"东城区","ct":"","lat":39.90959,"lng":116.41121,"brd":"耀莱成龙国际影城","dis":"","deal":1,"distance":0,"follow":0,"imax":0,"sellPrice":33,"dealPrice":30,"referencePrice":0,"showCount":0,"brdId":30227,"id":10781},{"poiId":52795616,"nm":"北京站电影院","sellmin":0,"sell":false,"preferential":0,"addr":"东城区毛家湾胡同甲13号站西侧3层","area":"东城区","ct":"","lat":39.903954,"lng":116.4272,"brd":"其它","dis":"","deal":0,"distance":0,"follow":0,"imax":0,"sellPrice":0,"dealPrice":0,"referencePrice":0,"showCount":0,"brdId":0,"id":14472},{"poiId":271413,"nm":"东城图书馆影剧院","sellmin":0,"sell":false,"preferential":0,"addr":"东城区交道口东大街85号区图书馆1楼","area":"东城区","ct":"","lat":39.941,"lng":116.413,"brd":"其它","dis":"东四","deal":0,"distance":0,"follow":0,"imax":0,"sellPrice":0,"dealPrice":0,"referencePrice":0,"showCount":0,"brdId":0,"id":4541}],"丰台区":[{"poiId":339944,"nm":"保利国际影城(凯德MALL·大峡谷店)","sellmin":0,"sell":true,"preferential":0,"addr":"丰台区南三环西路16号凯德大峡谷购物中心5楼","area":"丰台区","ct":"","lat":39.854645,"lng":116.36706,"brd":"保利国际影城","dis":"草桥","deal":0,"distance":0,"follow":0,"imax":0,"sellPrice":39,"dealPrice":0,"referencePrice":40,"showCount":0,"brdId":24472,"id":42},{"poiId":299479,"nm":"保利国际影城(万源店)","sellmin":0,"sell":true,"preferential":0,"addr":"丰台区东高地万源西里航天万源广场5层","area":"丰台区","ct":"","lat":39.80296,"lng":116.423454,"brd":"保利国际影城","dis":"东高地","deal":1,"distance":0,"follow":0,"imax":0,"sellPrice":39,"dealPrice":27,"referencePrice":70,"showCount":0,"brdId":24472,"id":129},{"poiId":82556,"nm":"博纳国际影城(方庄店)","sellmin":0,"sell":true,"preferential":0,"addr":"丰台区蒲黄榆路28号","area":"丰台区","ct":"","lat":39.863983,"lng":116.42227,"brd":"博纳国际影城","dis":"方庄","deal":0,"distance":0,"follow":0,"imax":0,"sellPrice":49,"dealPrice":0,"referencePrice":80,"showCount":0,"brdId":24595,"id":43},{"poiId":78978010,"nm":"大地影院(欣雅汇店)","sellmin":0,"sell":true,"preferential":0,"addr":"丰台区果园8号楼临三环（木樨园桥-西南角欣雅汇生活广场6层）","area":"丰台区","ct":"","lat":39.855907,"lng":116.397896,"brd":"大地影院","dis":"","deal":1,"distance":0,"follow":0,"imax":0,"sellPrice":33,"dealPrice":40.5,"referencePrice":0,"showCount":0,"brdId":384262,"id":15070},{"poiId":1547150,"nm":"华谊兄弟影院(洋桥店)","sellmin":0,"sell":true,"preferential":0,"addr":"丰台区马家堡东路101号院10号银泰百货6层","area":"丰台区","ct":"","lat":39.84446,"lng":116.38594,"brd":"华谊兄弟影院","dis":"","deal":0,"distance":0,"follow":0,"imax":1,"sellPrice":34,"dealPrice":0,"referencePrice":80,"showCount":0,"brdId":275830,"id":2548},{"poiId":271414,"nm":"青少年剧场","sellmin":0,"sell":true,"preferential":0,"addr":"丰台区西四环南路86号","area":"丰台区","ct":"","lat":39.851784,"lng":116.28421,"brd":"其它","dis":"","deal":0,"distance":0,"follow":0,"imax":0,"sellPrice":33,"dealPrice":0,"referencePrice":0,"showCount":0,"brdId":0,"id":4542},{"poiId":5161700,"nm":"幸福蓝海国际影城(北京公益桥店)","sellmin":0,"sell":true,"preferential":0,"addr":"丰台区角门路19号院2号楼华冠天地4层（原大万广场）","area":"丰台区","ct":"","lat":39.836674,"lng":116.37848,"brd":"幸福蓝海国际影城","dis":"","deal":0,"distance":0,"follow":0,"imax":0,"sellPrice":24,"dealPrice":0,"referencePrice":0,"showCount":0,"brdId":30053,"id":8578},{"poiId":1436294,"nm":"星美国际影城(分钟寺店)","sellmin":0,"sell":true,"preferential":0,"addr":"丰台区南三环东路成寿寺路2号新业广场2楼","area":"丰台区","ct":"","lat":39.857136,"lng":116.44611,"brd":"星美国际影城","dis":"方庄","deal":0,"distance":0,"follow":0,"imax":0,"sellPrice":14,"dealPrice":0,"referencePrice":35,"showCount":0,"brdId":30032,"id":9},{"poiId":82600,"nm":"正华影院","sellmin":0,"sell":true,"preferential":0,"addr":"丰台区宋家庄顺八条4号政馨园三区5号楼底商正华商城地下一层","area":"丰台区","ct":"","lat":39.845528,"lng":116.43179,"brd":"正华影城","dis":"方庄","deal":0,"distance":0,"follow":0,"imax":0,"sellPrice":33,"dealPrice":0,"referencePrice":60,"showCount":0,"brdId":677942,"id":63},{"poiId":6458108,"nm":"中影国际影城(丰台千禧街店)","sellmin":0,"sell":true,"preferential":0,"addr":"丰台区靛场路千禧商业街4号楼","area":"丰台区","ct":"","lat":39.889786,"lng":116.287766,"brd":"中影国际影城","dis":"","deal":0,"distance":0,"follow":0,"imax":0,"sellPrice":29,"dealPrice":0,"referencePrice":30,"showCount":0,"brdId":23745,"id":7634},{"poiId":77423086,"nm":"中影国际影城(丰台永旺店)","sellmin":0,"sell":true,"preferential":0,"addr":"丰台区丰葆路永旺梦乐城4层","area":"丰台区","ct":"","lat":39.817265,"lng":116.292496,"brd":"其它","dis":"","deal":0,"distance":0,"follow":0,"imax":0,"sellPrice":29,"dealPrice":0,"referencePrice":0,"showCount":0,"brdId":0,"id":14384},{"poiId":94444126,"nm":"DMG国际影城(悦秀店)","sellmin":0,"sell":false,"preferential":0,"addr":"丰台区开阳路8号悦秀城6层","area":"丰台区","ct":"","lat":39.86373,"lng":116.36722,"brd":"其它","dis":"","deal":0,"distance":0,"follow":0,"imax":0,"sellPrice":0,"dealPrice":0,"referencePrice":0,"showCount":0,"brdId":0,"id":15859},{"poiId":95577364,"nm":"北京中鼎兆通信息科技电影放映中心影院","sellmin":0,"sell":false,"preferential":0,"addr":"丰台区市辖区丰台区西四环南路38号-1","area":"丰台区","ct":"","lat":39.856148,"lng":116.28398,"brd":"其它","dis":"","deal":0,"distance":0,"follow":0,"imax":0,"sellPrice":0,"dealPrice":0,"referencePrice":0,"showCount":0,"brdId":0,"id":15271}],"大兴区":[{"poiId":1481117,"nm":"保利国际影城(绿地缤纷城店)","sellmin":0,"sell":true,"preferential":0,"addr":"大兴区金星西路3号绿地缤纷城购物中心4层","area":"大兴区","ct":"","lat":39.764683,"lng":116.33354,"brd":"保利国际影城","dis":"绿地缤纷城","deal":0,"distance":0,"follow":0,"imax":0,"sellPrice":39,"dealPrice":0,"referencePrice":70,"showCount":0,"brdId":24472,"id":2392},{"poiId":82601,"nm":"大料国际影城(创意生活广场店)","sellmin":0,"sell":true,"preferential":0,"addr":"大兴区亦庄经济开发区文化园东路6号创意生活广场三层","area":"大兴区","ct":"","lat":39.810535,"lng":116.50513,"brd":"大料国际影城","dis":"亦庄","deal":0,"distance":0,"follow":0,"imax":0,"sellPrice":28,"dealPrice":0,"referencePrice":80,"showCount":0,"brdId":24930,"id":34},{"poiId":324698,"nm":"大兴影剧院","sellmin":0,"sell":true,"preferential":0,"addr":"大兴区黄村西大街15号","area":"大兴区","ct":"","lat":39.7323,"lng":116.338005,"brd":"大兴剧院","dis":"黄村","deal":0,"distance":0,"follow":0,"imax":0,"sellPrice":28,"dealPrice":0,"referencePrice":21,"showCount":0,"brdId":381835,"id":179},{"poiId":6685358,"nm":"嘉美国际影城(旧宫店)","sellmin":0,"sell":true,"preferential":0,"addr":"大兴区旧宫小红门路39号","area":"大兴区","ct":"","lat":39.814774,"lng":116.454636,"brd":"嘉美国际影城","dis":"","deal":0,"distance":0,"follow":0,"imax":0,"sellPrice":23,"dealPrice":0,"referencePrice":70,"showCount":0,"brdId":352923,"id":2598},{"poiId":40697227,"nm":"金逸影城(荟聚IMAX店)","sellmin":0,"sell":true,"preferential":0,"addr":"大兴区欣宁街荟聚购物中心3层（地铁4号线西红门站A西出口站）","area":"大兴区","ct":"","lat":39.78632,"lng":116.32738,"brd":"金逸影城","dis":"","deal":0,"distance":0,"follow":0,"imax":1,"sellPrice":39,"dealPrice":0,"referencePrice":0,"showCount":0,"brdId":1079568,"id":10987},{"poiId":93511270,"nm":"卢米埃影城(万科店)","sellmin":0,"sell":true,"preferential":0,"addr":"大兴区忠凉路万科广场5层","area":"大兴区","ct":"","lat":39.80576,"lng":116.460175,"brd":"其它","dis":"","deal":0,"distance":0,"follow":0,"imax":0,"sellPrice":28,"dealPrice":0,"referencePrice":0,"showCount":0,"brdId":0,"id":15773},{"poiId":5165994,"nm":"唐阁影城(亦庄店)","sellmin":0,"sell":true,"preferential":0,"addr":"大兴区经济技术开发区荣华中路8号院华联力宝购物中心四层","area":"大兴区","ct":"","lat":39.806152,"lng":116.50166,"brd":"其它","dis":"","deal":0,"distance":0,"follow":0,"imax":0,"sellPrice":39,"dealPrice":0,"referencePrice":0,"showCount":0,"brdId":0,"id":11132},{"poiId":86394,"nm":"新华国际影城(大兴店)","sellmin":0,"sell":true,"preferential":0,"addr":"大兴区黄村东大街火神庙国际商业中心E座5层","area":"大兴区","ct":"","lat":39.72971,"lng":116.34167,"brd":"新华国际影城","dis":"黄村","deal":1,"distance":0,"follow":0,"imax":0,"sellPrice":28,"dealPrice":36,"referencePrice":40,"showCount":0,"brdId":29894,"id":11},{"poiId":2490890,"nm":"星美国际影城(西红门店)","sellmin":0,"sell":true,"preferential":0,"addr":"大兴区西红门镇京良路10号乐家购物中心B区3层","area":"大兴区","ct":"","lat":39.799633,"lng":116.33217,"brd":"星美国际影城","dis":"","deal":0,"distance":0,"follow":0,"imax":0,"sellPrice":4.01,"dealPrice":0,"referencePrice":70,"showCount":0,"brdId":30032,"id":6057},{"poiId":41278576,"nm":"耀莱成龙国际影城(西红门店)","sellmin":0,"sell":true,"preferential":0,"addr":"大兴区欣旺北大街8号鸿坤广场6层（地铁4号线西红门站Ｂ口向东４００米路北）","area":"大兴区","ct":"","lat":39.791393,"lng":116.340256,"brd":"耀莱成龙国际影城","dis":"","deal":1,"distance":0,"follow":0,"imax":0,"sellPrice":23,"dealPrice":25,"referencePrice":0,"showCount":0,"brdId":30227,"id":11082},{"poiId":93839693,"nm":"中传国际影城(亦庄店)","sellmin":0,"sell":true,"preferential":0,"addr":"大兴区经济技术开发区科创五街38号C座3层F3-C3006","area":"大兴区","ct":"","lat":39.803543,"lng":116.53282,"brd":"其它","dis":"","deal":0,"distance":0,"follow":0,"imax":0,"sellPrice":33,"dealPrice":0,"referencePrice":0,"showCount":0,"brdId":0,"id":15294},{"poiId":95968537,"nm":"最影城","sellmin":0,"sell":true,"preferential":0,"addr":"大兴区兴华大街百联清城购物中心3层北侧","area":"大兴区","ct":"","lat":39.73894,"lng":116.33174,"brd":"其它","dis":"","deal":1,"distance":0,"follow":0,"imax":0,"sellPrice":23,"dealPrice":29.6,"referencePrice":0,"showCount":0,"brdId":0,"id":15018},{"poiId":51400779,"nm":"玫瑰之约汽车影院(半壁店)","sellmin":0,"sell":false,"preferential":0,"addr":"大兴区东大路多维创新园内","area":"大兴区","ct":"","lat":39.629345,"lng":116.38453,"brd":"其它","dis":"","deal":0,"distance":0,"follow":0,"imax":0,"sellPrice":0,"dealPrice":0,"referencePrice":0,"showCount":0,"brdId":0,"id":14054}],"西城区":[{"poiId":271434,"nm":"北京青年宫","sellmin":0,"sell":true,"preferential":0,"addr":"西城区西直门南小街68号","area":"西城区","ct":"","lat":39.93531,"lng":116.35955,"brd":"其它","dis":"西直门","deal":0,"distance":0,"follow":0,"imax":0,"sellPrice":38,"dealPrice":0,"referencePrice":50,"showCount":0,"brdId":0,"id":260},{"poiId":89010,"nm":"大观楼电影院","sellmin":0,"sell":true,"preferential":0,"addr":"西城区前门大街大栅栏街36号","area":"西城区","ct":"","lat":39.895596,"lng":116.39515,"brd":"大观楼影城","dis":"大栅栏","deal":0,"distance":0,"follow":0,"imax":0,"sellPrice":34,"dealPrice":0,"referencePrice":60,"showCount":0,"brdId":392770,"id":263},{"poiId":89006,"nm":"地质礼堂","sellmin":0,"sell":true,"preferential":0,"addr":"西城区西四羊肉胡同30号（中国地质博物馆南侧）","area":"西城区","ct":"","lat":39.922535,"lng":116.371346,"brd":"地质礼堂","dis":"西四","deal":0,"distance":0,"follow":0,"imax":0,"sellPrice":38,"dealPrice":0,"referencePrice":50,"showCount":0,"brdId":368740,"id":261},{"poiId":82592,"nm":"广安门电影院","sellmin":0,"sell":true,"preferential":0,"addr":"西城区白广路8号","area":"西城区","ct":"","lat":39.88407,"lng":116.35917,"brd":"其它","dis":"广内大街","deal":0,"distance":0,"follow":0,"imax":0,"sellPrice":34,"dealPrice":0,"referencePrice":40,"showCount":0,"brdId":0,"id":247},{"poiId":274294,"nm":"国宾菁英电影院","sellmin":0,"sell":true,"preferential":0,"addr":"西城区月坛南街24号（近万方商场）","area":"西城区","ct":"","lat":39.913624,"lng":116.34325,"brd":"其它","dis":"月坛","deal":0,"distance":0,"follow":0,"imax":0,"sellPrice":33,"dealPrice":0,"referencePrice":40,"showCount":0,"brdId":0,"id":255},{"poiId":1436438,"nm":"工人俱乐部电影院","sellmin":0,"sell":true,"preferential":0,"addr":"西城区虎坊路口南7号","area":"西城区","ct":"","lat":39.888065,"lng":116.38378,"brd":"其它","dis":"虎坊桥","deal":0,"distance":0,"follow":0,"imax":0,"sellPrice":33,"dealPrice":0,"referencePrice":60,"showCount":0,"brdId":0,"id":237},{"poiId":1541415,"nm":"首都电影院(金融街店)","sellmin":0,"sell":true,"preferential":0,"addr":"西城区金融大街18号地下一层","area":"西城区","ct":"","lat":39.9151,"lng":116.36,"brd":"首都电影院","dis":"复兴门","deal":0,"distance":0,"follow":0,"imax":0,"sellPrice":46,"dealPrice":0,"referencePrice":80,"showCount":0,"brdId":1162239,"id":1625},{"poiId":283722,"nm":"首都电影院(西单店)","sellmin":0,"sell":true,"preferential":0,"addr":"西城区西单北大街131号大悦城10楼","area":"西城区","ct":"","lat":39.91066,"lng":116.373665,"brd":"首都电影院","dis":"西单","deal":0,"distance":0,"follow":0,"imax":0,"sellPrice":44,"dealPrice":0,"referencePrice":60,"showCount":0,"brdId":1162239,"id":149},{"poiId":93439511,"nm":"首都电影院(中华店)","sellmin":0,"sell":true,"preferential":0,"addr":"西城区天桥南大街3号楼一层、二层","area":"西城区","ct":"","lat":39.884457,"lng":116.39819,"brd":"其它","dis":"","deal":0,"distance":0,"follow":0,"imax":0,"sellPrice":39,"dealPrice":0,"referencePrice":0,"showCount":0,"brdId":0,"id":15270},{"poiId":2393654,"nm":"耀莱成龙国际影城(马连道店)","sellmin":0,"sell":true,"preferential":0,"addr":"西城区马连道路25号新年华生活购物广场5层","area":"西城区","ct":"","lat":39.877544,"lng":116.32643,"brd":"耀莱成龙国际影城","dis":"","deal":1,"distance":0,"follow":0,"imax":0,"sellPrice":38,"dealPrice":30,"referencePrice":70,"showCount":0,"brdId":30227,"id":5278},{"poiId":73944402,"nm":"剧空间剧场","sellmin":0,"sell":false,"preferential":0,"addr":"西城区新街口北大街74号（近北京科学教育电影制片厂院内）","area":"西城区","ct":"","lat":39.94392,"lng":116.37328,"brd":"其它","dis":"","deal":0,"distance":0,"follow":0,"imax":0,"sellPrice":0,"dealPrice":0,"referencePrice":0,"showCount":0,"brdId":0,"id":14387},{"poiId":271397,"nm":"西单4D数字影院","sellmin":0,"sell":false,"preferential":0,"addr":"西城区西单北大街180号西单文化广场","area":"西城区","ct":"","lat":39.90875,"lng":116.37512,"brd":"西单4d数字影院","dis":"西单","deal":0,"distance":0,"follow":0,"imax":0,"sellPrice":0,"dealPrice":0,"referencePrice":70,"showCount":0,"brdId":2876716,"id":137},{"poiId":82590,"nm":"新街口电影院","sellmin":0,"sell":false,"preferential":0,"addr":"西城区西直门内大街69号","area":"西城区","ct":"","lat":39.94168,"lng":116.37024,"brd":"新街口电影院","dis":"西直门","deal":0,"distance":0,"follow":0,"imax":0,"sellPrice":0,"dealPrice":0,"referencePrice":50,"showCount":0,"brdId":593182,"id":243}],"通州区":[{"poiId":363447,"nm":"博纳国际影城(通州北苑店)","sellmin":0,"sell":true,"preferential":0,"addr":"通州区杨庄北里52号华联天时名苑购物中心4楼（近通州北苑地铁站）","area":"通州区","ct":"","lat":39.903496,"lng":116.6367,"brd":"博纳国际影城","dis":"新华联","deal":0,"distance":0,"follow":0,"imax":0,"sellPrice":39,"dealPrice":0,"referencePrice":80,"showCount":0,"brdId":24595,"id":2},{"poiId":51455681,"nm":"博纳国际影城(通州土桥店)","sellmin":0,"sell":true,"preferential":0,"addr":"通州区八通线土桥地铁站向东900米华远好天地购物中心3层","area":"通州区","ct":"","lat":39.86987,"lng":116.697586,"brd":"其它","dis":"","deal":1,"distance":0,"follow":0,"imax":0,"sellPrice":34,"dealPrice":29,"referencePrice":0,"showCount":0,"brdId":0,"id":14381},{"poiId":2371476,"nm":"百尚影城","sellmin":0,"sell":true,"preferential":0,"addr":"通州区马驹桥镇百尚生活广场3楼","area":"通州区","ct":"","lat":39.752598,"lng":116.54536,"brd":"百尚影城","dis":"","deal":1,"distance":0,"follow":0,"imax":0,"sellPrice":33,"dealPrice":25,"referencePrice":0,"showCount":0,"brdId":825664,"id":6227},{"poiId":6151046,"nm":"大地影城(米拉店)","sellmin":0,"sell":true,"preferential":0,"addr":"通州区马驹桥新海东路1号（豪润生活广场7层）","area":"通州区","ct":"","lat":39.760098,"lng":116.545555,"brd":"大地影院","dis":"","deal":1,"distance":0,"follow":0,"imax":0,"sellPrice":38,"dealPrice":40.5,"referencePrice":0,"showCount":0,"brdId":384262,"id":8301},{"poiId":4800806,"nm":"佳合时光影城","sellmin":0,"sell":true,"preferential":0,"addr":"通州区运河西大街乔庄卜蜂莲花超市一层","area":"通州区","ct":"","lat":39.891575,"lng":116.68774,"brd":"其它","dis":"","deal":1,"distance":0,"follow":0,"imax":0,"sellPrice":28,"dealPrice":30,"referencePrice":0,"showCount":0,"brdId":0,"id":8654},{"poiId":82560,"nm":"通州区电影院","sellmin":0,"sell":true,"preferential":0,"addr":"通州区西海子西塔胡同1号","area":"通州区","ct":"","lat":39.912743,"lng":116.66441,"brd":"通州区电影院","dis":"德外大街","deal":0,"distance":0,"follow":0,"imax":0,"sellPrice":23,"dealPrice":0,"referencePrice":60,"showCount":0,"brdId":1041607,"id":178},{"poiId":41521114,"nm":"万达国际影城(通州万达店)","sellmin":0,"sell":true,"preferential":0,"addr":"通州区新华西街58号万达广场1号楼5层（厨艺宾馆对面）","area":"通州区","ct":"","lat":39.905937,"lng":116.64272,"brd":"万达影城","dis":"","deal":0,"distance":0,"follow":0,"imax":1,"sellPrice":43,"dealPrice":0,"referencePrice":0,"showCount":0,"brdId":102642,"id":10837},{"poiId":92950934,"nm":"耀莱成龙国际影城(临河里店)","sellmin":0,"sell":true,"preferential":0,"addr":"通州区临河里33号楼华业玫瑰商业中心D2号楼三层","area":"通州区","ct":"","lat":39.88119,"lng":116.68255,"brd":"耀莱成龙国际影城","dis":"","deal":1,"distance":0,"follow":0,"imax":0,"sellPrice":28,"dealPrice":25,"referencePrice":0,"showCount":0,"brdId":30227,"id":14634},{"poiId":6139543,"nm":"银兴乐天影城(通州店)","sellmin":0,"sell":true,"preferential":0,"addr":"通州区翠景北里21号京通罗斯福广场5F","area":"通州区","ct":"","lat":39.88967,"lng":116.659225,"brd":"乐天影城","dis":"","deal":0,"distance":0,"follow":0,"imax":0,"sellPrice":38,"dealPrice":0,"referencePrice":0,"showCount":0,"brdId":157630,"id":10964},{"poiId":99968119,"nm":"北京东融国际影城(月亮河店)","sellmin":0,"sell":false,"preferential":0,"addr":"通州区永顺镇芙蓉园513号楼","area":"通州区","ct":"","lat":39.919525,"lng":116.677376,"brd":"其它","dis":"","deal":0,"distance":0,"follow":0,"imax":0,"sellPrice":0,"dealPrice":0,"referencePrice":0,"showCount":0,"brdId":0,"id":15421},{"poiId":358821,"nm":"牛仔汽车电影院","sellmin":0,"sell":false,"preferential":0,"addr":"通州区台湖镇创业园路8号（近京沈高速台湖入口）","area":"通州区","ct":"","lat":39.84602,"lng":116.62319,"brd":"其它","dis":"梨园","deal":0,"distance":0,"follow":0,"imax":0,"sellPrice":0,"dealPrice":0,"referencePrice":10,"showCount":0,"brdId":0,"id":36}],"昌平区":[{"poiId":3320660,"nm":"保利国际影城(龙旗广场店)","sellmin":0,"sell":true,"preferential":0,"addr":"昌平区黄平路19号院3号楼龙旗广场购物中心3层（地铁8号线育新站路北600米，近永辉超市）","area":"昌平区","ct":"","lat":40.066605,"lng":116.34672,"brd":"保利国际影城","dis":"回龙观","deal":1,"distance":0,"follow":0,"imax":0,"sellPrice":39,"dealPrice":40,"referencePrice":100,"showCount":0,"brdId":24472,"id":5502},{"poiId":361208,"nm":"昌平保利影剧院(佳莲时代广场店)","sellmin":0,"sell":true,"preferential":0,"addr":"昌平区鼓楼南大街6号佳莲时代广场4楼（近鼓楼西街）","area":"昌平区","ct":"","lat":40.223534,"lng":116.23402,"brd":"其它","dis":"昌平镇","deal":0,"distance":0,"follow":0,"imax":0,"sellPrice":33,"dealPrice":0,"referencePrice":80,"showCount":0,"brdId":0,"id":50},{"poiId":1432377,"nm":"大地影院(昌平菓岭店)","sellmin":0,"sell":true,"preferential":0,"addr":"昌平区昌崔路203号果岭假日广场四楼","area":"昌平区","ct":"","lat":40.222176,"lng":116.264755,"brd":"大地影院","dis":"昌平镇","deal":0,"distance":0,"follow":0,"imax":0,"sellPrice":33,"dealPrice":0,"referencePrice":40,"showCount":0,"brdId":384262,"id":66},{"poiId":373237,"nm":"首都电影院(悦荟万科广场店)","sellmin":0,"sell":true,"preferential":0,"addr":"昌平区南环路10号院1号楼悦荟万科广场8层","area":"昌平区","ct":"","lat":40.2124,"lng":116.24026,"brd":"首都电影院","dis":"","deal":0,"distance":0,"follow":0,"imax":0,"sellPrice":38,"dealPrice":0,"referencePrice":0,"showCount":0,"brdId":1162239,"id":8186},{"poiId":30864,"nm":"万达国际影城(龙德广场店)","sellmin":0,"sell":true,"preferential":0,"addr":"昌平区立汤路186号龙德广场5层","area":"昌平区","ct":"","lat":40.060596,"lng":116.41618,"brd":"万达影城","dis":"天通苑","deal":0,"distance":0,"follow":0,"imax":1,"sellPrice":43,"dealPrice":0,"referencePrice":80,"showCount":0,"brdId":102642,"id":151},{"poiId":4058821,"nm":"沃美影城(回龙观店)","sellmin":0,"sell":true,"preferential":0,"addr":"昌平区回龙观同成街华联购物中心四楼（城铁回龙观站出口对面）","area":"昌平区","ct":"","lat":40.071976,"lng":116.33717,"brd":"沃美影城","dis":"","deal":1,"distance":0,"follow":0,"imax":0,"sellPrice":38,"dealPrice":40,"referencePrice":0,"showCount":0,"brdId":29462,"id":9647},{"poiId":286187,"nm":"星美国际影城(回龙观店)","sellmin":0,"sell":true,"preferential":0,"addr":"昌平区回龙观西大街111号华联商场3楼","area":"昌平区","ct":"","lat":40.07596,"lng":116.31944,"brd":"星美国际影城","dis":"回龙观","deal":0,"distance":0,"follow":0,"imax":0,"sellPrice":14,"dealPrice":0,"referencePrice":40,"showCount":0,"brdId":30032,"id":140},{"poiId":82598,"nm":"中影国际影城(昌平永旺店)","sellmin":0,"sell":true,"preferential":0,"addr":"昌平区北清路1号永旺国际商城3楼","area":"昌平区","ct":"","lat":40.09749,"lng":116.28857,"brd":"中影国际影城","dis":"回龙观","deal":0,"distance":0,"follow":0,"imax":0,"sellPrice":39,"dealPrice":0,"referencePrice":23,"showCount":0,"brdId":23745,"id":107}],"房山区":[{"poiId":52294367,"nm":"SFC上影(房山店)","sellmin":0,"sell":true,"preferential":0,"addr":"房山区黄辛庄路口绿地缤纷城3层","area":"房山区","ct":"","lat":39.756683,"lng":116.160515,"brd":"其它","dis":"","deal":0,"distance":0,"follow":0,"imax":0,"sellPrice":38,"dealPrice":0,"referencePrice":0,"showCount":0,"brdId":0,"id":13618},{"poiId":40470614,"nm":"幸福蓝海国际影城(北京房山店)","sellmin":0,"sell":true,"preferential":0,"addr":"房山区广阳新路9号院1号楼中粮万科半岛购物广场3层","area":"房山区","ct":"","lat":39.753548,"lng":116.21099,"brd":"幸福蓝海国际影城","dis":"","deal":1,"distance":0,"follow":0,"imax":0,"sellPrice":39,"dealPrice":33,"referencePrice":0,"showCount":0,"brdId":30053,"id":13028},{"poiId":299222,"nm":"新华国际影城(房山店)","sellmin":0,"sell":true,"preferential":0,"addr":"房山区良乡北关西路14号华冠购物中心五层","area":"房山区","ct":"","lat":39.73469,"lng":116.13953,"brd":"新华国际影城","dis":"房山","deal":0,"distance":0,"follow":0,"imax":0,"sellPrice":38,"dealPrice":0,"referencePrice":60,"showCount":0,"brdId":29894,"id":131},{"poiId":271449,"nm":"燕山影剧院","sellmin":0,"sell":true,"preferential":0,"addr":"房山区燕山岗南路3号","area":"房山区","ct":"","lat":39.72787,"lng":115.96215,"brd":"燕山影剧院","dis":"房山","deal":1,"distance":0,"follow":0,"imax":0,"sellPrice":33,"dealPrice":35,"referencePrice":35,"showCount":0,"brdId":777439,"id":60},{"poiId":99082156,"nm":"北京燕山文化活动中心影院","sellmin":0,"sell":false,"preferential":0,"addr":"房山区迎风街道岗南路9号","area":"房山区","ct":"","lat":39.72558,"lng":115.96181,"brd":"其它","dis":"","deal":0,"distance":0,"follow":0,"imax":0,"sellPrice":0,"dealPrice":0,"referencePrice":0,"showCount":0,"brdId":0,"id":15272},{"poiId":5252975,"nm":"环球国际影城","sellmin":0,"sell":false,"preferential":0,"addr":"房山区兴房大街38号华冠欢乐城四楼","area":"房山区","ct":"","lat":39.69285,"lng":115.98708,"brd":"其它","dis":"","deal":1,"distance":0,"follow":0,"imax":0,"sellPrice":38,"dealPrice":26,"referencePrice":0,"showCount":0,"brdId":0,"id":9370},{"poiId":1436368,"nm":"良乡影剧院","sellmin":0,"sell":false,"preferential":0,"addr":"房山区良乡拱辰大街31号","area":"房山区","ct":"","lat":39.73799,"lng":116.141685,"brd":"良乡影剧院","dis":"房山","deal":0,"distance":0,"follow":0,"imax":0,"sellPrice":0,"dealPrice":0,"referencePrice":30,"showCount":0,"brdId":949172,"id":145}],"顺义区":[{"poiId":6448554,"nm":"CGV星聚汇影城(顺义店)","sellmin":0,"sell":true,"preferential":0,"addr":"顺义区新顺南大街8号华联购物中心4层CGV星聚汇国际影城","area":"顺义区","ct":"","lat":40.12897,"lng":116.65173,"brd":"CGV星聚汇影城","dis":"","deal":0,"distance":0,"follow":0,"imax":0,"sellPrice":43,"dealPrice":0,"referencePrice":0,"showCount":0,"brdId":2020418,"id":8111},{"poiId":1437402,"nm":"博纳国际影城(顺义店)","sellmin":0,"sell":true,"preferential":0,"addr":"顺义区新顺南大街18号新世界百货七层","area":"顺义区","ct":"","lat":40.126575,"lng":116.65212,"brd":"博纳国际影城","dis":"顺义","deal":0,"distance":0,"follow":0,"imax":0,"sellPrice":29,"dealPrice":0,"referencePrice":70,"showCount":0,"brdId":24595,"id":69},{"poiId":40420215,"nm":"橙天嘉禾影城(祥云小镇店)","sellmin":0,"sell":true,"preferential":0,"addr":"顺义区安泰大街9号院7号楼二层（祥云小镇内）","area":"顺义区","ct":"","lat":40.09027,"lng":116.53684,"brd":"橙天嘉禾影城","dis":"","deal":0,"distance":0,"follow":0,"imax":0,"sellPrice":33.5,"dealPrice":0,"referencePrice":0,"showCount":0,"brdId":24745,"id":11102},{"poiId":41599879,"nm":"大地影院(顺义隆华店)","sellmin":0,"sell":true,"preferential":0,"addr":"顺义区新顺南大街11号隆华购物中心6F","area":"顺义区","ct":"","lat":40.125973,"lng":116.650536,"brd":"大地影院","dis":"","deal":1,"distance":0,"follow":0,"imax":0,"sellPrice":33,"dealPrice":40.5,"referencePrice":0,"showCount":0,"brdId":384262,"id":12394},{"poiId":89018,"nm":"顺义影剧院","sellmin":0,"sell":true,"preferential":0,"addr":"顺义区新顺北大街3号","area":"顺义区","ct":"","lat":40.1338,"lng":116.650375,"brd":"顺义影剧院","dis":"顺义","deal":1,"distance":0,"follow":0,"imax":0,"sellPrice":33,"dealPrice":25,"referencePrice":30,"showCount":0,"brdId":1148935,"id":180}],"门头沟区":[{"poiId":3260641,"nm":"门头沟影剧院","sellmin":0,"sell":true,"preferential":0,"addr":"门头沟区新桥大街12号","area":"门头沟区","ct":"","lat":39.9425,"lng":116.10049,"brd":"其它","dis":"门头沟","deal":0,"distance":0,"follow":0,"imax":0,"sellPrice":33,"dealPrice":0,"referencePrice":0,"showCount":0,"brdId":0,"id":182},{"poiId":42297501,"nm":"幸福蓝海影城(门头沟店)","sellmin":0,"sell":true,"preferential":0,"addr":"门头沟区永定镇冯村华润购物中心2层","area":"门头沟区","ct":"","lat":39.91212,"lng":116.11124,"brd":"幸福蓝海国际影城","dis":"","deal":1,"distance":0,"follow":0,"imax":0,"sellPrice":43,"dealPrice":35.9,"referencePrice":0,"showCount":0,"brdId":30053,"id":10570},{"poiId":40550440,"nm":"熙旺国际影城","sellmin":0,"sell":true,"preferential":0,"addr":"门头沟区双峪路35号熙旺生活广场B座6层","area":"门头沟区","ct":"","lat":39.93551,"lng":116.11315,"brd":"其它","dis":"","deal":1,"distance":0,"follow":0,"imax":0,"sellPrice":43,"dealPrice":35.9,"referencePrice":0,"showCount":0,"brdId":0,"id":10979}],"石景山区":[{"poiId":6596632,"nm":"保利国际影城(苹果园店)","sellmin":0,"sell":true,"preferential":0,"addr":"石景山区阜石路300号喜隆多三层","area":"石景山区","ct":"","lat":39.92295,"lng":116.17175,"brd":"保利国际影城","dis":"","deal":0,"distance":0,"follow":0,"imax":0,"sellPrice":38,"dealPrice":0,"referencePrice":0,"showCount":0,"brdId":24472,"id":10294},{"poiId":82589,"nm":"古城电影院","sellmin":0,"sell":true,"preferential":0,"addr":"石景山区古城南路15号","area":"石景山区","ct":"","lat":39.9112,"lng":116.19126,"brd":"古城电影院","dis":"古城","deal":1,"distance":0,"follow":0,"imax":0,"sellPrice":33,"dealPrice":30,"referencePrice":0,"showCount":0,"brdId":302869,"id":246},{"poiId":298683,"nm":"万达国际影城(石景山店)","sellmin":0,"sell":true,"preferential":0,"addr":"石景山区石景山路乙18号万达广场娱乐楼4楼","area":"石景山区","ct":"","lat":39.905945,"lng":116.22568,"brd":"万达影城","dis":"鲁谷","deal":0,"distance":0,"follow":0,"imax":1,"sellPrice":43,"dealPrice":0,"referencePrice":80,"showCount":0,"brdId":102642,"id":133}],"怀柔区":[{"poiId":3260663,"nm":"传奇瑞丽影城","sellmin":0,"sell":true,"preferential":0,"addr":"怀柔区青春路15号四层","area":"怀柔区","ct":"","lat":40.317955,"lng":116.62985,"brd":"其它","dis":"怀柔","deal":0,"distance":0,"follow":0,"imax":0,"sellPrice":43,"dealPrice":0,"referencePrice":35,"showCount":0,"brdId":0,"id":55},{"poiId":1541434,"nm":"怀柔区电影院","sellmin":0,"sell":false,"preferential":0,"addr":"怀柔区富乐大街8号","area":"怀柔区","ct":"","lat":40.34083,"lng":116.64014,"brd":"其它","dis":"怀柔","deal":0,"distance":0,"follow":0,"imax":0,"sellPrice":0,"dealPrice":0,"referencePrice":0,"showCount":0,"brdId":0,"id":2378},{"poiId":94728699,"nm":"米珈尼汽车影院","sellmin":0,"sell":false,"preferential":0,"addr":"怀柔区雁栖湖路1号","area":"怀柔区","ct":"","lat":40.392265,"lng":116.67963,"brd":"其它","dis":"","deal":0,"distance":0,"follow":0,"imax":0,"sellPrice":0,"dealPrice":0,"referencePrice":0,"showCount":0,"brdId":0,"id":15748}],"平谷区":[{"poiId":97314976,"nm":"耀莱成龙国际影城(平谷店)","sellmin":0,"sell":true,"preferential":0,"addr":"平谷区迎宾路1号院22号楼五层F5-13","area":"平谷区","ct":"","lat":40.14356,"lng":117.093155,"brd":"耀莱成龙国际影城","dis":"","deal":0,"distance":0,"follow":0,"imax":0,"sellPrice":38,"dealPrice":0,"referencePrice":0,"showCount":0,"brdId":30227,"id":15082},{"poiId":1156598,"nm":"平谷区影剧院","sellmin":0,"sell":false,"preferential":0,"addr":"平谷区府前街3号","area":"平谷区","ct":"","lat":40.14054,"lng":117.1224,"brd":"平谷区影剧院","dis":"平谷","deal":0,"distance":0,"follow":0,"imax":0,"sellPrice":0,"dealPrice":0,"referencePrice":0,"showCount":0,"brdId":505125,"id":2379}],"密云县":[{"poiId":1436412,"nm":"密云大剧院","sellmin":0,"sell":true,"preferential":0,"addr":"密云县鼓楼西大街1号","area":"密云县","ct":"","lat":40.377117,"lng":116.84507,"brd":"其它","dis":"密云县","deal":0,"distance":0,"follow":0,"imax":0,"sellPrice":33,"dealPrice":0,"referencePrice":60,"showCount":0,"brdId":0,"id":183}],"延庆县":[{"poiId":1366944,"nm":"大地影院(延庆金锣湾店)","sellmin":0,"sell":true,"preferential":0,"addr":"延庆县妫水北街39号1幢H座首楼金锣湾商业中心沃尔玛旁","area":"延庆县","ct":"","lat":40.461918,"lng":115.97629,"brd":"大地影院","dis":"延庆","deal":1,"distance":0,"follow":0,"imax":0,"sellPrice":43,"dealPrice":39,"referencePrice":40,"showCount":0,"brdId":384262,"id":13}]}
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
