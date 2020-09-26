package com.feicaodemo.jdkdemo.map;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @ClassName mapDemo
 * @Description
 *  <R> Stream<R> map(Function<? super T, ? extends R> mapper)
 * @Author Caofei
 * @Date {2020/8/15} 2:34
 */
public class mapDemo {
    public static void main(String[] args){
        /**
         *  map操作是将流进行再加工的形成一个新流
         *  map只是提取属性放入流中
         *  flatMap先提取属性放入一个比较小的流，然后再将所有的流合并为一个流(适合再嵌套场景下使用)
         *
         *  flatmap则提供一种一对多关系的映射
         *
         */
        List<User> userList = new ArrayList<>();
        for(int i = 0; i< 10; i++){
            User user = new User();

            user.setName("小组"+i);
            user.setAge(13+i);
            userList.add(user);
        }

        List<Integer> integerList = userList.stream().map(User::getAge).collect(Collectors.toList());
        System.out.println(integerList);

    }
}
