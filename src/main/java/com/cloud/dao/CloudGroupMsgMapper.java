package com.cloud.dao;

import com.cloud.models.CloudGroupMsg;

public interface CloudGroupMsgMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CloudGroupMsg record);

    int insertSelective(CloudGroupMsg record);

    CloudGroupMsg selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CloudGroupMsg record);

    int updateByPrimaryKey(CloudGroupMsg record);
}