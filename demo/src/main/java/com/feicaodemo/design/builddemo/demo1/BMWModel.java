package com.feicaodemo.design.builddemo.demo1;

/**
 * @author Caofei
 * @className BMWModel
 * @description 宝马车模型 是车辆模型中的一种
 * @date {2020/9/2} 23:59
 */
public class BMWModel extends CarModel {
    @Override
    protected void start() {
        System.out.println("宝马车跑起来。。。。");
    }

    @Override
    protected void stop() {
        System.out.println("宝马车停下来。。。。");
    }

    @Override
    protected void alarm() {
        System.out.println("宝马车鸣笛。。。。");
    }

    @Override
    protected void engineBoom() {
        System.out.println("宝马车启动引擎。。。。");
    }
}
