package com.gmail.mosoft521.jxc4papaer.controller;

import com.gmail.mosoft521.jxc4papaer.entity.Supplement;
import com.gmail.mosoft521.jxc4papaer.service.ProductService;
import com.gmail.mosoft521.jxc4papaer.service.SupplementService;
import com.gmail.mosoft521.jxc4papaer.vo.SupplementVO;
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
@RequestMapping("/supplement")
public class SupplementController {

    @Autowired
    private SupplementService supplementService;

    @Autowired
    private ProductService productService;

    /**
     * 获取所有仓库列表
     *
     * @return
     */
    @RequestMapping("/list")
    @ResponseBody
    public List<SupplementVO> list() {
        List<Supplement> supplementList = supplementService.list();
        List<SupplementVO> supplementVOList = new ArrayList<>(supplementList.size());
        for (Supplement supplement : supplementList) {
            SupplementVO supplementVO = new SupplementVO();
            BeanUtils.copyProperties(supplement, supplementVO);
            supplementVO.setProductName(productService.getNameById(supplement.getProductId()));
            supplementVOList.add(supplementVO);
        }
        return supplementVOList;
    }

    /**
     * 保存或修改仓库
     *
     * @return
     */
    @PostMapping("/saveOrUpdate")
    @ResponseBody
    public boolean saveOrUpdate(@RequestParam Integer supplementId, @RequestParam String supplementNo, @RequestParam Integer productId, @RequestParam Integer quantity, @RequestParam String remark) {
        Supplement supplement = new Supplement();
        supplement.setSupplementId(supplementId);
        supplement.setSupplementNo(supplementNo);
        supplement.setProductId(productId);
        supplement.setQuantity(quantity);
        supplement.setRemark(remark);
        return supplementService.saveOrUpdate(supplement);
    }

    @PostMapping("/delete")
    @ResponseBody
    public boolean delete(@RequestParam Integer supplementId) {
        return supplementService.delete(supplementId);
    }
}
