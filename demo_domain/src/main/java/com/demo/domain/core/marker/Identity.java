package com.demo.domain.core.marker;

import java.io.Serializable;

/**
 * @Author: zhucj_sh
 * @Date: 2021/7/5 20:13
 */
public interface Identity<T> extends Serializable {
    T getValue();
}
