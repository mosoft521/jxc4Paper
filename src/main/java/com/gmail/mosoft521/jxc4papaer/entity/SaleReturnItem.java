package com.gmail.mosoft521.jxc4papaer.entity;

public class SaleReturnItem {
    private Integer saleReturnItemId;

    private Integer saleReturnId;

    private Integer productId;

    private Integer quantity;

    private String remark;

    public Integer getSaleReturnItemId() {
        return saleReturnItemId;
    }

    public void setSaleReturnItemId(Integer saleReturnItemId) {
        this.saleReturnItemId = saleReturnItemId;
    }

    public Integer getSaleReturnId() {
        return saleReturnId;
    }

    public void setSaleReturnId(Integer saleReturnId) {
        this.saleReturnId = saleReturnId;
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