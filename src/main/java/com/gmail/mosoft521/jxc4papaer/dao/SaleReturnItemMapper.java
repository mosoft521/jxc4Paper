package com.gmail.mosoft521.jxc4papaer.dao;

import com.gmail.mosoft521.jxc4papaer.entity.SaleReturnItem;
import com.gmail.mosoft521.jxc4papaer.entity.SaleReturnItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SaleReturnItemMapper {
    long countByExample(SaleReturnItemExample example);

    int deleteByExample(SaleReturnItemExample example);

    int deleteByPrimaryKey(Integer saleReturnItemId);

    int insert(SaleReturnItem record);

    int insertSelective(SaleReturnItem record);

    List<SaleReturnItem> selectByExample(SaleReturnItemExample example);

    SaleReturnItem selectByPrimaryKey(Integer saleReturnItemId);

    int updateByExampleSelective(@Param("record") SaleReturnItem record, @Param("example") SaleReturnItemExample example);

    int updateByExample(@Param("record") SaleReturnItem record, @Param("example") SaleReturnItemExample example);

    int updateByPrimaryKeySelective(SaleReturnItem record);

    int updateByPrimaryKey(SaleReturnItem record);
}