package com.gmail.mosoft521.jxc4papaer.dao;

import com.gmail.mosoft521.jxc4papaer.entity.SaleReturnStockIn;
import com.gmail.mosoft521.jxc4papaer.entity.SaleReturnStockInExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SaleReturnStockInMapper {
    long countByExample(SaleReturnStockInExample example);

    int deleteByExample(SaleReturnStockInExample example);

    int deleteByPrimaryKey(Integer saleReturnStockInId);

    int insert(SaleReturnStockIn record);

    int insertSelective(SaleReturnStockIn record);

    List<SaleReturnStockIn> selectByExample(SaleReturnStockInExample example);

    SaleReturnStockIn selectByPrimaryKey(Integer saleReturnStockInId);

    int updateByExampleSelective(@Param("record") SaleReturnStockIn record, @Param("example") SaleReturnStockInExample example);

    int updateByExample(@Param("record") SaleReturnStockIn record, @Param("example") SaleReturnStockInExample example);

    int updateByPrimaryKeySelective(SaleReturnStockIn record);

    int updateByPrimaryKey(SaleReturnStockIn record);
}