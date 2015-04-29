package com.smartcommunity.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.smartcommunity.pojo.RepairExample.Criteria;

public class ComplaintsExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table complaints
     *
     * @mbggenerated Fri Jan 16 09:42:45 CST 2015
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table complaints
     *
     * @mbggenerated Fri Jan 16 09:42:45 CST 2015
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table complaints
     *
     * @mbggenerated Fri Jan 16 09:42:45 CST 2015
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table complaints
     *
     * @mbggenerated Fri Jan 16 09:42:45 CST 2015
     */
    public ComplaintsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table complaints
     *
     * @mbggenerated Fri Jan 16 09:42:45 CST 2015
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table complaints
     *
     * @mbggenerated Fri Jan 16 09:42:45 CST 2015
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table complaints
     *
     * @mbggenerated Fri Jan 16 09:42:45 CST 2015
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table complaints
     *
     * @mbggenerated Fri Jan 16 09:42:45 CST 2015
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table complaints
     *
     * @mbggenerated Fri Jan 16 09:42:45 CST 2015
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table complaints
     *
     * @mbggenerated Fri Jan 16 09:42:45 CST 2015
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table complaints
     *
     * @mbggenerated Fri Jan 16 09:42:45 CST 2015
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table complaints
     *
     * @mbggenerated Fri Jan 16 09:42:45 CST 2015
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
     * This method corresponds to the database table complaints
     *
     * @mbggenerated Fri Jan 16 09:42:45 CST 2015
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table complaints
     *
     * @mbggenerated Fri Jan 16 09:42:45 CST 2015
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table complaints
     *
     * @mbggenerated Fri Jan 16 09:42:45 CST 2015
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
        /**
         * add_y 用于多表查询
         * @param value
         * @return
         */
        public Criteria andComplaintsIdEqualTo(Integer value) {
            addCriterion("complaints.id =", value, "complaints.id");
            return (Criteria) this;
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(Date value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Date value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Date value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Date value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Date value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Date> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Date> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Date value1, Date value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Date value1, Date value2) {
            addCriterion("time not between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andRequiredresultIsNull() {
            addCriterion("requiredresult is null");
            return (Criteria) this;
        }

        public Criteria andRequiredresultIsNotNull() {
            addCriterion("requiredresult is not null");
            return (Criteria) this;
        }

        public Criteria andRequiredresultEqualTo(String value) {
            addCriterion("requiredresult =", value, "requiredresult");
            return (Criteria) this;
        }

        public Criteria andRequiredresultNotEqualTo(String value) {
            addCriterion("requiredresult <>", value, "requiredresult");
            return (Criteria) this;
        }

        public Criteria andRequiredresultGreaterThan(String value) {
            addCriterion("requiredresult >", value, "requiredresult");
            return (Criteria) this;
        }

        public Criteria andRequiredresultGreaterThanOrEqualTo(String value) {
            addCriterion("requiredresult >=", value, "requiredresult");
            return (Criteria) this;
        }

        public Criteria andRequiredresultLessThan(String value) {
            addCriterion("requiredresult <", value, "requiredresult");
            return (Criteria) this;
        }

        public Criteria andRequiredresultLessThanOrEqualTo(String value) {
            addCriterion("requiredresult <=", value, "requiredresult");
            return (Criteria) this;
        }

        public Criteria andRequiredresultLike(String value) {
            addCriterion("requiredresult like", value, "requiredresult");
            return (Criteria) this;
        }

        public Criteria andRequiredresultNotLike(String value) {
            addCriterion("requiredresult not like", value, "requiredresult");
            return (Criteria) this;
        }

        public Criteria andRequiredresultIn(List<String> values) {
            addCriterion("requiredresult in", values, "requiredresult");
            return (Criteria) this;
        }

        public Criteria andRequiredresultNotIn(List<String> values) {
            addCriterion("requiredresult not in", values, "requiredresult");
            return (Criteria) this;
        }

        public Criteria andRequiredresultBetween(String value1, String value2) {
            addCriterion("requiredresult between", value1, value2, "requiredresult");
            return (Criteria) this;
        }

        public Criteria andRequiredresultNotBetween(String value1, String value2) {
            addCriterion("requiredresult not between", value1, value2, "requiredresult");
            return (Criteria) this;
        }

        public Criteria andProcessedsituationIsNull() {
            addCriterion("processedsituation is null");
            return (Criteria) this;
        }

        public Criteria andProcessedsituationIsNotNull() {
            addCriterion("processedsituation is not null");
            return (Criteria) this;
        }

        public Criteria andProcessedsituationEqualTo(String value) {
            addCriterion("processedsituation =", value, "processedsituation");
            return (Criteria) this;
        }

        public Criteria andProcessedsituationNotEqualTo(String value) {
            addCriterion("processedsituation <>", value, "processedsituation");
            return (Criteria) this;
        }

        public Criteria andProcessedsituationGreaterThan(String value) {
            addCriterion("processedsituation >", value, "processedsituation");
            return (Criteria) this;
        }

        public Criteria andProcessedsituationGreaterThanOrEqualTo(String value) {
            addCriterion("processedsituation >=", value, "processedsituation");
            return (Criteria) this;
        }

        public Criteria andProcessedsituationLessThan(String value) {
            addCriterion("processedsituation <", value, "processedsituation");
            return (Criteria) this;
        }

        public Criteria andProcessedsituationLessThanOrEqualTo(String value) {
            addCriterion("processedsituation <=", value, "processedsituation");
            return (Criteria) this;
        }

        public Criteria andProcessedsituationLike(String value) {
            addCriterion("processedsituation like", value, "processedsituation");
            return (Criteria) this;
        }

        public Criteria andProcessedsituationNotLike(String value) {
            addCriterion("processedsituation not like", value, "processedsituation");
            return (Criteria) this;
        }

        public Criteria andProcessedsituationIn(List<String> values) {
            addCriterion("processedsituation in", values, "processedsituation");
            return (Criteria) this;
        }

        public Criteria andProcessedsituationNotIn(List<String> values) {
            addCriterion("processedsituation not in", values, "processedsituation");
            return (Criteria) this;
        }

        public Criteria andProcessedsituationBetween(String value1, String value2) {
            addCriterion("processedsituation between", value1, value2, "processedsituation");
            return (Criteria) this;
        }

        public Criteria andProcessedsituationNotBetween(String value1, String value2) {
            addCriterion("processedsituation not between", value1, value2, "processedsituation");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("remarks is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("remarks =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("remarks <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("remarks >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("remarks >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("remarks <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("remarks <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("remarks like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("remarks not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("remarks in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("remarks not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("remarks between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("remarks not between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andProcessedstateIsNull() {
            addCriterion("processedstate is null");
            return (Criteria) this;
        }

        public Criteria andProcessedstateIsNotNull() {
            addCriterion("processedstate is not null");
            return (Criteria) this;
        }

        public Criteria andProcessedstateEqualTo(Integer value) {
            addCriterion("processedstate =", value, "processedstate");
            return (Criteria) this;
        }

        public Criteria andProcessedstateNotEqualTo(Integer value) {
            addCriterion("processedstate <>", value, "processedstate");
            return (Criteria) this;
        }

        public Criteria andProcessedstateGreaterThan(Integer value) {
            addCriterion("processedstate >", value, "processedstate");
            return (Criteria) this;
        }

        public Criteria andProcessedstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("processedstate >=", value, "processedstate");
            return (Criteria) this;
        }

        public Criteria andProcessedstateLessThan(Integer value) {
            addCriterion("processedstate <", value, "processedstate");
            return (Criteria) this;
        }

        public Criteria andProcessedstateLessThanOrEqualTo(Integer value) {
            addCriterion("processedstate <=", value, "processedstate");
            return (Criteria) this;
        }

        public Criteria andProcessedstateIn(List<Integer> values) {
            addCriterion("processedstate in", values, "processedstate");
            return (Criteria) this;
        }

        public Criteria andProcessedstateNotIn(List<Integer> values) {
            addCriterion("processedstate not in", values, "processedstate");
            return (Criteria) this;
        }

        public Criteria andProcessedstateBetween(Integer value1, Integer value2) {
            addCriterion("processedstate between", value1, value2, "processedstate");
            return (Criteria) this;
        }

        public Criteria andProcessedstateNotBetween(Integer value1, Integer value2) {
            addCriterion("processedstate not between", value1, value2, "processedstate");
            return (Criteria) this;
        }

        public Criteria andProcessedtimeIsNull() {
            addCriterion("processedtime is null");
            return (Criteria) this;
        }

        public Criteria andProcessedtimeIsNotNull() {
            addCriterion("processedtime is not null");
            return (Criteria) this;
        }

        public Criteria andProcessedtimeEqualTo(Date value) {
            addCriterion("processedtime =", value, "processedtime");
            return (Criteria) this;
        }

        public Criteria andProcessedtimeNotEqualTo(Date value) {
            addCriterion("processedtime <>", value, "processedtime");
            return (Criteria) this;
        }

        public Criteria andProcessedtimeGreaterThan(Date value) {
            addCriterion("processedtime >", value, "processedtime");
            return (Criteria) this;
        }

        public Criteria andProcessedtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("processedtime >=", value, "processedtime");
            return (Criteria) this;
        }

        public Criteria andProcessedtimeLessThan(Date value) {
            addCriterion("processedtime <", value, "processedtime");
            return (Criteria) this;
        }

        public Criteria andProcessedtimeLessThanOrEqualTo(Date value) {
            addCriterion("processedtime <=", value, "processedtime");
            return (Criteria) this;
        }

        public Criteria andProcessedtimeIn(List<Date> values) {
            addCriterion("processedtime in", values, "processedtime");
            return (Criteria) this;
        }

        public Criteria andProcessedtimeNotIn(List<Date> values) {
            addCriterion("processedtime not in", values, "processedtime");
            return (Criteria) this;
        }

        public Criteria andProcessedtimeBetween(Date value1, Date value2) {
            addCriterion("processedtime between", value1, value2, "processedtime");
            return (Criteria) this;
        }

        public Criteria andProcessedtimeNotBetween(Date value1, Date value2) {
            addCriterion("processedtime not between", value1, value2, "processedtime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table complaints
     *
     * @mbggenerated do_not_delete_during_merge Fri Jan 16 09:42:45 CST 2015
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table complaints
     *
     * @mbggenerated Fri Jan 16 09:42:45 CST 2015
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