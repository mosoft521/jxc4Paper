package com.gmail.mosoft521.jxc4papaer.controller;

import com.gmail.mosoft521.jxc4papaer.entity.Purchase;
import com.gmail.mosoft521.jxc4papaer.entity.PurchaseStockInItem;
import com.gmail.mosoft521.jxc4papaer.service.EmpService;
import com.gmail.mosoft521.jxc4papaer.service.ProductService;
import com.gmail.mosoft521.jxc4papaer.service.ProviderService;
import com.gmail.mosoft521.jxc4papaer.service.PurchaseService;
import com.gmail.mosoft521.jxc4papaer.service.PurchaseStockInItemService;
import com.gmail.mosoft521.jxc4papaer.vo.PurchaseStockInItemVO;
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
@RequestMapping("/purchaseStockInItem")
public class PurchaseStockInItemController {

    //日期格式
    private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    //时间格式
    private SimpleDateFormat timeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Autowired
    private PurchaseStockInItemService purchaseStockInItemService;

    @Autowired
    private PurchaseService purchaseService;

    @Autowired
    private ProviderService providerService;

    @Autowired
    private EmpService empService;

    @Autowired
    private ProductService productService;

    /**
     * 获取所有入库列表
     *
     * @return
     */
    @RequestMapping("/list")
    @ResponseBody
    public List<PurchaseStockInItemVO> list(@RequestParam Integer purchaseStockInId) {
        List<PurchaseStockInItemVO> purchaseStockInItemVOList = purchaseStockInItemService.list(purchaseStockInId);
        return purchaseStockInItemVOList;
    }

    /**
     * 保存或修改入库
     *
     * @return
     */
    @PostMapping("/saveOrUpdate")
    @ResponseBody
    public boolean saveOrUpdate(@RequestParam Integer purchaseStockInItemId, @RequestParam String purchaseStockInItemNo, @RequestParam Integer purchaseId, @RequestParam String strDay, @RequestParam Integer quantity, @RequestParam String remark) {
        PurchaseStockInItem purchaseStockInItem = new PurchaseStockInItem();
        purchaseStockInItem.setPurchaseStockInItemId(purchaseStockInItemId);
        purchaseStockInItem.setRemark(remark);
        return purchaseStockInItemService.saveOrUpdate(purchaseStockInItem);
    }

    @PostMapping("/delete")
    @ResponseBody
    public boolean delete(@RequestParam Integer purchaseStockInItemId) {
        return purchaseStockInItemService.delete(purchaseStockInItemId);
    }
}
