package com.gmail.mosoft521.jxc4papaer.entity;

import java.util.ArrayList;
import java.util.List;

public class SupplementExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SupplementExample() {
        oredCriteria = new ArrayList<>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
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

        public Criteria andSupplementIdIsNull() {
            addCriterion("supplement_id is null");
            return (Criteria) this;
        }

        public Criteria andSupplementIdIsNotNull() {
            addCriterion("supplement_id is not null");
            return (Criteria) this;
        }

        public Criteria andSupplementIdEqualTo(Integer value) {
            addCriterion("supplement_id =", value, "supplementId");
            return (Criteria) this;
        }

        public Criteria andSupplementIdNotEqualTo(Integer value) {
            addCriterion("supplement_id <>", value, "supplementId");
            return (Criteria) this;
        }

        public Criteria andSupplementIdGreaterThan(Integer value) {
            addCriterion("supplement_id >", value, "supplementId");
            return (Criteria) this;
        }

        public Criteria andSupplementIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("supplement_id >=", value, "supplementId");
            return (Criteria) this;
        }

        public Criteria andSupplementIdLessThan(Integer value) {
            addCriterion("supplement_id <", value, "supplementId");
            return (Criteria) this;
        }

        public Criteria andSupplementIdLessThanOrEqualTo(Integer value) {
            addCriterion("supplement_id <=", value, "supplementId");
            return (Criteria) this;
        }

        public Criteria andSupplementIdIn(List<Integer> values) {
            addCriterion("supplement_id in", values, "supplementId");
            return (Criteria) this;
        }

        public Criteria andSupplementIdNotIn(List<Integer> values) {
            addCriterion("supplement_id not in", values, "supplementId");
            return (Criteria) this;
        }

        public Criteria andSupplementIdBetween(Integer value1, Integer value2) {
            addCriterion("supplement_id between", value1, value2, "supplementId");
            return (Criteria) this;
        }

        public Criteria andSupplementIdNotBetween(Integer value1, Integer value2) {
            addCriterion("supplement_id not between", value1, value2, "supplementId");
            return (Criteria) this;
        }

        public Criteria andSupplementNoIsNull() {
            addCriterion("supplement_no is null");
            return (Criteria) this;
        }

        public Criteria andSupplementNoIsNotNull() {
            addCriterion("supplement_no is not null");
            return (Criteria) this;
        }

        public Criteria andSupplementNoEqualTo(String value) {
            addCriterion("supplement_no =", value, "supplementNo");
            return (Criteria) this;
        }

        public Criteria andSupplementNoNotEqualTo(String value) {
            addCriterion("supplement_no <>", value, "supplementNo");
            return (Criteria) this;
        }

        public Criteria andSupplementNoGreaterThan(String value) {
            addCriterion("supplement_no >", value, "supplementNo");
            return (Criteria) this;
        }

        public Criteria andSupplementNoGreaterThanOrEqualTo(String value) {
            addCriterion("supplement_no >=", value, "supplementNo");
            return (Criteria) this;
        }

        public Criteria andSupplementNoLessThan(String value) {
            addCriterion("supplement_no <", value, "supplementNo");
            return (Criteria) this;
        }

        public Criteria andSupplementNoLessThanOrEqualTo(String value) {
            addCriterion("supplement_no <=", value, "supplementNo");
            return (Criteria) this;
        }

        public Criteria andSupplementNoLike(String value) {
            addCriterion("supplement_no like", value, "supplementNo");
            return (Criteria) this;
        }

        public Criteria andSupplementNoNotLike(String value) {
            addCriterion("supplement_no not like", value, "supplementNo");
            return (Criteria) this;
        }

        public Criteria andSupplementNoIn(List<String> values) {
            addCriterion("supplement_no in", values, "supplementNo");
            return (Criteria) this;
        }

        public Criteria andSupplementNoNotIn(List<String> values) {
            addCriterion("supplement_no not in", values, "supplementNo");
            return (Criteria) this;
        }

        public Criteria andSupplementNoBetween(String value1, String value2) {
            addCriterion("supplement_no between", value1, value2, "supplementNo");
            return (Criteria) this;
        }

        public Criteria andSupplementNoNotBetween(String value1, String value2) {
            addCriterion("supplement_no not between", value1, value2, "supplementNo");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNull() {
            addCriterion("product_id is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("product_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(Integer value) {
            addCriterion("product_id =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(Integer value) {
            addCriterion("product_id <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(Integer value) {
            addCriterion("product_id >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_id >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(Integer value) {
            addCriterion("product_id <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(Integer value) {
            addCriterion("product_id <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<Integer> values) {
            addCriterion("product_id in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<Integer> values) {
            addCriterion("product_id not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(Integer value1, Integer value2) {
            addCriterion("product_id between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(Integer value1, Integer value2) {
            addCriterion("product_id not between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNull() {
            addCriterion("quantity is null");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNotNull() {
            addCriterion("quantity is not null");
            return (Criteria) this;
        }

        public Criteria andQuantityEqualTo(Integer value) {
            addCriterion("quantity =", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotEqualTo(Integer value) {
            addCriterion("quantity <>", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThan(Integer value) {
            addCriterion("quantity >", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("quantity >=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThan(Integer value) {
            addCriterion("quantity <", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("quantity <=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityIn(List<Integer> values) {
            addCriterion("quantity in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotIn(List<Integer> values) {
            addCriterion("quantity not in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityBetween(Integer value1, Integer value2) {
            addCriterion("quantity between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("quantity not between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

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