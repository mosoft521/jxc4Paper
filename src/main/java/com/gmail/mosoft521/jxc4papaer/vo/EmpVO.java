package com.gmail.mosoft521.jxc4papaer.vo;

import com.gmail.mosoft521.jxc4papaer.entity.Emp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EmpVO extends Emp {
    //日期格式
    private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年M月d日");

    private String deptName;

    private String manageTypeName;

    private String sexName;

    private String strBirthday;

    public EmpVO() {
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getManageTypeName() {
        return manageTypeName;
    }

    public void setManageTypeName(String manageTypeName) {
        this.manageTypeName = manageTypeName;
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

    public String getStrBirthday() {
        return dateFormat.format(super.getBirthday());
    }

    public void setStrBirthday(String strBirthday) {
        Date d = null;
        try {
            d = dateFormat.parse(strBirthday);
        } catch (ParseException e) {
            super.setBirthday(new Date());
        }
        super.setBirthday(d);
    }
}
