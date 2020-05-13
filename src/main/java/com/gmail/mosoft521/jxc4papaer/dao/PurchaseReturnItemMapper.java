package com.gmail.mosoft521.jxc4papaer.dao;

import com.gmail.mosoft521.jxc4papaer.entity.PurchaseReturnItem;
import com.gmail.mosoft521.jxc4papaer.entity.PurchaseReturnItemExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PurchaseReturnItemMapper {
    long countByExample(PurchaseReturnItemExample example);

    int deleteByExample(PurchaseReturnItemExample example);

    int deleteByPrimaryKey(Integer purchaseReturnItemId);

    int insert(PurchaseReturnItem record);

    int insertSelective(PurchaseReturnItem record);

    List<PurchaseReturnItem> selectByExample(PurchaseReturnItemExample example);

    PurchaseReturnItem selectByPrimaryKey(Integer purchaseReturnItemId);

    int updateByExampleSelective(@Param("record") PurchaseReturnItem record, @Param("example") PurchaseReturnItemExample example);

    int updateByExample(@Param("record") PurchaseReturnItem record, @Param("example") PurchaseReturnItemExample example);

    int updateByPrimaryKeySelective(PurchaseReturnItem record);

    int updateByPrimaryKey(PurchaseReturnItem record);
}