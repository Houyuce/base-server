package com.jihelife.pojo;

import java.util.Date;

public class DictHoliday {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dict_holiday.holiday_type
     *
     * @mbg.generated Wed Jan 24 15:01:54 CST 2018
     */
    private String holidayType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dict_holiday.holiday
     *
     * @mbg.generated Wed Jan 24 15:01:54 CST 2018
     */
    private Date holiday;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dict_holiday.holiday_desc
     *
     * @mbg.generated Wed Jan 24 15:01:54 CST 2018
     */
    private String holidayDesc;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dict_holiday.holiday_type
     *
     * @return the value of dict_holiday.holiday_type
     *
     * @mbg.generated Wed Jan 24 15:01:54 CST 2018
     */
    public String getHolidayType() {
        return holidayType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dict_holiday.holiday_type
     *
     * @param holidayType the value for dict_holiday.holiday_type
     *
     * @mbg.generated Wed Jan 24 15:01:54 CST 2018
     */
    public void setHolidayType(String holidayType) {
        this.holidayType = holidayType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dict_holiday.holiday
     *
     * @return the value of dict_holiday.holiday
     *
     * @mbg.generated Wed Jan 24 15:01:54 CST 2018
     */
    public Date getHoliday() {
        return holiday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dict_holiday.holiday
     *
     * @param holiday the value for dict_holiday.holiday
     *
     * @mbg.generated Wed Jan 24 15:01:54 CST 2018
     */
    public void setHoliday(Date holiday) {
        this.holiday = holiday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dict_holiday.holiday_desc
     *
     * @return the value of dict_holiday.holiday_desc
     *
     * @mbg.generated Wed Jan 24 15:01:54 CST 2018
     */
    public String getHolidayDesc() {
        return holidayDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dict_holiday.holiday_desc
     *
     * @param holidayDesc the value for dict_holiday.holiday_desc
     *
     * @mbg.generated Wed Jan 24 15:01:54 CST 2018
     */
    public void setHolidayDesc(String holidayDesc) {
        this.holidayDesc = holidayDesc;
    }
}