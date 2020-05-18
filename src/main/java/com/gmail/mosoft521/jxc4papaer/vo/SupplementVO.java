package com.gmail.mosoft521.jxc4papaer.vo;

import com.gmail.mosoft521.jxc4papaer.entity.Supplement;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SupplementVO extends Supplement {
    //日期格式
    private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    private String productName;

    private String strDay;

    public SupplementVO() {
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
