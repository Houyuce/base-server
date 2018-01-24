package com.jihelife.controller;

import com.jihelife.constants.ApplicationConstants;
import com.jihelife.pojo.ReqParameter;
import com.jihelife.pojo.SysParametersV12;
import com.jihelife.service.BaseParamService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value="/base/inter/baseParam/v1")
public class BaseParamController extends BaseController{
    public static final Logger LOGGER = LoggerFactory.getLogger(SmsController.class);

    @Autowired
    BaseParamService baseParamService;


    @RequestMapping(value = "queryBaseParamsByKey",method = RequestMethod.GET,produces = "application/json;charset=UTF-8")
    @ResponseBody
    public Map<String,Object> queryBaseParamsByKey(){
        Map<String,Object> resultMap=new HashMap<>();
        ReqParameter reqParameter=RequestFacade.getParameters();
        resultMap.put(ApplicationConstants.TAG_DATA,baseParamService.selectByParamKey(reqParameter.getParamKey()));
        resultMap.put(ApplicationConstants.TAG_SC,ApplicationConstants.SC_OK);
        return  resultMap;
    }


    @RequestMapping(value = "queryAllBaseParams",method = RequestMethod.GET,produces = "application/json;charset=UTF-8")
    @ResponseBody
    public Map<String,Object> queryAllBaseParams(){
        Map<String,Object> resultMap=new HashMap<>();
        List<SysParametersV12> list=baseParamService.selectAllParams();
        resultMap.put(ApplicationConstants.TAG_DATA,list);
        resultMap.put(ApplicationConstants.TAG_SC,ApplicationConstants.SC_OK);
        return  resultMap;
    }



}
