package com.gmail.mosoft521.jxc4papaer.service.impl;

import com.gmail.mosoft521.jxc4papaer.dao.WarehouseMapper;
import com.gmail.mosoft521.jxc4papaer.entity.Warehouse;
import com.gmail.mosoft521.jxc4papaer.service.WarehouseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class WarehouseServiceImpl implements WarehouseService {

    @Resource
    private WarehouseMapper warehouseMapper;

    @Override
    public List<Warehouse> list() {
        return warehouseMapper.selectByExample(null);
    }

    @Override
    public boolean saveOrUpdate(Warehouse warehouse) {
        int r = 0;
        if (null == warehouse.getWarehouseId()) {
            r = warehouseMapper.insertSelective(warehouse);
        } else {
            r = warehouseMapper.updateByPrimaryKey(warehouse);
        }
        return r > 0 ? true : false;
    }

    @Override
    public boolean delete(Integer warehouseId) {
        return warehouseMapper.deleteByPrimaryKey(warehouseId) > 0 ? true : false;
    }

    @Override
    public String getNameById(Integer warehouseId) {
        return warehouseMapper.selectByPrimaryKey(warehouseId).getWarehouseName();
    }
}
