package com.gmail.mosoft521.jxc4papaer.service.impl;

import com.gmail.mosoft521.jxc4papaer.dao.ProductMapper;
import com.gmail.mosoft521.jxc4papaer.dao.PurchaseStockInItemMapper;
import com.gmail.mosoft521.jxc4papaer.dao.StockMapper;
import com.gmail.mosoft521.jxc4papaer.dao.SupplementMapper;
import com.gmail.mosoft521.jxc4papaer.entity.PurchaseStockInItem;
import com.gmail.mosoft521.jxc4papaer.entity.PurchaseStockInItemExample;
import com.gmail.mosoft521.jxc4papaer.entity.Stock;
import com.gmail.mosoft521.jxc4papaer.entity.Supplement;
import com.gmail.mosoft521.jxc4papaer.service.PurchaseStockInItemService;
import com.gmail.mosoft521.jxc4papaer.vo.PurchaseStockInItemVO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PurchaseStockInItemServiceImpl implements PurchaseStockInItemService {

    @Resource
    private PurchaseStockInItemMapper purchaseStockInItemMapper;

    @Resource
    private ProductMapper productMapper;

    @Resource
    private StockMapper stockMapper;

    @Resource
    private SupplementMapper supplementMapper;

    @Override
    public List<PurchaseStockInItemVO> list() {
        List<PurchaseStockInItem> purchaseStockInItemList = purchaseStockInItemMapper.selectByExample(null);
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
    public boolean saveOrUpdate(PurchaseStockInItem purchaseStockInItem) {
        int r = 0;
        int delta = 0;
        if (null == purchaseStockInItem.getPurchaseStockInItemId()) {//插入
            delta = purchaseStockInItem.getQuantity();
            r = purchaseStockInItemMapper.insertSelective(purchaseStockInItem);
        } else {//修改
            PurchaseStockInItem purchaseStockInItemOld = purchaseStockInItemMapper.selectByPrimaryKey(purchaseStockInItem.getPurchaseStockInId());
            delta = purchaseStockInItem.getQuantity() - purchaseStockInItemOld.getQuantity();
            r = purchaseStockInItemMapper.updateByPrimaryKey(purchaseStockInItem);
        }
        //更新一下库存
        Stock stock = stockMapper.selectByPrimaryKey(purchaseStockInItem.getProductId());
        int quantityCurrent = stock.getQuantityCurrent() + delta;
        stock.setQuantityCurrent(quantityCurrent);
        stockMapper.updateByPrimaryKey(stock);
        //最小库存判断
        if (quantityCurrent < stock.getQuantityMin()) {
            Supplement supplement = new Supplement();
            supplement.setSupplementNo("BH" + getString());
            supplement.setProductId(purchaseStockInItem.getProductId());
            supplement.setQuantity(stock.getQuantityMin() - quantityCurrent);
            supplement.setRemark("采购入库明细insert或update产生");
            supplementMapper.insert(supplement);
        }
        return r > 0 ? true : false;
    }

    @Override
    public boolean delete(Integer purchaseStockInItemId) {
        PurchaseStockInItem purchaseStockInItem = purchaseStockInItemMapper.selectByPrimaryKey(purchaseStockInItemId);
        //更新一下库存【删入库明细，就是减当前库存】
        Stock stock = stockMapper.selectByPrimaryKey(purchaseStockInItem.getProductId());
        stock.setQuantityCurrent(stock.getQuantityCurrent() - purchaseStockInItem.getQuantity());
        stockMapper.updateByPrimaryKey(stock);
        return purchaseStockInItemMapper.deleteByPrimaryKey(purchaseStockInItemId) > 0 ? true : false;
    }
}
