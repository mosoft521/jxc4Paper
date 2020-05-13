package com.gmail.mosoft521.jxc4papaer.service;

import com.gmail.mosoft521.jxc4papaer.entity.PurchaseItem;
import com.gmail.mosoft521.jxc4papaer.vo.PurchaseItemVO;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface PurchaseItemService {

    List<PurchaseItemVO> list();

    List<PurchaseItemVO> list(Integer purchaseId);

    @Transactional
    boolean saveOrUpdate(PurchaseItem purchaseItem);

    @Transactional
    boolean delete(Integer purchaseItemId);

    PurchaseItem getById(Integer purchaseItemId);
}