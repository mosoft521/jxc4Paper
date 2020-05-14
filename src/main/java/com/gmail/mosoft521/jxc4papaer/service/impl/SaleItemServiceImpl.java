package com.gmail.mosoft521.jxc4papaer.service.impl;

import com.gmail.mosoft521.jxc4papaer.dao.ProductMapper;
import com.gmail.mosoft521.jxc4papaer.dao.SaleItemMapper;
import com.gmail.mosoft521.jxc4papaer.entity.SaleItem;
import com.gmail.mosoft521.jxc4papaer.entity.SaleItemExample;
import com.gmail.mosoft521.jxc4papaer.service.SaleItemService;
import com.gmail.mosoft521.jxc4papaer.vo.SaleItemVO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class SaleItemServiceImpl implements SaleItemService {

    @Resource
    private SaleItemMapper saleItemMapper;

    @Resource
    private ProductMapper productMapper;

    @Override
    public List<SaleItemVO> list() {
        List<SaleItem> saleItemList = saleItemMapper.selectByExample(null);
        List<SaleItemVO> saleVOList = new ArrayList<>(saleItemList.size());
        for (SaleItem saleItem : saleItemList) {
            SaleItemVO saleVO = new SaleItemVO();
            BeanUtils.copyProperties(saleItem, saleVO);
            saleVO.setProductName(productMapper.selectByPrimaryKey(saleItem.getProductId()).getProductName());
            saleVOList.add(saleVO);
        }
        return saleVOList;
    }

    @Override
    public List<SaleItemVO> list(Integer saleId) {
        SaleItemExample saleItemExample = new SaleItemExample();
        SaleItemExample.Criteria saleItemExampleCriteria = saleItemExample.createCriteria();
        saleItemExampleCriteria.andSaleIdEqualTo(saleId);
        List<SaleItem> saleItemList = saleItemMapper.selectByExample(saleItemExample);
        List<SaleItemVO> saleVOList = new ArrayList<>(saleItemList.size());
        for (SaleItem saleItem : saleItemList) {
            SaleItemVO saleVO = new SaleItemVO();
            BeanUtils.copyProperties(saleItem, saleVO);
            saleVO.setProductName(productMapper.selectByPrimaryKey(saleItem.getProductId()).getProductName());
            saleVOList.add(saleVO);
        }
        return saleVOList;
    }

    @Override
    public boolean saveOrUpdate(SaleItem saleItem) {
        int r = 0;
        if (null == saleItem.getSaleItemId()) {
            r = saleItemMapper.insertSelective(saleItem);
        } else {
            r = saleItemMapper.updateByPrimaryKey(saleItem);
        }
        return r > 0 ? true : false;
    }

    @Override
    public boolean delete(Integer saleItemId) {
        return saleItemMapper.deleteByPrimaryKey(saleItemId) > 0 ? true : false;
    }

    @Override
    public SaleItem getById(Integer saleItemId) {
        return saleItemMapper.selectByPrimaryKey(saleItemId);
    }
}
