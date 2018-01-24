package com.jihelife.controller;

import com.alibaba.fastjson.JSON;
import com.jihelife.pojo.ReqParameter;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Enumeration;

/**
 * Created by maobg on 2015/7/23.
 */
public class ParameterInterceptor implements HandlerInterceptor {

    private static Log logger = LogFactory.getLog(ParameterInterceptor.class);

    ThreadLocal threadLocal = new ThreadLocal();

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse httpServletResponse, Object o) throws Exception {
        logger.info("***********************************************");
        logger.info("request="+request.getServletPath() + (null == request.getQueryString() ? "" : "?" + request.getQueryString()));
        Enumeration<String> header =   request.getHeaderNames();
        while (header.hasMoreElements()){
            String headername = header.nextElement();
            logger.info(headername + ":" + request.getHeader(headername));
        }
        logger.info("hotelId="+request.getParameter("hotelId"));
        logger.info("templateJson="+request.getParameter("templateJson"));
        logger.info("***********************************************");



        RequestFacade.setParameters(null);
        ReqParameter parameterInfo = null;
  /*   parameterInfo = JSON.parseObject(request.getParameter("data"), ReqParameter.class);*/
        if(null != request.getParameter("data")){
            parameterInfo = JSON.parseObject(request.getParameter("data"), ReqParameter.class);
        }else {
            parameterInfo=new ReqParameter();
        }
/*        if(null != request.getParameter("hotelId")) {
            parameterInfo.setHotelId(Integer.parseInt(request.getParameter("hotelId")));
        }
        if(null != request.getParameter("groupId")) {
            parameterInfo.setGroupId(Integer.parseInt(request.getParameter("groupId")));
        }
        if(null != request.getParameter("templateId")) {
            parameterInfo.setTemplateId(Integer.parseInt(request.getParameter("templateId")));
        }
        if(null != request.getParameter("accountPhone")) {
            parameterInfo.setAccountPhone(request.getParameter("accountPhone"));
        }
        if(null != request.getParameter("signatureName")) {
            parameterInfo.setSignatureName(request.getParameter("signatureName"));
        }
        if(null != request.getParameter("accountId")) {
            parameterInfo.setAccountId(Integer.parseInt(request.getParameter("accountId")));
        }
        if(null != request.getParameter("templateJson")) {
            parameterInfo.setTemplateJson(request.getParameter("templateJson"));
        }
        if(null != request.getParameter("recordStatus")) {
            parameterInfo.setRecordStatus(Integer.parseInt(request.getParameter("recordStatus")));
        }
        if(null != request.getParameter("paramKey")) {
            parameterInfo.setParamKey(request.getParameter("paramKey"));
        }*/
        parameterInfo.setClientrealip(null != request.getHeader("remoteip") ? request.getHeader("remoteip") : (null != request.getHeader("X-Real-IP") ? request.getHeader("X-Real-IP") : request.getRemoteAddr()));
        parameterInfo.setAction(request.getServletPath());
        logger.info(parameterInfo);
        RequestFacade.setParameters(parameterInfo);

        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
