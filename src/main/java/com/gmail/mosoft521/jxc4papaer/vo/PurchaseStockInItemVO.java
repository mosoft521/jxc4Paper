package com.gmail.mosoft521.jxc4papaer.vo;

import com.gmail.mosoft521.jxc4papaer.entity.PurchaseStockInItem;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PurchaseStockInItemVO extends PurchaseStockInItem {

    //日期格式
    private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    private String productName;

    public PurchaseStockInItemVO() {
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

}
