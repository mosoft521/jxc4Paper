package com.gmail.mosoft521.jxc4papaer.entity;

import java.util.Date;

public class PurchaseReturnStockOut {
    private Integer purchaseReturnStockOutId;

    private Integer purchaseReturnId;

    private Integer empId;

    private String purchaseReturnStockOutNo;

    private Date day;

    private String remark;

    public Integer getPurchaseReturnStockOutId() {
        return purchaseReturnStockOutId;
    }

    public void setPurchaseReturnStockOutId(Integer purchaseReturnStockOutId) {
        this.purchaseReturnStockOutId = purchaseReturnStockOutId;
    }

    public Integer getPurchaseReturnId() {
        return purchaseReturnId;
    }

    public void setPurchaseReturnId(Integer purchaseReturnId) {
        this.purchaseReturnId = purchaseReturnId;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getPurchaseReturnStockOutNo() {
        return purchaseReturnStockOutNo;
    }

    public void setPurchaseReturnStockOutNo(String purchaseReturnStockOutNo) {
        this.purchaseReturnStockOutNo = purchaseReturnStockOutNo == null ? null : purchaseReturnStockOutNo.trim();
    }

    public Date getDay() {
        return day;
    }

    public void setDay(Date day) {
        this.day = day;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}