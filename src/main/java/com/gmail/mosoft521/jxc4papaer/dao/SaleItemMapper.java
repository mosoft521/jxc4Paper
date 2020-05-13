package com.gmail.mosoft521.jxc4papaer.dao;

import com.gmail.mosoft521.jxc4papaer.entity.SaleItem;
import com.gmail.mosoft521.jxc4papaer.entity.SaleItemExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SaleItemMapper {
    long countByExample(SaleItemExample example);

    int deleteByExample(SaleItemExample example);

    int deleteByPrimaryKey(Integer saleItemId);

    int insert(SaleItem record);

    int insertSelective(SaleItem record);

    List<SaleItem> selectByExample(SaleItemExample example);

    SaleItem selectByPrimaryKey(Integer saleItemId);

    int updateByExampleSelective(@Param("record") SaleItem record, @Param("example") SaleItemExample example);

    int updateByExample(@Param("record") SaleItem record, @Param("example") SaleItemExample example);

    int updateByPrimaryKeySelective(SaleItem record);

    int updateByPrimaryKey(SaleItem record);
}