package com.demo.domain.core.specification;

import com.demo.domain.core.marker.Identity;
import com.demo.domain.core.marker.Specification;

import javax.validation.constraints.NotNull;

/**
 * @Author: zhucj_sh
 * @Date: 2021/7/15 15:40
 */
public abstract class AbstractSpecification<ID extends Identity> implements Specification<ID> {

    @NotNull(message = "AbstractSpecification ID can't be null")
    private ID id;

    @Override
    public ID getId() {
        return id;
    }
}
