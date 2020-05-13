package com.gmail.mosoft521.jxc4papaer.service;

import com.gmail.mosoft521.jxc4papaer.entity.PurchaseStockIn;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface PurchaseStockInService {

    List<PurchaseStockIn> list();

    @Transactional
    boolean saveOrUpdate(PurchaseStockIn stockIn);

    @Transactional
    boolean delete(Integer stockInId);

    String getNameById(Integer stockInId);
}