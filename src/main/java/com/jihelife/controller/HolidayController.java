package com.jihelife.controller;


import com.jihelife.constants.ApplicationConstants;
import com.jihelife.service.HolidayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value="/base/h5/holiday/v1")
public class HolidayController extends BaseController{

    @Autowired
    HolidayService holidayService;

    @RequestMapping(value = "queryHolidayAfterToday",method = RequestMethod.GET,produces = "application/json;charset=UTF-8")
    @ResponseBody
    public Map<String,Object> queryHolidayAfterToday(){
        Map<String,Object> resultMap=new HashMap<>();
        resultMap.put(ApplicationConstants.TAG_DATA,holidayService.queryHolidayAfterToday());
        resultMap.put(ApplicationConstants.TAG_SC,ApplicationConstants.SC_OK);
        return resultMap;
    }
}
