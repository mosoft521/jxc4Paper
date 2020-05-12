package com.gmail.mosoft521.jxc4papaer.dao;

import com.gmail.mosoft521.jxc4papaer.entity.PurchaseStockInItem;
import com.gmail.mosoft521.jxc4papaer.entity.PurchaseStockInItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PurchaseStockInItemMapper {
    long countByExample(PurchaseStockInItemExample example);

    int deleteByExample(PurchaseStockInItemExample example);

    int deleteByPrimaryKey(Integer purchaseStockInItemId);

    int insert(PurchaseStockInItem record);

    int insertSelective(PurchaseStockInItem record);

    List<PurchaseStockInItem> selectByExample(PurchaseStockInItemExample example);

    PurchaseStockInItem selectByPrimaryKey(Integer purchaseStockInItemId);

    int updateByExampleSelective(@Param("record") PurchaseStockInItem record, @Param("example") PurchaseStockInItemExample example);

    int updateByExample(@Param("record") PurchaseStockInItem record, @Param("example") PurchaseStockInItemExample example);

    int updateByPrimaryKeySelective(PurchaseStockInItem record);

    int updateByPrimaryKey(PurchaseStockInItem record);
}