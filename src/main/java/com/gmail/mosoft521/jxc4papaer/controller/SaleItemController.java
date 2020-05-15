package com.gmail.mosoft521.jxc4papaer.controller;

import com.gmail.mosoft521.jxc4papaer.entity.SaleItem;
import com.gmail.mosoft521.jxc4papaer.service.CustomerService;
import com.gmail.mosoft521.jxc4papaer.service.EmpService;
import com.gmail.mosoft521.jxc4papaer.service.ProductService;
import com.gmail.mosoft521.jxc4papaer.service.SaleItemService;
import com.gmail.mosoft521.jxc4papaer.service.SaleService;
import com.gmail.mosoft521.jxc4papaer.vo.SaleItemVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.List;

@Controller
@RequestMapping("/saleItem")
public class SaleItemController {

    //日期格式
    private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    //时间格式
    private SimpleDateFormat timeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Autowired
    private SaleService saleService;

    @Autowired
    private SaleItemService saleItemService;

    @Autowired
    private CustomerService customerService;

    @Autowired
    private EmpService empService;

    @Autowired
    private ProductService productService;

    /**
     * 根据销售单ID获取其所有销售明细
     *
     * @return
     */
    @RequestMapping("/list")
    @ResponseBody
    public List<SaleItemVO> list(@RequestParam Integer saleId) {
        List<SaleItemVO> saleItemVOList = saleItemService.list(saleId);
        return saleItemVOList;
    }

    /**
     * 保存或修改销售明细
     *
     * @return
     */
    @PostMapping("/saveOrUpdate")
    @ResponseBody
    public boolean saveOrUpdate(@RequestParam Integer saleItemId, @RequestParam Integer saleId, @RequestParam Integer productId,
                                @RequestParam Float price, @RequestParam Integer quantity, @RequestParam String remark) {
        SaleItem saleItem = new SaleItem();
        saleItem.setSaleItemId(saleItemId);
        saleItem.setSaleId(saleId);
        saleItem.setProductId(productId);
        saleItem.setPrice(price);
        saleItem.setQuantity(quantity);
        saleItem.setRemark(remark);
        return saleItemService.saveOrUpdate(saleItem);
    }

    @PostMapping("/delete")
    @ResponseBody
    public boolean delete(@RequestParam Integer saleItemId) {
        return saleItemService.delete(saleItemId);
    }
}
