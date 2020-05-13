package com.gmail.mosoft521.jxc4papaer.dao;

import com.gmail.mosoft521.jxc4papaer.entity.PurchaseStockIn;
import com.gmail.mosoft521.jxc4papaer.entity.PurchaseStockInExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PurchaseStockInMapper {
    long countByExample(PurchaseStockInExample example);

    int deleteByExample(PurchaseStockInExample example);

    int deleteByPrimaryKey(Integer purchaseStockInId);

    int insert(PurchaseStockIn record);

    int insertSelective(PurchaseStockIn record);

    List<PurchaseStockIn> selectByExample(PurchaseStockInExample example);

    PurchaseStockIn selectByPrimaryKey(Integer purchaseStockInId);

    int updateByExampleSelective(@Param("record") PurchaseStockIn record, @Param("example") PurchaseStockInExample example);

    int updateByExample(@Param("record") PurchaseStockIn record, @Param("example") PurchaseStockInExample example);

    int updateByPrimaryKeySelective(PurchaseStockIn record);

    int updateByPrimaryKey(PurchaseStockIn record);
}