package com.gmail.mosoft521.jxc4papaer.vo;

import com.gmail.mosoft521.jxc4papaer.entity.Customer;

public class CustomerVO extends Customer {

    private String customerTypeName;

    private String sexName;

    public CustomerVO() {
    }

    public String getCustomerTypeName() {
        return customerTypeName;
    }

    public void setCustomerTypeName(String customerTypeName) {
        this.customerTypeName = customerTypeName;
    }

    public String getSexName() {
        if ("F".equalsIgnoreCase(super.getSex())) {
            return "女";
        } else {
            return "男";
        }
    }

    public void setSexName(String sexName) {
        this.sexName = sexName;
        if ("F".equalsIgnoreCase(sexName) || "女".equals(sexName)) {
            super.setSex("F");
        } else {
            super.setSex("M");
        }
    }
}
