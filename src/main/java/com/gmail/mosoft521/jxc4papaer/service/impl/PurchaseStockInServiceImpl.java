package com.gmail.mosoft521.jxc4papaer.service.impl;

import com.gmail.mosoft521.jxc4papaer.dao.PurchaseMapper;
import com.gmail.mosoft521.jxc4papaer.dao.PurchaseStockInItemMapper;
import com.gmail.mosoft521.jxc4papaer.dao.PurchaseStockInMapper;
import com.gmail.mosoft521.jxc4papaer.dao.StockMapper;
import com.gmail.mosoft521.jxc4papaer.entity.Purchase;
import com.gmail.mosoft521.jxc4papaer.entity.PurchaseStockIn;
import com.gmail.mosoft521.jxc4papaer.entity.PurchaseStockInItem;
import com.gmail.mosoft521.jxc4papaer.entity.PurchaseStockInItemExample;
import com.gmail.mosoft521.jxc4papaer.entity.Stock;
import com.gmail.mosoft521.jxc4papaer.service.PurchaseStockInService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PurchaseStockInServiceImpl implements PurchaseStockInService {

    @Resource
    private PurchaseStockInMapper purchaseStockInMapper;
    @Resource
    private PurchaseStockInItemMapper purchaseStockInItemMapper;

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
        } else {
            PurchaseStockIn stockInOld = purchaseStockInMapper.selectByPrimaryKey(purchaseStockIn.getPurchaseStockInId());
            r = purchaseStockInMapper.updateByPrimaryKey(purchaseStockIn);
        }
        return r > 0 ? true : false;
    }

    @Override
    public boolean delete(Integer purchaseStockInId) {
        //把明细也删除了
        PurchaseStockInItemExample purchaseStockInItemExample = new PurchaseStockInItemExample();
        PurchaseStockInItemExample.Criteria purchaseStockInItemExampleCriteria = purchaseStockInItemExample.createCriteria();
        purchaseStockInItemExampleCriteria.andPurchaseStockInIdEqualTo(purchaseStockInId);
        List<PurchaseStockInItem> purchaseStockInItemList = purchaseStockInItemMapper.selectByExample(purchaseStockInItemExample);
        for (PurchaseStockInItem purchaseStockInItem : purchaseStockInItemList) {
            purchaseStockInItemMapper.deleteByPrimaryKey(purchaseStockInItem.getPurchaseStockInItemId());
            //更新一下库存【删入库明细，就是减当前库存】
            Stock stock = stockMapper.selectByPrimaryKey(purchaseStockInItem.getProductId());
            stock.setQuantityCurrent(stock.getQuantityCurrent() - purchaseStockInItem.getQuantity());
            //todo:最小库存判断
            stockMapper.updateByPrimaryKey(stock);
        }

        return purchaseStockInMapper.deleteByPrimaryKey(purchaseStockInId) > 0 ? true : false;
    }

    @Override
    public String getNameById(Integer purchaseStockInId) {
        return purchaseStockInMapper.selectByPrimaryKey(purchaseStockInId).getPurchaseStockInNo();
    }

    @Override
    public PurchaseStockIn getById(Integer purchaseStockInId) {
        return purchaseStockInMapper.selectByPrimaryKey(purchaseStockInId);
    }
}
