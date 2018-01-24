package com.jihelife.service.impl;

import com.jihelife.mapper.DictProvinceMapper;
import com.jihelife.mapper.TSmsRecordMapper;
import com.jihelife.mapper.TSmsSignatureMapper;
import com.jihelife.mapper.TSmsTemplateMapper;
import com.jihelife.pojo.*;
import com.jihelife.service.SmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class SmsServiceImpl implements SmsService{
    @Autowired
    TSmsRecordMapper tSmsRecordMapper;
    @Autowired
    TSmsTemplateMapper tSmsTemplateMapper;
    @Autowired
    TSmsSignatureMapper tSmsSignatureMapper;

    @Override
    public void insertRecord(TSmsRecord tSmsRecord) {
        tSmsRecordMapper.insert(tSmsRecord);
    }

    @Override
    public List<TSmsTemplate> selectTemplateList(int templateId) {
        return tSmsTemplateMapper.selectTemplateList(templateId);
    }

    @Override
    public List<TSmsRecord> querySmsRecord(ReqParameter reqParameter) {
        return tSmsRecordMapper.querySmsRecord(reqParameter);
    }

    @Override
    public TSmsSignature querySignBySite(ReqParameter reqParameter) {
        return tSmsSignatureMapper.querySmsSignBySite(reqParameter);
    }
}
