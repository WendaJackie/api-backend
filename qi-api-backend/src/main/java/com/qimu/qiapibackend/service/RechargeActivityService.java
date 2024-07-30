package com.qimu.qiapibackend.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qimu.qiapibackend.model.entity.RechargeActivity;

import java.util.List;

/**
 * 充值活动服务
 */
public interface RechargeActivityService extends IService<RechargeActivity> {
    /**
     * 按订单号获取充值活动
     *
     * @param orderNo 订单号
     * @return {@link RechargeActivity}
     */
    List<RechargeActivity> getRechargeActivityByOrderNo(String orderNo);
}
