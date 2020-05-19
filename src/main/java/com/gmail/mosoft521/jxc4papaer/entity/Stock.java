package com.gmail.mosoft521.jxc4papaer.entity;

public class Stock extends StockKey {
    private Integer quantityCurrent;

    private Integer quantityMin;

    public Integer getQuantityCurrent() {
        return quantityCurrent;
    }

    public void setQuantityCurrent(Integer quantityCurrent) {
        this.quantityCurrent = quantityCurrent;
    }

    public Integer getQuantityMin() {
        return quantityMin;
    }

    public void setQuantityMin(Integer quantityMin) {
        this.quantityMin = quantityMin;
    }
}