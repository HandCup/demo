package com.feicaodemo.jdkdemo.predicate;

/**
 * @author Caofei
 * @className Consumer
 * @description TODO
 * @date {2020/9/23} 22:56
 */
@FunctionalInterface
public interface Consumer<T> {
    void accept(T t);
}
