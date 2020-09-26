package com.feicaodemo.design;

/**
 * @author Caofei
 * @className Person
 * @description 使用策略的人
 * @date {2020/8/20} 23:28
 */
public class Person {
    public static void main(String[] args){
        // 带着策略锦囊
        Container container;
        // 上厕所忘带纸了 打开锦囊 拿出第一个妙计：用手
        container = new Container(new ADD());

        container.exec();

        // 手很脏 打开锦囊 拿出第二个妙计： 用水冲洗
        container = new Container(new SUM());
        container.exec();
    }
}
