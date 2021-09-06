package com.demo.persitence.repository.impl;

import com.demo.domain.aggregate.paymentinstance.PaymentInstance;
import com.demo.domain.aggregate.paymentinstance.entity.PaymentMethodNo;
import com.demo.domain.aggregate.paymentinstance.repository.PaymentInstanceRepository;
import com.demo.domain.aggregate.paymentinstance.specification.PaymentInstanceSpecification;

import java.util.List;

/**
 * @Author: zhucj_sh
 * @Date: 2021/7/14 16:52
 */
public class PaymentInstanceRepositoryImpl implements PaymentInstanceRepository {
    public PaymentInstance save(PaymentInstance instance) {
        return null;
    }

    public PaymentInstance find(PaymentMethodNo id) {
        return null;
    }

    public List<PaymentInstance> find(List<PaymentInstanceSpecification> specifications) {
        return null;
    }

    public List<PaymentInstance> find(PaymentMethodNo id, PaymentInstanceSpecification specification) {
        return null;
    }
}
