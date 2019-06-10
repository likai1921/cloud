package com.cloud.dao;

import com.cloud.models.CloudFriend;

public interface CloudFriendMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CloudFriend record);

    int insertSelective(CloudFriend record);

    CloudFriend selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CloudFriend record);

    int updateByPrimaryKey(CloudFriend record);
}