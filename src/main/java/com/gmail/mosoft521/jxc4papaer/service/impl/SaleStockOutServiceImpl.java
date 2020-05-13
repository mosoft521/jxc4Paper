package com.gmail.mosoft521.jxc4papaer.service.impl;

import com.gmail.mosoft521.jxc4papaer.dao.SaleMapper;
import com.gmail.mosoft521.jxc4papaer.dao.StockMapper;
import com.gmail.mosoft521.jxc4papaer.dao.SaleStockOutMapper;
import com.gmail.mosoft521.jxc4papaer.entity.Sale;
import com.gmail.mosoft521.jxc4papaer.entity.Stock;
import com.gmail.mosoft521.jxc4papaer.entity.SaleStockOut;
import com.gmail.mosoft521.jxc4papaer.service.SaleStockOutService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SaleStockOutServiceImpl implements SaleStockOutService {

    @Resource
    private SaleStockOutMapper stockOutMapper;

    @Resource
    private StockMapper stockMapper;

    @Resource
    private SaleMapper saleMapper;

    @Override
    public List<SaleStockOut> list() {
        return stockOutMapper.selectByExample(null);
    }

    @Override
    public boolean saveOrUpdate(SaleStockOut saleStockOut) {
        int r = 0;
        if (null == saleStockOut.getSaleStockOutId()) {
            r = stockOutMapper.insertSelective(saleStockOut);
            //更新一下库存
            Sale sale = saleMapper.selectByPrimaryKey(saleStockOut.getSaleId());
        } else {
            SaleStockOut stockOutOld = stockOutMapper.selectByPrimaryKey(saleStockOut.getSaleStockOutId());
            r = stockOutMapper.updateByPrimaryKey(saleStockOut);
            //更新一下库存
            Sale sale = saleMapper.selectByPrimaryKey(saleStockOut.getSaleId());
        }
        return r > 0 ? true : false;
    }

    @Override
    public boolean delete(Integer stockOutId) {
        //更新库存
        SaleStockOut stockOut = stockOutMapper.selectByPrimaryKey(stockOutId);
        Sale sale = saleMapper.selectByPrimaryKey(stockOut.getSaleId());
        return stockOutMapper.deleteByPrimaryKey(stockOutId) > 0 ? true : false;
    }

    @Override
    public String getNameById(Integer stockOutId) {
        return stockOutMapper.selectByPrimaryKey(stockOutId).getSaleStockOutNo();
    }
}
