package com.gmail.mosoft521.jxc4papaer.controller;

import com.gmail.mosoft521.jxc4papaer.entity.Sale;
import com.gmail.mosoft521.jxc4papaer.service.CustomerService;
import com.gmail.mosoft521.jxc4papaer.service.EmpService;
import com.gmail.mosoft521.jxc4papaer.service.ProductService;
import com.gmail.mosoft521.jxc4papaer.service.SaleService;
import com.gmail.mosoft521.jxc4papaer.vo.SaleVO;
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
@RequestMapping("/sale")
public class SaleController {

    //日期格式
    private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    //时间格式
    private SimpleDateFormat timeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Autowired
    private SaleService saleService;

    @Autowired
    private CustomerService customerService;

    @Autowired
    private EmpService empService;

    @Autowired
    private ProductService productService;

    /**
     * 获取所有销售列表
     *
     * @return
     */
    @RequestMapping("/list")
    @ResponseBody
    public List<SaleVO> list() {
        List<Sale> saleList = saleService.list();
        List<SaleVO> saleVOList = new ArrayList<>(saleList.size());
        for (Sale sale : saleList) {
            SaleVO saleVO = new SaleVO();
            BeanUtils.copyProperties(sale, saleVO);
            saleVO.setCustomerName(customerService.getNameById(saleVO.getCustomerId()));
            saleVO.setEmpName(empService.getNameById(saleVO.getEmpId()));
            saleVOList.add(saleVO);
        }
        return saleVOList;
    }

    /**
     * 保存或修改销售
     *
     * @return
     */
    @PostMapping("/saveOrUpdate")
    @ResponseBody
    public boolean saveOrUpdate(@RequestParam Integer saleId, @RequestParam String saleNo, @RequestParam Integer customerId, @RequestParam Integer empId, @RequestParam Integer productId,
                                @RequestParam String strDay, @RequestParam Float price, @RequestParam Integer quantity, @RequestParam String remark) {
        Sale sale = new Sale();
        sale.setSaleId(saleId);
        sale.setSaleNo(saleNo);
        sale.setCustomerId(customerId);
        sale.setEmpId(empId);
        Date d = null;
        try {
            d = timeFormat.parse(strDay);
        } catch (ParseException e) {
            return false;
        }
        sale.setDay(d);
        sale.setRemark(remark);
        return saleService.saveOrUpdate(sale);
    }

    @PostMapping("/delete")
    @ResponseBody
    public boolean delete(@RequestParam Integer saleId) {
        return saleService.delete(saleId);
    }
}
