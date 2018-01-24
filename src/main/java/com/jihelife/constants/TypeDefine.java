package com.jihelife.constants;

/**
 * Created by hutiejiong on 2016/3/16.
 */
public final class TypeDefine {
    //酒店类型
    public static final int HOTELTYPE_HOTEL = 0;   //标准酒店
    public static final int HOTELTYPE_BNB = 1;  //民宿

    //产品支付方式
    public static final int PAYTYPE_MONEY = 0;              //纯现金
    public static final int PAYTYPE_POINTS = 1;             //纯积分
    public static final int PAYTYPE_MONEY_AND_POINT = 2;    //现金+积分

    //产品类型
    public static final int PRODUCTTYPE_THIRD_BOOKING = 0;    //免费（第三方预订）
    public static final int PRODUCTTYPE_PROXY_BOOKING = 1;    //代订
    public static final int PRODUCTTYPE_ONLINE_PAY_BOOKING = 2;    //在线付


    //资源类型定义
    public static final int RESOURCE_TYPE_HOTEL = 1;  //酒店
    public static final int RESOURCE_TYPE_PROMOTION = 2;  //住宿优惠
    public static final int RESOURCE_TYPE_TOPIC = 3;  //主题
    public static final int RESOURCE_TYPE_ADVERT = 4;  //广告
    public static final int RESOURCE_TYPE_JIHEPLUS = 5; //几何PLUS
    public static final int RESOURCE_TYPE_ACTIVITY = 6; //活动
    public static final int RESOURCE_TYPE_TEA = 7; //下午茶
    public static final int RESOURCE_TYPE_ROOM = 11; //下午茶

    public static final int RESOURCE_SUBTYPE_PROMOTION_STAY = 210;
    public static final int RESOURCE_SUBTYPE_PROMOTION_BUFFET = 230;
    public static final int RESOURCE_SUBTYPE_PROMOTION_SPA = 240;

    //对象类型
    public static final int TYPE_OBJECT_CONTENT = 0;
    public static final int TYPE_OBJECT_ORDER = 1;


    //活动类型
    public static final int TYPE_ACTIVITY_NORMAL                    = 0;
    public static final int TYPE_ACTIVITY_MINSUSINGLE_ONECODE       = 1;    //试睡单人单码模式
    public static final int TYPE_ACTIVITY_MINSUMATCH                = 2;    //试睡双人配对模式
    public static final int TYPE_ACTIVITY_MINSUTEAM                 = 3;    //试睡组团模式
    public static final int TYPE_ACTIVITY_MINSUSINGLE_EXTRACODES    = 4;    //试睡单人多码模式
    public static final int TYPE_ACTIVITY_LOTTERY                   = 5;    //老虎机抽奖模式
    public static final int TYPE_ACTIVITY_MINSUSINGLE_MULTICHANNEL  = 6;    //试睡单人多渠道模式
    public static final int TYPE_ACTIVITY_MINSUSINGLE_ONECHANNEL    = 7;    //试睡单人单渠道模式
    public static final int TYPE_ACTIVITY_MINSUSINGLE_MULTICHANNEL_JIHECLUB   = 8;    //试睡单人多渠道带会员注册模式
    public static final int TYPE_ACTIVITY_VOTE_TRIP                 = 10;    //自由行程投票模式
    public static final int TYPE_ACTIVITY_VOTE_HOTEL                = 11;    //固定行程投票模式
    public static final int TYPE_ACTIVITY_OTHER                     = 99;


    //数据类型
    public static final int TYPE_DATA_DATE = 4;
    public static final int TYPE_DATA_STRING = 0;

    //操作员身份类型
    public static final int OPERATOR_MODULE_OMS = 1;
    public static final int OPERATOR_MODULE_BMS = 0;

    //BMS账号类型
    public static final int OPERATOR_NORMAL = 0;
    public static final int OPERATOR_WEIXIN = 1;


}
