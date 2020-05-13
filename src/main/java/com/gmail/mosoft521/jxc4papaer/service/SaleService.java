package com.gmail.mosoft521.jxc4papaer.service;

import com.gmail.mosoft521.jxc4papaer.entity.Sale;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface SaleService {

    List<Sale> list();

    @Transactional
    boolean saveOrUpdate(Sale sale);

    @Transactional
    boolean delete(Integer saleId);

    String getNoById(Integer saleId);

    Sale getById(Integer saleId);
}