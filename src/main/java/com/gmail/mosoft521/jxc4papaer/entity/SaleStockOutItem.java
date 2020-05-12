package com.gmail.mosoft521.jxc4papaer.entity;

public class SaleStockOutItem {
    private Integer saleStockOutItemId;

    private Integer saleStockOutId;

    private Integer productId;

    private Integer quantity;

    private String remark;

    public Integer getSaleStockOutItemId() {
        return saleStockOutItemId;
    }

    public void setSaleStockOutItemId(Integer saleStockOutItemId) {
        this.saleStockOutItemId = saleStockOutItemId;
    }

    public Integer getSaleStockOutId() {
        return saleStockOutId;
    }

    public void setSaleStockOutId(Integer saleStockOutId) {
        this.saleStockOutId = saleStockOutId;
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