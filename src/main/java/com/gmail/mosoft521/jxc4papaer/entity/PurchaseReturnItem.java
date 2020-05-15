package com.gmail.mosoft521.jxc4papaer.entity;

public class PurchaseReturnItem {
    private Integer purchaseReturnItemId;

    private Integer purchaseReturnId;

    private Integer productId;

    private Integer quantity;

    private String remark;

    public Integer getPurchaseReturnItemId() {
        return purchaseReturnItemId;
    }

    public void setPurchaseReturnItemId(Integer purchaseReturnItemId) {
        this.purchaseReturnItemId = purchaseReturnItemId;
    }

    public Integer getPurchaseReturnId() {
        return purchaseReturnId;
    }

    public void setPurchaseReturnId(Integer purchaseReturnId) {
        this.purchaseReturnId = purchaseReturnId;
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