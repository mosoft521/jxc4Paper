package com.gmail.mosoft521.jxc4papaer.entity;

import java.util.ArrayList;
import java.util.List;

public class StockExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StockExample() {
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

        public Criteria andQuantityCurrentIsNull() {
            addCriterion("quantity_current is null");
            return (Criteria) this;
        }

        public Criteria andQuantityCurrentIsNotNull() {
            addCriterion("quantity_current is not null");
            return (Criteria) this;
        }

        public Criteria andQuantityCurrentEqualTo(Integer value) {
            addCriterion("quantity_current =", value, "quantityCurrent");
            return (Criteria) this;
        }

        public Criteria andQuantityCurrentNotEqualTo(Integer value) {
            addCriterion("quantity_current <>", value, "quantityCurrent");
            return (Criteria) this;
        }

        public Criteria andQuantityCurrentGreaterThan(Integer value) {
            addCriterion("quantity_current >", value, "quantityCurrent");
            return (Criteria) this;
        }

        public Criteria andQuantityCurrentGreaterThanOrEqualTo(Integer value) {
            addCriterion("quantity_current >=", value, "quantityCurrent");
            return (Criteria) this;
        }

        public Criteria andQuantityCurrentLessThan(Integer value) {
            addCriterion("quantity_current <", value, "quantityCurrent");
            return (Criteria) this;
        }

        public Criteria andQuantityCurrentLessThanOrEqualTo(Integer value) {
            addCriterion("quantity_current <=", value, "quantityCurrent");
            return (Criteria) this;
        }

        public Criteria andQuantityCurrentIn(List<Integer> values) {
            addCriterion("quantity_current in", values, "quantityCurrent");
            return (Criteria) this;
        }

        public Criteria andQuantityCurrentNotIn(List<Integer> values) {
            addCriterion("quantity_current not in", values, "quantityCurrent");
            return (Criteria) this;
        }

        public Criteria andQuantityCurrentBetween(Integer value1, Integer value2) {
            addCriterion("quantity_current between", value1, value2, "quantityCurrent");
            return (Criteria) this;
        }

        public Criteria andQuantityCurrentNotBetween(Integer value1, Integer value2) {
            addCriterion("quantity_current not between", value1, value2, "quantityCurrent");
            return (Criteria) this;
        }

        public Criteria andQuantityMinIsNull() {
            addCriterion("quantity_min is null");
            return (Criteria) this;
        }

        public Criteria andQuantityMinIsNotNull() {
            addCriterion("quantity_min is not null");
            return (Criteria) this;
        }

        public Criteria andQuantityMinEqualTo(Integer value) {
            addCriterion("quantity_min =", value, "quantityMin");
            return (Criteria) this;
        }

        public Criteria andQuantityMinNotEqualTo(Integer value) {
            addCriterion("quantity_min <>", value, "quantityMin");
            return (Criteria) this;
        }

        public Criteria andQuantityMinGreaterThan(Integer value) {
            addCriterion("quantity_min >", value, "quantityMin");
            return (Criteria) this;
        }

        public Criteria andQuantityMinGreaterThanOrEqualTo(Integer value) {
            addCriterion("quantity_min >=", value, "quantityMin");
            return (Criteria) this;
        }

        public Criteria andQuantityMinLessThan(Integer value) {
            addCriterion("quantity_min <", value, "quantityMin");
            return (Criteria) this;
        }

        public Criteria andQuantityMinLessThanOrEqualTo(Integer value) {
            addCriterion("quantity_min <=", value, "quantityMin");
            return (Criteria) this;
        }

        public Criteria andQuantityMinIn(List<Integer> values) {
            addCriterion("quantity_min in", values, "quantityMin");
            return (Criteria) this;
        }

        public Criteria andQuantityMinNotIn(List<Integer> values) {
            addCriterion("quantity_min not in", values, "quantityMin");
            return (Criteria) this;
        }

        public Criteria andQuantityMinBetween(Integer value1, Integer value2) {
            addCriterion("quantity_min between", value1, value2, "quantityMin");
            return (Criteria) this;
        }

        public Criteria andQuantityMinNotBetween(Integer value1, Integer value2) {
            addCriterion("quantity_min not between", value1, value2, "quantityMin");
            return (Criteria) this;
        }

        public Criteria andQuantityMaxIsNull() {
            addCriterion("quantity_max is null");
            return (Criteria) this;
        }

        public Criteria andQuantityMaxIsNotNull() {
            addCriterion("quantity_max is not null");
            return (Criteria) this;
        }

        public Criteria andQuantityMaxEqualTo(Integer value) {
            addCriterion("quantity_max =", value, "quantityMax");
            return (Criteria) this;
        }

        public Criteria andQuantityMaxNotEqualTo(Integer value) {
            addCriterion("quantity_max <>", value, "quantityMax");
            return (Criteria) this;
        }

        public Criteria andQuantityMaxGreaterThan(Integer value) {
            addCriterion("quantity_max >", value, "quantityMax");
            return (Criteria) this;
        }

        public Criteria andQuantityMaxGreaterThanOrEqualTo(Integer value) {
            addCriterion("quantity_max >=", value, "quantityMax");
            return (Criteria) this;
        }

        public Criteria andQuantityMaxLessThan(Integer value) {
            addCriterion("quantity_max <", value, "quantityMax");
            return (Criteria) this;
        }

        public Criteria andQuantityMaxLessThanOrEqualTo(Integer value) {
            addCriterion("quantity_max <=", value, "quantityMax");
            return (Criteria) this;
        }

        public Criteria andQuantityMaxIn(List<Integer> values) {
            addCriterion("quantity_max in", values, "quantityMax");
            return (Criteria) this;
        }

        public Criteria andQuantityMaxNotIn(List<Integer> values) {
            addCriterion("quantity_max not in", values, "quantityMax");
            return (Criteria) this;
        }

        public Criteria andQuantityMaxBetween(Integer value1, Integer value2) {
            addCriterion("quantity_max between", value1, value2, "quantityMax");
            return (Criteria) this;
        }

        public Criteria andQuantityMaxNotBetween(Integer value1, Integer value2) {
            addCriterion("quantity_max not between", value1, value2, "quantityMax");
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