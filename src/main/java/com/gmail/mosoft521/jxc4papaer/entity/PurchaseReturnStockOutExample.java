package com.gmail.mosoft521.jxc4papaer.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PurchaseReturnStockOutExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PurchaseReturnStockOutExample() {
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

        public Criteria andPurchaseReturnStockOutIdIsNull() {
            addCriterion("purchase_return_stock_out_id is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseReturnStockOutIdIsNotNull() {
            addCriterion("purchase_return_stock_out_id is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseReturnStockOutIdEqualTo(Integer value) {
            addCriterion("purchase_return_stock_out_id =", value, "purchaseReturnStockOutId");
            return (Criteria) this;
        }

        public Criteria andPurchaseReturnStockOutIdNotEqualTo(Integer value) {
            addCriterion("purchase_return_stock_out_id <>", value, "purchaseReturnStockOutId");
            return (Criteria) this;
        }

        public Criteria andPurchaseReturnStockOutIdGreaterThan(Integer value) {
            addCriterion("purchase_return_stock_out_id >", value, "purchaseReturnStockOutId");
            return (Criteria) this;
        }

        public Criteria andPurchaseReturnStockOutIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("purchase_return_stock_out_id >=", value, "purchaseReturnStockOutId");
            return (Criteria) this;
        }

        public Criteria andPurchaseReturnStockOutIdLessThan(Integer value) {
            addCriterion("purchase_return_stock_out_id <", value, "purchaseReturnStockOutId");
            return (Criteria) this;
        }

        public Criteria andPurchaseReturnStockOutIdLessThanOrEqualTo(Integer value) {
            addCriterion("purchase_return_stock_out_id <=", value, "purchaseReturnStockOutId");
            return (Criteria) this;
        }

        public Criteria andPurchaseReturnStockOutIdIn(List<Integer> values) {
            addCriterion("purchase_return_stock_out_id in", values, "purchaseReturnStockOutId");
            return (Criteria) this;
        }

        public Criteria andPurchaseReturnStockOutIdNotIn(List<Integer> values) {
            addCriterion("purchase_return_stock_out_id not in", values, "purchaseReturnStockOutId");
            return (Criteria) this;
        }

        public Criteria andPurchaseReturnStockOutIdBetween(Integer value1, Integer value2) {
            addCriterion("purchase_return_stock_out_id between", value1, value2, "purchaseReturnStockOutId");
            return (Criteria) this;
        }

        public Criteria andPurchaseReturnStockOutIdNotBetween(Integer value1, Integer value2) {
            addCriterion("purchase_return_stock_out_id not between", value1, value2, "purchaseReturnStockOutId");
            return (Criteria) this;
        }

        public Criteria andPurchaseReturnIdIsNull() {
            addCriterion("purchase_return_id is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseReturnIdIsNotNull() {
            addCriterion("purchase_return_id is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseReturnIdEqualTo(Integer value) {
            addCriterion("purchase_return_id =", value, "purchaseReturnId");
            return (Criteria) this;
        }

        public Criteria andPurchaseReturnIdNotEqualTo(Integer value) {
            addCriterion("purchase_return_id <>", value, "purchaseReturnId");
            return (Criteria) this;
        }

        public Criteria andPurchaseReturnIdGreaterThan(Integer value) {
            addCriterion("purchase_return_id >", value, "purchaseReturnId");
            return (Criteria) this;
        }

        public Criteria andPurchaseReturnIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("purchase_return_id >=", value, "purchaseReturnId");
            return (Criteria) this;
        }

        public Criteria andPurchaseReturnIdLessThan(Integer value) {
            addCriterion("purchase_return_id <", value, "purchaseReturnId");
            return (Criteria) this;
        }

        public Criteria andPurchaseReturnIdLessThanOrEqualTo(Integer value) {
            addCriterion("purchase_return_id <=", value, "purchaseReturnId");
            return (Criteria) this;
        }

        public Criteria andPurchaseReturnIdIn(List<Integer> values) {
            addCriterion("purchase_return_id in", values, "purchaseReturnId");
            return (Criteria) this;
        }

        public Criteria andPurchaseReturnIdNotIn(List<Integer> values) {
            addCriterion("purchase_return_id not in", values, "purchaseReturnId");
            return (Criteria) this;
        }

        public Criteria andPurchaseReturnIdBetween(Integer value1, Integer value2) {
            addCriterion("purchase_return_id between", value1, value2, "purchaseReturnId");
            return (Criteria) this;
        }

        public Criteria andPurchaseReturnIdNotBetween(Integer value1, Integer value2) {
            addCriterion("purchase_return_id not between", value1, value2, "purchaseReturnId");
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

        public Criteria andPurchaseReturnStockOutNoIsNull() {
            addCriterion("purchase_return_stock_out_no is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseReturnStockOutNoIsNotNull() {
            addCriterion("purchase_return_stock_out_no is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseReturnStockOutNoEqualTo(String value) {
            addCriterion("purchase_return_stock_out_no =", value, "purchaseReturnStockOutNo");
            return (Criteria) this;
        }

        public Criteria andPurchaseReturnStockOutNoNotEqualTo(String value) {
            addCriterion("purchase_return_stock_out_no <>", value, "purchaseReturnStockOutNo");
            return (Criteria) this;
        }

        public Criteria andPurchaseReturnStockOutNoGreaterThan(String value) {
            addCriterion("purchase_return_stock_out_no >", value, "purchaseReturnStockOutNo");
            return (Criteria) this;
        }

        public Criteria andPurchaseReturnStockOutNoGreaterThanOrEqualTo(String value) {
            addCriterion("purchase_return_stock_out_no >=", value, "purchaseReturnStockOutNo");
            return (Criteria) this;
        }

        public Criteria andPurchaseReturnStockOutNoLessThan(String value) {
            addCriterion("purchase_return_stock_out_no <", value, "purchaseReturnStockOutNo");
            return (Criteria) this;
        }

        public Criteria andPurchaseReturnStockOutNoLessThanOrEqualTo(String value) {
            addCriterion("purchase_return_stock_out_no <=", value, "purchaseReturnStockOutNo");
            return (Criteria) this;
        }

        public Criteria andPurchaseReturnStockOutNoLike(String value) {
            addCriterion("purchase_return_stock_out_no like", value, "purchaseReturnStockOutNo");
            return (Criteria) this;
        }

        public Criteria andPurchaseReturnStockOutNoNotLike(String value) {
            addCriterion("purchase_return_stock_out_no not like", value, "purchaseReturnStockOutNo");
            return (Criteria) this;
        }

        public Criteria andPurchaseReturnStockOutNoIn(List<String> values) {
            addCriterion("purchase_return_stock_out_no in", values, "purchaseReturnStockOutNo");
            return (Criteria) this;
        }

        public Criteria andPurchaseReturnStockOutNoNotIn(List<String> values) {
            addCriterion("purchase_return_stock_out_no not in", values, "purchaseReturnStockOutNo");
            return (Criteria) this;
        }

        public Criteria andPurchaseReturnStockOutNoBetween(String value1, String value2) {
            addCriterion("purchase_return_stock_out_no between", value1, value2, "purchaseReturnStockOutNo");
            return (Criteria) this;
        }

        public Criteria andPurchaseReturnStockOutNoNotBetween(String value1, String value2) {
            addCriterion("purchase_return_stock_out_no not between", value1, value2, "purchaseReturnStockOutNo");
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