package com.jihelife.controller;

import com.jihelife.base.BizException;
import com.jihelife.constants.ApplicationConstants;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by maobg on 2015/7/14.
 */
public class BaseController {
    private static Log logger = LogFactory.getLog(BaseController.class);

    protected Validator validator;

    /*
    *spring    Model属性解析(@ModelAttribute)String转Date,added by hutiejiong
     */
    @InitBinder
    protected void initBinder(HttpServletRequest request,
                              ServletRequestDataBinder binder) throws Exception {
        //注册自定义的属性编辑器 ，日期
        binder.registerCustomEditor(Date.class, new DateParamParser());

    }

    @PostConstruct
    protected void initValidator() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
    }


    @ExceptionHandler({Exception.class, BizException.class})
    @ResponseBody
    public Map<String, Object> ExceptionHandler(Exception ex) {
        logger.error("ExceptionHandler", ex);
        Map<String, Object> resultMap = new HashMap<String, Object>();

        if (ex instanceof BizException) {
            BizException bizException = (BizException) ex;
            String errorMsg = "";
            if (logger.isErrorEnabled())
                errorMsg = bizException.getMessage();
            resultMap.put(ApplicationConstants.TAG_SC, bizException.getCode());
            resultMap.put(ApplicationConstants.TAG_SC_MSG, errorMsg);
        } else {
            StringBuffer buf = new StringBuffer();
            if (logger.isErrorEnabled()) {
                buf.append("<");
                buf.append(ex.toString());
                buf.append(">");
                StringWriter sw = new StringWriter(1024);
                PrintWriter pw = new PrintWriter(sw);
                ex.printStackTrace(pw);
                pw.close();
                buf.append(sw.toString());
            } else {
                buf.append(ex.toString());
            }
            if(logger.isErrorEnabled()){
                logger.error(ex.getMessage());
            }
            resultMap.put(ApplicationConstants.TAG_SC, "-99999");
            resultMap.put(ApplicationConstants.TAG_SC_MSG, buf.toString());
        }
        return resultMap;
    }
}
