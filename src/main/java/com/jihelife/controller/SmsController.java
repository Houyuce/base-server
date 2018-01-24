package com.jihelife.controller;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.aliyuncs.dysmsapi.model.v20170525.QuerySendDetailsResponse;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import com.aliyuncs.exceptions.ClientException;
import com.jihelife.base.BizException;
import com.jihelife.constants.ApplicationConstants;
import com.jihelife.pojo.ReqParameter;
import com.jihelife.pojo.TSmsRecord;
import com.jihelife.pojo.TSmsTemplate;
import com.jihelife.service.SmsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


/**
 * Created by houyc on 2017/12/28.
 */
@RestController
@RequestMapping(value="/base")
public class SmsController extends BaseController{
    public static final Logger LOGGER = LoggerFactory.getLogger(SmsController.class);

    @Autowired
    SmsService smsService;


    @RequestMapping(value = "/inter/sms/v1/sendSms",method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
    @ResponseBody
    public Map<String,Object> sendSms() throws  BizException {
        Map<String,Object> resultMap=new HashMap<>();
        ReqParameter reqParameter=RequestFacade.getParameters();
        if(reqParameter!=null){
            /*解析json截取多余字符*/
            String templateParam=reqParameter.getTemplateJson();
            Map<String,String> map = JSON.parseObject(templateParam,Map.class);
            Set set = map.keySet();
            Iterator it = set.iterator();
            while(it.hasNext()){
                String key = (String) it.next();
                String value=map.get(key);
                String newValue;
                if(value.length()>20){
                    newValue=value.substring(0,20);
                }else{
                    newValue=value;
                }
                map.put(key,newValue);
            }
            String templateJson=JSON.toJSONString(map);
             /*配短信参数*/
            List<TSmsTemplate> templateList=smsService.selectTemplateList(reqParameter.getTemplateId());
            TSmsTemplate template=null;
           if(reqParameter.getHotelId()==0){
               for(int i=0;i<templateList.size();i++){
                   if(templateList.get(i).getHotelId()==0){
                       template=templateList.get(i);
                   }
               }
           }else{
               if(templateList!=null&&templateList.size()>0){
                   boolean mark=false;
                   for(int i=0;i<templateList.size();i++){
                       if(templateList.get(i).getHotelId()==reqParameter.getHotelId()){
                           template=templateList.get(i);
                           mark=true;
                       }
                   }
                   if(!mark){
                       for(int i=0;i<templateList.size();i++){
                           if(templateList.get(i).getHotelId()==0){
                               template=templateList.get(i);
                           }
                       }
                   }
               }else{
                   throw new BizException(BizException.CODE_LACK_PARM,BizException.MSG_LACK_PARM);
               }
           }
           if("y".equals(template.getTemplateMark())){
               Map<String,Object> sendParam=new HashMap<>();
               sendParam.put("phone",reqParameter.getAccountPhone());
               sendParam.put("signName",smsService.querySignBySite(reqParameter).getSignatureName());
               sendParam.put("templateNum",template.getTemplateNum());
               sendParam.put("templateJson",templateJson);
               //发短信
               SendSmsResponse response = null;
               try {
                   response = SmsDemo.sendSms(sendParam);
               } catch (ClientException e) {
                   LOGGER.error("短信发送失败");
                   e.printStackTrace();
               }
                /* Thread.sleep(3000L);*/
               //查明细，插入记录表
               if(response.getCode() != null && response.getCode().equals("OK")) {
                   resultMap.put(ApplicationConstants.TAG_SC,ApplicationConstants.SC_OK);
                   QuerySendDetailsResponse querySendDetailsResponse = null;
                   try {
                       querySendDetailsResponse = SmsDemo.querySendDetails(response.getBizId(),reqParameter.getAccountPhone());
                   } catch (ClientException e) {
                       LOGGER.error("返回响应信息有误");
                       e.printStackTrace();
                   }
                   for(QuerySendDetailsResponse.SmsSendDetailDTO smsSendDetailDTO : querySendDetailsResponse.getSmsSendDetailDTOs())
                   {
                       TSmsRecord tSmsRecord=new TSmsRecord();
                       tSmsRecord.setSite(reqParameter.getSite());
                       tSmsRecord.setUserId(reqParameter.getUserid());
                       tSmsRecord.setAccountPhone(smsSendDetailDTO.getPhoneNum());
                       tSmsRecord.setGroupId(reqParameter.getGroupId());
                       tSmsRecord.setHotelId(reqParameter.getHotelId());
                       tSmsRecord.setTemplateId(reqParameter.getTemplateId());
                       if(smsSendDetailDTO.getSendStatus()!=2){
                           tSmsRecord.setRecordStatus(1);
                       }else{
                           if(smsSendDetailDTO.getErrCode()!=""&&smsSendDetailDTO.getErrCode()!=null){
                               tSmsRecord.setErrorCode(smsSendDetailDTO.getErrCode());
                           }
                           tSmsRecord.setRecordStatus(2);
                       }

                       tSmsRecord.setSendContent(smsSendDetailDTO.getContent());

                       SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                       Date date=null;
                       try {
                           date=sdf.parse(smsSendDetailDTO.getSendDate());
                       } catch (ParseException e) {
                           e.printStackTrace();
                       }
                       tSmsRecord.setSendTime(date);
                       smsService.insertRecord(tSmsRecord);
                   }
               }else {
                   TSmsRecord tSmsRecord=new TSmsRecord();
                   tSmsRecord.setSite(reqParameter.getSite());
                   tSmsRecord.setUserId(reqParameter.getUserid());
                   tSmsRecord.setAccountPhone(reqParameter.getAccountPhone());
                   tSmsRecord.setGroupId(reqParameter.getGroupId());
                   tSmsRecord.setHotelId(reqParameter.getHotelId());
                   tSmsRecord.setTemplateId(reqParameter.getTemplateId());
                   tSmsRecord.setRecordStatus(2);
                   tSmsRecord.setErrorCode(response.getCode());
                   tSmsRecord.setSendTime(new Date());
                   smsService.insertRecord(tSmsRecord);
               }
           }else{
               resultMap.put(ApplicationConstants.TAG_SC,ApplicationConstants.SC_OK);
           }
        }else{
            LOGGER.error("参数为空");
        }
       return resultMap;
    }


    @RequestMapping(value = "/bms/sms/v1/querySmsRecord",method = RequestMethod.GET,produces = "application/json;charset=UTF-8")
    @ResponseBody
    public Map<String,Object>  querySmsRecord(){
        Map<String,Object> resultMap=new HashMap<>();
        ReqParameter reqParameter=RequestFacade.getParameters();
        if(reqParameter!=null){
            List<TSmsRecord> l=smsService.querySmsRecord(reqParameter);
            resultMap.put(ApplicationConstants.TAG_DATA,l);
        }else {
            LOGGER.error("参数为空");
        }
        resultMap.put(ApplicationConstants.TAG_SC,ApplicationConstants.SC_OK);
        return resultMap;
    }


}