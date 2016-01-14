package com.hy.cbs.dao;

import com.hy.cbs.domain.Carlevel;

public interface CarlevelMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Carlevel record);

    int insertSelective(Carlevel record);

    Carlevel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Carlevel record);

    int updateByPrimaryKey(Carlevel record);
}