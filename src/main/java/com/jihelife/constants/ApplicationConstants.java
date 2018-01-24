package com.jihelife.constants;

/**
 * Created by hutiejong on 2015/11/05.
 */
public final class ApplicationConstants {

    public static final int QINIU_RESP_CODE_OK = 200;

    //response返回标签
    public static final String TAG_SC = "sc";
    public static final String TAG_SC_MSG = "msg";
    public static final String TAG_PAGEINFO = "pageinfo";
    public static final String TAG_LIST = "list";
    public static final String TAG_DATA = "data";
    public static final String TAG_H5URL = "h5url";
    public static final String TAG_MC = "mc";      //url中的渠道参数名称

    //返回码
    public static final String SC_OK = "0";
    public static final String SC_ERR_LACK_PARM = "BASE -1002";  //缺少必要参数
    public static final String SC_ERR_MSG_LACK_PARM = "missing parameters"; //参数错误
    public static final String SC_ERR_PARM_ERROR = "BASE -1003";   //参数错误
    public static final String SC_ERR_OBJECT_NOTEXIST = "CONTENT-1004";  //对象不存在
    public static final String SC_ERR_MSG_OBJECT_NOTEXIST = "object not existed";  //对象不存在

    //系统参数在DB中的key名称
    public static final String SYS_PARAM_KEY_PHONEREGEX = "phoneRegex";
    public static final String SYS_PARAM_KEY_PRICECALENDAR_LENGTH = "price_calendar_length";
    public static final String SYS_PARAM_KEY_PRICECALENDAR_EMPTYPRICE_MSG = "price_calendar_emptyprice_message";
    public static final String SYS_PARAM_KEY_DEFAULT_OTA_NAME = "default_ota_name";
    public static final String SYS_PARAM_KEY_OTA_ORIGIN_TEMPLATE = "price_calendar_ota_origin_template";
    public static final String SYS_PARAM_KEY_HTTP_HOST = "h5url_root_path";
    public static final String SYS_PARAM_KEY_H5URL_HOTEL_DETAIL = "h5url_hotel_detail";
    public static final String SYS_PARAM_KEY_H5URL_PROMOTION_DETAIL = "h5url_promotion_detail";
    public static final String SYS_PARAM_KEY_H5URL_TOPIC_DETAIL = "h5url_topic_detail";
    public static final String SYS_PARAM_KEY_H5URL_ADVERT_DETAIL = "h5url_advert_detail";
    public static final String SYS_PARAM_KEY_H5URL_ACTIVITY_DETAIL = "h5url_activity_detail";
    public static final String SYS_PARAM_KEY_H5URL_TEA_DETAIL = "h5url_tea_detail";
    public static final String SYS_PARAM_KEY_H5URL_BNB_DETAIL = "h5url_bnb_detail";
    public static final String SYS_PARAM_KEY_H5URL_VIRTUALGOODS = "h5url_virtualgoods";
    public static final String SYS_PARAM_KEY_H5URL_MULTIPRODUCTS_LIST = "h5url_multiproducts_list";
    public static final String SYS_PARAM_KEY_USER_SPREAD_URL = "user_registermember_spread_url";        //注册会员推广地址
    public static final String SYS_PARAM_KEY_INSTOREPAY_URL = "instorepay_url";        //店内支付地址


    public static final String SYS_PARAM_KEY_TAG_ID_JIHE_BUSINESS = "tag_id_jihe_business";
    public static final String SYS_PARAM_KEY_TAG_ID_BNB_HOTEL = "tag_id_bnbHotel";
    public static final String SYS_PARAM_KEY_QINIU_RESOURCE_URI = "qiniu_resource_uri";

    public static final String SYS_PARAM_KEY_SHARE_TITLE_PROMOTION = "share_prom_title_template";
    public static final String SYS_PARAM_KEY_SHARE_DESC_PROMOTION = "share_default_desc";
    public static final String SYS_PARAM_KEY_SHARE_URL_PROMOTION = "share_promotion_url";


    //内网服务host地址
    public static final String SYS_PARAM_KEY_SERVICE_USER_ROOT_URL = "service_root_url_user";
    public static final String SYS_PARAM_KEY_SERVICE_SEARCH_ROOT_URL = "service_root_url_search";
    public static final String SYS_PARAM_KEY_SERVICE_PAY_ROOT_URL = "service_root_url_pay";
    public static final String SYS_PARAM_KEY_SERVICE_COUPON_ROOT_URL = "service_root_url_coupon";
    public static final String SYS_PARAM_KEY_SERVICE_MEMBER_ROOT_URL = "service_root_url_member";

    //OTA类型命名定义
    public static final String OTA_TYPE_CTRIP = "ctrip";
    public static final String OTA_TYPE_QUNAR = "qunar";
    public static final String OTA_NAME_CTRIP = "携程网";
    public static final String OTA_NAME_QUNAR = "去哪儿网";




    //resource service response sc
    public static final String RESOURCE_SUCCESS = "0";


    public static final int UPDATE_INDEX_SUCCESS = 0;


    //七牛存储访问KEY
    public static final String QINIU_ACCESS_KEY = "yyXVAMl2WdAr0yBiaeYhsm3EJeBgTLdi7iWCgwga";
    //七牛存储秘钥
    public static final String QINIU_SECRET_KEY = "EQsELp04PLjKZpGq1ctWp803t7NGHf27GSOPaUZD";

    //七牛用户名
    public static final String QINIU_BUCKET_NAME = "html";





    //酒店、民宿官网（集团）代码
    public static final String GROUP_CODE_SPG = "spg";
    public static final String GROUP_CODE_IHG = "ihg";
    public static final String GROUP_CODE_FANQIE = "fanqie";
    public static final String GROUP_CODE_YUNZHANGGUI = "yunzhanggui";
    public static final String GROUP_CODE_CUSTOM = "custom";

    public static String DEFAULT_SYMBOL_RMB = "￥";
    public static String DEFAULT_COUNTRY_CODE = "CN";

    //预定方式的定义
    public static final String RESERVE_WAY_URL = "1";   //固定url（官网等）
    public static final String RESERVE_WAY_TEL = "2";   //电话预订
    public static final String RESERVE_WAY_CTRIP = "3"; //携程预订
    public static final String RESERVE_WAY_YZG = "4";   //云掌柜预订
    public static final String RESERVE_WAY_FANQIE = "5";    //番茄来了预订

    //几何商户
    public static final int FLAG_JIHE_BUSINESS_MEMBER = 1;

    //部分tagid
    public static final int DEFAULT_TAG_ID_JIHE_BUSINESS = 109;
    public static final int DEFAULT_TAG_ID_BNB_HOTEL = 40;
    public static final int DEFAULT_TAG_GID_PRICE = 3;
    public static final int DEFAULT_TAG_GID_RESOURCE_TYPE = 4;


    //活动通用扩展参数命名
    public static final String ACT_PARAM_NAME_ACTIVITY_TIPS = "activity_tips";              //活动温馨提示
    public static final String ACT_PARAM_DESC_ACTIVITY_TIPS = "活动温馨提示";                //活动温馨提示
    public static final String ACT_PARAM_NAME_PRIZE_NAME = "prize_name";
    public static final String ACT_PARAM_DESC_PRIZE_NAME = "奖品名称";

    //民宿试睡活动扩展参数命名
    public static final String ACT_PARAM_NAME_HEADER_IMG = "header_img";
    public static final String ACT_PARAM_DESC_HEADER_IMG = "页面头图ID";
    public static final String ACT_PARAM_NAME_SMALL_HEADER_IMG = "small_header_img";
    public static final String ACT_PARAM_DESC_SMALL_HEADER_IMG = "小尺寸头图ID";

    public static final String ACT_PARAM_NAME_BACKGROUND_IMG = "background_img";
    public static final String ACT_PARAM_DESC_BACKGROUND_IMG = "背景图";
    public static final String ACT_PARAM_NAME_BACKGROUND_COLOR = "background_color";
    public static final String ACT_PARAM_DESC_BACKGROUND_COLOR = "报名页背景底色";
    public static final String ACT_PARAM_DEFAULTVALUE_BACKGROUND_COLOR = "#0a0d16";

    public static final String ACT_PARAM_NAME_VIEWPAGE_BACKGROUND_COLOR = "viewpage_background_color";
    public static final String ACT_PARAM_DESC_VIEWPAGE_BACKGROUND_COLOR = "抽奖码背景底色";
    public static final String ACT_PARAM_DEFAULTVALUE_VIEWPAGE_BACKGROUND_COLOR = "#333c4d";

    public static final String ACT_PARAM_NAME_PAGE_FOOTER_LOGO = "footer_logo";
    public static final String ACT_PARAM_DESC_PAGE_FOOTER_LOGO = "页尾几何logo";
    public static final String ACT_PARAM_DEFAULTVALUE_PAGE_FOOTER_LOGO = "216290";


    public static final String ACT_PARAM_NAME_MAX_QUANTITY_BOXES = "max_quantity_boxes";
    public static final String ACT_PARAM_DESC_MAX_QUANTITY_BOXES = "用户可翻牌的最大数量";
    public static final Integer ACT_PARAM_DEFAULTVALUE_MAX_QUANTITY_BOXES = 4;
    public static final String ACT_PARAM_NAME_MIN_QUANTITY_BOXES = "min_quantity_boxes";
    public static final String ACT_PARAM_DESC_MIN_QUANTITY_BOXES = "用户可翻牌的最小数量";
    public static final Integer ACT_PARAM_DEFAULTVALUE_MIN_QUANTITY_BOXES = 3;


    //待办事项相关
    public static final String SYS_PARAM_KEY_TODO_HOTELTEAM_APPLYCONFIRM_TITLE_TEMPLATE = "todo_hotelteam_applyconfirm_title_template";
    public static final String SYS_PARAM_KEY_TODO_HOTELTEAM_APPLYPASS_TITLE_TEMPLATE = "todo_hotelteam_applypass_title_template";
    public static final String SYS_PARAM_KEY_TODO_HOTELTEAM_APPLYREJECT_TITLE_TEMPLATE = "todo_hotelteam_applyreject_title_template";
    public static final String SYS_PARAM_KEY_TODO_HOTELTEAM_APPLYCONFIRM_H5URL = "todo_hotelteam_applyconfirm_h5url";
    public static final String SYS_PARAM_KEY_TODO_HOTELTEAM_APPLYPASS_H5URL = "todo_hotelteam_applypass_h5url";
    public static final String SYS_PARAM_KEY_TODO_HOTELTEAM_APPLYREJECT_H5URL = "todo_hotelteam_applyreject_h5url";


    /**
     *   bms-server 迁移
     */
    public static final int IS_VALID = 1;       // 有效
    public static final int IS_NO_VALID = 0;    //无效

    public static final String JIHE_LOGO = "/1024.png";
    public static final String SH_QRCODE_PATH = "image/";



    public static final String MODULE_NAME_OMS = "oms";
    public static final String MODULE_NAME_BMS = "bms";

}
