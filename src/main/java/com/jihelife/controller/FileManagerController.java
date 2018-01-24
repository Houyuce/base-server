package com.jihelife.controller;



import com.alibaba.fastjson.JSON;
import com.jihelife.boot.config.ApplicationProperties;
import com.jihelife.constants.ApplicationConstants;
import com.jihelife.pojo.RespResourceId;
import com.qiniu.http.Response;
import com.qiniu.storage.UploadManager;
import com.qiniu.util.Auth;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;


import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.math.BigInteger;
import java.net.URISyntaxException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;

/**
 * Created by hutiejiong on 2015/5/30 0030.
 */

@Controller
public class FileManagerController extends BaseController {

    //@Autowired
    @Autowired
    ApplicationProperties applicationProperties;

    private Logger logger = LoggerFactory.getLogger(FileManagerController.class);

    // 文件允许格式
    private String[] allowFiles = {".gif", ".png", ".jpg", ".jpeg", ".bmp"};

    //检查文件后缀，判断是否为图片类型
    private boolean checkFileType(String fileName) {
        Iterator<String> type = Arrays.asList(this.allowFiles).iterator();
        while (type.hasNext()) {
            String ext = type.next();
            if (fileName.toLowerCase().endsWith(ext)) {
                return true;
            }
        }
        return false;
    }


/*    @RequestMapping(value = "/base/savePicture",method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
    public ModelAndView testUpload(HttpServletRequest request) throws IOException, NoSuchAlgorithmException, URISyntaxException {
        ModelAndView mav=new ModelAndView();
        Map<String, Object> resMap = new HashMap<String, Object>();
        MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;

        //页面控件的文件流
        MultipartFile multipartFile = multipartRequest.getFile("fileID");
        System.out.println(multipartFile.getBytes());
       // 获取文件名及后缀
        String fileName = multipartFile.getOriginalFilename();
        String suffix = fileName.substring(fileName.lastIndexOf("."));

        if (checkFileType(suffix) ){

            //抽取摘要
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(multipartFile.getBytes());
            byte[] digesta=messageDigest.digest();

            BigInteger bigInteger = new BigInteger(1, digesta);
            String  uri= bigInteger.toString(16);
            System.out.println("======"+uri);
            RespResourceId  respResourceId= getResouceId(uri);
            if( null != respResourceId ) {
                if (ApplicationConstants.RESOURCE_SUCCESS.equals(respResourceId.getSc())) {

                    UploadManager uploadManager = new UploadManager();
                    Auth auth = Auth.create(applicationProperties.getQiniu_access_key(),
                            applicationProperties.getQiniu_secret_key());
                    String token = auth.uploadToken(applicationProperties.getQiniu_bucket_name());

                    Response qiniu_resp = uploadManager.put(multipartFile.getBytes(), respResourceId.getData(), token);
                }
                resMap.put(ApplicationConstants.TAG_SC, ApplicationConstants.SC_OK);
                resMap.put(ApplicationConstants.TAG_DATA , respResourceId.getData());
            }
        }
        mav.setViewName("success");
        mav.addObject("map",resMap);
        return mav;
    }*/

    @ResponseBody
    @RequestMapping(value = "/base/h5/v1/saveImg",method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
    public Map<String, Object> testUpload(HttpServletRequest request) throws IOException, NoSuchAlgorithmException, URISyntaxException {

        Map<String, Object> resMap = new HashMap<String, Object>();
        MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;

        //页面控件的文件流
        MultipartFile multipartFile = multipartRequest.getFile("file");
        // 获取文件名及后缀
        String fileName = multipartFile.getOriginalFilename();
        String suffix = fileName.substring(fileName.lastIndexOf("."));
        if (checkFileType(suffix) ){

            //抽取摘要
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(multipartFile.getBytes());
            byte[] digesta=messageDigest.digest();

            BigInteger bigInteger = new BigInteger(1, digesta);
            String  uri= bigInteger.toString(16);
            RespResourceId  respResourceId= getResouceId(uri);
            if( null != respResourceId ) {
                if (ApplicationConstants.RESOURCE_SUCCESS.equals(respResourceId.getSc())) {

                    UploadManager uploadManager = new UploadManager();
                    Auth auth = Auth.create(applicationProperties.getQiniu_access_key(),
                            applicationProperties.getQiniu_secret_key());
                    String token = auth.uploadToken(applicationProperties.getQiniu_bucket_name());

                    Response qiniu_resp = uploadManager.put(multipartFile.getBytes(), respResourceId.getData(), token);
                }
                resMap.put(ApplicationConstants.TAG_SC, ApplicationConstants.SC_OK);
                resMap.put(ApplicationConstants.TAG_DATA , respResourceId.getData());
            }
        }
      return resMap;
    }


    /**
     * 调用resouceid service服务获取资源图片唯一id
     * @param uri
     * @return
     */
    private RespResourceId getResouceId(String uri) throws URISyntaxException {

        if( null == uri || "".equals(uri) )
            return null;


        String resourceIdServiceURL = applicationProperties.getResourceid_service();


        CloseableHttpClient httpclient = HttpClients.createDefault();
        RequestConfig requestConfig = RequestConfig.custom().setSocketTimeout(3000).setConnectTimeout(2000).build();

        HttpPost httpPost = new HttpPost(resourceIdServiceURL);
        httpPost.setConfig(requestConfig);

        String data = "{'uri':'"+uri+"'}";
        logger.debug(data);
        List<NameValuePair> formparams = new ArrayList<NameValuePair>();
        formparams.add(new BasicNameValuePair("data", data));

        UrlEncodedFormEntity entity;
        try {
            entity = new UrlEncodedFormEntity(formparams, "UTF-8");
            httpPost.setEntity(entity);

            HttpResponse httpResponse = httpclient.execute(httpPost);

            HttpEntity httpEntity = httpResponse.getEntity();
            if (httpEntity != null) {
                String responseData = EntityUtils.toString(httpEntity, "UTF-8");
                logger.info("request:uri=" + uri +",| response:" + responseData);

                RespResourceId respResourceId = JSON.parseObject(responseData, RespResourceId.class);

                return respResourceId;

            }
        } catch (Exception e) {
            logger.error("failed in request service: "+resourceIdServiceURL,e);
        }
        finally {
            try{if(null != httpclient) {httpclient.close();httpclient=null;}}catch (Exception e){};
        }
        return null;
    }

}
