package com.gmail.mosoft521.jxc4papaer.entity;

import java.util.Date;

public class SaleStockOut {
    private Integer saleStockOutId;

    private Integer saleId;

    private Integer empId;

    private String saleStockOutNo;

    private Date day;

    private String remark;

    public Integer getSaleStockOutId() {
        return saleStockOutId;
    }

    public void setSaleStockOutId(Integer saleStockOutId) {
        this.saleStockOutId = saleStockOutId;
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

    public String getSaleStockOutNo() {
        return saleStockOutNo;
    }

    public void setSaleStockOutNo(String saleStockOutNo) {
        this.saleStockOutNo = saleStockOutNo == null ? null : saleStockOutNo.trim();
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