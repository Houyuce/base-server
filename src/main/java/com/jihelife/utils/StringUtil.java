package com.jihelife.utils;

import java.util.Random;

/**
 * Created by hutiejiong on 2016/12/17 0017.
 */
public class StringUtil {

    /**
     * 判断字符串是否是整数
     * @param str
     * @return
     */
    public static boolean isNumeric(String str){
        if( null==str)
            return false;

        if(str.trim().matches("\\d*")){
            return true;
        }
        else{
            return false;
        }
    }


    /**
     * 生成随机字符串
     * @param length
     * @return
     */
    public static String getRandomString(int length) { //length表示生成字符串的长度
        String base = "abcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < length; i++) {
            int number = random.nextInt(base.length());
            sb.append(base.charAt(number));
        }
        return sb.toString();
    }


    /**
     * 字符串第bpos到epos位的字符用星号代替
     * @param org
     * @param bpos
     * @param epos
     * @return
     */
    public static String replaceString(String org, int bpos,int epos)
    {
        if( null == org )
            return null;
        if( bpos >= org.length() )
            return org;
        bpos = bpos<0?0:bpos;
        epos = epos>org.length()?org.length()-1:epos;
        char[] cs = org.toCharArray();
        for (int i = bpos; i <= epos; i++)
        {
            cs[i] = '*';
        }
        return String.valueOf(cs);
    }


    /**
     * 组合host和path ，删除中间多余斜杠
     * @param host
     * @param url
     * @return
     */
    public static String combineURL(String host,String url){

        if( null == url || url.startsWith("http://") )
            return url;
        else{
            if( host.endsWith("/")  && url.startsWith("/"))
                return host+url.substring(1);
            else if( !host.endsWith("/")  && !url.startsWith("/"))
                return host+"/"+url;
            else
                return host+url;
        }
    }
}
