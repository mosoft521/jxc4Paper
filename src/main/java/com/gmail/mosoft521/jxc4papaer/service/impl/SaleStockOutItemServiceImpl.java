package com.gmail.mosoft521.jxc4papaer.service.impl;

import com.gmail.mosoft521.jxc4papaer.dao.ProductMapper;
import com.gmail.mosoft521.jxc4papaer.dao.SaleMapper;
import com.gmail.mosoft521.jxc4papaer.dao.SaleStockOutItemMapper;
import com.gmail.mosoft521.jxc4papaer.dao.StockMapper;
import com.gmail.mosoft521.jxc4papaer.entity.SaleStockOutItem;
import com.gmail.mosoft521.jxc4papaer.entity.SaleStockOutItemExample;
import com.gmail.mosoft521.jxc4papaer.service.SaleStockOutItemService;
import com.gmail.mosoft521.jxc4papaer.vo.SaleStockOutItemVO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class SaleStockOutItemServiceImpl implements SaleStockOutItemService {

    @Resource
    private SaleStockOutItemMapper saleStockOutItemMapper;

    @Resource
    private ProductMapper productMapper;

    @Resource
    private StockMapper stockMapper;

    @Override
    public List<SaleStockOutItemVO> list() {
        List<SaleStockOutItem> saleStockOutItemList = saleStockOutItemMapper.selectByExample(null);
        List<SaleStockOutItemVO> saleStockOutItemVOList = new ArrayList<>(saleStockOutItemList.size());
        for (SaleStockOutItem saleStockOutItem : saleStockOutItemList) {
            SaleStockOutItemVO saleStockOutItemVO = new SaleStockOutItemVO();
            BeanUtils.copyProperties(saleStockOutItem, saleStockOutItemVO);
            saleStockOutItemVO.setProductName(productMapper.selectByPrimaryKey(saleStockOutItem.getProductId()).getProductName());
            saleStockOutItemVOList.add(saleStockOutItemVO);
        }
        return saleStockOutItemVOList;
    }

    @Override
    public List<SaleStockOutItemVO> list(Integer saleStockOutId) {
        SaleStockOutItemExample saleStockOutItemExample = new SaleStockOutItemExample();
        SaleStockOutItemExample.Criteria saleStockOutItemExampleCriteria = saleStockOutItemExample.createCriteria();
        saleStockOutItemExampleCriteria.andSaleStockOutIdEqualTo(saleStockOutId);
        List<SaleStockOutItem> saleStockOutItemList = saleStockOutItemMapper.selectByExample(saleStockOutItemExample);
        List<SaleStockOutItemVO> saleStockOutItemVOList = new ArrayList<>(saleStockOutItemList.size());
        for (SaleStockOutItem saleStockOutItem : saleStockOutItemList) {
            SaleStockOutItemVO saleStockOutItemVO = new SaleStockOutItemVO();
            BeanUtils.copyProperties(saleStockOutItem, saleStockOutItemVO);
            saleStockOutItemVO.setProductName(productMapper.selectByPrimaryKey(saleStockOutItem.getProductId()).getProductName());
            saleStockOutItemVOList.add(saleStockOutItemVO);
        }
        return saleStockOutItemVOList;
    }

    @Override
    public boolean saveOrUpdate(SaleStockOutItem saleStockOutItem) {
        int r = 0;
        if (null == saleStockOutItem.getSaleStockOutItemId()) {
            r = saleStockOutItemMapper.insertSelective(saleStockOutItem);

        } else {
            r = saleStockOutItemMapper.updateByPrimaryKey(saleStockOutItem);
        }
        //todo: 更新一下库存
        return r > 0 ? true : false;
    }

    @Override
    public boolean delete(Integer saleStockOutItemId) {

        SaleStockOutItem saleStockOutItem = saleStockOutItemMapper.selectByPrimaryKey(saleStockOutItemId);
        //todo:更新库存
        return saleStockOutItemMapper.deleteByPrimaryKey(saleStockOutItemId) > 0 ? true : false;
    }
}
