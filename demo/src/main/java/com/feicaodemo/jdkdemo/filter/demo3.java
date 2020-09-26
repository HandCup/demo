package com.feicaodemo.jdkdemo.filter;

import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Caofei
 * @className demo3
 * @description TODO
 * @date {2020/9/13} 15:26
 * Stream() 流中的映射
 * Stream API中提供了map和flatMap中提供了类似的工具
 */
@Slf4j
public class demo3 {
    public static void main(String[] args){
        /**
         * 对流中的每一个元素应用函数
         *
         */
        List<String> words = Arrays.asList("Java 8","Lambdas","In","Action");
//        List<Integer> wordLength  = words.stream().map(String :: length).collect(Collectors.toList());
//        System.out.println(wordLength);


        /**
         * 流的扁平化
         * 拿到上面数组的每个单词的每个字符
         * 1.尝试使用stream 和 map： 结论:不可行，先将单词转换成了一个个数组，然后将一个个数组转换成了流
         * 2.使用flatMap
         */

        /**
         * 先将每个单词转分割成字符串数组（由其字母构成的数组）
         * 再将单词中的每个字符扁平化成一个个单个流
         *
         */
//        List<String> uniqueCharacters  = words.stream()
//                .map(w-> w.split(" "))
//                .flatMap(Arrays::stream)
//                .collect(Collectors.toList());
//
//        System.out.println(uniqueCharacters);

        // 例1：
//        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
//        // 将数组中每个数字的平方值 输出
//        List<Integer> squares = numbers.stream().map(i->i*i).collect(Collectors.toList());
//
//        System.out.println(squares);
        // 例2：
        List<Integer> list1 = Arrays.asList(1,2,3);
        List<Integer> list2 = Arrays.asList(3,4);
       // 输出两个数组可以组合的任意组合
//        List<int[]> list = list1.stream().flatMap(l-> list2.stream().map(l2-> new int[]{l,l2})).collect(Collectors.toList());

        // 输出总和能被３整除的数对
//        List<int[]> pairs =  list1.stream()
//                .flatMap(l1->list2.stream()
//                        .filter(l2 -> (l1+l2) % 3 == 0)
//                        .map( l2-> new int[]{l1, l2}))
//                .collect(Collectors.toList());
//        log.info(pairs.get(0)+"，"+pairs.get(1));

        /**
         * 查找和匹配:数据集中的某些元素是否匹配一个给定的属性
         * allMatch(返回的是布尔值, 终端操作)
         * anyMatch(返回的是布尔值, 终端操作)
         * noneMatch(返回的是布尔值，终端操作)
         * allMatch/anyMatch/noneMatch 三个是短路，跟java中的&&、|| 运算符一个只不过他们是在流中的版本
         *
         * 理解: 什么是短路？其实就是短路求值
         * 有些操作不必要处理整个流就能得到结果。这就是短路
         * 同样limit也是短路操作。
         * limit只需要创建一个给定大小的流，而不用处理流中的所有元素，在碰到无限大小的流的时候，这种操作就有用了，可以把无限流变成有限流
         *
         * findFirst
         * findAny
         */



    }


}
