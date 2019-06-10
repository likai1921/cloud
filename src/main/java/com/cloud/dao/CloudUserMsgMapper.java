package com.cloud.dao;

import com.cloud.models.CloudUserMsg;

public interface CloudUserMsgMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CloudUserMsg record);

    int insertSelective(CloudUserMsg record);

    CloudUserMsg selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CloudUserMsg record);

    int updateByPrimaryKey(CloudUserMsg record);
}