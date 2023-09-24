package com.yupi.yuapicommon.service;

import com.yupi.yuapicommon.model.entity.InterfaceInfo;

/**
* @author zwd
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2023-05-17 17:40:03
*/
public interface InnerInterfaceInfoService  {

    /**
     * 从数据库中查询模拟接口是否存在（请求路径，请求方法，请求参数，布尔）
     */
    InterfaceInfo getInterfaceInfo(String path, String method);
}
