package com.gmail.mosoft521.jxc4papaer.controller;

import com.gmail.mosoft521.jxc4papaer.entity.Purchase;
import com.gmail.mosoft521.jxc4papaer.entity.PurchaseStockIn;
import com.gmail.mosoft521.jxc4papaer.service.EmpService;
import com.gmail.mosoft521.jxc4papaer.service.ProductService;
import com.gmail.mosoft521.jxc4papaer.service.ProviderService;
import com.gmail.mosoft521.jxc4papaer.service.PurchaseService;
import com.gmail.mosoft521.jxc4papaer.service.PurchaseStockInItemService;
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
@RequestMapping("/purchaseStockIn")
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
        List<PurchaseStockIn> purchaseStockInList = purchaseStockInService.list();
        List<PurchaseStockInVO> purchaseStockInVOList = new ArrayList<>(purchaseStockInList.size());
        for (PurchaseStockIn purchaseStockIn : purchaseStockInList) {
            PurchaseStockInVO purchaseStockInVO = new PurchaseStockInVO();
            BeanUtils.copyProperties(purchaseStockIn, purchaseStockInVO);
            purchaseStockInVO.setPurchaseNo(purchaseService.getNoById(purchaseStockIn.getPurchaseId()));
            Purchase purchase = purchaseService.getById(purchaseStockIn.getPurchaseId());
            purchaseStockInVO.setProviderName(providerService.getNameById(purchase.getProviderId()));
            purchaseStockInVO.setEmpName(empService.getNameById(purchaseStockIn.getEmpId()));
            purchaseStockInVOList.add(purchaseStockInVO);
        }
        return purchaseStockInVOList;
    }

    /**
     * 保存或修改入库
     *
     * @return
     */
    @PostMapping("/saveOrUpdate")
    @ResponseBody
    public boolean saveOrUpdate(@RequestParam Integer purchaseStockInId, @RequestParam String purchaseStockInNo, @RequestParam Integer purchaseId, @RequestParam Integer empId, @RequestParam String strDay, @RequestParam String remark) {
        PurchaseStockIn purchaseStockIn = new PurchaseStockIn();
        purchaseStockIn.setPurchaseStockInId(purchaseStockInId);
        purchaseStockIn.setPurchaseStockInNo(purchaseStockInNo);
        purchaseStockIn.setPurchaseId(purchaseId);
        purchaseStockIn.setEmpId(empId);
        Date d = null;
        try {
            d = timeFormat.parse(strDay);
        } catch (ParseException e) {
            return false;
        }
        purchaseStockIn.setDay(d);
        purchaseStockIn.setRemark(remark);
        return purchaseStockInService.saveOrUpdate(purchaseStockIn);
    }

    @PostMapping("/delete")
    @ResponseBody
    public boolean delete(@RequestParam Integer purchaseStockInId) {
        return purchaseStockInService.delete(purchaseStockInId);
    }
}
