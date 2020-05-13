package com.gmail.mosoft521.jxc4papaer.controller;

import com.gmail.mosoft521.jxc4papaer.entity.Sale;
import com.gmail.mosoft521.jxc4papaer.entity.SaleStockOut;
import com.gmail.mosoft521.jxc4papaer.service.CustomerService;
import com.gmail.mosoft521.jxc4papaer.service.EmpService;
import com.gmail.mosoft521.jxc4papaer.service.ProductService;
import com.gmail.mosoft521.jxc4papaer.service.SaleService;
import com.gmail.mosoft521.jxc4papaer.service.SaleStockOutService;
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
@RequestMapping("/stockOut")
public class SaleStockOutController {

    //日期格式
    private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    //时间格式
    private SimpleDateFormat timeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Autowired
    private SaleStockOutService stockOutService;

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
        List<SaleStockOut> stockOutList = stockOutService.list();
        List<SaleStockOutVO> stockOutVOList = new ArrayList<>(stockOutList.size());
        for (SaleStockOut stockOut : stockOutList) {
            SaleStockOutVO stockOutVO = new SaleStockOutVO();
            BeanUtils.copyProperties(stockOut, stockOutVO);
            stockOutVO.setSaleNo(saleService.getNoById(stockOut.getSaleId()));
            Sale sale = saleService.getById(stockOut.getSaleId());
            stockOutVO.setCustomerName(customerService.getNameById(sale.getCustomerId()));
            stockOutVO.setEmpName(empService.getNameById(sale.getEmpId()));
            stockOutVOList.add(stockOutVO);
        }
        return stockOutVOList;
    }

    /**
     * 保存或修改出库
     *
     * @return
     */
    @PostMapping("/saveOrUpdate")
    @ResponseBody
    public boolean saveOrUpdate(@RequestParam Integer stockOutId, @RequestParam String stockOutNo, @RequestParam Integer saleId, @RequestParam String strDay, @RequestParam Integer quantity, @RequestParam String remark) {
        SaleStockOut stockOut = new SaleStockOut();
        stockOut.setSaleStockOutId(stockOutId);
        stockOut.setSaleStockOutNo(stockOutNo);
        stockOut.setSaleId(saleId);
        Date d = null;
        try {
            d = timeFormat.parse(strDay);
        } catch (ParseException e) {
            return false;
        }
        stockOut.setDay(d);
        stockOut.setRemark(remark);
        return stockOutService.saveOrUpdate(stockOut);
    }

    @PostMapping("/delete")
    @ResponseBody
    public boolean delete(@RequestParam Integer stockOutId) {
        return stockOutService.delete(stockOutId);
    }
}
