package com.gmail.mosoft521.jxc4papaer.dao;

import com.gmail.mosoft521.jxc4papaer.entity.Supply;
import com.gmail.mosoft521.jxc4papaer.entity.SupplyExample;
import com.gmail.mosoft521.jxc4papaer.entity.SupplyKey;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SupplyMapper {
    long countByExample(SupplyExample example);

    int deleteByExample(SupplyExample example);

    int deleteByPrimaryKey(SupplyKey key);

    int insert(Supply record);

    int insertSelective(Supply record);

    List<Supply> selectByExample(SupplyExample example);

    Supply selectByPrimaryKey(SupplyKey key);

    int updateByExampleSelective(@Param("record") Supply record, @Param("example") SupplyExample example);

    int updateByExample(@Param("record") Supply record, @Param("example") SupplyExample example);

    int updateByPrimaryKeySelective(Supply record);

    int updateByPrimaryKey(Supply record);
}