package com.gmail.mosoft521.jxc4papaer.controller;

import com.gmail.mosoft521.jxc4papaer.entity.SaleStockOut;
import com.gmail.mosoft521.jxc4papaer.service.CustomerService;
import com.gmail.mosoft521.jxc4papaer.service.EmpService;
import com.gmail.mosoft521.jxc4papaer.service.ProductService;
import com.gmail.mosoft521.jxc4papaer.service.SaleService;
import com.gmail.mosoft521.jxc4papaer.service.SaleStockOutService;
import com.gmail.mosoft521.jxc4papaer.vo.SaleStockOutVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/saleStockOut")
public class SaleStockOutController {

    //日期格式
    private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    //时间格式
    private SimpleDateFormat timeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Autowired
    private SaleStockOutService saleStockOutService;

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
    public List<SaleStockOutVO> list() {
        List<SaleStockOutVO> saleStockOutVOList = saleStockOutService.list();
        return saleStockOutVOList;
    }

    /**
     * 保存或修改销售出库单
     *
     * @return
     */
    @PostMapping("/saveOrUpdate")
    @ResponseBody
    public boolean saveOrUpdate(@RequestParam Integer saleStockOutId, @RequestParam String saleStockOutNo, @RequestParam Integer saleId, @RequestParam Integer empId, @RequestParam String strDay, @RequestParam String remark) {
        SaleStockOut stockOut = new SaleStockOut();
        stockOut.setSaleStockOutId(saleStockOutId);
        stockOut.setSaleStockOutNo(saleStockOutNo);
        stockOut.setSaleId(saleId);
        stockOut.setEmpId(empId);
        Date d = null;
        try {
            d = timeFormat.parse(strDay);
        } catch (ParseException e) {
            return false;
        }
        stockOut.setDay(d);
        stockOut.setRemark(remark);
        return saleStockOutService.saveOrUpdate(stockOut);
    }

    @PostMapping("/delete")
    @ResponseBody
    public boolean delete(@RequestParam Integer saleStockOutId) {
        return saleStockOutService.delete(saleStockOutId);
    }
}
