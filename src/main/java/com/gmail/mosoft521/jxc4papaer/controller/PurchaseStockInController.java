package com.gmail.mosoft521.jxc4papaer.controller;

import com.gmail.mosoft521.jxc4papaer.entity.Purchase;
import com.gmail.mosoft521.jxc4papaer.entity.PurchaseStockIn;
import com.gmail.mosoft521.jxc4papaer.service.EmpService;
import com.gmail.mosoft521.jxc4papaer.service.ProductService;
import com.gmail.mosoft521.jxc4papaer.service.ProviderService;
import com.gmail.mosoft521.jxc4papaer.service.PurchaseService;
import com.gmail.mosoft521.jxc4papaer.service.PurchaseStockInService;
import com.gmail.mosoft521.jxc4papaer.vo.PurchaseStockInVO;
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
@RequestMapping("/stockIn")
public class PurchaseStockInController {

    //日期格式
    private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    //时间格式
    private SimpleDateFormat timeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Autowired
    private PurchaseStockInService purchaseStockInService;

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
    public List<PurchaseStockInVO> list() {
        List<PurchaseStockIn> stockInList = purchaseStockInService.list();
        List<PurchaseStockInVO> stockInVOList = new ArrayList<>(stockInList.size());
        for (PurchaseStockIn stockIn : stockInList) {
            PurchaseStockInVO stockInVO = new PurchaseStockInVO();
            BeanUtils.copyProperties(stockIn, stockInVO);
            stockInVO.setPurchaseNo(purchaseService.getNoById(stockIn.getPurchaseId()));
            Purchase purchase = purchaseService.getById(stockIn.getPurchaseId());
            stockInVO.setProviderName(providerService.getNameById(purchase.getProviderId()));
            stockInVO.setEmpName(empService.getNameById(purchase.getEmpId()));
            stockInVOList.add(stockInVO);
        }
        return stockInVOList;
    }

    /**
     * 保存或修改入库
     *
     * @return
     */
    @PostMapping("/saveOrUpdate")
    @ResponseBody
    public boolean saveOrUpdate(@RequestParam Integer stockInId, @RequestParam String stockInNo, @RequestParam Integer purchaseId, @RequestParam String strDay, @RequestParam Integer quantity, @RequestParam String remark) {
        PurchaseStockIn stockIn = new PurchaseStockIn();
        stockIn.setPurchaseStockInId(stockInId);
        stockIn.setPurchaseStockInNo(stockInNo);
        stockIn.setPurchaseId(purchaseId);
        Date d = null;
        try {
            d = timeFormat.parse(strDay);
        } catch (ParseException e) {
            return false;
        }
        stockIn.setDay(d);
        stockIn.setRemark(remark);
        return purchaseStockInService.saveOrUpdate(stockIn);
    }

    @PostMapping("/delete")
    @ResponseBody
    public boolean delete(@RequestParam Integer stockInId) {
        return purchaseStockInService.delete(stockInId);
    }
}
