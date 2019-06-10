package com.cloud.dao;

import com.cloud.models.CloudGorup;

public interface CloudGorupMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CloudGorup record);

    int insertSelective(CloudGorup record);

    CloudGorup selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CloudGorup record);

    int updateByPrimaryKey(CloudGorup record);
}