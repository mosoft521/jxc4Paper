package com.gmail.mosoft521.jxc4papaer.service.impl;

import com.gmail.mosoft521.jxc4papaer.dao.StockMapper;
import com.gmail.mosoft521.jxc4papaer.entity.Stock;
import com.gmail.mosoft521.jxc4papaer.service.StockService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StockServiceImpl implements StockService {

    @Resource
    private StockMapper stockMapper;

    @Override
    public List<Stock> list() {
        return stockMapper.selectByExample(null);
    }

    @Override
    public boolean saveOrUpdate(Stock stock) {
        return stockMapper.updateByPrimaryKey(stock) > 0 ? true : false;
    }

    @Override
    public boolean delete(Integer productId) {
        return stockMapper.deleteByPrimaryKey(productId) > 0 ? true : false;
    }

    @Override
    public Stock getStockById(Integer productId) {
        return stockMapper.selectByPrimaryKey(productId);
    }
}
