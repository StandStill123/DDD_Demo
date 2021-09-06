package com.demo.domain.core.marker;

/**
 * @Author: zhucj_sh
 * @Date: 2021/7/12 14:38
 */
public interface Identifiable<ID extends Identity> {
    ID getId();
}