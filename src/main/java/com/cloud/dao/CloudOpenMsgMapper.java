package com.cloud.dao;

import com.cloud.models.CloudOpenMsg;

public interface CloudOpenMsgMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CloudOpenMsg record);

    int insertSelective(CloudOpenMsg record);

    CloudOpenMsg selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CloudOpenMsg record);

    int updateByPrimaryKey(CloudOpenMsg record);
}