package com.gmail.mosoft521.jxc4papaer.service;

import com.gmail.mosoft521.jxc4papaer.entity.Warehouse;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface WarehouseService {

    List<Warehouse> list();

    @Transactional
    boolean saveOrUpdate(Warehouse warehouse);

    @Transactional
    boolean delete(Integer warehouseId);

    String getNameById(Integer warehouseId);
}