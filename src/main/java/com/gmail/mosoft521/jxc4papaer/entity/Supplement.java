package com.gmail.mosoft521.jxc4papaer.entity;

public class Supplement {
    private Integer supplementId;

    private String supplementNo;

    private Integer productId;

    private Integer quantity;

    private String remark;

    public Integer getSupplementId() {
        return supplementId;
    }

    public void setSupplementId(Integer supplementId) {
        this.supplementId = supplementId;
    }

    public String getSupplementNo() {
        return supplementNo;
    }

    public void setSupplementNo(String supplementNo) {
        this.supplementNo = supplementNo == null ? null : supplementNo.trim();
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}