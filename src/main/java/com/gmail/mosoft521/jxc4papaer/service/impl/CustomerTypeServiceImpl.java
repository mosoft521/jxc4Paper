package com.gmail.mosoft521.jxc4papaer.service.impl;

import com.gmail.mosoft521.jxc4papaer.dao.CustomerTypeMapper;
import com.gmail.mosoft521.jxc4papaer.entity.CustomerType;
import com.gmail.mosoft521.jxc4papaer.service.CustomerTypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CustomerTypeServiceImpl implements CustomerTypeService {

    @Resource
    private CustomerTypeMapper customerTypeMapper;

    @Override
    public List<CustomerType> list() {
        return customerTypeMapper.selectByExample(null);
    }

    @Override
    public boolean saveOrUpdate(CustomerType customerType) {
        int r = 0;
        if (null == customerType.getCustomerTypeId()) {
            r = customerTypeMapper.insertSelective(customerType);
        } else {
            r = customerTypeMapper.updateByPrimaryKey(customerType);
        }
        return r > 0 ? true : false;
    }

    @Override
    public boolean delete(Integer customerTypeId) {
        return customerTypeMapper.deleteByPrimaryKey(customerTypeId) > 0 ? true : false;
    }

    @Override
    public String getNameById(Integer customerTypeId) {
        return customerTypeMapper.selectByPrimaryKey(customerTypeId).getName();
    }
}
