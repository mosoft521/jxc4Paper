package com.gmail.mosoft521.jxc4papaer.entity;

public class PurchaseStockInItem {
    private Integer purchaseStockInItemId;

    private Integer purchaseStockInId;

    private Integer productId;

    private Integer quantity;

    private String remark;

    public Integer getPurchaseStockInItemId() {
        return purchaseStockInItemId;
    }

    public void setPurchaseStockInItemId(Integer purchaseStockInItemId) {
        this.purchaseStockInItemId = purchaseStockInItemId;
    }

    public Integer getPurchaseStockInId() {
        return purchaseStockInId;
    }

    public void setPurchaseStockInId(Integer purchaseStockInId) {
        this.purchaseStockInId = purchaseStockInId;
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