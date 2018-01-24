package com.jihelife.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by maobg on 2015/7/14.
 */
public class DateUtil {

    static ThreadLocal<SimpleDateFormat> threadLocal = new ThreadLocal<SimpleDateFormat>();
    public static String format(Date date){
        SimpleDateFormat dateFormat = (SimpleDateFormat)threadLocal.get();
        if(null == dateFormat){
            dateFormat =  new SimpleDateFormat("yyyy-MM-dd");
            threadLocal.set(dateFormat);
        }
        return dateFormat.format(date);
    }
    public static String format(Date date,String format){
        if(null == format)
            format = "yyyy-MM-dd";
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        return dateFormat.format(date);
    }

    public static String formatDateTime(Date date){
        SimpleDateFormat dateFormat = (SimpleDateFormat)threadLocal.get();
        if(null == dateFormat){
            dateFormat =  new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            threadLocal.set(dateFormat);
        }
        return dateFormat.format(date);
    }


    public static Date parse(String date) throws ParseException {
        SimpleDateFormat dateFormat = (SimpleDateFormat)threadLocal.get();
        if(null == dateFormat){
            dateFormat =  new SimpleDateFormat("yyyy-MM-dd");
            threadLocal.set(dateFormat);
        }
        return dateFormat.parse(date);
    }



    public static Date today() throws ParseException {
        SimpleDateFormat dateFormat = (SimpleDateFormat)threadLocal.get();
        if(null == dateFormat){
            dateFormat =  new SimpleDateFormat("yyyy-MM-dd");
            threadLocal.set(dateFormat);
        }
        return dateFormat.parse(dateFormat.format(new Date()));
    }

    public static Date addDays(Date date,Integer daySpan) {
        String s_date1 = format(date);

        try {
            Date round_date1   = parse(s_date1);

            round_date1.setTime(round_date1.getTime()+ (long)(daySpan*24 * 60 * 60 * 1000) );
            return round_date1;

        } catch (ParseException e) {

        }
        return date;
    }

    public static Integer day(Date date){
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        return cal.get(Calendar.DATE);
    };

    public static Integer month(Date date){
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        return cal.get(Calendar.MONTH) + 1;
    }

    public static Integer year(Date date){
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        return cal.get(Calendar.YEAR);
    }

    public static Integer dayspan(Date date1, Date date2) {
        String s_date1 = format(date1);
        String s_date2 =  format(date2);

        try {
            Date round_date1   = parse(s_date1);
            Date round_date2   = parse(s_date2);
            return (int) Math.abs( (round_date2.getTime() - round_date1.getTime()) / (24 * 60 * 60 * 1000) );
        } catch (ParseException e) {

        }
        return 0;
    }

}
