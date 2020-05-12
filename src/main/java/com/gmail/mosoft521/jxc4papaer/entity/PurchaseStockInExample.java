package com.gmail.mosoft521.jxc4papaer.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PurchaseStockInExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PurchaseStockInExample() {
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

        public Criteria andPurchaseIdIsNull() {
            addCriterion("purchase_id is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseIdIsNotNull() {
            addCriterion("purchase_id is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseIdEqualTo(Integer value) {
            addCriterion("purchase_id =", value, "purchaseId");
            return (Criteria) this;
        }

        public Criteria andPurchaseIdNotEqualTo(Integer value) {
            addCriterion("purchase_id <>", value, "purchaseId");
            return (Criteria) this;
        }

        public Criteria andPurchaseIdGreaterThan(Integer value) {
            addCriterion("purchase_id >", value, "purchaseId");
            return (Criteria) this;
        }

        public Criteria andPurchaseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("purchase_id >=", value, "purchaseId");
            return (Criteria) this;
        }

        public Criteria andPurchaseIdLessThan(Integer value) {
            addCriterion("purchase_id <", value, "purchaseId");
            return (Criteria) this;
        }

        public Criteria andPurchaseIdLessThanOrEqualTo(Integer value) {
            addCriterion("purchase_id <=", value, "purchaseId");
            return (Criteria) this;
        }

        public Criteria andPurchaseIdIn(List<Integer> values) {
            addCriterion("purchase_id in", values, "purchaseId");
            return (Criteria) this;
        }

        public Criteria andPurchaseIdNotIn(List<Integer> values) {
            addCriterion("purchase_id not in", values, "purchaseId");
            return (Criteria) this;
        }

        public Criteria andPurchaseIdBetween(Integer value1, Integer value2) {
            addCriterion("purchase_id between", value1, value2, "purchaseId");
            return (Criteria) this;
        }

        public Criteria andPurchaseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("purchase_id not between", value1, value2, "purchaseId");
            return (Criteria) this;
        }

        public Criteria andEmpIdIsNull() {
            addCriterion("emp_id is null");
            return (Criteria) this;
        }

        public Criteria andEmpIdIsNotNull() {
            addCriterion("emp_id is not null");
            return (Criteria) this;
        }

        public Criteria andEmpIdEqualTo(Integer value) {
            addCriterion("emp_id =", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotEqualTo(Integer value) {
            addCriterion("emp_id <>", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdGreaterThan(Integer value) {
            addCriterion("emp_id >", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("emp_id >=", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdLessThan(Integer value) {
            addCriterion("emp_id <", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdLessThanOrEqualTo(Integer value) {
            addCriterion("emp_id <=", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdIn(List<Integer> values) {
            addCriterion("emp_id in", values, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotIn(List<Integer> values) {
            addCriterion("emp_id not in", values, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdBetween(Integer value1, Integer value2) {
            addCriterion("emp_id between", value1, value2, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotBetween(Integer value1, Integer value2) {
            addCriterion("emp_id not between", value1, value2, "empId");
            return (Criteria) this;
        }

        public Criteria andPurchaseStockInNoIsNull() {
            addCriterion("purchase_stock_in_no is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseStockInNoIsNotNull() {
            addCriterion("purchase_stock_in_no is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseStockInNoEqualTo(String value) {
            addCriterion("purchase_stock_in_no =", value, "purchaseStockInNo");
            return (Criteria) this;
        }

        public Criteria andPurchaseStockInNoNotEqualTo(String value) {
            addCriterion("purchase_stock_in_no <>", value, "purchaseStockInNo");
            return (Criteria) this;
        }

        public Criteria andPurchaseStockInNoGreaterThan(String value) {
            addCriterion("purchase_stock_in_no >", value, "purchaseStockInNo");
            return (Criteria) this;
        }

        public Criteria andPurchaseStockInNoGreaterThanOrEqualTo(String value) {
            addCriterion("purchase_stock_in_no >=", value, "purchaseStockInNo");
            return (Criteria) this;
        }

        public Criteria andPurchaseStockInNoLessThan(String value) {
            addCriterion("purchase_stock_in_no <", value, "purchaseStockInNo");
            return (Criteria) this;
        }

        public Criteria andPurchaseStockInNoLessThanOrEqualTo(String value) {
            addCriterion("purchase_stock_in_no <=", value, "purchaseStockInNo");
            return (Criteria) this;
        }

        public Criteria andPurchaseStockInNoLike(String value) {
            addCriterion("purchase_stock_in_no like", value, "purchaseStockInNo");
            return (Criteria) this;
        }

        public Criteria andPurchaseStockInNoNotLike(String value) {
            addCriterion("purchase_stock_in_no not like", value, "purchaseStockInNo");
            return (Criteria) this;
        }

        public Criteria andPurchaseStockInNoIn(List<String> values) {
            addCriterion("purchase_stock_in_no in", values, "purchaseStockInNo");
            return (Criteria) this;
        }

        public Criteria andPurchaseStockInNoNotIn(List<String> values) {
            addCriterion("purchase_stock_in_no not in", values, "purchaseStockInNo");
            return (Criteria) this;
        }

        public Criteria andPurchaseStockInNoBetween(String value1, String value2) {
            addCriterion("purchase_stock_in_no between", value1, value2, "purchaseStockInNo");
            return (Criteria) this;
        }

        public Criteria andPurchaseStockInNoNotBetween(String value1, String value2) {
            addCriterion("purchase_stock_in_no not between", value1, value2, "purchaseStockInNo");
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