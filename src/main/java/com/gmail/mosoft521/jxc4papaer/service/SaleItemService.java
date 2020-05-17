package com.gmail.mosoft521.jxc4papaer.service;

import com.gmail.mosoft521.jxc4papaer.entity.SaleItem;
import com.gmail.mosoft521.jxc4papaer.vo.ResponseVO;
import com.gmail.mosoft521.jxc4papaer.vo.SaleItemVO;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface SaleItemService {

    List<SaleItemVO> list();

    List<SaleItemVO> list(Integer saleId);

    @Transactional
    ResponseVO saveOrUpdate(SaleItem saleItem);

    @Transactional
    boolean delete(Integer saleItemId);

    SaleItem getById(Integer saleItemId);
}