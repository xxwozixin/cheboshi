package com.hy.cbs.dao;

import com.hy.cbs.domain.Repository;

public interface RepositoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Repository record);

    int insertSelective(Repository record);

    Repository selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Repository record);

    int updateByPrimaryKeyWithBLOBs(Repository record);

    int updateByPrimaryKey(Repository record);
}