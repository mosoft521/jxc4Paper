package com.gmail.mosoft521.jxc4papaer.controller;

import com.gmail.mosoft521.jxc4papaer.entity.CustomerType;
import com.gmail.mosoft521.jxc4papaer.service.CustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/customerType")
public class CustomerTypeController {

    @Autowired
    private CustomerTypeService customerTypeService;

    /**
     * 获取所有员工类型列表
     *
     * @return
     */
    @RequestMapping("/list")
    @ResponseBody
    public List<CustomerType> list() {
        List<CustomerType> deptList = customerTypeService.list();
        return deptList;
    }

    /**
     * 保存或修改员工类型
     *
     * @return
     */
    @PostMapping("/saveOrUpdate")
    @ResponseBody
    public boolean saveOrUpdate(@RequestParam Integer customerTypeId, @RequestParam String name, @RequestParam Float discountRate, @RequestParam String remark) {
        CustomerType customerType = new CustomerType();
        customerType.setCustomerTypeId(customerTypeId);
        customerType.setName(name);
        customerType.setDiscountRate(discountRate);
        customerType.setRemark(remark);
        return customerTypeService.saveOrUpdate(customerType);
    }

    @PostMapping("/delete")
    @ResponseBody
    public boolean delete(@RequestParam Integer customerTypeId) {
        return customerTypeService.delete(customerTypeId);
    }
}
