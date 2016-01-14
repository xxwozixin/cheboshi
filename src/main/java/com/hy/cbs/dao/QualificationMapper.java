package com.hy.cbs.dao;

import com.hy.cbs.domain.Qualification;

public interface QualificationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Qualification record);

    int insertSelective(Qualification record);

    Qualification selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Qualification record);

    int updateByPrimaryKey(Qualification record);
}