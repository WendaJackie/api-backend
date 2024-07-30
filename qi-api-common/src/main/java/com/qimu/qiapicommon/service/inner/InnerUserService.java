package com.qimu.qiapicommon.service.inner;

import com.qimu.qiapicommon.model.vo.UserVO;


/**
 * 用户服务
 */
public interface InnerUserService {

    /**
     * 通过访问密钥获取invoke用户
     * 按凭证获取invoke用户
     *
     * @param accessKey 访问密钥
     * @return {@link UserVO}
     */
    UserVO getInvokeUserByAccessKey(String accessKey);
}
