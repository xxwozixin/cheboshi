package com.hy.cbs.dao;

import com.hy.cbs.domain.Carinfo;

public interface CarinfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Carinfo record);

    int insertSelective(Carinfo record);

    Carinfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Carinfo record);

    int updateByPrimaryKey(Carinfo record);
}