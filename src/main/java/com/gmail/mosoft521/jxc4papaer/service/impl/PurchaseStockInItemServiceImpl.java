package com.gmail.mosoft521.jxc4papaer.service.impl;

import com.gmail.mosoft521.jxc4papaer.dao.ProductMapper;
import com.gmail.mosoft521.jxc4papaer.dao.PurchaseStockInItemMapper;
import com.gmail.mosoft521.jxc4papaer.dao.StockMapper;
import com.gmail.mosoft521.jxc4papaer.entity.PurchaseStockInItem;
import com.gmail.mosoft521.jxc4papaer.entity.PurchaseStockInItemExample;
import com.gmail.mosoft521.jxc4papaer.service.PurchaseStockInItemService;
import com.gmail.mosoft521.jxc4papaer.vo.PurchaseStockInItemVO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class PurchaseStockInItemServiceImpl implements PurchaseStockInItemService {

    @Resource
    private PurchaseStockInItemMapper purchaseStockInItemMapper;

    @Resource
    private ProductMapper productMapper;

    @Resource
    private StockMapper stockMapper;

    @Override
    public List<PurchaseStockInItemVO> list() {
        List<PurchaseStockInItem> purchaseStockInItemList = purchaseStockInItemMapper.selectByExample(null);
        List<PurchaseStockInItemVO> purchaseStockInItemVOList = new ArrayList<>(purchaseStockInItemList.size());
        for (PurchaseStockInItem purchaseStockInItem : purchaseStockInItemList) {
            PurchaseStockInItemVO purchaseStockInItemVO = new PurchaseStockInItemVO();
            BeanUtils.copyProperties(purchaseStockInItem, purchaseStockInItemVO);
            purchaseStockInItemVOList.add(purchaseStockInItemVO);
        }
        return purchaseStockInItemVOList;
    }

    @Override
    public List<PurchaseStockInItemVO> list(Integer purchaseStockInId) {
        PurchaseStockInItemExample purchaseStockInItemExample = new PurchaseStockInItemExample();
        PurchaseStockInItemExample.Criteria purchaseStockInItemExampleCriteria = purchaseStockInItemExample.createCriteria();
        purchaseStockInItemExampleCriteria.andPurchaseStockInIdEqualTo(purchaseStockInId);
        List<PurchaseStockInItem> purchaseStockInItemList = purchaseStockInItemMapper.selectByExample(purchaseStockInItemExample);
        List<PurchaseStockInItemVO> purchaseStockInItemVOList = new ArrayList<>(purchaseStockInItemList.size());
        for (PurchaseStockInItem purchaseStockInItem : purchaseStockInItemList) {
            PurchaseStockInItemVO purchaseStockInItemVO = new PurchaseStockInItemVO();
            BeanUtils.copyProperties(purchaseStockInItem, purchaseStockInItemVO);
            purchaseStockInItemVO.setProductName(productMapper.selectByPrimaryKey(purchaseStockInItem.getProductId()).getProductName());
            purchaseStockInItemVOList.add(purchaseStockInItemVO);
        }
        return purchaseStockInItemVOList;
    }

    @Override
    public boolean saveOrUpdate(PurchaseStockInItem purchaseStockInItem) {
        int r = 0;
        if (null == purchaseStockInItem.getPurchaseStockInId()) {
            r = purchaseStockInItemMapper.insertSelective(purchaseStockInItem);
            //todo:更新一下库存
        } else {
            PurchaseStockInItem purchaseStockInItemOld = purchaseStockInItemMapper.selectByPrimaryKey(purchaseStockInItem.getPurchaseStockInId());
            r = purchaseStockInItemMapper.updateByPrimaryKey(purchaseStockInItem);
            //todo:更新一下库存
        }
        return r > 0 ? true : false;
    }

    @Override
    public boolean delete(Integer purchaseStockInItemId) {
        PurchaseStockInItem purchaseStockInItem = purchaseStockInItemMapper.selectByPrimaryKey(purchaseStockInItemId);
        //todo：更新库存
        return purchaseStockInItemMapper.deleteByPrimaryKey(purchaseStockInItemId) > 0 ? true : false;
    }
}
