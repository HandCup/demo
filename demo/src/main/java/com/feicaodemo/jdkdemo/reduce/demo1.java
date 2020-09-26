package com.feicaodemo.jdkdemo.reduce;

import com.fasterxml.jackson.databind.ser.std.NumberSerializer;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @author Caofei
 * @className demo1
 * @description TODO
 * @date {2020/9/13} 18:28
 * 归约
 * 元素求和 Integer::sum
 * 最大值 Integer::max
 * 最小值 Integer::min
 *
 *
 * filter 中间 Stream<T> Predicate<T> T -> boolean
 * distinct 中间
 * (有状态无界)
 * Stream<T>
 * skip 中间
 * (有状态有界)
 * Stream<T> long
 * limit 中间
 * (有状态有界)
 * Stream<T> long
 * map 中间 Stream<R> Function<T, R> T -> R
 * flatMap 中间 Stream<R> Function<T, Stream<R>> T -> Stream<R>
 * sorted 中间
 * (有状态无界)
 * Stream<T> Comparator<T> (T, T) -> int
 * anyMatch 终端 boolean Predicate<T> T -> boolean
 * noneMatch 终端 boolean Predicate<T> T -> boolean
 * allMatch 终端 boolean Predicate<T> T -> boolean
 * findAny 终端 Optional<T>
 * findFirst 终端 Optional<T>
 * forEach 终端 void Consumer<T> T -> void
 * collect 终端 R Collector<T, A, R>
 * reduce 终端
 * (有状态有界)
 * Optional<T> BinaryOperator<T> (T, T) -> T
 * count 终端 long
 *
 */
@Slf4j
public class demo1 {
    public static void main(String[] args){
        int sum = 0;
        for(int i =0; i< 3; i++){
            sum +=i;
        }
        log.info("和:{}",sum);
        /**
         * 此时通过运算符反复迭代来计算出结果
         * 把一个数字列表归约成一个数字
         */

        List<Integer> numbers = Arrays.asList(1,2,3,33,4,5);
        log.info("{}:",numbers.stream().reduce(0, Integer::sum));

        // 无初始值 的reduce的重载的变体
        // 返回值为Optional<Integer> 考虑到和可能不存在的情况返回个Optional对象 规避NPE
        Optional<Integer> sum2 = numbers.stream().reduce(Integer::sum);
        System.out.println(sum2.get());
    }
}
