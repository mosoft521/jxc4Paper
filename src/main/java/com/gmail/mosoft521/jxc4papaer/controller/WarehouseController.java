package com.gmail.mosoft521.jxc4papaer.controller;

import com.gmail.mosoft521.jxc4papaer.entity.Warehouse;
import com.gmail.mosoft521.jxc4papaer.service.WarehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/warehouse")
public class WarehouseController {

    @Autowired
    private WarehouseService warehouseService;

    /**
     * 获取所有库存列表
     *
     * @return
     */
    @RequestMapping("/list")
    @ResponseBody
    public List<Warehouse> list() {
        List<Warehouse> warehouseList = warehouseService.list();
        return warehouseList;
    }

    /**
     * 保存或修改库存
     *
     * @return
     */
    @PostMapping("/saveOrUpdate")
    @ResponseBody
    public boolean saveOrUpdate(@RequestParam Integer warehouseId, @RequestParam String warehouseName, @RequestParam String warehouseAddress, @RequestParam String tel, @RequestParam Integer warehouseSize) {
        Warehouse warehouse = new Warehouse();
        warehouse.setWarehouseId(warehouseId);
        warehouse.setWarehouseName(warehouseName);
        warehouse.setWarehouseAddress(warehouseAddress);
        warehouse.setTel(tel);
        warehouse.setWarehouseSize(warehouseSize);
        return warehouseService.saveOrUpdate(warehouse);
    }

    @PostMapping("/delete")
    @ResponseBody
    public boolean delete(@RequestParam Integer warehouseId) {
        return warehouseService.delete(warehouseId);
    }
}
