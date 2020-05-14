package com.gmail.mosoft521.jxc4papaer.service;

import com.gmail.mosoft521.jxc4papaer.entity.PurchaseStockIn;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface PurchaseStockInService {

    List<PurchaseStockIn> list();

    @Transactional
    boolean saveOrUpdate(PurchaseStockIn purchaseStockIn);

    @Transactional
    boolean delete(Integer purchaseStockInId);

    String getNameById(Integer purchaseStockInId);
}