package com.gmail.mosoft521.jxc4papaer.controller;

import com.gmail.mosoft521.jxc4papaer.entity.SaleStockOutItem;
import com.gmail.mosoft521.jxc4papaer.service.SaleStockOutItemService;
import com.gmail.mosoft521.jxc4papaer.vo.ResponseVO;
import com.gmail.mosoft521.jxc4papaer.vo.SaleStockOutItemVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.List;

@Controller
@RequestMapping("/saleStockOutItem")
public class SaleStockOutItemController {

    //日期格式
    private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    //时间格式
    private SimpleDateFormat timeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Autowired
    private SaleStockOutItemService saleStockOutItemService;

    /**
     * 根据销售出库单ID获取其所有销售出库明细
     *
     * @return
     */
    @RequestMapping("/list")
    @ResponseBody
    public List<SaleStockOutItemVO> list(@RequestParam Integer saleStockOutId) {
        List<SaleStockOutItemVO> saleStockOutItemVOList = saleStockOutItemService.list(saleStockOutId);
        return saleStockOutItemVOList;
    }

    /**
     * 保存或修改销售出库明细
     *
     * @return
     */
    @PostMapping("/saveOrUpdate")
    @ResponseBody
    public ResponseVO saveOrUpdate(@RequestParam Integer saleStockOutItemId, @RequestParam Integer saleStockOutId, @RequestParam Integer productId, @RequestParam Integer quantity, @RequestParam String remark) {
        SaleStockOutItem saleStockOutItem = new SaleStockOutItem();
        saleStockOutItem.setSaleStockOutItemId(saleStockOutItemId);
        saleStockOutItem.setSaleStockOutId(saleStockOutId);
        saleStockOutItem.setProductId(productId);
        saleStockOutItem.setQuantity(quantity);
        saleStockOutItem.setRemark(remark);
        return saleStockOutItemService.saveOrUpdate(saleStockOutItem);
    }

    @PostMapping("/delete")
    @ResponseBody
    public boolean delete(@RequestParam Integer saleStockOutItemId) {
        return saleStockOutItemService.delete(saleStockOutItemId);
    }
}
