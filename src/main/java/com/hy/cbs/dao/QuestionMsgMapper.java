package com.hy.cbs.dao;

import com.hy.cbs.domain.QuestionMsg;

public interface QuestionMsgMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(QuestionMsg record);

    int insertSelective(QuestionMsg record);

    QuestionMsg selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(QuestionMsg record);

    int updateByPrimaryKey(QuestionMsg record);
}