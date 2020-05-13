package com.gmail.mosoft521.jxc4papaer.dao;

import com.gmail.mosoft521.jxc4papaer.entity.SaleStockOutItem;
import com.gmail.mosoft521.jxc4papaer.entity.SaleStockOutItemExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SaleStockOutItemMapper {
    long countByExample(SaleStockOutItemExample example);

    int deleteByExample(SaleStockOutItemExample example);

    int deleteByPrimaryKey(Integer saleStockOutItemId);

    int insert(SaleStockOutItem record);

    int insertSelective(SaleStockOutItem record);

    List<SaleStockOutItem> selectByExample(SaleStockOutItemExample example);

    SaleStockOutItem selectByPrimaryKey(Integer saleStockOutItemId);

    int updateByExampleSelective(@Param("record") SaleStockOutItem record, @Param("example") SaleStockOutItemExample example);

    int updateByExample(@Param("record") SaleStockOutItem record, @Param("example") SaleStockOutItemExample example);

    int updateByPrimaryKeySelective(SaleStockOutItem record);

    int updateByPrimaryKey(SaleStockOutItem record);
}