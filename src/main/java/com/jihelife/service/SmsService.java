package com.jihelife.service;


import com.jihelife.pojo.*;

import java.util.List;
import java.util.Map;

public interface SmsService {
    /*插入短信记录*/
     void insertRecord(TSmsRecord tSmsRecord);
    /*根据id查询短信模板List*/
     List<TSmsTemplate> selectTemplateList(int templateId);
     /*根据条件查询记录*/
     List<TSmsRecord> querySmsRecord(ReqParameter reqParameter);
     /*根据site查询签名*/
     TSmsSignature querySignBySite(ReqParameter reqParameter);
}
