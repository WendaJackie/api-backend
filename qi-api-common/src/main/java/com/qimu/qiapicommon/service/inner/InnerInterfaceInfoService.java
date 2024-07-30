package com.qimu.qiapicommon.service.inner;


import com.qimu.qiapicommon.model.entity.InterfaceInfo;

/**
 * 接口信息服务
 */
public interface InnerInterfaceInfoService {
    /**
     * 获取接口信息
     *
     * @param path   路径
     * @param method 方法
     * @return {@link InterfaceInfo}
     */
    InterfaceInfo getInterfaceInfo(String path, String method);
}
