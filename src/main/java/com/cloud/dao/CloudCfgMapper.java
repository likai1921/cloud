package com.cloud.dao;

import com.cloud.models.CloudCfg;

public interface CloudCfgMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CloudCfg record);

    int insertSelective(CloudCfg record);

    CloudCfg selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CloudCfg record);

    int updateByPrimaryKey(CloudCfg record);
}