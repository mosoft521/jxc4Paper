package com.gmail.mosoft521.jxc4papaer.vo;

import com.gmail.mosoft521.jxc4papaer.entity.PurchaseStockIn;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PurchaseStockInVO extends PurchaseStockIn {

    //日期格式
    private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    private String purchaseNo;

    private String providerName;

    private String empName;

    private String productName;

    private String strDay;

    public PurchaseStockInVO() {
    }

    public String getPurchaseNo() {
        return purchaseNo;
    }

    public void setPurchaseNo(String purchaseNo) {
        this.purchaseNo = purchaseNo;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getStrDay() {
        return dateFormat.format(super.getDay());
    }

    public void setStrDay(String strDay) {
        Date d = null;
        try {
            d = dateFormat.parse(strDay);
        } catch (ParseException e) {
            super.setDay(new Date());
        }
        super.setDay(d);
    }
}
