package com.hy.cbs.dao;

import com.hy.cbs.domain.CheboshiCarlevel;

public interface CheboshiCarlevelMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CheboshiCarlevel record);

    int insertSelective(CheboshiCarlevel record);

    CheboshiCarlevel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CheboshiCarlevel record);

    int updateByPrimaryKey(CheboshiCarlevel record);
}