package com.gmail.mosoft521.jxc4papaer.controller;

import com.gmail.mosoft521.jxc4papaer.entity.Stock;
import com.gmail.mosoft521.jxc4papaer.service.ProductService;
import com.gmail.mosoft521.jxc4papaer.service.StockService;
import com.gmail.mosoft521.jxc4papaer.vo.StockVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/stock")
public class StockController {

    @Autowired
    private StockService stockService;

    @Autowired
    private ProductService productService;

    /**
     * 获取所有仓库列表
     *
     * @return
     */
    @RequestMapping("/list")
    @ResponseBody
    public List<StockVO> list() {
        List<Stock> stockList = stockService.list();
        List<StockVO> stockVOList = new ArrayList<>(stockList.size());
        for (Stock stock : stockList) {
            StockVO stockVO = new StockVO();
            BeanUtils.copyProperties(stock, stockVO);
            stockVO.setProductName(productService.getNameById(stock.getProductId()));
            stockVOList.add(stockVO);
        }
        return stockVOList;
    }

    /**
     * 保存或修改仓库
     *
     * @return
     */
    @PostMapping("/saveOrUpdate")
    @ResponseBody
    public boolean saveOrUpdate(@RequestParam Integer productId, @RequestParam Integer quantityCurrent, @RequestParam Integer quantityMin, @RequestParam Integer quantityMax) {
        Stock stock = new Stock();
        stock.setProductId(productId);
        stock.setQuantityCurrent(quantityCurrent);
        stock.setQuantityMin(quantityMin);
        stock.setQuantityMax(quantityMax);
        return stockService.saveOrUpdate(stock);
    }

    @PostMapping("/delete")
    @ResponseBody
    public boolean delete(@RequestParam Integer productId) {
        return stockService.delete(productId);
    }
}
