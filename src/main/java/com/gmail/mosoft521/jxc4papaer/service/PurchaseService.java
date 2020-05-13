package com.gmail.mosoft521.jxc4papaer.service;

import com.gmail.mosoft521.jxc4papaer.entity.Purchase;
import com.gmail.mosoft521.jxc4papaer.vo.PurchaseVO;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface PurchaseService {

    List<PurchaseVO> list();

    @Transactional
    boolean saveOrUpdate(Purchase purchase);

    @Transactional
    boolean delete(Integer purchaseId);

    String getNoById(Integer purchaseId);

    Purchase getById(Integer purchaseId);
}