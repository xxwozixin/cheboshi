package com.hy.cbs.dao;

import com.hy.cbs.domain.UserCarinfo;

public interface UserCarinfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserCarinfo record);

    int insertSelective(UserCarinfo record);

    UserCarinfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserCarinfo record);

    int updateByPrimaryKey(UserCarinfo record);
}