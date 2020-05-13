package com.gmail.mosoft521.jxc4papaer.vo;

import com.gmail.mosoft521.jxc4papaer.entity.PurchaseItem;

import java.text.SimpleDateFormat;

public class PurchaseItemVO extends PurchaseItem {

    //日期格式
    private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    private String productName;

    public PurchaseItemVO() {
    }


    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
