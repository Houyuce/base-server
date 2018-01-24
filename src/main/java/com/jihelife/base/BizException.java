package com.jihelife.base;

/**
 * Created by maobg on 2015/5/23.
 */
public class BizException extends Exception {

    public static final String CODE_NO_LONIN     = "-1";       //未登录
    public static final String MSG_NO_LONIN      = "用户未登录";

    //基本错误定义
    public static final String CODE_SIGN_ERROR       = "BASE-1000";       //签名错误
    public static final String MSG_SIGN_ERROR        = "【签名错误】";
    public static final String CODE_IPAUTH_ERROR     = "BASE-1001";       //IP授权错误
    public static final String MSG_IPAUTH_ERROR      = "【IP未授权】";
    public static final String CODE_LACK_PARM        = "BASE-1002";       //缺少必要参数
    public static final String MSG_LACK_PARM         = "【缺少必要参数】";
    public static final String CODE_PARM_ERROR       = "BASE-1003";       //参数错误
    public static final String MSG_PARM_ERROR        = "【参数错误】";
    public static final String CALL_SERVICE_ERROR  = "BASE-1004";       //调用服务异常
    public static final String MSG_CALL_SERVICE_ERROR = "调用服务异常";

    //用户错误定义
    public static final String CODE_PAY_FAIL = "PAY-1000";
    public static final String MSG_PAY_FAIL = "支付失败";
    public static final String CODE_PAY_COUPON_FAIL = "PAY-1001";
    public static final String MSG_PAY_COUPON_FAIL = "券支付失败";
    public static final String CODE_PAY_COUPON_REMAIN_NOT_ENOUGH = "PAY-1002";
    public static final String MSG_PAY_COUPON_REMAIN_NOT_ENOUGH = "支付失败：礼券余额不足";
    public static final String CODE_PAY_COUPON_RECOVERY_FAIL = "PAY-1003";
    public static final String MSG_PAY_COUPON_RECOVERY_FAIL = "券冲正失败";
    public static final String CODE_PAY_POINTS_FAIL    = "PAY-1004";
    public static final String MSG_PAY_POINTS_FAIL    = "积分支付失败";
    public static final String CODE_PAY_POINTS_NOT_ENOUGH    = "PAY-1005";
    public static final String MSG_PAY_POINTS_NOT_ENOUGH    = "支付失败：积分不足";
    public static final String CODE_PAY_POINTS_RECOVERY_FAIL = "PAY-1006";
    public static final String MSG_PAY_POINTS_RECOVERY_FAIL = "积分冲正失败";
    public static final String CODE_PAY_VALID_FAIL = "PAY-1007";
    public static final String MSG_PAY_VALID_FAIL = "校验失败";
    public static final String CODE_PAY_BALANCE_FAIL = "PAY-1008";
    public static final String MSG_PAY_BALANCE_FAIL = "余额账户支付失败";
    public static final String CODE_PAY_BALANCE_NOT_ENOUGH = "PAY-1009";
    public static final String MSG_PAY_BALANCE_NOT_ENOUGH = "支付失败：余额不足";
    public static final String CODE_PAY_BALANCE_RECOVERY_FAIL = "PAY-1010";
    public static final String MSG_PAY_BALANCE_RECOVERY_FAIL = "退款失败：余额冲正失败";
    public static final String CODE_PAY_CONVERT_OTHER_PAY_FAIL = "PAY-1011";
    public static final String MSG_PAY_CONVERT_OTHER_PAY_FAIL = "下单失败";
    public static final String CODE_PAY_PAYMENT_CLASH = "PAY-1012";     //券冲突
    public static final String CODE_PAY_WITHDRAW_FAIL = "PAY-1013";     //提现失败

    public static final String CODE_COUPON_GRANT_FAIL = "COUPON-1000";
    public static final String MSG_COUPON_GRANT_FAIL = "抵用券发放失败";
    public static final String CODE_COUPON_CAN_NOT_RECYCLE = "COUPON-1001";     //券不能回收
    public static final String MSG_COUPON_CAN_NOT_RECYCLE = "券不能回收";
    public static final String CODE_COUPON_RECYCLE_FAIL = "COUPON-1002";     //券回收失败
    public static final String MSG_COUPON_RECYCLE_FAIL = "券回收失败";
    public static final String CODE_COUPON_TRADE_FAIL = "COUPON-1003";     //券交易失败
    public static final String MSG_COUPON_TRADE_FAIL = "券交易失败";


    public static final String CODE_BNB_NOT_IN_UNION = "POINT-1005";
    public static final String MSG_BNB_NOT_IN_UNION = "当前时间此民宿为非联盟商户";
    public static final String CODE_POINTS_REWARD_FAIL = "POINT-1007";
    public static final String MSG_POINTS_REWARD_FAIL = "积分充值失败";





    private String code;
    public BizException(String code, String message) {
        super(message);
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
