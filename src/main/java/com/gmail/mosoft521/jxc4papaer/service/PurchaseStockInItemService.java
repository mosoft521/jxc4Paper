package com.gmail.mosoft521.jxc4papaer.service;

import com.gmail.mosoft521.jxc4papaer.entity.PurchaseStockInItem;
import com.gmail.mosoft521.jxc4papaer.vo.PurchaseStockInItemVO;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface PurchaseStockInItemService {

    List<PurchaseStockInItemVO> list();

    List<PurchaseStockInItemVO> list(Integer purchaseStockInId);

    @Transactional
    boolean saveOrUpdate(PurchaseStockInItem purchaseStockInItem);

    @Transactional
    boolean delete(Integer purchaseStockInItemId);
}