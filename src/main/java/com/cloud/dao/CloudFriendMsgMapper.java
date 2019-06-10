package com.cloud.dao;

import com.cloud.models.CloudFriendMsg;

public interface CloudFriendMsgMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CloudFriendMsg record);

    int insertSelective(CloudFriendMsg record);

    CloudFriendMsg selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CloudFriendMsg record);

    int updateByPrimaryKey(CloudFriendMsg record);
}