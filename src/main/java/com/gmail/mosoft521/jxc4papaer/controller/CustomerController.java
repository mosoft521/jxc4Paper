package com.gmail.mosoft521.jxc4papaer.controller;

import com.gmail.mosoft521.jxc4papaer.entity.Customer;
import com.gmail.mosoft521.jxc4papaer.service.CustomerService;
import com.gmail.mosoft521.jxc4papaer.service.CustomerTypeService;
import com.gmail.mosoft521.jxc4papaer.vo.CustomerVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private CustomerTypeService customerTypeService;

    /**
     * 获取所有客户列表
     *
     * @return
     */
    @RequestMapping("/list")
    @ResponseBody
    public List<CustomerVO> list() {
        List<Customer> customerList = customerService.list();
        List<CustomerVO> customerVOList = new ArrayList<>(customerList.size());
        for(Customer customer:customerList){
            CustomerVO customerVO = new CustomerVO();
            BeanUtils.copyProperties(customer, customerVO);
            customerVO.setCustomerTypeName(customerTypeService.getNameById(customerVO.getCustomerTypeId()));
            customerVOList.add(customerVO);
        }
        return customerVOList;
    }

    /**
     * 保存或修改客户
     *
     * @return
     */
    @PostMapping("/saveOrUpdate")
    @ResponseBody
    public boolean saveOrUpdate(@RequestParam Integer customerId, @RequestParam String name, @RequestParam Integer customerTypeId, @RequestParam String tel, @RequestParam String sex, @RequestParam String address, @RequestParam String remark) {
        Customer customer = new Customer();
        customer.setCustomerId(customerId);
        customer.setName(name);
        customer.setCustomerTypeId(customerTypeId);
        customer.setTel(tel);
        customer.setSex(sex);
        customer.setAddress(address);
        customer.setRemark(remark);
        return customerService.saveOrUpdate(customer);
    }

    @PostMapping("/delete")
    @ResponseBody
    public boolean delete(@RequestParam Integer customerId) {
        return customerService.delete(customerId);
    }
}
