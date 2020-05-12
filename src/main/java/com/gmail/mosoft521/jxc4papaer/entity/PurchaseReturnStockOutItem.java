package com.gmail.mosoft521.jxc4papaer.entity;

public class PurchaseReturnStockOutItem {
    private Integer purchaseReturnStockOutItemId;

    private Integer purchaseReturnStockOutId;

    private Integer productId;

    private Integer quantity;

    private String remark;

    public Integer getPurchaseReturnStockOutItemId() {
        return purchaseReturnStockOutItemId;
    }

    public void setPurchaseReturnStockOutItemId(Integer purchaseReturnStockOutItemId) {
        this.purchaseReturnStockOutItemId = purchaseReturnStockOutItemId;
    }

    public Integer getPurchaseReturnStockOutId() {
        return purchaseReturnStockOutId;
    }

    public void setPurchaseReturnStockOutId(Integer purchaseReturnStockOutId) {
        this.purchaseReturnStockOutId = purchaseReturnStockOutId;
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