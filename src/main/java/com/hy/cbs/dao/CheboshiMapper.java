package com.hy.cbs.dao;

import com.hy.cbs.domain.Cheboshi;

public interface CheboshiMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Cheboshi record);

    int insertSelective(Cheboshi record);

    Cheboshi selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Cheboshi record);

    int updateByPrimaryKeyWithBLOBs(Cheboshi record);

    int updateByPrimaryKey(Cheboshi record);
}