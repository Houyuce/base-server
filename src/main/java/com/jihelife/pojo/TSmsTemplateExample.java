package com.jihelife.pojo;

import java.util.ArrayList;
import java.util.List;

public class TSmsTemplateExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_sms_template
     *
     * @mbg.generated Mon Jan 22 15:31:24 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_sms_template
     *
     * @mbg.generated Mon Jan 22 15:31:24 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_sms_template
     *
     * @mbg.generated Mon Jan 22 15:31:24 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sms_template
     *
     * @mbg.generated Mon Jan 22 15:31:24 CST 2018
     */
    public TSmsTemplateExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sms_template
     *
     * @mbg.generated Mon Jan 22 15:31:24 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sms_template
     *
     * @mbg.generated Mon Jan 22 15:31:24 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sms_template
     *
     * @mbg.generated Mon Jan 22 15:31:24 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sms_template
     *
     * @mbg.generated Mon Jan 22 15:31:24 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sms_template
     *
     * @mbg.generated Mon Jan 22 15:31:24 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sms_template
     *
     * @mbg.generated Mon Jan 22 15:31:24 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sms_template
     *
     * @mbg.generated Mon Jan 22 15:31:24 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sms_template
     *
     * @mbg.generated Mon Jan 22 15:31:24 CST 2018
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sms_template
     *
     * @mbg.generated Mon Jan 22 15:31:24 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sms_template
     *
     * @mbg.generated Mon Jan 22 15:31:24 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_sms_template
     *
     * @mbg.generated Mon Jan 22 15:31:24 CST 2018
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andTemplateIdIsNull() {
            addCriterion("template_id is null");
            return (Criteria) this;
        }

        public Criteria andTemplateIdIsNotNull() {
            addCriterion("template_id is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateIdEqualTo(Integer value) {
            addCriterion("template_id =", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdNotEqualTo(Integer value) {
            addCriterion("template_id <>", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdGreaterThan(Integer value) {
            addCriterion("template_id >", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("template_id >=", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdLessThan(Integer value) {
            addCriterion("template_id <", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdLessThanOrEqualTo(Integer value) {
            addCriterion("template_id <=", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdIn(List<Integer> values) {
            addCriterion("template_id in", values, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdNotIn(List<Integer> values) {
            addCriterion("template_id not in", values, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdBetween(Integer value1, Integer value2) {
            addCriterion("template_id between", value1, value2, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdNotBetween(Integer value1, Integer value2) {
            addCriterion("template_id not between", value1, value2, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateNameIsNull() {
            addCriterion("template_name is null");
            return (Criteria) this;
        }

        public Criteria andTemplateNameIsNotNull() {
            addCriterion("template_name is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateNameEqualTo(String value) {
            addCriterion("template_name =", value, "templateName");
            return (Criteria) this;
        }

        public Criteria andTemplateNameNotEqualTo(String value) {
            addCriterion("template_name <>", value, "templateName");
            return (Criteria) this;
        }

        public Criteria andTemplateNameGreaterThan(String value) {
            addCriterion("template_name >", value, "templateName");
            return (Criteria) this;
        }

        public Criteria andTemplateNameGreaterThanOrEqualTo(String value) {
            addCriterion("template_name >=", value, "templateName");
            return (Criteria) this;
        }

        public Criteria andTemplateNameLessThan(String value) {
            addCriterion("template_name <", value, "templateName");
            return (Criteria) this;
        }

        public Criteria andTemplateNameLessThanOrEqualTo(String value) {
            addCriterion("template_name <=", value, "templateName");
            return (Criteria) this;
        }

        public Criteria andTemplateNameLike(String value) {
            addCriterion("template_name like", value, "templateName");
            return (Criteria) this;
        }

        public Criteria andTemplateNameNotLike(String value) {
            addCriterion("template_name not like", value, "templateName");
            return (Criteria) this;
        }

        public Criteria andTemplateNameIn(List<String> values) {
            addCriterion("template_name in", values, "templateName");
            return (Criteria) this;
        }

        public Criteria andTemplateNameNotIn(List<String> values) {
            addCriterion("template_name not in", values, "templateName");
            return (Criteria) this;
        }

        public Criteria andTemplateNameBetween(String value1, String value2) {
            addCriterion("template_name between", value1, value2, "templateName");
            return (Criteria) this;
        }

        public Criteria andTemplateNameNotBetween(String value1, String value2) {
            addCriterion("template_name not between", value1, value2, "templateName");
            return (Criteria) this;
        }

        public Criteria andTemplateNumIsNull() {
            addCriterion("template_num is null");
            return (Criteria) this;
        }

        public Criteria andTemplateNumIsNotNull() {
            addCriterion("template_num is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateNumEqualTo(String value) {
            addCriterion("template_num =", value, "templateNum");
            return (Criteria) this;
        }

        public Criteria andTemplateNumNotEqualTo(String value) {
            addCriterion("template_num <>", value, "templateNum");
            return (Criteria) this;
        }

        public Criteria andTemplateNumGreaterThan(String value) {
            addCriterion("template_num >", value, "templateNum");
            return (Criteria) this;
        }

        public Criteria andTemplateNumGreaterThanOrEqualTo(String value) {
            addCriterion("template_num >=", value, "templateNum");
            return (Criteria) this;
        }

        public Criteria andTemplateNumLessThan(String value) {
            addCriterion("template_num <", value, "templateNum");
            return (Criteria) this;
        }

        public Criteria andTemplateNumLessThanOrEqualTo(String value) {
            addCriterion("template_num <=", value, "templateNum");
            return (Criteria) this;
        }

        public Criteria andTemplateNumLike(String value) {
            addCriterion("template_num like", value, "templateNum");
            return (Criteria) this;
        }

        public Criteria andTemplateNumNotLike(String value) {
            addCriterion("template_num not like", value, "templateNum");
            return (Criteria) this;
        }

        public Criteria andTemplateNumIn(List<String> values) {
            addCriterion("template_num in", values, "templateNum");
            return (Criteria) this;
        }

        public Criteria andTemplateNumNotIn(List<String> values) {
            addCriterion("template_num not in", values, "templateNum");
            return (Criteria) this;
        }

        public Criteria andTemplateNumBetween(String value1, String value2) {
            addCriterion("template_num between", value1, value2, "templateNum");
            return (Criteria) this;
        }

        public Criteria andTemplateNumNotBetween(String value1, String value2) {
            addCriterion("template_num not between", value1, value2, "templateNum");
            return (Criteria) this;
        }

        public Criteria andTemplateContentIsNull() {
            addCriterion("template_content is null");
            return (Criteria) this;
        }

        public Criteria andTemplateContentIsNotNull() {
            addCriterion("template_content is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateContentEqualTo(String value) {
            addCriterion("template_content =", value, "templateContent");
            return (Criteria) this;
        }

        public Criteria andTemplateContentNotEqualTo(String value) {
            addCriterion("template_content <>", value, "templateContent");
            return (Criteria) this;
        }

        public Criteria andTemplateContentGreaterThan(String value) {
            addCriterion("template_content >", value, "templateContent");
            return (Criteria) this;
        }

        public Criteria andTemplateContentGreaterThanOrEqualTo(String value) {
            addCriterion("template_content >=", value, "templateContent");
            return (Criteria) this;
        }

        public Criteria andTemplateContentLessThan(String value) {
            addCriterion("template_content <", value, "templateContent");
            return (Criteria) this;
        }

        public Criteria andTemplateContentLessThanOrEqualTo(String value) {
            addCriterion("template_content <=", value, "templateContent");
            return (Criteria) this;
        }

        public Criteria andTemplateContentLike(String value) {
            addCriterion("template_content like", value, "templateContent");
            return (Criteria) this;
        }

        public Criteria andTemplateContentNotLike(String value) {
            addCriterion("template_content not like", value, "templateContent");
            return (Criteria) this;
        }

        public Criteria andTemplateContentIn(List<String> values) {
            addCriterion("template_content in", values, "templateContent");
            return (Criteria) this;
        }

        public Criteria andTemplateContentNotIn(List<String> values) {
            addCriterion("template_content not in", values, "templateContent");
            return (Criteria) this;
        }

        public Criteria andTemplateContentBetween(String value1, String value2) {
            addCriterion("template_content between", value1, value2, "templateContent");
            return (Criteria) this;
        }

        public Criteria andTemplateContentNotBetween(String value1, String value2) {
            addCriterion("template_content not between", value1, value2, "templateContent");
            return (Criteria) this;
        }

        public Criteria andTemplateMarkIsNull() {
            addCriterion("template_mark is null");
            return (Criteria) this;
        }

        public Criteria andTemplateMarkIsNotNull() {
            addCriterion("template_mark is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateMarkEqualTo(String value) {
            addCriterion("template_mark =", value, "templateMark");
            return (Criteria) this;
        }

        public Criteria andTemplateMarkNotEqualTo(String value) {
            addCriterion("template_mark <>", value, "templateMark");
            return (Criteria) this;
        }

        public Criteria andTemplateMarkGreaterThan(String value) {
            addCriterion("template_mark >", value, "templateMark");
            return (Criteria) this;
        }

        public Criteria andTemplateMarkGreaterThanOrEqualTo(String value) {
            addCriterion("template_mark >=", value, "templateMark");
            return (Criteria) this;
        }

        public Criteria andTemplateMarkLessThan(String value) {
            addCriterion("template_mark <", value, "templateMark");
            return (Criteria) this;
        }

        public Criteria andTemplateMarkLessThanOrEqualTo(String value) {
            addCriterion("template_mark <=", value, "templateMark");
            return (Criteria) this;
        }

        public Criteria andTemplateMarkLike(String value) {
            addCriterion("template_mark like", value, "templateMark");
            return (Criteria) this;
        }

        public Criteria andTemplateMarkNotLike(String value) {
            addCriterion("template_mark not like", value, "templateMark");
            return (Criteria) this;
        }

        public Criteria andTemplateMarkIn(List<String> values) {
            addCriterion("template_mark in", values, "templateMark");
            return (Criteria) this;
        }

        public Criteria andTemplateMarkNotIn(List<String> values) {
            addCriterion("template_mark not in", values, "templateMark");
            return (Criteria) this;
        }

        public Criteria andTemplateMarkBetween(String value1, String value2) {
            addCriterion("template_mark between", value1, value2, "templateMark");
            return (Criteria) this;
        }

        public Criteria andTemplateMarkNotBetween(String value1, String value2) {
            addCriterion("template_mark not between", value1, value2, "templateMark");
            return (Criteria) this;
        }

        public Criteria andSignIdIsNull() {
            addCriterion("sign_id is null");
            return (Criteria) this;
        }

        public Criteria andSignIdIsNotNull() {
            addCriterion("sign_id is not null");
            return (Criteria) this;
        }

        public Criteria andSignIdEqualTo(Integer value) {
            addCriterion("sign_id =", value, "signId");
            return (Criteria) this;
        }

        public Criteria andSignIdNotEqualTo(Integer value) {
            addCriterion("sign_id <>", value, "signId");
            return (Criteria) this;
        }

        public Criteria andSignIdGreaterThan(Integer value) {
            addCriterion("sign_id >", value, "signId");
            return (Criteria) this;
        }

        public Criteria andSignIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sign_id >=", value, "signId");
            return (Criteria) this;
        }

        public Criteria andSignIdLessThan(Integer value) {
            addCriterion("sign_id <", value, "signId");
            return (Criteria) this;
        }

        public Criteria andSignIdLessThanOrEqualTo(Integer value) {
            addCriterion("sign_id <=", value, "signId");
            return (Criteria) this;
        }

        public Criteria andSignIdIn(List<Integer> values) {
            addCriterion("sign_id in", values, "signId");
            return (Criteria) this;
        }

        public Criteria andSignIdNotIn(List<Integer> values) {
            addCriterion("sign_id not in", values, "signId");
            return (Criteria) this;
        }

        public Criteria andSignIdBetween(Integer value1, Integer value2) {
            addCriterion("sign_id between", value1, value2, "signId");
            return (Criteria) this;
        }

        public Criteria andSignIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sign_id not between", value1, value2, "signId");
            return (Criteria) this;
        }

        public Criteria andHotelIdIsNull() {
            addCriterion("hotel_id is null");
            return (Criteria) this;
        }

        public Criteria andHotelIdIsNotNull() {
            addCriterion("hotel_id is not null");
            return (Criteria) this;
        }

        public Criteria andHotelIdEqualTo(Integer value) {
            addCriterion("hotel_id =", value, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdNotEqualTo(Integer value) {
            addCriterion("hotel_id <>", value, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdGreaterThan(Integer value) {
            addCriterion("hotel_id >", value, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("hotel_id >=", value, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdLessThan(Integer value) {
            addCriterion("hotel_id <", value, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdLessThanOrEqualTo(Integer value) {
            addCriterion("hotel_id <=", value, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdIn(List<Integer> values) {
            addCriterion("hotel_id in", values, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdNotIn(List<Integer> values) {
            addCriterion("hotel_id not in", values, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdBetween(Integer value1, Integer value2) {
            addCriterion("hotel_id between", value1, value2, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdNotBetween(Integer value1, Integer value2) {
            addCriterion("hotel_id not between", value1, value2, "hotelId");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_sms_template
     *
     * @mbg.generated do_not_delete_during_merge Mon Jan 22 15:31:24 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_sms_template
     *
     * @mbg.generated Mon Jan 22 15:31:24 CST 2018
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}