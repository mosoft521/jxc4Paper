package com.gmail.mosoft521.jxc4papaer.dao;

import com.gmail.mosoft521.jxc4papaer.entity.CustomerType;
import com.gmail.mosoft521.jxc4papaer.entity.CustomerTypeExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CustomerTypeMapper {
    long countByExample(CustomerTypeExample example);

    int deleteByExample(CustomerTypeExample example);

    int deleteByPrimaryKey(Integer customerTypeId);

    int insert(CustomerType record);

    int insertSelective(CustomerType record);

    List<CustomerType> selectByExample(CustomerTypeExample example);

    CustomerType selectByPrimaryKey(Integer customerTypeId);

    int updateByExampleSelective(@Param("record") CustomerType record, @Param("example") CustomerTypeExample example);

    int updateByExample(@Param("record") CustomerType record, @Param("example") CustomerTypeExample example);

    int updateByPrimaryKeySelective(CustomerType record);

    int updateByPrimaryKey(CustomerType record);
}