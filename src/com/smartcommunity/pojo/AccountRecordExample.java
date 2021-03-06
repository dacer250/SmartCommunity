package com.smartcommunity.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AccountRecordExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table account_record
     *
     * @mbggenerated Sat Jan 24 19:27:37 CST 2015
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table account_record
     *
     * @mbggenerated Sat Jan 24 19:27:37 CST 2015
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table account_record
     *
     * @mbggenerated Sat Jan 24 19:27:37 CST 2015
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_record
     *
     * @mbggenerated Sat Jan 24 19:27:37 CST 2015
     */
    public AccountRecordExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_record
     *
     * @mbggenerated Sat Jan 24 19:27:37 CST 2015
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_record
     *
     * @mbggenerated Sat Jan 24 19:27:37 CST 2015
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_record
     *
     * @mbggenerated Sat Jan 24 19:27:37 CST 2015
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_record
     *
     * @mbggenerated Sat Jan 24 19:27:37 CST 2015
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_record
     *
     * @mbggenerated Sat Jan 24 19:27:37 CST 2015
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_record
     *
     * @mbggenerated Sat Jan 24 19:27:37 CST 2015
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_record
     *
     * @mbggenerated Sat Jan 24 19:27:37 CST 2015
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_record
     *
     * @mbggenerated Sat Jan 24 19:27:37 CST 2015
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
     * This method corresponds to the database table account_record
     *
     * @mbggenerated Sat Jan 24 19:27:37 CST 2015
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_record
     *
     * @mbggenerated Sat Jan 24 19:27:37 CST 2015
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table account_record
     *
     * @mbggenerated Sat Jan 24 19:27:37 CST 2015
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andMeteridIsNull() {
            addCriterion("meterid is null");
            return (Criteria) this;
        }

        public Criteria andMeteridIsNotNull() {
            addCriterion("meterid is not null");
            return (Criteria) this;
        }

        public Criteria andMeteridEqualTo(Integer value) {
            addCriterion("meterid =", value, "meterid");
            return (Criteria) this;
        }

        public Criteria andMeteridNotEqualTo(Integer value) {
            addCriterion("meterid <>", value, "meterid");
            return (Criteria) this;
        }

        public Criteria andMeteridGreaterThan(Integer value) {
            addCriterion("meterid >", value, "meterid");
            return (Criteria) this;
        }

        public Criteria andMeteridGreaterThanOrEqualTo(Integer value) {
            addCriterion("meterid >=", value, "meterid");
            return (Criteria) this;
        }

        public Criteria andMeteridLessThan(Integer value) {
            addCriterion("meterid <", value, "meterid");
            return (Criteria) this;
        }

        public Criteria andMeteridLessThanOrEqualTo(Integer value) {
            addCriterion("meterid <=", value, "meterid");
            return (Criteria) this;
        }

        public Criteria andMeteridIn(List<Integer> values) {
            addCriterion("meterid in", values, "meterid");
            return (Criteria) this;
        }

        public Criteria andMeteridNotIn(List<Integer> values) {
            addCriterion("meterid not in", values, "meterid");
            return (Criteria) this;
        }

        public Criteria andMeteridBetween(Integer value1, Integer value2) {
            addCriterion("meterid between", value1, value2, "meterid");
            return (Criteria) this;
        }

        public Criteria andMeteridNotBetween(Integer value1, Integer value2) {
            addCriterion("meterid not between", value1, value2, "meterid");
            return (Criteria) this;
        }

        public Criteria andRoomnumberIsNull() {
            addCriterion("roomnumber is null");
            return (Criteria) this;
        }

        public Criteria andRoomnumberIsNotNull() {
            addCriterion("roomnumber is not null");
            return (Criteria) this;
        }

        public Criteria andRoomnumberEqualTo(String value) {
            addCriterion("roomnumber =", value, "roomnumber");
            return (Criteria) this;
        }

        public Criteria andRoomnumberNotEqualTo(String value) {
            addCriterion("roomnumber <>", value, "roomnumber");
            return (Criteria) this;
        }

        public Criteria andRoomnumberGreaterThan(String value) {
            addCriterion("roomnumber >", value, "roomnumber");
            return (Criteria) this;
        }

        public Criteria andRoomnumberGreaterThanOrEqualTo(String value) {
            addCriterion("roomnumber >=", value, "roomnumber");
            return (Criteria) this;
        }

        public Criteria andRoomnumberLessThan(String value) {
            addCriterion("roomnumber <", value, "roomnumber");
            return (Criteria) this;
        }

        public Criteria andRoomnumberLessThanOrEqualTo(String value) {
            addCriterion("roomnumber <=", value, "roomnumber");
            return (Criteria) this;
        }

        public Criteria andRoomnumberLike(String value) {
            addCriterion("roomnumber like", value, "roomnumber");
            return (Criteria) this;
        }

        public Criteria andRoomnumberNotLike(String value) {
            addCriterion("roomnumber not like", value, "roomnumber");
            return (Criteria) this;
        }

        public Criteria andRoomnumberIn(List<String> values) {
            addCriterion("roomnumber in", values, "roomnumber");
            return (Criteria) this;
        }

        public Criteria andRoomnumberNotIn(List<String> values) {
            addCriterion("roomnumber not in", values, "roomnumber");
            return (Criteria) this;
        }

        public Criteria andRoomnumberBetween(String value1, String value2) {
            addCriterion("roomnumber between", value1, value2, "roomnumber");
            return (Criteria) this;
        }

        public Criteria andRoomnumberNotBetween(String value1, String value2) {
            addCriterion("roomnumber not between", value1, value2, "roomnumber");
            return (Criteria) this;
        }

        public Criteria andDateIsNull() {
            addCriterion("date is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("date is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(Date value) {
            addCriterion("date =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(Date value) {
            addCriterion("date <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(Date value) {
            addCriterion("date >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(Date value) {
            addCriterion("date >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(Date value) {
            addCriterion("date <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(Date value) {
            addCriterion("date <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<Date> values) {
            addCriterion("date in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<Date> values) {
            addCriterion("date not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(Date value1, Date value2) {
            addCriterion("date between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(Date value1, Date value2) {
            addCriterion("date not between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andShouldpayIsNull() {
            addCriterion("shouldpay is null");
            return (Criteria) this;
        }

        public Criteria andShouldpayIsNotNull() {
            addCriterion("shouldpay is not null");
            return (Criteria) this;
        }

        public Criteria andShouldpayEqualTo(Float value) {
            addCriterion("shouldpay =", value, "shouldpay");
            return (Criteria) this;
        }

        public Criteria andShouldpayNotEqualTo(Float value) {
            addCriterion("shouldpay <>", value, "shouldpay");
            return (Criteria) this;
        }

        public Criteria andShouldpayGreaterThan(Float value) {
            addCriterion("shouldpay >", value, "shouldpay");
            return (Criteria) this;
        }

        public Criteria andShouldpayGreaterThanOrEqualTo(Float value) {
            addCriterion("shouldpay >=", value, "shouldpay");
            return (Criteria) this;
        }

        public Criteria andShouldpayLessThan(Float value) {
            addCriterion("shouldpay <", value, "shouldpay");
            return (Criteria) this;
        }

        public Criteria andShouldpayLessThanOrEqualTo(Float value) {
            addCriterion("shouldpay <=", value, "shouldpay");
            return (Criteria) this;
        }

        public Criteria andShouldpayIn(List<Float> values) {
            addCriterion("shouldpay in", values, "shouldpay");
            return (Criteria) this;
        }

        public Criteria andShouldpayNotIn(List<Float> values) {
            addCriterion("shouldpay not in", values, "shouldpay");
            return (Criteria) this;
        }

        public Criteria andShouldpayBetween(Float value1, Float value2) {
            addCriterion("shouldpay between", value1, value2, "shouldpay");
            return (Criteria) this;
        }

        public Criteria andShouldpayNotBetween(Float value1, Float value2) {
            addCriterion("shouldpay not between", value1, value2, "shouldpay");
            return (Criteria) this;
        }

        public Criteria andActualpayIsNull() {
            addCriterion("actualpay is null");
            return (Criteria) this;
        }

        public Criteria andActualpayIsNotNull() {
            addCriterion("actualpay is not null");
            return (Criteria) this;
        }

        public Criteria andActualpayEqualTo(Float value) {
            addCriterion("actualpay =", value, "actualpay");
            return (Criteria) this;
        }

        public Criteria andActualpayNotEqualTo(Float value) {
            addCriterion("actualpay <>", value, "actualpay");
            return (Criteria) this;
        }

        public Criteria andActualpayGreaterThan(Float value) {
            addCriterion("actualpay >", value, "actualpay");
            return (Criteria) this;
        }

        public Criteria andActualpayGreaterThanOrEqualTo(Float value) {
            addCriterion("actualpay >=", value, "actualpay");
            return (Criteria) this;
        }

        public Criteria andActualpayLessThan(Float value) {
            addCriterion("actualpay <", value, "actualpay");
            return (Criteria) this;
        }

        public Criteria andActualpayLessThanOrEqualTo(Float value) {
            addCriterion("actualpay <=", value, "actualpay");
            return (Criteria) this;
        }

        public Criteria andActualpayIn(List<Float> values) {
            addCriterion("actualpay in", values, "actualpay");
            return (Criteria) this;
        }

        public Criteria andActualpayNotIn(List<Float> values) {
            addCriterion("actualpay not in", values, "actualpay");
            return (Criteria) this;
        }

        public Criteria andActualpayBetween(Float value1, Float value2) {
            addCriterion("actualpay between", value1, value2, "actualpay");
            return (Criteria) this;
        }

        public Criteria andActualpayNotBetween(Float value1, Float value2) {
            addCriterion("actualpay not between", value1, value2, "actualpay");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andParamIsNull() {
            addCriterion("param is null");
            return (Criteria) this;
        }

        public Criteria andParamIsNotNull() {
            addCriterion("param is not null");
            return (Criteria) this;
        }

        public Criteria andParamEqualTo(String value) {
            addCriterion("param =", value, "param");
            return (Criteria) this;
        }

        public Criteria andParamNotEqualTo(String value) {
            addCriterion("param <>", value, "param");
            return (Criteria) this;
        }

        public Criteria andParamGreaterThan(String value) {
            addCriterion("param >", value, "param");
            return (Criteria) this;
        }

        public Criteria andParamGreaterThanOrEqualTo(String value) {
            addCriterion("param >=", value, "param");
            return (Criteria) this;
        }

        public Criteria andParamLessThan(String value) {
            addCriterion("param <", value, "param");
            return (Criteria) this;
        }

        public Criteria andParamLessThanOrEqualTo(String value) {
            addCriterion("param <=", value, "param");
            return (Criteria) this;
        }

        public Criteria andParamLike(String value) {
            addCriterion("param like", value, "param");
            return (Criteria) this;
        }

        public Criteria andParamNotLike(String value) {
            addCriterion("param not like", value, "param");
            return (Criteria) this;
        }

        public Criteria andParamIn(List<String> values) {
            addCriterion("param in", values, "param");
            return (Criteria) this;
        }

        public Criteria andParamNotIn(List<String> values) {
            addCriterion("param not in", values, "param");
            return (Criteria) this;
        }

        public Criteria andParamBetween(String value1, String value2) {
            addCriterion("param between", value1, value2, "param");
            return (Criteria) this;
        }

        public Criteria andParamNotBetween(String value1, String value2) {
            addCriterion("param not between", value1, value2, "param");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table account_record
     *
     * @mbggenerated do_not_delete_during_merge Sat Jan 24 19:27:37 CST 2015
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table account_record
     *
     * @mbggenerated Sat Jan 24 19:27:37 CST 2015
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