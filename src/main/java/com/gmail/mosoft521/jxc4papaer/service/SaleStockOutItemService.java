package com.gmail.mosoft521.jxc4papaer.service;

import com.gmail.mosoft521.jxc4papaer.entity.SaleStockOutItem;
import com.gmail.mosoft521.jxc4papaer.vo.SaleStockOutItemVO;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface SaleStockOutItemService {

    List<SaleStockOutItemVO> list();
    List<SaleStockOutItemVO> list(Integer saleStockOutId);

    @Transactional
    boolean saveOrUpdate(SaleStockOutItem saleStockOutItem);

    @Transactional
    boolean delete(Integer saleStockOutItemId);
}