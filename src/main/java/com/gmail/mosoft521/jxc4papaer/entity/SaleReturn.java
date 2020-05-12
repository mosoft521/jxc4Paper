package com.gmail.mosoft521.jxc4papaer.entity;

import java.util.Date;

public class SaleReturn {
    private Integer saleReturnId;

    private Integer saleId;

    private Integer empId;

    private String saleReturnNo;

    private Date day;

    private String remark;

    public Integer getSaleReturnId() {
        return saleReturnId;
    }

    public void setSaleReturnId(Integer saleReturnId) {
        this.saleReturnId = saleReturnId;
    }

    public Integer getSaleId() {
        return saleId;
    }

    public void setSaleId(Integer saleId) {
        this.saleId = saleId;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getSaleReturnNo() {
        return saleReturnNo;
    }

    public void setSaleReturnNo(String saleReturnNo) {
        this.saleReturnNo = saleReturnNo == null ? null : saleReturnNo.trim();
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