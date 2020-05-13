package com.gmail.mosoft521.jxc4papaer.vo;

import com.gmail.mosoft521.jxc4papaer.entity.Purchase;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class PurchaseVO extends Purchase {

    //日期格式
    private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    private String providerName;

    private String empName;

    private String strDay;

    private List<PurchaseItemVO> purchaseItemVOList;


    public PurchaseVO() {
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

    public List<PurchaseItemVO> getPurchaseItemVOList() {
        return purchaseItemVOList;
    }

    public void setPurchaseItemVOList(List<PurchaseItemVO> purchaseItemVOList) {
        this.purchaseItemVOList = purchaseItemVOList;
    }
}
