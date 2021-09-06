package com.demo.domain.core.id;

import com.demo.domain.core.marker.Identity;
import lombok.Data;

/**
 * @Author: zhucj_sh
 * @Date: 2021/7/13 14:19
 */
@Data
public abstract class StringId implements Identity<String> {

    private static final long serialVersionUID = 2693922111031783484L;

    private String value;

}
