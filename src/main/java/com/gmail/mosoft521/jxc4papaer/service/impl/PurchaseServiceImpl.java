package com.gmail.mosoft521.jxc4papaer.service.impl;

import com.gmail.mosoft521.jxc4papaer.dao.EmpMapper;
import com.gmail.mosoft521.jxc4papaer.dao.ProductMapper;
import com.gmail.mosoft521.jxc4papaer.dao.ProviderMapper;
import com.gmail.mosoft521.jxc4papaer.dao.PurchaseItemMapper;
import com.gmail.mosoft521.jxc4papaer.dao.PurchaseMapper;
import com.gmail.mosoft521.jxc4papaer.entity.Purchase;
import com.gmail.mosoft521.jxc4papaer.entity.PurchaseItem;
import com.gmail.mosoft521.jxc4papaer.entity.PurchaseItemExample;
import com.gmail.mosoft521.jxc4papaer.service.PurchaseService;
import com.gmail.mosoft521.jxc4papaer.vo.PurchaseItemVO;
import com.gmail.mosoft521.jxc4papaer.vo.PurchaseVO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class PurchaseServiceImpl implements PurchaseService {

    @Resource
    private PurchaseMapper purchaseMapper;

    @Resource
    private PurchaseItemMapper purchaseItemMapper;

    @Resource
    private ProviderMapper providerMapper;

    @Resource
    private EmpMapper empMapper;

    @Resource
    private ProductMapper productMapper;

    @Override
    public List<PurchaseVO> list() {
        List<Purchase> purchaseList = purchaseMapper.selectByExample(null);

        List<PurchaseVO> purchaseVOList = new ArrayList<>(purchaseList.size());
        for (Purchase purchase : purchaseList) {
            PurchaseVO purchaseVO = new PurchaseVO();
            BeanUtils.copyProperties(purchase, purchaseVO);
            purchaseVO.setProviderName(providerMapper.selectByPrimaryKey(purchaseVO.getProviderId()).getName());
            purchaseVO.setEmpName(empMapper.selectByPrimaryKey(purchaseVO.getEmpId()).getName());


            PurchaseItemExample purchaseItemExample = new PurchaseItemExample();
            PurchaseItemExample.Criteria purchaseItemExampleCriteria = purchaseItemExample.createCriteria();
            purchaseItemExampleCriteria.andPurchaseIdEqualTo(purchase.getPurchaseId());
            List<PurchaseItem> purchaseItemList = purchaseItemMapper.selectByExample(purchaseItemExample);
            List<PurchaseItemVO> purchaseItemVOList = new ArrayList<>(purchaseItemList.size());
            for (PurchaseItem purchaseItem : purchaseItemList) {
                PurchaseItemVO purchaseItemVO = new PurchaseItemVO();
                BeanUtils.copyProperties(purchaseItem, purchaseItemVO);
                purchaseItemVO.setProductName(productMapper.selectByPrimaryKey(purchaseItem.getProductId()).getProductName());
                purchaseItemVOList.add(purchaseItemVO);
            }
            purchaseVO.setPurchaseItemVOList(purchaseItemVOList);

            purchaseVOList.add(purchaseVO);
        }
        return purchaseVOList;
    }

    @Override
    public boolean saveOrUpdate(Purchase purchase) {
        int r = 0;
        if (null == purchase.getPurchaseId()) {
            r = purchaseMapper.insertSelective(purchase);
        } else {
            r = purchaseMapper.updateByPrimaryKey(purchase);
        }
        return r > 0 ? true : false;
    }

    @Override
    public boolean delete(Integer purchaseId) {
        return purchaseMapper.deleteByPrimaryKey(purchaseId) > 0 ? true : false;
    }

    @Override
    public String getNoById(Integer purchaseId) {
        return purchaseMapper.selectByPrimaryKey(purchaseId).getPurchaseNo();
    }

    @Override
    public Purchase getById(Integer purchaseId) {
        return purchaseMapper.selectByPrimaryKey(purchaseId);
    }
}
