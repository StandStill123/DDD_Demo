package com.demo.domain.aggregate.paymentinstance;

import com.demo.domain.aggregate.order.entity.TradeNo;
import com.demo.domain.aggregate.paymentinstance.entity.PaymentMethodEntity;
import com.demo.domain.aggregate.paymentinstance.entity.PaymentMethodNo;
import com.demo.domain.core.aggregate.AbstractAggregate;

/**
 * @Author: zhucj_sh
 * @Date: 2021/7/13 14:55
 */
public class PaymentInstance extends AbstractAggregate<PaymentMethodNo> {

    private PaymentMethodEntity paymentMethod;

    // other domain primitive * value objects

    // private OrderData orderData;

    // private List<PaymentMethodDetails> details;


}