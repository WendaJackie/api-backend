package com.yupi.yuapicommon.service;

import com.yupi.yuapicommon.model.entity.User;


/**
 * 用户服务
 *
 * @author yupi
 */
public interface InnerUserService {

    /**
     * 数据库中查是否已分配给用户密钥（accessKey）
     * @param accessKey
     */
    User getInvokeUser(String accessKey);
}
