package com.jihelife.controller;

import com.jihelife.boot.config.ApplicationProperties;
import com.jihelife.constants.ApplicationConstants;
import com.jihelife.service.AddrService;
import org.apache.http.client.methods.HttpPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value="/base/h5/addr/v1")
public class AddrController extends BaseController{
    @Autowired
    AddrService addrService;
    @Autowired
    ApplicationProperties applicationProperties;

    @RequestMapping(value = "queryAllProvince",method = RequestMethod.GET,produces = "application/json;charset=UTF-8")
    @ResponseBody
    public Map<String,Object> queryAllProvince(){
        Map<String,Object> resultMap=new HashMap<>();
        resultMap.put(ApplicationConstants.TAG_DATA,addrService.selectAllProvince());
        resultMap.put(ApplicationConstants.TAG_SC,ApplicationConstants.SC_OK);
        return resultMap;
    }

    @RequestMapping(value = "/queryCityByProId/{provinceId}",method = RequestMethod.GET,produces = "application/json;charset=UTF-8")
    @ResponseBody
    public Map<String,Object> queryCityByProId(@PathVariable(value = "provinceId") int provinceId){
        Map<String,Object> resultMap=new HashMap<>();
        resultMap.put(ApplicationConstants.TAG_DATA,addrService.selectCityByProId(provinceId));
        resultMap.put(ApplicationConstants.TAG_SC,ApplicationConstants.SC_OK);
        return resultMap;
    }
}
