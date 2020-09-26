package com.feicaodemo.jdkdemo.predicate;

import java.util.List;

/**
 * @author Caofei
 * @className Predicate
 * @description TODO
 * @date {2020/9/23} 22:51
 */
@FunctionalInterface
public interface Predicate<T> {
    boolean test(T t);
}

