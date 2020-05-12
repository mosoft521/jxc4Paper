package com.gmail.mosoft521.jxc4papaer.entity;

import java.util.Date;

public class PurchaseReturn {
    private Integer purchaseReturnId;

    private Integer purchaseId;

    private Integer empId;

    private String purchaseReturnNo;

    private Date day;

    private String remark;

    public Integer getPurchaseReturnId() {
        return purchaseReturnId;
    }

    public void setPurchaseReturnId(Integer purchaseReturnId) {
        this.purchaseReturnId = purchaseReturnId;
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

    public String getPurchaseReturnNo() {
        return purchaseReturnNo;
    }

    public void setPurchaseReturnNo(String purchaseReturnNo) {
        this.purchaseReturnNo = purchaseReturnNo == null ? null : purchaseReturnNo.trim();
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