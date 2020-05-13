package com.gmail.mosoft521.jxc4papaer.service;

import com.gmail.mosoft521.jxc4papaer.entity.SaleStockOut;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface SaleStockOutService {

    List<SaleStockOut> list();

    @Transactional
    boolean saveOrUpdate(SaleStockOut stockOut);

    @Transactional
    boolean delete(Integer stockOutId);

    String getNameById(Integer stockOutId);
}