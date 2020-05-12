package com.gmail.mosoft521.jxc4papaer.entity;

import java.util.Date;

public class SaleReturnStockIn {
    private Integer saleReturnStockInId;

    private Integer saleReturnId;

    private Integer empId;

    private String saleReturnStockInNo;

    private Date day;

    private String remark;

    public Integer getSaleReturnStockInId() {
        return saleReturnStockInId;
    }

    public void setSaleReturnStockInId(Integer saleReturnStockInId) {
        this.saleReturnStockInId = saleReturnStockInId;
    }

    public Integer getSaleReturnId() {
        return saleReturnId;
    }

    public void setSaleReturnId(Integer saleReturnId) {
        this.saleReturnId = saleReturnId;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getSaleReturnStockInNo() {
        return saleReturnStockInNo;
    }

    public void setSaleReturnStockInNo(String saleReturnStockInNo) {
        this.saleReturnStockInNo = saleReturnStockInNo == null ? null : saleReturnStockInNo.trim();
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