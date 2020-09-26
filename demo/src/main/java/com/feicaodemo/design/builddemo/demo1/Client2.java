package com.feicaodemo.design.builddemo.demo1;

import java.util.ArrayList;

/**
 * @author Caofei
 * @className Client2
 * @description TODO
 * @date {2020/9/3} 0:13
 */
public class Client2 {
    public static void main(String[] args){
        // 客户来定制车了
        ArrayList<String> sequence = new ArrayList<String>();

        sequence.add("engine boom");
        sequence.add("start");
        sequence.add("stop");
        // 我要一个奔驰车
        BenzBuilder builder = new BenzBuilder();
        builder.setSequence(sequence);
        BenzModel benzModel = (BenzModel) builder.getCarModel();
        benzModel.run();
        /**
         * 这里如果在需要一辆宝马车的话 需要增加一个宝马车的建造者 以及它的定制需要
         * 似乎不太好啊。。。。。。
         * 有没有更好的方案呢？
         *
         * 如果我们不知道客户具体的定制需要 我们如何量产呢
         * 把客户的需求封装起来？
         * 可以增加一个人，他的职责就是聚合客户的定制需求，根据需求生成出车辆的模型
         */
    }
}
