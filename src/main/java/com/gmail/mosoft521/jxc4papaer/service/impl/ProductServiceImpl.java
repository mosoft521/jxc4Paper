package com.gmail.mosoft521.jxc4papaer.service.impl;

import com.gmail.mosoft521.jxc4papaer.constant.Constants;
import com.gmail.mosoft521.jxc4papaer.dao.ProductMapper;
import com.gmail.mosoft521.jxc4papaer.dao.StockMapper;
import com.gmail.mosoft521.jxc4papaer.dao.SupplyMapper;
import com.gmail.mosoft521.jxc4papaer.entity.Product;
import com.gmail.mosoft521.jxc4papaer.entity.Stock;
import com.gmail.mosoft521.jxc4papaer.entity.StockExample;
import com.gmail.mosoft521.jxc4papaer.entity.Supply;
import com.gmail.mosoft521.jxc4papaer.entity.SupplyExample;
import com.gmail.mosoft521.jxc4papaer.service.ProductService;
import com.gmail.mosoft521.jxc4papaer.vo.ProductVO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Resource
    private ProductMapper productMapper;

    @Resource
    private StockMapper stockMapper;

    @Resource
    private SupplyMapper supplyMapper;

    @Override
    public List<ProductVO> list() {
        List<Product> productList = productMapper.selectByExample(null);
        List<ProductVO> productVOList = new ArrayList<>(productList.size());
        for (Product product : productList) {
            ProductVO productVO = new ProductVO();
            BeanUtils.copyProperties(product, productVO);
            productVOList.add(productVO);
        }
        return productVOList;
    }

    @Override
    public List<ProductVO> list(Integer providerId) {
        SupplyExample supplyExample = new SupplyExample();
        SupplyExample.Criteria supplyExampleCriteria = supplyExample.createCriteria();
        supplyExampleCriteria.andProviderIdEqualTo(providerId);
        List<Supply> supplyList = supplyMapper.selectByExample(supplyExample);
        List<ProductVO> productVOList = new ArrayList<>(supplyList.size());
        for (Supply supply : supplyList) {
            Integer productId = supply.getProductId();
            Product product = productMapper.selectByPrimaryKey(productId);
            ProductVO productVO = new ProductVO();
            BeanUtils.copyProperties(product, productVO);
            productVOList.add(productVO);
        }
        return productVOList;
    }

    @Override
    public boolean saveOrUpdate(Product product) {
        int r = 0;
        if (null == product.getProductId()) {
            r = productMapper.insertSelective(product);
            //顺便插入一份库存
            Stock stock = new Stock();
            stock.setProductId(product.getProductId());
            stock.setWarehouseId(Constants.WAREHOUSE_ID);
            stock.setQuantityCurrent(0);
            stock.setQuantityMin(0);
            stockMapper.insert(stock);
        } else {
            r = productMapper.updateByPrimaryKey(product);
        }
        return r > 0 ? true : false;
    }

    @Override
    public boolean delete(Integer productId) {
        //先删除库存
        StockExample stockExample = new StockExample();
        StockExample.Criteria stockExampleCriteria = stockExample.createCriteria();
        stockExampleCriteria.andProductIdEqualTo(productId);
        stockMapper.deleteByExample(stockExample);
        return productMapper.deleteByPrimaryKey(productId) > 0 ? true : false;
    }

    @Override
    public String getNameById(Integer productId) {
        return productMapper.selectByPrimaryKey(productId).getProductName();
    }

    @Override
    public Product getById(Integer productId) {
        return productMapper.selectByPrimaryKey(productId);
    }
}
