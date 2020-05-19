package com.gmail.mosoft521.jxc4papaer.entity;

public class Supply extends SupplyKey {
    private Float price;

    private String remark;

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}