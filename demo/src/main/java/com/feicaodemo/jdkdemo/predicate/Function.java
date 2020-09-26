package com.feicaodemo.jdkdemo.predicate;

/**
 * @author Caofei
 * @className Function
 * @description TODO
 * @date {2020/9/23} 23:00
 */
@FunctionalInterface
public interface Function<T, R> {
    R apply(T t);
}
