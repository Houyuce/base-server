package com.jihelife.boot.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by maobg on 2015/7/18.
 */
@ConfigurationProperties(prefix = "application")
public class ApplicationProperties {

    private String qiniu_access_key;
    private String qiniu_secret_key;
    private String qiniu_bucket_name;
    private String qiniu_uri_prefix;


    private String proxy_order_server_url;
    private String proxy_oms_dir;
    private String proxy_data_key;
    private String proxy_data_encode;
    private String proxy_key_name_operator;
    private String proxy_key_name_orderid;

    //V1.x和V2.0新老数据结构兼容开关，1-打开，同步写入旧数据结构
    private int switch_adapt_old_data;

    private String resourceid_service;

    //内部服务地址
    private String intel_service_host;

    public String getIntel_service_host() {
        return intel_service_host;
    }

    public void setIntel_service_host(String intel_service_host) {
        this.intel_service_host = intel_service_host;
    }

    public String getResourceid_service() {
        return resourceid_service;
    }

    public void setResourceid_service(String resourceid_service) {
        this.resourceid_service = resourceid_service;
    }

    public String getQiniu_access_key() {
        return qiniu_access_key;
    }

    public void setQiniu_access_key(String qiniu_access_key) {
        this.qiniu_access_key = qiniu_access_key;
    }

    public String getQiniu_secret_key() {
        return qiniu_secret_key;
    }

    public void setQiniu_secret_key(String qiniu_secret_key) {
        this.qiniu_secret_key = qiniu_secret_key;
    }

    public String getQiniu_bucket_name() {
        return qiniu_bucket_name;
    }

    public void setQiniu_bucket_name(String qiniu_bucket_name) {
        this.qiniu_bucket_name = qiniu_bucket_name;
    }

    public String getQiniu_uri_prefix() {
        return qiniu_uri_prefix;
    }

    public void setQiniu_uri_prefix(String qiniu_uri_prefix) {
        this.qiniu_uri_prefix = qiniu_uri_prefix;
    }

    public String getProxy_order_server_url() {
        return proxy_order_server_url;
    }

    public void setProxy_order_server_url(String proxy_order_server_url) {
        this.proxy_order_server_url = proxy_order_server_url;
    }

    public String getProxy_oms_dir() {
        return proxy_oms_dir;
    }

    public void setProxy_oms_dir(String proxy_oms_dir) {
        this.proxy_oms_dir = proxy_oms_dir;
    }

    public String getProxy_data_key() {
        return proxy_data_key;
    }

    public void setProxy_data_key(String proxy_data_key) {
        this.proxy_data_key = proxy_data_key;
    }

    public String getProxy_data_encode() {
        return proxy_data_encode;
    }

    public void setProxy_data_encode(String proxy_data_encode) {
        this.proxy_data_encode = proxy_data_encode;
    }

    public String getProxy_key_name_operator() {
        return proxy_key_name_operator;
    }

    public void setProxy_key_name_operator(String proxy_key_name_operator) {
        this.proxy_key_name_operator = proxy_key_name_operator;
    }

    public String getProxy_key_name_orderid() {
        return proxy_key_name_orderid;
    }

    public void setProxy_key_name_orderid(String proxy_key_name_orderid) {
        this.proxy_key_name_orderid = proxy_key_name_orderid;
    }

    public int getSwitch_adapt_old_data() {
        return switch_adapt_old_data;
    }

    public void setSwitch_adapt_old_data(int switch_adapt_old_data) {
        this.switch_adapt_old_data = switch_adapt_old_data;
    }
}
