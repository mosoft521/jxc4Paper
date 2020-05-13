package com.gmail.mosoft521.jxc4papaer.service.impl;

import com.gmail.mosoft521.jxc4papaer.dao.SaleMapper;
import com.gmail.mosoft521.jxc4papaer.entity.Sale;
import com.gmail.mosoft521.jxc4papaer.service.SaleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SaleServiceImpl implements SaleService {

    @Resource
    private SaleMapper saleMapper;

    @Override
    public List<Sale> list() {
        return saleMapper.selectByExample(null);
    }

    @Override
    public boolean saveOrUpdate(Sale sale) {
        int r = 0;
        if (null == sale.getSaleId()) {
            r = saleMapper.insertSelective(sale);
        } else {
            r = saleMapper.updateByPrimaryKey(sale);
        }
        return r > 0 ? true : false;
    }

    @Override
    public boolean delete(Integer saleId) {
        return saleMapper.deleteByPrimaryKey(saleId) > 0 ? true : false;
    }

    @Override
    public String getNoById(Integer saleId) {
        return saleMapper.selectByPrimaryKey(saleId).getSaleNo();
    }

    @Override
    public Sale getById(Integer saleId) {
        return saleMapper.selectByPrimaryKey(saleId);
    }
}
