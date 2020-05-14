package com.gmail.mosoft521.jxc4papaer.service.impl;

import com.gmail.mosoft521.jxc4papaer.dao.CustomerMapper;
import com.gmail.mosoft521.jxc4papaer.dao.EmpMapper;
import com.gmail.mosoft521.jxc4papaer.dao.SaleMapper;
import com.gmail.mosoft521.jxc4papaer.dao.SaleStockOutMapper;
import com.gmail.mosoft521.jxc4papaer.dao.StockMapper;
import com.gmail.mosoft521.jxc4papaer.entity.Sale;
import com.gmail.mosoft521.jxc4papaer.entity.SaleStockOut;
import com.gmail.mosoft521.jxc4papaer.service.SaleStockOutService;
import com.gmail.mosoft521.jxc4papaer.vo.SaleStockOutVO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class SaleStockOutServiceImpl implements SaleStockOutService {

    @Resource
    private SaleStockOutMapper saleStockOutMapper;

    @Resource
    private StockMapper stockMapper;

    @Resource
    private SaleMapper saleMapper;

    @Resource
    private CustomerMapper customerMapper;

    @Resource
    private EmpMapper empMapper;

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
            //更新一下库存
            Sale sale = saleMapper.selectByPrimaryKey(saleStockOut.getSaleId());
        } else {
            SaleStockOut stockOutOld = saleStockOutMapper.selectByPrimaryKey(saleStockOut.getSaleStockOutId());
            r = saleStockOutMapper.updateByPrimaryKey(saleStockOut);
            //更新一下库存
            Sale sale = saleMapper.selectByPrimaryKey(saleStockOut.getSaleId());
        }
        return r > 0 ? true : false;
    }

    @Override
    public boolean delete(Integer saleStockOutId) {
        SaleStockOut stockOut = saleStockOutMapper.selectByPrimaryKey(saleStockOutId);
        //更新库存
        Sale sale = saleMapper.selectByPrimaryKey(stockOut.getSaleId());
        return saleStockOutMapper.deleteByPrimaryKey(saleStockOutId) > 0 ? true : false;
    }

    @Override
    public String getNameById(Integer saleStockOutId) {
        return saleStockOutMapper.selectByPrimaryKey(saleStockOutId).getSaleStockOutNo();
    }
}
