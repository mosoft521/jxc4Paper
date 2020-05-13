package com.gmail.mosoft521.jxc4papaer.controller;

import com.gmail.mosoft521.jxc4papaer.entity.Product;
import com.gmail.mosoft521.jxc4papaer.service.ProductService;
import com.gmail.mosoft521.jxc4papaer.service.WarehouseService;
import com.gmail.mosoft521.jxc4papaer.vo.ProductVO;
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
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private WarehouseService warehouseService;

    /**
     * 获取所有商品列表
     *
     * @return
     */
    @RequestMapping("/list")
    @ResponseBody
    public List<ProductVO> list() {
        List<Product> productList = productService.list();
        List<ProductVO> productVOList = new ArrayList<>(productList.size());
        for (Product product : productList) {
            ProductVO productVO = new ProductVO();
            BeanUtils.copyProperties(product, productVO);
            productVO.setWarehouseName(warehouseService.getNameById(productVO.getWarehouseId()));
            productVOList.add(productVO);
        }
        return productVOList;
    }

    /**
     * 保存或修改商品
     *
     * @return
     */
    @PostMapping("/saveOrUpdate")
    @ResponseBody
    public boolean saveOrUpdate(@RequestParam Integer productId, @RequestParam String productName, @RequestParam Integer warehouseId, @RequestParam Float price, @RequestParam String uom, @RequestParam String spec, @RequestParam String remark) {
        Product product = new Product();
        product.setProductId(productId);
        product.setProductName(productName);
        product.setWarehouseId(warehouseId);
        product.setPrice(price);
        product.setUom(uom);
        product.setSpec(spec);
        product.setRemark(remark);
        return productService.saveOrUpdate(product);
    }

    @PostMapping("/delete")
    @ResponseBody
    public boolean delete(@RequestParam Integer productId) {
        return productService.delete(productId);
    }
}
