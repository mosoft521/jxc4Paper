package com.gmail.mosoft521.jxc4papaer.dao;

import com.gmail.mosoft521.jxc4papaer.entity.Supplement;
import com.gmail.mosoft521.jxc4papaer.entity.SupplementExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SupplementMapper {
    long countByExample(SupplementExample example);

    int deleteByExample(SupplementExample example);

    int deleteByPrimaryKey(Integer supplementId);

    int insert(Supplement record);

    int insertSelective(Supplement record);

    List<Supplement> selectByExample(SupplementExample example);

    Supplement selectByPrimaryKey(Integer supplementId);

    int updateByExampleSelective(@Param("record") Supplement record, @Param("example") SupplementExample example);

    int updateByExample(@Param("record") Supplement record, @Param("example") SupplementExample example);

    int updateByPrimaryKeySelective(Supplement record);

    int updateByPrimaryKey(Supplement record);
}