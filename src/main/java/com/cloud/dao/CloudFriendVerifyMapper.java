package com.cloud.dao;

import com.cloud.models.CloudFriendVerify;

public interface CloudFriendVerifyMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CloudFriendVerify record);

    int insertSelective(CloudFriendVerify record);

    CloudFriendVerify selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CloudFriendVerify record);

    int updateByPrimaryKey(CloudFriendVerify record);
}