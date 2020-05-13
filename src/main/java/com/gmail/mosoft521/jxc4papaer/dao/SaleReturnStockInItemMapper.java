package com.gmail.mosoft521.jxc4papaer.dao;

import com.gmail.mosoft521.jxc4papaer.entity.SaleReturnStockInItem;
import com.gmail.mosoft521.jxc4papaer.entity.SaleReturnStockInItemExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SaleReturnStockInItemMapper {
    long countByExample(SaleReturnStockInItemExample example);

    int deleteByExample(SaleReturnStockInItemExample example);

    int deleteByPrimaryKey(Integer saleReturnStockInItemId);

    int insert(SaleReturnStockInItem record);

    int insertSelective(SaleReturnStockInItem record);

    List<SaleReturnStockInItem> selectByExample(SaleReturnStockInItemExample example);

    SaleReturnStockInItem selectByPrimaryKey(Integer saleReturnStockInItemId);

    int updateByExampleSelective(@Param("record") SaleReturnStockInItem record, @Param("example") SaleReturnStockInItemExample example);

    int updateByExample(@Param("record") SaleReturnStockInItem record, @Param("example") SaleReturnStockInItemExample example);

    int updateByPrimaryKeySelective(SaleReturnStockInItem record);

    int updateByPrimaryKey(SaleReturnStockInItem record);
}