package com.gmail.mosoft521.jxc4papaer.dao;

import com.gmail.mosoft521.jxc4papaer.entity.PurchaseReturn;
import com.gmail.mosoft521.jxc4papaer.entity.PurchaseReturnExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PurchaseReturnMapper {
    long countByExample(PurchaseReturnExample example);

    int deleteByExample(PurchaseReturnExample example);

    int deleteByPrimaryKey(Integer purchaseReturnId);

    int insert(PurchaseReturn record);

    int insertSelective(PurchaseReturn record);

    List<PurchaseReturn> selectByExample(PurchaseReturnExample example);

    PurchaseReturn selectByPrimaryKey(Integer purchaseReturnId);

    int updateByExampleSelective(@Param("record") PurchaseReturn record, @Param("example") PurchaseReturnExample example);

    int updateByExample(@Param("record") PurchaseReturn record, @Param("example") PurchaseReturnExample example);

    int updateByPrimaryKeySelective(PurchaseReturn record);

    int updateByPrimaryKey(PurchaseReturn record);
}