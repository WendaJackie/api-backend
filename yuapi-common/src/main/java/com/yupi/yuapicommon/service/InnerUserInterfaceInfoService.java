package com.yupi.yuapicommon.service;

/**
* @author zwd
* @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Service
* @createDate 2023-06-08 19:39:23
*/
public interface InnerUserInterfaceInfoService {


    /**
     * 调用接口统计
     * @param interfaceInfoId
     * @param userId
     * @return
     */
    boolean invokeCount(long interfaceInfoId, long userId);
}
