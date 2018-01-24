package com.jihelife.pojo;


/**
 * Created by wangwenchao on 2015/7/22.
 */
public class ReqParameter {
    /**
     * 短信参数
     */
    private int templateId;
    private String signatureName;
    private String accountPhone;
    private int hotelId=0;
    private int groupId=0;
    private String templateJson;
    private int recordStatus;
    private String site;

    /**
     * 基本参数
     */
    private String action;
    private String useragent;
    private String location;
    private String apiversion;
    private String channel;
    private String uuid;
    private String userid;
    private String sign;
    private String clientrealip;
    private String data;
    private String queryString;

    /*sysParammetersV12参数*/
    private String paramKey;


    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getParamKey() {
        return paramKey;
    }

    public void setParamKey(String paramKey) {
        this.paramKey = paramKey;
    }

    public int getRecordStatus() {
        return recordStatus;
    }

    public void setRecordStatus(int recordStatus) {
        this.recordStatus = recordStatus;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getUseragent() {
        return useragent;
    }

    public void setUseragent(String useragent) {
        this.useragent = useragent;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getApiversion() {
        return apiversion;
    }

    public void setApiversion(String apiversion) {
        this.apiversion = apiversion;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getClientrealip() {
        return clientrealip;
    }

    public void setClientrealip(String clientrealip) {
        this.clientrealip = clientrealip;
    }

    public String getQueryString() {
        return queryString;
    }

    public void setQueryString(String queryString) {
        this.queryString = queryString;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getTemplateId() {
        return templateId;
    }

    public void setTemplateId(int templateId) {
        this.templateId = templateId;
    }

    public String getTemplateJson() {
        return templateJson;
    }

    public void setTemplateJson(String templateJson) {
        this.templateJson = templateJson;
    }

    public String getSignatureName() {
        return signatureName;
    }

    public void setSignatureName(String signatureName) {
        this.signatureName = signatureName;
    }



    public String getAccountPhone() {
        return accountPhone;
    }

    public void setAccountPhone(String accountPhone) {
        this.accountPhone = accountPhone;
    }

    public int getHotelId() {
        return hotelId;
    }

    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    @Override
    public String toString() {
        return "ReqParameter{" +
                "templateId=" + templateId +
                ", signatureName='" + signatureName + '\'' +
                ", userId=" +
                ", accountPhone='" + accountPhone + '\'' +
                ", hotelId=" + hotelId +
                ", groupId=" + groupId +
                ", templateJson='" + templateJson + '\'' +
                ", recordStatus=" + recordStatus +
                ", action='" + action + '\'' +
                ", useragent='" + useragent + '\'' +
                ", location='" + location + '\'' +
                ", apiversion='" + apiversion + '\'' +
                ", channel='" + channel + '\'' +
                ", uuid='" + uuid + '\'' +
                ", userid='" + userid + '\'' +
                ", sign='" + sign + '\'' +
                ", clientrealip='" + clientrealip + '\'' +
                ", data='" + data + '\'' +
                ", queryString='" + queryString + '\'' +
                ", paramKey='" + paramKey + '\'' +
                '}';
    }
}
