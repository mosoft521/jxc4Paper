package com.gmail.mosoft521.jxc4papaer.service.impl;

import com.gmail.mosoft521.jxc4papaer.constant.Constants;
import com.gmail.mosoft521.jxc4papaer.dao.ProductMapper;
import com.gmail.mosoft521.jxc4papaer.dao.SaleItemMapper;
import com.gmail.mosoft521.jxc4papaer.dao.StockMapper;
import com.gmail.mosoft521.jxc4papaer.entity.SaleItem;
import com.gmail.mosoft521.jxc4papaer.entity.SaleItemExample;
import com.gmail.mosoft521.jxc4papaer.entity.Stock;
import com.gmail.mosoft521.jxc4papaer.entity.StockKey;
import com.gmail.mosoft521.jxc4papaer.service.SaleItemService;
import com.gmail.mosoft521.jxc4papaer.vo.ResponseVO;
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

    @Resource
    private StockMapper stockMapper;

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
    public ResponseVO saveOrUpdate(SaleItem saleItem) {
        ResponseVO responseVO = new ResponseVO();
        int r = 0;
        if (null == saleItem.getSaleItemId()) {
            r = saleItemMapper.insertSelective(saleItem);
        } else {
            r = saleItemMapper.updateByPrimaryKey(saleItem);
        }
        responseVO.setSuccess(r > 0 ? true : false);
        //查询库存，比销售明细商品数量少就报缺货
        StockKey stockKey = new StockKey();
        stockKey.setProductId(saleItem.getProductId());
        stockKey.setWarehouseId(Constants.WAREHOUSE_ID);
        Stock stock = stockMapper.selectByPrimaryKey(stockKey);
        if (stock.getQuantityCurrent() < saleItem.getQuantity()) {
            responseVO.setMsg("商品: " + productMapper.selectByPrimaryKey(saleItem.getProductId()).getProductName() + " 缺货，请立即采购" + (saleItem.getQuantity() - stock.getQuantityCurrent()) + "件");
        }
        return responseVO;
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
