package com.gmail.mosoft521.jxc4papaer.controller;

import com.gmail.mosoft521.jxc4papaer.entity.Product;
import com.gmail.mosoft521.jxc4papaer.entity.Purchase;
import com.gmail.mosoft521.jxc4papaer.entity.PurchaseStockIn;
import com.gmail.mosoft521.jxc4papaer.entity.SaleStockOut;
import com.gmail.mosoft521.jxc4papaer.service.ProductService;
import com.gmail.mosoft521.jxc4papaer.service.PurchaseItemService;
import com.gmail.mosoft521.jxc4papaer.service.PurchaseService;
import com.gmail.mosoft521.jxc4papaer.service.PurchaseStockInService;
import com.gmail.mosoft521.jxc4papaer.service.SaleItemService;
import com.gmail.mosoft521.jxc4papaer.service.SaleStockOutService;
import com.gmail.mosoft521.jxc4papaer.vo.ProductVO;
import com.gmail.mosoft521.jxc4papaer.vo.PurchaseItemVO;
import com.gmail.mosoft521.jxc4papaer.vo.SaleItemVO;
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
    private PurchaseService purchaseService;

    @Autowired
    private PurchaseStockInService purchaseStockInService;

    @Autowired
    private PurchaseItemService purchaseItemService;

    @Autowired
    private SaleStockOutService saleStockOutService;

    @Autowired
    private SaleItemService saleItemService;

    /**
     * 获取所有商品列表
     *
     * @return
     */
    @RequestMapping("/list")
    @ResponseBody
    public List<ProductVO> list() {
        return productService.list();
    }

    /**
     * 根据采购单id获取所有商品列表
     *
     * @return
     */
    @RequestMapping("/listByPurchaseId")
    @ResponseBody
    public List<ProductVO> listByPurchaseId(@RequestParam Integer purchaseId) {
        Purchase purchase = purchaseService.getById(purchaseId);
        List<ProductVO> productVOList = productService.list(purchase.getProviderId());
        return productVOList;
    }

    /**
     * 根据采购入库单id获取所有商品列表
     *
     * @return
     */
    @RequestMapping("/listByPurchaseStockInId")
    @ResponseBody
    public List<ProductVO> listByPurchaseStockInId(@RequestParam Integer purchaseStockInId) {
        PurchaseStockIn purchaseStockIn = purchaseStockInService.getById(purchaseStockInId);
        List<PurchaseItemVO> purchaseItemVOList = purchaseItemService.list(purchaseStockIn.getPurchaseId());
        List<ProductVO> productVOList = new ArrayList<>(purchaseItemVOList.size());
        for (PurchaseItemVO purchaseItemVO : purchaseItemVOList) {
            ProductVO productVO = new ProductVO();
            Product product = productService.getById(purchaseItemVO.getProductId());
            BeanUtils.copyProperties(product, productVO);
            productVOList.add(productVO);
        }
        return productVOList;
    }

    /**
     * 根据销售出库单id获取所有商品列表
     *
     * @return
     */
    @RequestMapping("/listBySaleStockOutId")
    @ResponseBody
    public List<ProductVO> listBySaleStockOutId(@RequestParam Integer saleStockOutId) {
        SaleStockOut saleStockOut = saleStockOutService.getById(saleStockOutId);
        List<SaleItemVO> saleItemVOList = saleItemService.list(saleStockOut.getSaleId());
        List<ProductVO> productVOList = new ArrayList<>(saleItemVOList.size());
        for (SaleItemVO saleItemVO : saleItemVOList) {
            ProductVO productVO = new ProductVO();
            Product product = productService.getById(saleItemVO.getProductId());
            BeanUtils.copyProperties(product, productVO);
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
    public boolean saveOrUpdate(@RequestParam Integer productId, @RequestParam String productName, @RequestParam Float price, @RequestParam String uom, @RequestParam String spec, @RequestParam String remark) {
        Product product = new Product();
        product.setProductId(productId);
        product.setProductName(productName);
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
