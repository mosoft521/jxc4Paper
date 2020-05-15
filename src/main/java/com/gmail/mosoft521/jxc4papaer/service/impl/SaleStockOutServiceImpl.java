package com.gmail.mosoft521.jxc4papaer.service.impl;

import com.gmail.mosoft521.jxc4papaer.dao.CustomerMapper;
import com.gmail.mosoft521.jxc4papaer.dao.EmpMapper;
import com.gmail.mosoft521.jxc4papaer.dao.SaleMapper;
import com.gmail.mosoft521.jxc4papaer.dao.SaleStockOutItemMapper;
import com.gmail.mosoft521.jxc4papaer.dao.SaleStockOutMapper;
import com.gmail.mosoft521.jxc4papaer.dao.StockMapper;
import com.gmail.mosoft521.jxc4papaer.dao.SupplementMapper;
import com.gmail.mosoft521.jxc4papaer.entity.Sale;
import com.gmail.mosoft521.jxc4papaer.entity.SaleStockOut;
import com.gmail.mosoft521.jxc4papaer.entity.SaleStockOutItem;
import com.gmail.mosoft521.jxc4papaer.entity.SaleStockOutItemExample;
import com.gmail.mosoft521.jxc4papaer.entity.Stock;
import com.gmail.mosoft521.jxc4papaer.entity.Supplement;
import com.gmail.mosoft521.jxc4papaer.service.SaleStockOutService;
import com.gmail.mosoft521.jxc4papaer.vo.SaleStockOutVO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class SaleStockOutServiceImpl implements SaleStockOutService {

    @Resource
    private SaleStockOutMapper saleStockOutMapper;
    @Resource
    private SaleStockOutItemMapper saleStockOutItemMapper;

    @Resource
    private StockMapper stockMapper;

    @Resource
    private SaleMapper saleMapper;

    @Resource
    private CustomerMapper customerMapper;

    @Resource
    private EmpMapper empMapper;

    @Resource
    private SupplementMapper supplementMapper;

    @Override
    public List<SaleStockOutVO> list() {
        List<SaleStockOut> stockOutList = saleStockOutMapper.selectByExample(null);
        List<SaleStockOutVO> stockOutVOList = new ArrayList<>(stockOutList.size());
        for (SaleStockOut stockOut : stockOutList) {
            SaleStockOutVO stockOutVO = new SaleStockOutVO();
            BeanUtils.copyProperties(stockOut, stockOutVO);
            stockOutVO.setSaleNo(saleMapper.selectByPrimaryKey(stockOut.getSaleId()).getSaleNo());
            Sale sale = saleMapper.selectByPrimaryKey(stockOut.getSaleId());
            stockOutVO.setCustomerName(customerMapper.selectByPrimaryKey(sale.getCustomerId()).getName());
            stockOutVO.setEmpName(empMapper.selectByPrimaryKey(sale.getEmpId()).getName());
            stockOutVOList.add(stockOutVO);
        }
        return stockOutVOList;
    }

    @Override
    public boolean saveOrUpdate(SaleStockOut saleStockOut) {
        int r = 0;
        if (null == saleStockOut.getSaleStockOutId()) {
            r = saleStockOutMapper.insertSelective(saleStockOut);
        } else {
            SaleStockOut stockOutOld = saleStockOutMapper.selectByPrimaryKey(saleStockOut.getSaleStockOutId());
            r = saleStockOutMapper.updateByPrimaryKey(saleStockOut);
        }
        return r > 0 ? true : false;
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
    public boolean delete(Integer saleStockOutId) {
        //把明细也删除了
        SaleStockOutItemExample saleStockOutItemExample = new SaleStockOutItemExample();
        SaleStockOutItemExample.Criteria saleStockOutItemExampleCriteria = saleStockOutItemExample.createCriteria();
        saleStockOutItemExampleCriteria.andSaleStockOutIdEqualTo(saleStockOutId);
        List<SaleStockOutItem> saleStockOutItemList = saleStockOutItemMapper.selectByExample(saleStockOutItemExample);
        for(SaleStockOutItem saleStockOutItem : saleStockOutItemList) {
            saleStockOutItemMapper.deleteByPrimaryKey(saleStockOutItem.getSaleStockOutItemId());
            //更新一下库存【删出库明细，就是加当前库存】
            Stock stock = stockMapper.selectByPrimaryKey(saleStockOutItem.getProductId());
            int quantityCurrent = stock.getQuantityCurrent() + saleStockOutItem.getQuantity();
            stock.setQuantityCurrent(quantityCurrent);
            stockMapper.updateByPrimaryKey(stock);
            //最小库存判断
            if (quantityCurrent < stock.getQuantityMin()) {
                Supplement supplement = new Supplement();
                supplement.setSupplementNo("BH" + getString());
                supplement.setProductId(saleStockOutItem.getProductId());
                supplement.setQuantity(stock.getQuantityMin() - quantityCurrent);
                supplement.setRemark("销售出库明del产生");
                supplementMapper.insert(supplement);
            }
        }

        return saleStockOutMapper.deleteByPrimaryKey(saleStockOutId) > 0 ? true : false;
    }

    @Override
    public String getNameById(Integer saleStockOutId) {
        return saleStockOutMapper.selectByPrimaryKey(saleStockOutId).getSaleStockOutNo();
    }

    @Override
    public SaleStockOut getById(Integer saleStockOutId) {
        return saleStockOutMapper.selectByPrimaryKey(saleStockOutId);
    }
}
