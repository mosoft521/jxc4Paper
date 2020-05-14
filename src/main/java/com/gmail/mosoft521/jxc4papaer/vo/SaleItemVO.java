package com.gmail.mosoft521.jxc4papaer.vo;

import com.gmail.mosoft521.jxc4papaer.entity.SaleItem;

import java.text.SimpleDateFormat;

public class SaleItemVO extends SaleItem {

    //日期格式
    private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    private String productName;

    public SaleItemVO() {
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
