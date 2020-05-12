package com.gmail.mosoft521.jxc4papaer.dao;

import com.gmail.mosoft521.jxc4papaer.entity.SaleStockOut;
import com.gmail.mosoft521.jxc4papaer.entity.SaleStockOutExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SaleStockOutMapper {
    long countByExample(SaleStockOutExample example);

    int deleteByExample(SaleStockOutExample example);

    int deleteByPrimaryKey(Integer saleStockOutId);

    int insert(SaleStockOut record);

    int insertSelective(SaleStockOut record);

    List<SaleStockOut> selectByExample(SaleStockOutExample example);

    SaleStockOut selectByPrimaryKey(Integer saleStockOutId);

    int updateByExampleSelective(@Param("record") SaleStockOut record, @Param("example") SaleStockOutExample example);

    int updateByExample(@Param("record") SaleStockOut record, @Param("example") SaleStockOutExample example);

    int updateByPrimaryKeySelective(SaleStockOut record);

    int updateByPrimaryKey(SaleStockOut record);
}