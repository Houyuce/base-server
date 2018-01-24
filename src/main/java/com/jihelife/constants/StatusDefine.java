package com.jihelife.constants;

/**
 * Created by hutiejiong on 2015/6/1 0001.
 */
public interface StatusDefine {

    //内容产品状态
    public static final int PRODUCT_DRAFT = 0;
    public static final int PRODUCT_ONLINE = 1;
    public static final int PRODUCT_OFFLINE = 2;
    public static final int PRODUCT_SOLDOUT = 3;
    public static final int PRODUCT_WAITFOR = 4;

    public static final int PRODUCT_DELETED = 99;        //归档


    //房型状态
    public static final int ROOM_CLOSED = 0;
    public static final int ROOM_OPENING = 1;
    public static final int ROOM_DELETED = 2;

    public static final int RESUTL_SC_ERROR = 1;


    //用户登录状态
    public static final String USER_LOGIN_SUCCESS = "0";
    public static final String USER_LOGIN_PWDERROR = "-1";

    //爆料状态
    public static final int EXHIBIT_NEW = 0;
    public static final int EXHIBIT_ACCEPT = 1;
    public static final int EXHIBIT_REFUSE = 2;

    //OMS用户状态
    public static final int OMS_OPERATOR_VALID = 1;
    public static final int OMS_OPERATOR_INVALID = 0;
    public static final int OMS_OPERATOR_DELETED = 2;


    // 用户修改密码状态
    public static final String USER_EDIT_SUCCESS = "0";
    public static final String USER_EDIT_ERROR = "-1";

    //活动分享开关状态
    public static final int ACTIVITY_SWITCH_SHARE_OFF = 0;
    public static final int ACTIVITY_SWITCH_SHARE_ALWAYS_ON = 1;
    public static final int ACTIVITY_SWITCH_SHARE_WORKTIME_ON = 2;

    //活动粉丝关注开关状态
    public static final int ACTIVITY_SWITCH_JOINFANS_OFF = 0;
    public static final int ACTIVITY_SWITCH_JOINFANS_ON = 1;

    //待办事项状态
    public static final int TODO_UNREAD = 0;
    public static final int TODO_READ = 1;
    public static final int TODO_DELETED = 2;

}
