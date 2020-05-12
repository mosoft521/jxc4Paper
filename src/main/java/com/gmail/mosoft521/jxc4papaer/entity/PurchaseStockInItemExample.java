package com.gmail.mosoft521.jxc4papaer.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PurchaseStockInItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PurchaseStockInItemExample() {
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

        public Criteria andPurchaseStockInItemIdIsNull() {
            addCriterion("purchase_stock_in_item_id is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseStockInItemIdIsNotNull() {
            addCriterion("purchase_stock_in_item_id is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseStockInItemIdEqualTo(Integer value) {
            addCriterion("purchase_stock_in_item_id =", value, "purchaseStockInItemId");
            return (Criteria) this;
        }

        public Criteria andPurchaseStockInItemIdNotEqualTo(Integer value) {
            addCriterion("purchase_stock_in_item_id <>", value, "purchaseStockInItemId");
            return (Criteria) this;
        }

        public Criteria andPurchaseStockInItemIdGreaterThan(Integer value) {
            addCriterion("purchase_stock_in_item_id >", value, "purchaseStockInItemId");
            return (Criteria) this;
        }

        public Criteria andPurchaseStockInItemIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("purchase_stock_in_item_id >=", value, "purchaseStockInItemId");
            return (Criteria) this;
        }

        public Criteria andPurchaseStockInItemIdLessThan(Integer value) {
            addCriterion("purchase_stock_in_item_id <", value, "purchaseStockInItemId");
            return (Criteria) this;
        }

        public Criteria andPurchaseStockInItemIdLessThanOrEqualTo(Integer value) {
            addCriterion("purchase_stock_in_item_id <=", value, "purchaseStockInItemId");
            return (Criteria) this;
        }

        public Criteria andPurchaseStockInItemIdIn(List<Integer> values) {
            addCriterion("purchase_stock_in_item_id in", values, "purchaseStockInItemId");
            return (Criteria) this;
        }

        public Criteria andPurchaseStockInItemIdNotIn(List<Integer> values) {
            addCriterion("purchase_stock_in_item_id not in", values, "purchaseStockInItemId");
            return (Criteria) this;
        }

        public Criteria andPurchaseStockInItemIdBetween(Integer value1, Integer value2) {
            addCriterion("purchase_stock_in_item_id between", value1, value2, "purchaseStockInItemId");
            return (Criteria) this;
        }

        public Criteria andPurchaseStockInItemIdNotBetween(Integer value1, Integer value2) {
            addCriterion("purchase_stock_in_item_id not between", value1, value2, "purchaseStockInItemId");
            return (Criteria) this;
        }

        public Criteria andPurchaseStockInIdIsNull() {
            addCriterion("purchase_stock_in_id is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseStockInIdIsNotNull() {
            addCriterion("purchase_stock_in_id is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseStockInIdEqualTo(Integer value) {
            addCriterion("purchase_stock_in_id =", value, "purchaseStockInId");
            return (Criteria) this;
        }

        public Criteria andPurchaseStockInIdNotEqualTo(Integer value) {
            addCriterion("purchase_stock_in_id <>", value, "purchaseStockInId");
            return (Criteria) this;
        }

        public Criteria andPurchaseStockInIdGreaterThan(Integer value) {
            addCriterion("purchase_stock_in_id >", value, "purchaseStockInId");
            return (Criteria) this;
        }

        public Criteria andPurchaseStockInIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("purchase_stock_in_id >=", value, "purchaseStockInId");
            return (Criteria) this;
        }

        public Criteria andPurchaseStockInIdLessThan(Integer value) {
            addCriterion("purchase_stock_in_id <", value, "purchaseStockInId");
            return (Criteria) this;
        }

        public Criteria andPurchaseStockInIdLessThanOrEqualTo(Integer value) {
            addCriterion("purchase_stock_in_id <=", value, "purchaseStockInId");
            return (Criteria) this;
        }

        public Criteria andPurchaseStockInIdIn(List<Integer> values) {
            addCriterion("purchase_stock_in_id in", values, "purchaseStockInId");
            return (Criteria) this;
        }

        public Criteria andPurchaseStockInIdNotIn(List<Integer> values) {
            addCriterion("purchase_stock_in_id not in", values, "purchaseStockInId");
            return (Criteria) this;
        }

        public Criteria andPurchaseStockInIdBetween(Integer value1, Integer value2) {
            addCriterion("purchase_stock_in_id between", value1, value2, "purchaseStockInId");
            return (Criteria) this;
        }

        public Criteria andPurchaseStockInIdNotBetween(Integer value1, Integer value2) {
            addCriterion("purchase_stock_in_id not between", value1, value2, "purchaseStockInId");
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

        public Criteria andDayIsNull() {
            addCriterion("day is null");
            return (Criteria) this;
        }

        public Criteria andDayIsNotNull() {
            addCriterion("day is not null");
            return (Criteria) this;
        }

        public Criteria andDayEqualTo(Date value) {
            addCriterion("day =", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayNotEqualTo(Date value) {
            addCriterion("day <>", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayGreaterThan(Date value) {
            addCriterion("day >", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayGreaterThanOrEqualTo(Date value) {
            addCriterion("day >=", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayLessThan(Date value) {
            addCriterion("day <", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayLessThanOrEqualTo(Date value) {
            addCriterion("day <=", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayIn(List<Date> values) {
            addCriterion("day in", values, "day");
            return (Criteria) this;
        }

        public Criteria andDayNotIn(List<Date> values) {
            addCriterion("day not in", values, "day");
            return (Criteria) this;
        }

        public Criteria andDayBetween(Date value1, Date value2) {
            addCriterion("day between", value1, value2, "day");
            return (Criteria) this;
        }

        public Criteria andDayNotBetween(Date value1, Date value2) {
            addCriterion("day not between", value1, value2, "day");
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