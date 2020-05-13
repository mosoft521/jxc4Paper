package com.gmail.mosoft521.jxc4papaer.service.impl;

import com.gmail.mosoft521.jxc4papaer.dao.ProductMapper;
import com.gmail.mosoft521.jxc4papaer.dao.PurchaseItemMapper;
import com.gmail.mosoft521.jxc4papaer.entity.PurchaseItem;
import com.gmail.mosoft521.jxc4papaer.entity.PurchaseItemExample;
import com.gmail.mosoft521.jxc4papaer.service.PurchaseItemService;
import com.gmail.mosoft521.jxc4papaer.vo.PurchaseItemVO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class PurchaseItemServiceImpl implements PurchaseItemService {

    @Resource
    private PurchaseItemMapper purchaseItemMapper;

    @Resource
    private ProductMapper productMapper;

    @Override
    public List<PurchaseItemVO> list() {
        List<PurchaseItem> purchaseItemList = purchaseItemMapper.selectByExample(null);
        List<PurchaseItemVO> purchaseItemVOList = new ArrayList<>(purchaseItemList.size());
        for (PurchaseItem purchaseItem : purchaseItemList) {
            PurchaseItemVO purchaseItemVO = new PurchaseItemVO();
            BeanUtils.copyProperties(purchaseItem, purchaseItemVO);
            purchaseItemVO.setProductName(productMapper.selectByPrimaryKey(purchaseItem.getProductId()).getProductName());
            purchaseItemVOList.add(purchaseItemVO);
        }
        return purchaseItemVOList;
    }

    @Override
    public List<PurchaseItemVO> list(Integer purchaseId) {
        PurchaseItemExample purchaseItemExample = new PurchaseItemExample();
        PurchaseItemExample.Criteria purchaseItemExampleCriteria = purchaseItemExample.createCriteria();
        purchaseItemExampleCriteria.andPurchaseIdEqualTo(purchaseId);
        List<PurchaseItem> purchaseItemList = purchaseItemMapper.selectByExample(purchaseItemExample);
        List<PurchaseItemVO> purchaseItemVOList = new ArrayList<>(purchaseItemList.size());
        for (PurchaseItem purchaseItem : purchaseItemList) {
            PurchaseItemVO purchaseItemVO = new PurchaseItemVO();
            BeanUtils.copyProperties(purchaseItem, purchaseItemVO);
            purchaseItemVO.setProductName(productMapper.selectByPrimaryKey(purchaseItem.getProductId()).getProductName());
            purchaseItemVOList.add(purchaseItemVO);
        }
        return purchaseItemVOList;
    }

    @Override
    public boolean saveOrUpdate(PurchaseItem purchaseItem) {
        int r = 0;
        if (null == purchaseItem.getPurchaseItemId()) {
            r = purchaseItemMapper.insertSelective(purchaseItem);
        } else {
            r = purchaseItemMapper.updateByPrimaryKey(purchaseItem);
        }
        return r > 0 ? true : false;
    }

    @Override
    public boolean delete(Integer purchaseItemId) {
        return purchaseItemMapper.deleteByPrimaryKey(purchaseItemId) > 0 ? true : false;
    }

    @Override
    public PurchaseItem getById(Integer purchaseItemId) {
        return purchaseItemMapper.selectByPrimaryKey(purchaseItemId);
    }
}
