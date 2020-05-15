package com.gmail.mosoft521.jxc4papaer.service.impl;

import com.gmail.mosoft521.jxc4papaer.dao.ProductMapper;
import com.gmail.mosoft521.jxc4papaer.dao.SaleMapper;
import com.gmail.mosoft521.jxc4papaer.dao.SaleStockOutItemMapper;
import com.gmail.mosoft521.jxc4papaer.dao.StockMapper;
import com.gmail.mosoft521.jxc4papaer.dao.SupplementMapper;
import com.gmail.mosoft521.jxc4papaer.entity.PurchaseStockInItem;
import com.gmail.mosoft521.jxc4papaer.entity.SaleStockOutItem;
import com.gmail.mosoft521.jxc4papaer.entity.SaleStockOutItemExample;
import com.gmail.mosoft521.jxc4papaer.entity.Stock;
import com.gmail.mosoft521.jxc4papaer.entity.Supplement;
import com.gmail.mosoft521.jxc4papaer.service.SaleStockOutItemService;
import com.gmail.mosoft521.jxc4papaer.vo.SaleStockOutItemVO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class SaleStockOutItemServiceImpl implements SaleStockOutItemService {

    @Resource
    private SaleStockOutItemMapper saleStockOutItemMapper;

    @Resource
    private ProductMapper productMapper;

    @Resource
    private StockMapper stockMapper;

    @Resource
    private SupplementMapper supplementMapper;

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

    /**
     * 生成随机图片文件名，年月日时分秒格式
     */
    private static String getString() {
        Date date = new Date(System.currentTimeMillis());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
        String string = simpleDateFormat.format(date);
        return string;
    }

    @Override
    public boolean saveOrUpdate(SaleStockOutItem saleStockOutItem) {
        int r = 0;
        int delta = 0;
        if (null == saleStockOutItem.getSaleStockOutItemId()) {
            delta = saleStockOutItem.getQuantity();
            r = saleStockOutItemMapper.insertSelective(saleStockOutItem);
        } else {
            SaleStockOutItem saleStockOutItemOld = saleStockOutItemMapper.selectByPrimaryKey(saleStockOutItem.getSaleStockOutItemId());
            delta = saleStockOutItem.getQuantity() - saleStockOutItemOld.getQuantity();
            r = saleStockOutItemMapper.updateByPrimaryKey(saleStockOutItem);
        }
        //更新一下库存
        Stock stock = stockMapper.selectByPrimaryKey(saleStockOutItem.getProductId());
        int quantityCurrent = stock.getQuantityCurrent() - delta;
        stock.setQuantityCurrent(quantityCurrent);
        stockMapper.updateByPrimaryKey(stock);
        //最小库存判断
        if (quantityCurrent < stock.getQuantityMin()) {
            Supplement supplement = new Supplement();
            supplement.setSupplementNo("BH" + getString());
            supplement.setProductId(saleStockOutItem.getProductId());
            supplement.setQuantity(stock.getQuantityMin() - quantityCurrent);
            supplement.setRemark("销售出库明细insert或update产生");
            supplementMapper.insert(supplement);
        }
        return r > 0 ? true : false;
    }

    @Override
    public boolean delete(Integer saleStockOutItemId) {
        SaleStockOutItem saleStockOutItem = saleStockOutItemMapper.selectByPrimaryKey(saleStockOutItemId);
        //更新一下库存【删出库明细，就是加当前库存】
        Stock stock = stockMapper.selectByPrimaryKey(saleStockOutItem.getProductId());
        stock.setQuantityCurrent(stock.getQuantityCurrent() + saleStockOutItem.getQuantity());
        stockMapper.updateByPrimaryKey(stock);
        return saleStockOutItemMapper.deleteByPrimaryKey(saleStockOutItemId) > 0 ? true : false;
    }
}
