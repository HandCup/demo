package com.feicaodemo.jdkdemo.filter;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @ClassName demo1
 * @Description Stream<T> filter(Predicate<? super T> predicate)
 * @Author Caofei
 * @Date {2020/8/15} 1:53
 */
@Slf4j
public class demo1 {
    public static void main(String[] args){
        /**
         * Predicate 是一个functionalInterface
         * 代表的方法需要输入一个参数
         * 返回值：boolean
         * 用在stream的filter中，表示是否满足过滤条件
         */

//        basicUsage();
//        multipleFilters();
//        complexPredicate();
//        combinePredicate();
        combinePredicateCollection();
    }

    /**
     * 基础使用
     * 返回结果：[a, abc, auq]
     *
     * 一个Predicate条件
     * s -> s.startsWith("a")
     */
    public static void basicUsage(){
        List<String> stringList = Stream.of("a","b","c","d","e","abc","auq").filter(s -> s.startsWith("a")).collect(Collectors.toList());
        log.info("结果{}:" , stringList);
    }

    /**
     * 如果我们有多个Predicate条件，则可以使用多个filter来进行过滤
     * 返回结果：[abc, abcd]
     *
     * 此时两个predicate条件：
     *  Predicate => s -> s.length() >2
     *  And
     *  Predicate => s ->s.startsWith("a")
     *
     */
    public static void multipleFilters(){
        List<String> list = Stream.of("a","abc","abcd","bcd","deg","sgdgd").filter(s ->s.startsWith("a"))
                .filter(s -> s.length() >2)
                .collect(Collectors.toList());
        log.info("结果{}:", list);

    }

    /**
     * 复合Predicate条件
     * 返回结果：&& ：[bba, budsa]
     *          ||：[a, gasa, bba, budsa]
     *
     * predicate: s -> s.startsWith("b") && s.endsWith("a")
     *
     */
    public static void complexPredicate(){
        List<String> list = Stream.of("a", "ab", "abc","ad","ef","ed","gasa","hasr","bba","budsa")
                .filter(s -> s.startsWith("b") && s.endsWith("a"))
                .collect(Collectors.toList());
        log.info("结果{}:", list);

    }


    /**
     * 组合Predicate
     * Predicate是一个接口，它有几个默认的方法可以用来实现Predicate之间的组合操作
     * ex:
     *  Predicate.or()
     *  Predicate.and()
     *  Predicate.negate() 非
     *
     * 返回结果：
     *  结果1[abc, abhd, asda]:
     *  结果2[a, ab, abc, cbs, abhd, dasda, kmks, asda]:
     *  结果3[a, ab, abc, abhd, asda]:
     */
    public static void combinePredicate(){
        Predicate<String> predicate1 = s -> s.startsWith("a");
        Predicate<String> predicate2 = s -> s.length() > 2;
        List<String> list1 = Stream.of("a","ab","abc","cbs","abhd","dasda","kmks","asda")
                .filter(predicate1.and(predicate2))
                .collect(Collectors.toList());
        log.info("结果1{}:", list1);

        List<String> list2 = Stream.of("a","ab","abc","cbs","abhd","dasda","kmks","asda")
                .filter(predicate1.or(predicate2))
                .collect(Collectors.toList());
        log.info("结果2{}:", list2);


        List<String> list3 = Stream.of("a","ab","abc","cbs","abhd","dasda","kmks","asda")
                .filter(predicate1.or(predicate2.negate()))
                .collect(Collectors.toList());
        log.info("结果3{}:", list3);

        List<String> list4 = Stream.of("a","ab","abc","cbs","abhd","dasda","kmks","asda")
                .filter(predicate1.negate())
                .collect(Collectors.toList());
        log.info("结果4{}:", list4);

    }


    /**
     * Predicate的集合操作
     * 可以使用reduce()对集合进行合并运算
     *
     */
    public static void combinePredicateCollection(){
        List<Predicate<String>> allPredicates = new ArrayList<>();
        allPredicates.add(a -> a.startsWith("a"));
        allPredicates.add(a -> a.length() > 1);

        List<String> list = Stream.of("a","ab","b","bc","asdas")
                .filter(allPredicates.stream().reduce(q->true,Predicate::and))
                .collect(Collectors.toList());

        log.info("结果{}:", list);
    }
}
