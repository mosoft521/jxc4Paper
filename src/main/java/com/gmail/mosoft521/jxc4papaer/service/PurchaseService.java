package com.gmail.mosoft521.jxc4papaer.service;

import com.gmail.mosoft521.jxc4papaer.entity.Purchase;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface PurchaseService {

    List<Purchase> list();

    @Transactional
    boolean saveOrUpdate(Purchase purchase);

    @Transactional
    boolean delete(Integer purchaseId);

    String getNoById(Integer purchaseId);

    Purchase getById(Integer purchaseId);
}