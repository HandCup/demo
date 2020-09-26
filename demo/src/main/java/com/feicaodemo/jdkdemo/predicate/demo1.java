package com.feicaodemo.jdkdemo.predicate;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Caofei
 * @className demo1
 * @description TODO
 * @date {2020/9/23} 22:51
 */
public class demo1 {
    public static <T> List<T> filter(List<T> list, Predicate<T> p) {
        List<T> results = new ArrayList<>();
        for (T s : list) {
            if (p.test(s)) {
                results.add(s);
            }
        }
        return results;
    }

}
