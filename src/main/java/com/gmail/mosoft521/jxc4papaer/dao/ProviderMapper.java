package com.gmail.mosoft521.jxc4papaer.dao;

import com.gmail.mosoft521.jxc4papaer.entity.Provider;
import com.gmail.mosoft521.jxc4papaer.entity.ProviderExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ProviderMapper {
    long countByExample(ProviderExample example);

    int deleteByExample(ProviderExample example);

    int deleteByPrimaryKey(Integer providerId);

    int insert(Provider record);

    int insertSelective(Provider record);

    List<Provider> selectByExample(ProviderExample example);

    Provider selectByPrimaryKey(Integer providerId);

    int updateByExampleSelective(@Param("record") Provider record, @Param("example") ProviderExample example);

    int updateByExample(@Param("record") Provider record, @Param("example") ProviderExample example);

    int updateByPrimaryKeySelective(Provider record);

    int updateByPrimaryKey(Provider record);
}