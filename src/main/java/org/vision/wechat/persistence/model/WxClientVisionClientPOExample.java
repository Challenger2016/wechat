package org.vision.wechat.persistence.model;

import java.util.ArrayList;
import java.util.List;

public class WxClientVisionClientPOExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table wx_client_vision_client
     *
     * @mbg.generated Mon Mar 04 15:29:42 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table wx_client_vision_client
     *
     * @mbg.generated Mon Mar 04 15:29:42 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table wx_client_vision_client
     *
     * @mbg.generated Mon Mar 04 15:29:42 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wx_client_vision_client
     *
     * @mbg.generated Mon Mar 04 15:29:42 CST 2019
     */
    public WxClientVisionClientPOExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wx_client_vision_client
     *
     * @mbg.generated Mon Mar 04 15:29:42 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wx_client_vision_client
     *
     * @mbg.generated Mon Mar 04 15:29:42 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wx_client_vision_client
     *
     * @mbg.generated Mon Mar 04 15:29:42 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wx_client_vision_client
     *
     * @mbg.generated Mon Mar 04 15:29:42 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wx_client_vision_client
     *
     * @mbg.generated Mon Mar 04 15:29:42 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wx_client_vision_client
     *
     * @mbg.generated Mon Mar 04 15:29:42 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wx_client_vision_client
     *
     * @mbg.generated Mon Mar 04 15:29:42 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wx_client_vision_client
     *
     * @mbg.generated Mon Mar 04 15:29:42 CST 2019
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
     * This method corresponds to the database table wx_client_vision_client
     *
     * @mbg.generated Mon Mar 04 15:29:42 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wx_client_vision_client
     *
     * @mbg.generated Mon Mar 04 15:29:42 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table wx_client_vision_client
     *
     * @mbg.generated Mon Mar 04 15:29:42 CST 2019
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andWxClientIdIsNull() {
            addCriterion("wx_client_id is null");
            return (Criteria) this;
        }

        public Criteria andWxClientIdIsNotNull() {
            addCriterion("wx_client_id is not null");
            return (Criteria) this;
        }

        public Criteria andWxClientIdEqualTo(String value) {
            addCriterion("wx_client_id =", value, "wxClientId");
            return (Criteria) this;
        }

        public Criteria andWxClientIdNotEqualTo(String value) {
            addCriterion("wx_client_id <>", value, "wxClientId");
            return (Criteria) this;
        }

        public Criteria andWxClientIdGreaterThan(String value) {
            addCriterion("wx_client_id >", value, "wxClientId");
            return (Criteria) this;
        }

        public Criteria andWxClientIdGreaterThanOrEqualTo(String value) {
            addCriterion("wx_client_id >=", value, "wxClientId");
            return (Criteria) this;
        }

        public Criteria andWxClientIdLessThan(String value) {
            addCriterion("wx_client_id <", value, "wxClientId");
            return (Criteria) this;
        }

        public Criteria andWxClientIdLessThanOrEqualTo(String value) {
            addCriterion("wx_client_id <=", value, "wxClientId");
            return (Criteria) this;
        }

        public Criteria andWxClientIdLike(String value) {
            addCriterion("wx_client_id like", value, "wxClientId");
            return (Criteria) this;
        }

        public Criteria andWxClientIdNotLike(String value) {
            addCriterion("wx_client_id not like", value, "wxClientId");
            return (Criteria) this;
        }

        public Criteria andWxClientIdIn(List<String> values) {
            addCriterion("wx_client_id in", values, "wxClientId");
            return (Criteria) this;
        }

        public Criteria andWxClientIdNotIn(List<String> values) {
            addCriterion("wx_client_id not in", values, "wxClientId");
            return (Criteria) this;
        }

        public Criteria andWxClientIdBetween(String value1, String value2) {
            addCriterion("wx_client_id between", value1, value2, "wxClientId");
            return (Criteria) this;
        }

        public Criteria andWxClientIdNotBetween(String value1, String value2) {
            addCriterion("wx_client_id not between", value1, value2, "wxClientId");
            return (Criteria) this;
        }

        public Criteria andVisionClientIdIsNull() {
            addCriterion("vision_client_id is null");
            return (Criteria) this;
        }

        public Criteria andVisionClientIdIsNotNull() {
            addCriterion("vision_client_id is not null");
            return (Criteria) this;
        }

        public Criteria andVisionClientIdEqualTo(String value) {
            addCriterion("vision_client_id =", value, "visionClientId");
            return (Criteria) this;
        }

        public Criteria andVisionClientIdNotEqualTo(String value) {
            addCriterion("vision_client_id <>", value, "visionClientId");
            return (Criteria) this;
        }

        public Criteria andVisionClientIdGreaterThan(String value) {
            addCriterion("vision_client_id >", value, "visionClientId");
            return (Criteria) this;
        }

        public Criteria andVisionClientIdGreaterThanOrEqualTo(String value) {
            addCriterion("vision_client_id >=", value, "visionClientId");
            return (Criteria) this;
        }

        public Criteria andVisionClientIdLessThan(String value) {
            addCriterion("vision_client_id <", value, "visionClientId");
            return (Criteria) this;
        }

        public Criteria andVisionClientIdLessThanOrEqualTo(String value) {
            addCriterion("vision_client_id <=", value, "visionClientId");
            return (Criteria) this;
        }

        public Criteria andVisionClientIdLike(String value) {
            addCriterion("vision_client_id like", value, "visionClientId");
            return (Criteria) this;
        }

        public Criteria andVisionClientIdNotLike(String value) {
            addCriterion("vision_client_id not like", value, "visionClientId");
            return (Criteria) this;
        }

        public Criteria andVisionClientIdIn(List<String> values) {
            addCriterion("vision_client_id in", values, "visionClientId");
            return (Criteria) this;
        }

        public Criteria andVisionClientIdNotIn(List<String> values) {
            addCriterion("vision_client_id not in", values, "visionClientId");
            return (Criteria) this;
        }

        public Criteria andVisionClientIdBetween(String value1, String value2) {
            addCriterion("vision_client_id between", value1, value2, "visionClientId");
            return (Criteria) this;
        }

        public Criteria andVisionClientIdNotBetween(String value1, String value2) {
            addCriterion("vision_client_id not between", value1, value2, "visionClientId");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table wx_client_vision_client
     *
     * @mbg.generated do_not_delete_during_merge Mon Mar 04 15:29:42 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table wx_client_vision_client
     *
     * @mbg.generated Mon Mar 04 15:29:42 CST 2019
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