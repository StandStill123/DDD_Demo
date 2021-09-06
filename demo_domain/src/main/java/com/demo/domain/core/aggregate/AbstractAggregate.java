package com.demo.domain.core.aggregate;

import com.demo.domain.core.marker.Aggregate;
import com.demo.domain.core.marker.Identity;

import javax.validation.constraints.NotNull;

/**
 * @Author: zhucj_sh
 * @Date: 2021/7/15 13:56
 */
public abstract class AbstractAggregate<Root extends Identity> implements Aggregate<Root> {

    @NotNull(message = "AggregateRoot can't be null")
    private Root root;

    public Root getId(){
      return root;
    }

}
