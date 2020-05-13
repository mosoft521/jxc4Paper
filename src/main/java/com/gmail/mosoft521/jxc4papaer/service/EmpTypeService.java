package com.gmail.mosoft521.jxc4papaer.service;

import com.gmail.mosoft521.jxc4papaer.entity.EmpType;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface EmpTypeService {

    List<EmpType> list();

    @Transactional
    boolean saveOrUpdate(EmpType empType);

    @Transactional
    boolean delete(Integer empTypeId);

    String getNameById(Integer empTypeId);
}