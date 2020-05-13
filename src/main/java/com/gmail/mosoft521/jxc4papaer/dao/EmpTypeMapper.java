package com.gmail.mosoft521.jxc4papaer.dao;

import com.gmail.mosoft521.jxc4papaer.entity.EmpType;
import com.gmail.mosoft521.jxc4papaer.entity.EmpTypeExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface EmpTypeMapper {
    long countByExample(EmpTypeExample example);

    int deleteByExample(EmpTypeExample example);

    int deleteByPrimaryKey(Integer empTypeId);

    int insert(EmpType record);

    int insertSelective(EmpType record);

    List<EmpType> selectByExample(EmpTypeExample example);

    EmpType selectByPrimaryKey(Integer empTypeId);

    int updateByExampleSelective(@Param("record") EmpType record, @Param("example") EmpTypeExample example);

    int updateByExample(@Param("record") EmpType record, @Param("example") EmpTypeExample example);

    int updateByPrimaryKeySelective(EmpType record);

    int updateByPrimaryKey(EmpType record);
}