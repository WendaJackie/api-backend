package com.qimu.qiapibackend.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qimu.qiapicommon.model.entity.InterfaceInfo;

import java.util.List;


/**
 * 接口信息服务
 */
public interface InterfaceInfoService extends IService<InterfaceInfo> {

    /**
     * 校验
     *
     * @param add           是否为创建校验
     * @param interfaceInfo 接口信息
     */
    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);

    /**
     * 更新总调用数
     *
     * @param interfaceId 接口id
     * @return boolean
     */
    boolean updateTotalInvokes(long interfaceId);

    /**
     * 获取前三个常被调用的接口
     *
     * @return List<InterfaceInfo>
     */
    List<InterfaceInfo> getTopThreeInvokedInterfaces();
}
