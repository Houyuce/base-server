package com.jihelife.controller;

import com.jihelife.base.BizException;
import com.jihelife.constants.ApplicationConstants;
import com.jihelife.pojo.ReqParameter;
import com.jihelife.service.cache.DictSysParameter;
import com.jihelife.utils.ValidUtil;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.util.TextUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;
import java.util.logging.Logger;


/**
 * Created by maobg on 2015/7/6.
 */
public class SecurityInterceptor  implements HandlerInterceptor {

    private static Log logger = LogFactory.getLog(SecurityInterceptor.class);

    @Autowired
    DictSysParameter dictSysParameter;

    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response, Object handler) throws Exception {
        ReqParameter reqParameter = RequestFacade.getParameters();
        if(reqParameter.getAction().startsWith("/base/inter")||reqParameter.getAction().startsWith("/base/inter")){
            checkJiheIp(reqParameter);
        }
        return true;
    }


    private void checkJiheIp(ReqParameter reqParameter) throws BizException {
        String regxList[] = dictSysParameter.getParameter("jihe_server_iplist","").split("[|]");
        for(String regx:regxList)
        {
            if(ValidUtil.isMatch(reqParameter.getClientrealip(),regx))
                return;
        }
        throw new BizException(BizException.CODE_IPAUTH_ERROR,BizException.MSG_IPAUTH_ERROR);
    }

    @Override
    public void postHandle(HttpServletRequest request,
                           HttpServletResponse response, Object handler,
                           ModelAndView modelAndView) throws Exception {
    }

    @Override
    public void afterCompletion(HttpServletRequest request,
                                HttpServletResponse response, Object handler, Exception ex)
            throws Exception {
    }
}
