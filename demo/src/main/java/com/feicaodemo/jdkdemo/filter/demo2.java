package com.feicaodemo.jdkdemo.filter;

import java.util.Arrays;
import java.util.List;

/**
 * @author Caofei
 * @className demo2
 * @description TODO
 * @date {2020/9/13} 12:05
 * distinct(): 根据流生成的hashCode和equals方法去比较
 *
 */
public class demo2 {
    public static void main(String[] args){
        List<Integer>  numbers = Arrays.asList(1,2,3,4,2,3,3,5);

        /**
         * 筛选流中不同的元素
         */
        // 使用filter根据条件过滤
//        numbers.stream().filter(number ->(number % 2 == 0))
//                .distinct()
//                .forEach(System.out::println);
        /**
         * 截断流
         * 该方法会返回一个不超过给定长度的流
         * limit(n) ： n代表长度
         * 如果流是有序的，limit(n) 会返回前n个元素
         * 如果流是无序的，比如元是一个set 这个时候limit的结果不会以任何顺序排列
         *
         * 跳跃流中的元素：
         * 用法和limit(n) 类似
         *
         * 返回一个扔掉了前n个元素的流， 如果流中的元素不足n个，则返回一个空流
         *
         */
//        numbers.stream().filter(number -> number >2)
//                .limit(6)
//                .forEach(System.out::println);

//        numbers.stream().filter(number -> number >2)
//                .skip(5)
//                .forEach(System.out::println);

    }


}
