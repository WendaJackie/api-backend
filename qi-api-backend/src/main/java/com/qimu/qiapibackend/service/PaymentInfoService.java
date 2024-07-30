package com.qimu.qiapibackend.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qimu.qiapibackend.model.entity.PaymentInfo;
import com.qimu.qiapibackend.model.vo.PaymentInfoVo;

/**
 *支付信息服务
 */
public interface PaymentInfoService extends IService<PaymentInfo> {
    /**
     * 创建付款信息
     *
     * @param paymentInfoVo 付款信息vo
     * @return boolean
     */
    boolean createPaymentInfo(PaymentInfoVo paymentInfoVo);
}
