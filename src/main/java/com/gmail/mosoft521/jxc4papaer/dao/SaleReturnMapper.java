package com.gmail.mosoft521.jxc4papaer.dao;

import com.gmail.mosoft521.jxc4papaer.entity.SaleReturn;
import com.gmail.mosoft521.jxc4papaer.entity.SaleReturnExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SaleReturnMapper {
    long countByExample(SaleReturnExample example);

    int deleteByExample(SaleReturnExample example);

    int deleteByPrimaryKey(Integer saleReturnId);

    int insert(SaleReturn record);

    int insertSelective(SaleReturn record);

    List<SaleReturn> selectByExample(SaleReturnExample example);

    SaleReturn selectByPrimaryKey(Integer saleReturnId);

    int updateByExampleSelective(@Param("record") SaleReturn record, @Param("example") SaleReturnExample example);

    int updateByExample(@Param("record") SaleReturn record, @Param("example") SaleReturnExample example);

    int updateByPrimaryKeySelective(SaleReturn record);

    int updateByPrimaryKey(SaleReturn record);
}