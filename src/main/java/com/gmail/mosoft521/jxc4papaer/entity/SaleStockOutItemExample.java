package com.gmail.mosoft521.jxc4papaer.entity;

import java.util.ArrayList;
import java.util.List;

public class SaleStockOutItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SaleStockOutItemExample() {
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

        public Criteria andSaleStockOutItemIdIsNull() {
            addCriterion("sale_stock_out_item_id is null");
            return (Criteria) this;
        }

        public Criteria andSaleStockOutItemIdIsNotNull() {
            addCriterion("sale_stock_out_item_id is not null");
            return (Criteria) this;
        }

        public Criteria andSaleStockOutItemIdEqualTo(Integer value) {
            addCriterion("sale_stock_out_item_id =", value, "saleStockOutItemId");
            return (Criteria) this;
        }

        public Criteria andSaleStockOutItemIdNotEqualTo(Integer value) {
            addCriterion("sale_stock_out_item_id <>", value, "saleStockOutItemId");
            return (Criteria) this;
        }

        public Criteria andSaleStockOutItemIdGreaterThan(Integer value) {
            addCriterion("sale_stock_out_item_id >", value, "saleStockOutItemId");
            return (Criteria) this;
        }

        public Criteria andSaleStockOutItemIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sale_stock_out_item_id >=", value, "saleStockOutItemId");
            return (Criteria) this;
        }

        public Criteria andSaleStockOutItemIdLessThan(Integer value) {
            addCriterion("sale_stock_out_item_id <", value, "saleStockOutItemId");
            return (Criteria) this;
        }

        public Criteria andSaleStockOutItemIdLessThanOrEqualTo(Integer value) {
            addCriterion("sale_stock_out_item_id <=", value, "saleStockOutItemId");
            return (Criteria) this;
        }

        public Criteria andSaleStockOutItemIdIn(List<Integer> values) {
            addCriterion("sale_stock_out_item_id in", values, "saleStockOutItemId");
            return (Criteria) this;
        }

        public Criteria andSaleStockOutItemIdNotIn(List<Integer> values) {
            addCriterion("sale_stock_out_item_id not in", values, "saleStockOutItemId");
            return (Criteria) this;
        }

        public Criteria andSaleStockOutItemIdBetween(Integer value1, Integer value2) {
            addCriterion("sale_stock_out_item_id between", value1, value2, "saleStockOutItemId");
            return (Criteria) this;
        }

        public Criteria andSaleStockOutItemIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sale_stock_out_item_id not between", value1, value2, "saleStockOutItemId");
            return (Criteria) this;
        }

        public Criteria andSaleStockOutIdIsNull() {
            addCriterion("sale_stock_out_id is null");
            return (Criteria) this;
        }

        public Criteria andSaleStockOutIdIsNotNull() {
            addCriterion("sale_stock_out_id is not null");
            return (Criteria) this;
        }

        public Criteria andSaleStockOutIdEqualTo(Integer value) {
            addCriterion("sale_stock_out_id =", value, "saleStockOutId");
            return (Criteria) this;
        }

        public Criteria andSaleStockOutIdNotEqualTo(Integer value) {
            addCriterion("sale_stock_out_id <>", value, "saleStockOutId");
            return (Criteria) this;
        }

        public Criteria andSaleStockOutIdGreaterThan(Integer value) {
            addCriterion("sale_stock_out_id >", value, "saleStockOutId");
            return (Criteria) this;
        }

        public Criteria andSaleStockOutIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sale_stock_out_id >=", value, "saleStockOutId");
            return (Criteria) this;
        }

        public Criteria andSaleStockOutIdLessThan(Integer value) {
            addCriterion("sale_stock_out_id <", value, "saleStockOutId");
            return (Criteria) this;
        }

        public Criteria andSaleStockOutIdLessThanOrEqualTo(Integer value) {
            addCriterion("sale_stock_out_id <=", value, "saleStockOutId");
            return (Criteria) this;
        }

        public Criteria andSaleStockOutIdIn(List<Integer> values) {
            addCriterion("sale_stock_out_id in", values, "saleStockOutId");
            return (Criteria) this;
        }

        public Criteria andSaleStockOutIdNotIn(List<Integer> values) {
            addCriterion("sale_stock_out_id not in", values, "saleStockOutId");
            return (Criteria) this;
        }

        public Criteria andSaleStockOutIdBetween(Integer value1, Integer value2) {
            addCriterion("sale_stock_out_id between", value1, value2, "saleStockOutId");
            return (Criteria) this;
        }

        public Criteria andSaleStockOutIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sale_stock_out_id not between", value1, value2, "saleStockOutId");
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