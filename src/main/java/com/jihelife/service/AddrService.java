package com.jihelife.service;


import com.jihelife.pojo.DictCity;
import com.jihelife.pojo.DictProvince;

import java.util.List;

public interface AddrService {
    /*查询所有省份*/
    List<DictProvince> selectAllProvince();
    /*根据省份Id查询所属城市*/
    List<DictCity> selectCityByProId(int provinceId);
}
