package com.demo.domain.aggregate.paymentinstance.repository;

import com.demo.domain.aggregate.paymentinstance.PaymentInstance;
import com.demo.domain.aggregate.paymentinstance.entity.PaymentMethodNo;
import com.demo.domain.aggregate.paymentinstance.specification.PaymentInstanceSpecification;
import com.demo.domain.core.marker.Repository;

import java.util.List;

/**
 * @Author: zhucj_sh
 * @Date: 2021/7/13 14:57
 */
public interface PaymentInstanceRepository extends Repository<PaymentInstance, PaymentMethodNo> {

    PaymentInstance save(PaymentInstance instance);

    PaymentInstance find(PaymentMethodNo id);

    // todo:这个方法一定是定义在仓储里面吗,还是定义在domainService里面
    List<PaymentInstance> find(List<PaymentInstanceSpecification> specifications);

}
