package com.gmail.mosoft521.jxc4papaer.entity;

public class SaleReturnStockInItem {
    private Integer saleReturnStockInItemId;

    private Integer saleReturnStockInId;

    private Integer productId;

    private Integer quantity;

    private String remark;

    public Integer getSaleReturnStockInItemId() {
        return saleReturnStockInItemId;
    }

    public void setSaleReturnStockInItemId(Integer saleReturnStockInItemId) {
        this.saleReturnStockInItemId = saleReturnStockInItemId;
    }

    public Integer getSaleReturnStockInId() {
        return saleReturnStockInId;
    }

    public void setSaleReturnStockInId(Integer saleReturnStockInId) {
        this.saleReturnStockInId = saleReturnStockInId;
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