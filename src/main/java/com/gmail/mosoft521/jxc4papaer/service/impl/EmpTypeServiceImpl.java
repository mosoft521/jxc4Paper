package com.gmail.mosoft521.jxc4papaer.service.impl;

import com.gmail.mosoft521.jxc4papaer.dao.EmpTypeMapper;
import com.gmail.mosoft521.jxc4papaer.entity.EmpType;
import com.gmail.mosoft521.jxc4papaer.service.EmpTypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EmpTypeServiceImpl implements EmpTypeService {

    @Resource
    private EmpTypeMapper empTypeMapper;

    @Override
    public List<EmpType> list() {
        return empTypeMapper.selectByExample(null);
    }

    @Override
    public boolean saveOrUpdate(EmpType empType) {
        int r = 0;
        if (null == empType.getEmpTypeId()) {
            r = empTypeMapper.insertSelective(empType);
        } else {
            r = empTypeMapper.updateByPrimaryKey(empType);
        }
        return r > 0 ? true : false;
    }

    @Override
    public boolean delete(Integer empTypeId) {
        return empTypeMapper.deleteByPrimaryKey(empTypeId) > 0 ? true : false;
    }

    @Override
    public String getNameById(Integer empTypeId) {
        return empTypeMapper.selectByPrimaryKey(empTypeId).getName();
    }
}
