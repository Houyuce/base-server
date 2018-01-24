package com.jihelife.service.impl;

import com.jihelife.mapper.DictHolidayMapper;
import com.jihelife.pojo.DictHoliday;
import com.jihelife.service.HolidayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class HolidayServiceImpl implements HolidayService{

    @Autowired
    DictHolidayMapper dictHolidayMapper;

    @Override
    public List<DictHoliday> queryHolidayAfterToday() {
        return dictHolidayMapper.queryHolidayAfterToday(new Date());
    }
}
