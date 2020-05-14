package com.gmail.mosoft521.jxc4papaer.service;

import com.gmail.mosoft521.jxc4papaer.entity.SaleStockOut;
import com.gmail.mosoft521.jxc4papaer.vo.SaleStockOutVO;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface SaleStockOutService {

    List<SaleStockOutVO> list();

    @Transactional
    boolean saveOrUpdate(SaleStockOut saleStockOut);

    @Transactional
    boolean delete(Integer saleStockOutId);

    String getNameById(Integer saleStockOutId);

    SaleStockOut getById(Integer saleStockOutId);
}