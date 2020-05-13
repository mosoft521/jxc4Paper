package com.gmail.mosoft521.jxc4papaer.dao;

import com.gmail.mosoft521.jxc4papaer.entity.Warehouse;
import com.gmail.mosoft521.jxc4papaer.entity.WarehouseExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface WarehouseMapper {
    long countByExample(WarehouseExample example);

    int deleteByExample(WarehouseExample example);

    int deleteByPrimaryKey(Integer warehouseId);

    int insert(Warehouse record);

    int insertSelective(Warehouse record);

    List<Warehouse> selectByExample(WarehouseExample example);

    Warehouse selectByPrimaryKey(Integer warehouseId);

    int updateByExampleSelective(@Param("record") Warehouse record, @Param("example") WarehouseExample example);

    int updateByExample(@Param("record") Warehouse record, @Param("example") WarehouseExample example);

    int updateByPrimaryKeySelective(Warehouse record);

    int updateByPrimaryKey(Warehouse record);
}