package com.jihelife.service.impl;

import com.jihelife.mapper.DictCityMapper;
import com.jihelife.mapper.DictProvinceMapper;
import com.jihelife.pojo.DictCity;
import com.jihelife.pojo.DictProvince;
import com.jihelife.service.AddrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddrServiceImpl implements AddrService{
    @Autowired
    DictProvinceMapper dictProvinceMapper;
    @Autowired
    DictCityMapper dictCityMapper;

    @Override
    public List<DictProvince> selectAllProvince() {
        return dictProvinceMapper.selectAllProvince();
    }

    @Override
    public List<DictCity> selectCityByProId(int provinceId) {
        return dictCityMapper.selectCityByProId(provinceId);
    }
}
