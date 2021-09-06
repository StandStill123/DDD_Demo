package com.demo.domain.aggregate.order;

import com.demo.domain.aggregate.order.entity.TradeNo;
import com.demo.domain.core.marker.Aggregate;
import com.demo.domain.common.CountryCurrencyRelation;

/**
 * @Author: zhucj_sh
 * @Date: 2021/7/13 15:13
 */
public class TradeInfo implements Aggregate<TradeNo> {

    private TradeNo id;

    private CountryCurrencyRelation relation;

    // other dp

    @Override
    public TradeNo getId() {
        return id;
    }
}
