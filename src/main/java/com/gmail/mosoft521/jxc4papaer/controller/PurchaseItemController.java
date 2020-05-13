package com.gmail.mosoft521.jxc4papaer.controller;

import com.gmail.mosoft521.jxc4papaer.entity.PurchaseItem;
import com.gmail.mosoft521.jxc4papaer.service.PurchaseItemService;
import com.gmail.mosoft521.jxc4papaer.vo.PurchaseItemVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.List;

@Controller
@RequestMapping("/purchaseItem")
public class PurchaseItemController {

    //日期格式
    private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    //时间格式
    private SimpleDateFormat timeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Autowired
    private PurchaseItemService purchaseItemService;

    /**
     * 获取所有采购列表
     *
     * @return
     */
    @RequestMapping("/list")
    @ResponseBody
    public List<PurchaseItemVO> list(@RequestParam Integer purchaseId) {
        List<PurchaseItemVO> purchaseItemVOList = purchaseItemService.list(purchaseId);
        return purchaseItemVOList;
    }

    /**
     * 保存或修改采购
     *
     * @return
     */
    @PostMapping("/saveOrUpdate")
    @ResponseBody
    public boolean saveOrUpdate(@RequestParam Integer purchaseItemId, @RequestParam Integer purchaseId, @RequestParam Integer productId,
                                @RequestParam Float price, @RequestParam Integer quantity, @RequestParam String remark) {
        PurchaseItem purchaseItem = new PurchaseItem();
        purchaseItem.setPurchaseItemId(purchaseItemId);
        purchaseItem.setPurchaseId(purchaseId);
        purchaseItem.setProductId(productId);
        purchaseItem.setPrice(price);
        purchaseItem.setQuantity(quantity);
        purchaseItem.setRemark(remark);
        return purchaseItemService.saveOrUpdate(purchaseItem);
    }

    @PostMapping("/delete")
    @ResponseBody
    public boolean delete(@RequestParam Integer purchaseItemId) {
        return purchaseItemService.delete(purchaseItemId);
    }
}
