package com.gmail.mosoft521.jxc4papaer.service.impl;

import com.gmail.mosoft521.jxc4papaer.dao.PurchaseMapper;
import com.gmail.mosoft521.jxc4papaer.dao.PurchaseStockInMapper;
import com.gmail.mosoft521.jxc4papaer.dao.StockMapper;
import com.gmail.mosoft521.jxc4papaer.entity.Purchase;
import com.gmail.mosoft521.jxc4papaer.entity.PurchaseStockIn;
import com.gmail.mosoft521.jxc4papaer.service.PurchaseStockInService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PurchaseStockInServiceImpl implements PurchaseStockInService {

    @Resource
    private PurchaseStockInMapper purchaseStockInMapper;

    @Resource
    private StockMapper stockMapper;

    @Resource
    private PurchaseMapper purchaseMapper;

    @Override
    public List<PurchaseStockIn> list() {
        return purchaseStockInMapper.selectByExample(null);
    }

    @Override
    public boolean saveOrUpdate(PurchaseStockIn purchaseStockIn) {
        int r = 0;
        if (null == purchaseStockIn.getPurchaseStockInId()) {
            r = purchaseStockInMapper.insertSelective(purchaseStockIn);
            //更新一下库存
            Purchase purchase = purchaseMapper.selectByPrimaryKey(purchaseStockIn.getPurchaseId());
        } else {
            PurchaseStockIn stockInOld = purchaseStockInMapper.selectByPrimaryKey(purchaseStockIn.getPurchaseStockInId());
            r = purchaseStockInMapper.updateByPrimaryKey(purchaseStockIn);
            //更新一下库存
            Purchase purchase = purchaseMapper.selectByPrimaryKey(purchaseStockIn.getPurchaseId());
        }
        return r > 0 ? true : false;
    }

    @Override
    public boolean delete(Integer purchaseStockInId) {
        //更新库存
        PurchaseStockIn stockIn = purchaseStockInMapper.selectByPrimaryKey(purchaseStockInId);
        Purchase purchase = purchaseMapper.selectByPrimaryKey(stockIn.getPurchaseId());
        return purchaseStockInMapper.deleteByPrimaryKey(purchaseStockInId) > 0 ? true : false;
    }

    @Override
    public String getNameById(Integer purchaseStockInId) {
        return purchaseStockInMapper.selectByPrimaryKey(purchaseStockInId).getPurchaseStockInNo();
    }
}
