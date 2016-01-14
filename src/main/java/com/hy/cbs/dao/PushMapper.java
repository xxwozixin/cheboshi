package com.hy.cbs.dao;

import com.hy.cbs.domain.Push;

public interface PushMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Push record);

    int insertSelective(Push record);

    Push selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Push record);

    int updateByPrimaryKey(Push record);
}