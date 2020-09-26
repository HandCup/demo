package com.feicaodemo.design.statuedemo;

/**
 * @author Caofei
 * @className Lift
 * @description TODO
 * @date {2020/9/2} 22:11
 */
public class Lift implements ILift {
    @Override
    public void open() {
        System.out.println("电梯启动...");
    }

    @Override
    public void close() {
        System.out.println("电梯关闭...");
    }

    @Override
    public void run() {
        System.out.println("电梯上下运行...");
    }

    @Override
    public void stop() {
        System.out.println("电梯停止...");
    }
}
