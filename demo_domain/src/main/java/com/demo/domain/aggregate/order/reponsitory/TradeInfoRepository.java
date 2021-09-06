package com.demo.domain.aggregate.order.reponsitory;

import com.demo.domain.aggregate.order.TradeInfo;
import com.demo.domain.aggregate.order.entity.TradeNo;
import com.demo.domain.core.marker.Repository;

/**
 * @Author: zhucj_sh
 * @Date: 2021/7/13 15:16
 */
public interface TradeInfoRepository extends Repository<TradeInfo, TradeNo> {

    TradeInfo getTradeInfo(TradeNo id);

    // 如果只是做了一层转换的话还有必要定义仓储吗?

}
