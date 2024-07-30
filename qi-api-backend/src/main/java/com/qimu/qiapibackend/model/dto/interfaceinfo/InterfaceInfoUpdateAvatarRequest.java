package com.qimu.qiapibackend.model.dto.interfaceinfo;

import lombok.Data;

/**
 * 接口头像更新请求
 */
@Data
public class InterfaceInfoUpdateAvatarRequest {

    private static final long serialVersionUID = 1L;

    private long id;

    /**
     * 接口头像
     */
    private String avatarUrl;

}
