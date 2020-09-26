package com.feicaodemo.jdkdemo.predicate;

import java.util.Arrays;
import java.util.List;

/**
 * @author Caofei
 * @className demo2
 * @description TODO
 * @date {2020/9/23} 22:57
 */
public class demo2 {

    public static <T> void  forEach(List<T> list, Consumer<T> c){
        for(T i : list){
            c.accept(i);
        }

        // Lambda是Consumer 中accept方法的实现
        forEach(Arrays.asList(1,2,3,4,5), (Integer i) -> System.out.println(i));
    }

}
