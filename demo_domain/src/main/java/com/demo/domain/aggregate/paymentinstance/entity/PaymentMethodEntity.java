package com.demo.domain.aggregate.paymentinstance.entity;

import com.demo.domain.core.marker.Entity;

/**
 * @Author: zhucj_sh
 * @Date: 2021/7/13 14:41
 */
public class PaymentMethodEntity implements Entity<PaymentMethodNo> {

    // 实体唯一标识Id
    private PaymentMethodNo id;

    // 其他的属性

    @Override
    public PaymentMethodNo getId() {
        return id;
    }
}
