package com.jihelife.utils;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author wangpeng@jihelife.com
 * @created 2016/3/9 下午 3:49
 * @lastModified
 * @history
 */
public class CookieUtil {

    // 创建 cookie
    public static Cookie addCookie(String name, String value) {
        Cookie cookie = new Cookie(name, value);
        cookie.setMaxAge(7 * 24 * 60 * 60);
        cookie.setPath("/");
        return cookie;
    }

    // 查询 cookie
    public static Cookie getCookieByName(HttpServletRequest request, String name) {
        Cookie[] cookies = request.getCookies();
        if (null != cookies && cookies.length > 0) {
            for (Cookie cookie : cookies) {
                if (name.equals(cookie.getName())) {
                    return cookie;
                }
            }
        }
        return null;
    }

    // 删除cookie
    public static void delCookieByName(HttpServletRequest request, HttpServletResponse response, String name){
        Cookie[] cookies = request.getCookies();
        if(null != cookies && cookies.length > 0){
            for(Cookie cookie : cookies){
                if(name.equals(cookie.getName())){
                    cookie.setValue(null);
                    cookie.setMaxAge(0);
                    cookie.setPath("/");
                    response.addCookie(cookie);
                }
            }
        }
    }

}
