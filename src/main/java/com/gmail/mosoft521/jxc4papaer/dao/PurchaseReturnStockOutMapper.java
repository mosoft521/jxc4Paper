package com.gmail.mosoft521.jxc4papaer.dao;

import com.gmail.mosoft521.jxc4papaer.entity.PurchaseReturnStockOut;
import com.gmail.mosoft521.jxc4papaer.entity.PurchaseReturnStockOutExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PurchaseReturnStockOutMapper {
    long countByExample(PurchaseReturnStockOutExample example);

    int deleteByExample(PurchaseReturnStockOutExample example);

    int deleteByPrimaryKey(Integer purchaseReturnStockOutId);

    int insert(PurchaseReturnStockOut record);

    int insertSelective(PurchaseReturnStockOut record);

    List<PurchaseReturnStockOut> selectByExample(PurchaseReturnStockOutExample example);

    PurchaseReturnStockOut selectByPrimaryKey(Integer purchaseReturnStockOutId);

    int updateByExampleSelective(@Param("record") PurchaseReturnStockOut record, @Param("example") PurchaseReturnStockOutExample example);

    int updateByExample(@Param("record") PurchaseReturnStockOut record, @Param("example") PurchaseReturnStockOutExample example);

    int updateByPrimaryKeySelective(PurchaseReturnStockOut record);

    int updateByPrimaryKey(PurchaseReturnStockOut record);
}