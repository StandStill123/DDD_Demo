package com.demo.domain.core.entity;

import com.demo.domain.core.marker.Entity;
import com.demo.domain.core.marker.Identity;
import lombok.Data;


/**
 * @Author: zhucj_sh
 * @Date: 2021/7/13 14:43
 */
@Data
public abstract class AbstractEntity<ID extends Identity> implements Entity<ID> {

    private ID id;

}
