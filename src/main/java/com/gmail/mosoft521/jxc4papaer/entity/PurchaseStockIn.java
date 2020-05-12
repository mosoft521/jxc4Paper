package com.gmail.mosoft521.jxc4papaer.entity;

import java.util.Date;

public class PurchaseStockIn {
    private Integer purchaseStockInId;

    private Integer purchaseId;

    private Integer empId;

    private String purchaseStockInNo;

    private Date day;

    private String remark;

    public Integer getPurchaseStockInId() {
        return purchaseStockInId;
    }

    public void setPurchaseStockInId(Integer purchaseStockInId) {
        this.purchaseStockInId = purchaseStockInId;
    }

    public Integer getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(Integer purchaseId) {
        this.purchaseId = purchaseId;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getPurchaseStockInNo() {
        return purchaseStockInNo;
    }

    public void setPurchaseStockInNo(String purchaseStockInNo) {
        this.purchaseStockInNo = purchaseStockInNo == null ? null : purchaseStockInNo.trim();
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