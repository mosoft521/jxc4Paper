package com.gmail.mosoft521.jxc4papaer.entity;

public class Warehouse {
    private Integer warehouseId;

    private String warehouseName;

    private String warehouseAddress;

    private String tel;

    private Integer warehouseSize;

    public Integer getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(Integer warehouseId) {
        this.warehouseId = warehouseId;
    }

    public String getWarehouseName() {
        return warehouseName;
    }

    public void setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName == null ? null : warehouseName.trim();
    }

    public String getWarehouseAddress() {
        return warehouseAddress;
    }

    public void setWarehouseAddress(String warehouseAddress) {
        this.warehouseAddress = warehouseAddress == null ? null : warehouseAddress.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public Integer getWarehouseSize() {
        return warehouseSize;
    }

    public void setWarehouseSize(Integer warehouseSize) {
        this.warehouseSize = warehouseSize;
    }
}