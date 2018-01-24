package com.jihelife.service;

import com.jihelife.pojo.DictHoliday;

import java.util.List;

public interface HolidayService {

    List<DictHoliday> queryHolidayAfterToday();
}
