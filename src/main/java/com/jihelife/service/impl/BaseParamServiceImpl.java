package com.jihelife.service.impl;

import com.jihelife.mapper.SysParametersV12Mapper;
import com.jihelife.pojo.SysParametersV12;
import com.jihelife.service.BaseParamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BaseParamServiceImpl implements BaseParamService{
    @Autowired
    SysParametersV12Mapper sysParametersV12Mapper;

    @Override
    public SysParametersV12 selectByParamKey(String paramKey) {
        return sysParametersV12Mapper.selectByPrimaryKey(paramKey);
    }

    @Override
    public List<SysParametersV12> selectAllParams() {
        return sysParametersV12Mapper.selectAllParams();
    }
}
