package com.jihelife.controller;

/**
 * Created by hutiejiong on 2015/6/3 0003.
 */

import org.springframework.util.StringUtils;

import java.beans.PropertyEditorSupport;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//Date 类型数据解析
public class DateParamParser extends PropertyEditorSupport {

    private static final DateFormat DATEFORMAT = new SimpleDateFormat("yyyy-MM-dd");
    private static final DateFormat TIMEFORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    private static final DateFormat DATEFORMAT2 = new SimpleDateFormat("MM/dd/yyyy");
    private static final DateFormat TIMEFORMAT2 = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");

    private DateFormat dateFormat;
    private boolean allowEmpty = true;

    public DateParamParser() {
    }

    public DateParamParser(DateFormat dateFormat) {
        this.dateFormat = dateFormat;
    }

    public DateParamParser(DateFormat dateFormat, boolean allowEmpty) {
        this.dateFormat = dateFormat;
        this.allowEmpty = allowEmpty;
    }

    /**
     * Parse the Date from the given text, using the specified DateFormat.
     */
    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        if (this.allowEmpty && !StringUtils.hasText(text)) {
            // Treat empty String as null value.
            setValue(null);
        } else {
            try {
                if(this.dateFormat != null)
                    setValue(this.dateFormat.parse(text));
                else {
                    if(text.contains("-")) {
                        if (text.contains(":"))
                            setValue(TIMEFORMAT.parse(text));
                        else
                            setValue(DATEFORMAT.parse(text));
                    }
                    else if(text.contains("/")) {
                            if (text.contains(":"))
                                setValue(TIMEFORMAT2.parse(text));
                            else
                                setValue(DATEFORMAT2.parse(text));
                        }
                }
            } catch (ParseException ex) {
                throw new IllegalArgumentException("Could not parse date: " + ex.getMessage(), ex);
            }
        }
    }

    /**
     * Format the Date as String, using the specified DateFormat.
     */
    @Override
    public String getAsText() {
        Date value = (Date) getValue();
        DateFormat dateFormat = this.dateFormat;
        if(dateFormat == null)
            dateFormat = TIMEFORMAT;
        return (value != null ? dateFormat.format(value) : "");
    }
}