package com.feicaodemo.design.builddemo.demo1;

/**
 * @author Caofei
 * @className BenzModel
 * @description 奔驰模型 是车辆模型着一种
 * @date {2020/9/2} 23:57
 */
public class BenzModel extends CarModel {
    @Override
    protected void start() {
        System.out.println("奔驰车跑起来。。。。");
    }

    @Override
    protected void stop() {
        System.out.println("奔驰车停下了。。。。");
    }

    @Override
    protected void alarm() {
        System.out.println("奔驰车按喇叭。。。。");
    }

    @Override
    protected void engineBoom() {
        System.out.println("奔驰车开启启动引擎。。。。");
    }
}
