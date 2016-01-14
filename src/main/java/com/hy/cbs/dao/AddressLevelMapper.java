package com.hy.cbs.dao;

import com.hy.cbs.domain.AddressLevel;

public interface AddressLevelMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AddressLevel record);

    int insertSelective(AddressLevel record);

    AddressLevel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AddressLevel record);

    int updateByPrimaryKey(AddressLevel record);
}