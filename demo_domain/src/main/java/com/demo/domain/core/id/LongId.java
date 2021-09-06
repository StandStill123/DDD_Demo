package com.demo.domain.core.id;

import com.demo.domain.core.marker.Identity;
import lombok.Data;

/**
 * @Author: zhucj_sh
 * @Date: 2021/7/13 12:12
 */
@Data
public abstract class LongId implements Identity<Long> {

    private static final long serialVersionUID = 5656772908538939660L;

    private Long value;

}
