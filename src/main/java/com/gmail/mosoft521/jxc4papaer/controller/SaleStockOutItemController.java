package com.gmail.mosoft521.jxc4papaer.controller;

import com.gmail.mosoft521.jxc4papaer.entity.Sale;
import com.gmail.mosoft521.jxc4papaer.entity.SaleStockOut;
import com.gmail.mosoft521.jxc4papaer.entity.SaleStockOutItem;
import com.gmail.mosoft521.jxc4papaer.service.CustomerService;
import com.gmail.mosoft521.jxc4papaer.service.EmpService;
import com.gmail.mosoft521.jxc4papaer.service.ProductService;
import com.gmail.mosoft521.jxc4papaer.service.SaleService;
import com.gmail.mosoft521.jxc4papaer.service.SaleStockOutItemService;
import com.gmail.mosoft521.jxc4papaer.service.SaleStockOutService;
import com.gmail.mosoft521.jxc4papaer.vo.SaleStockOutItemVO;
import com.gmail.mosoft521.jxc4papaer.vo.SaleStockOutVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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

    @Autowired
    private SaleService saleService;

    @Autowired
    private CustomerService customerService;

    @Autowired
    private EmpService empService;

    @Autowired
    private ProductService productService;

    /**
     * 获取所有出库列表
     *
     * @return
     */
    @RequestMapping("/list")
    @ResponseBody
    public List<SaleStockOutItemVO> list() {
        List<SaleStockOutItemVO> saleStockOutItemVOList = saleStockOutItemService.list();
        return saleStockOutItemVOList;
    }

    /**
     * 保存或修改出库
     *
     * @return
     */
    @PostMapping("/saveOrUpdate")
    @ResponseBody
    public boolean saveOrUpdate(@RequestParam Integer saleStockOutItemId, @RequestParam Integer saleStockOutId, @RequestParam Integer productId, @RequestParam Integer quantity, @RequestParam String remark) {
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
