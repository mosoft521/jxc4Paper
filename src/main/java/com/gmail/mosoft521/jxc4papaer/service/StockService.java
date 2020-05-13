package com.gmail.mosoft521.jxc4papaer.service;

import com.gmail.mosoft521.jxc4papaer.entity.Stock;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface StockService {

    List<Stock> list();

    @Transactional
    boolean saveOrUpdate(Stock stock);

    @Transactional
    boolean delete(Integer productId);

    Stock getStockById(Integer productId);
}