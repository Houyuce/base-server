package com.jihelife.service;

import com.jihelife.pojo.SysParametersV12;

import java.util.List;

public interface BaseParamService {
    SysParametersV12 selectByParamKey(String paramKey);

    List<SysParametersV12> selectAllParams();
}
