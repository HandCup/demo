package com.feicaodemo.jdkdemo.predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Caofei
 * @className demo3
 * @description TODO
 * @date {2020/9/23} 23:01
 * 泛型只能绑定到引用类型
 * Java有将原始类型转换为对应的引用类型的机制-这个机制叫作 装箱(boxing)
 * 将引用类型转换为原始类型叫做拆箱-这个机制叫做 拆箱(unboxing)
 *
 * 在Java中有个自动装箱机制来帮助程序员执行这一任务：即装箱和拆箱是自动完成的
 *
 * 装箱的本质：把原始类型包裹起来，并保存在堆里，因此装箱后的值需要更多的内存。并且需要额外的内存搜索来获取被包裹的原始值
 *
 *
 *
 */
public class demo3 {
    public static <T, R> List<R> map(List<T> list, Function<T,R> f){
        List<R> result = new ArrayList<>();
        for(T s : list){
            result.add(f.apply(s));
        }
        return result;
    }
    // [7, 2, 6]
    List<Integer> list = map(Arrays.asList("lambdas","in","action"), (String s)-> s.length());
}
