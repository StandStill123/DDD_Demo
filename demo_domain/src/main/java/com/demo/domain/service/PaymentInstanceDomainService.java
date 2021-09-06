package com.demo.domain.service;

import com.demo.domain.aggregate.paymentinstance.PaymentInstance;

/**
 * @Author: zhucj_sh
 * @Date: 2021/7/14 15:19
 */
public interface PaymentInstanceDomainService {

    // 合并渠道支付方式实例 入:渠道支付方式实例,出: 支付实例
    PaymentInstance merge(PaymentInstance instance);

}
