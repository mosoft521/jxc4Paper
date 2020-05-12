package com.gmail.mosoft521.jxc4papaer.dao;

import com.gmail.mosoft521.jxc4papaer.entity.PurchaseReturnStockOutItem;
import com.gmail.mosoft521.jxc4papaer.entity.PurchaseReturnStockOutItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PurchaseReturnStockOutItemMapper {
    long countByExample(PurchaseReturnStockOutItemExample example);

    int deleteByExample(PurchaseReturnStockOutItemExample example);

    int deleteByPrimaryKey(Integer purchaseReturnStockOutItemId);

    int insert(PurchaseReturnStockOutItem record);

    int insertSelective(PurchaseReturnStockOutItem record);

    List<PurchaseReturnStockOutItem> selectByExample(PurchaseReturnStockOutItemExample example);

    PurchaseReturnStockOutItem selectByPrimaryKey(Integer purchaseReturnStockOutItemId);

    int updateByExampleSelective(@Param("record") PurchaseReturnStockOutItem record, @Param("example") PurchaseReturnStockOutItemExample example);

    int updateByExample(@Param("record") PurchaseReturnStockOutItem record, @Param("example") PurchaseReturnStockOutItemExample example);

    int updateByPrimaryKeySelective(PurchaseReturnStockOutItem record);

    int updateByPrimaryKey(PurchaseReturnStockOutItem record);
}