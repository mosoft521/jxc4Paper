package com.gmail.mosoft521.jxc4papaer.dao;

import com.gmail.mosoft521.jxc4papaer.entity.PurchaseItem;
import com.gmail.mosoft521.jxc4papaer.entity.PurchaseItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PurchaseItemMapper {
    long countByExample(PurchaseItemExample example);

    int deleteByExample(PurchaseItemExample example);

    int deleteByPrimaryKey(Integer purchaseItemId);

    int insert(PurchaseItem record);

    int insertSelective(PurchaseItem record);

    List<PurchaseItem> selectByExample(PurchaseItemExample example);

    PurchaseItem selectByPrimaryKey(Integer purchaseItemId);

    int updateByExampleSelective(@Param("record") PurchaseItem record, @Param("example") PurchaseItemExample example);

    int updateByExample(@Param("record") PurchaseItem record, @Param("example") PurchaseItemExample example);

    int updateByPrimaryKeySelective(PurchaseItem record);

    int updateByPrimaryKey(PurchaseItem record);
}