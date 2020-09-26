package com.feicaodemo.design.statuedemo;

/**
 * @author Caofei
 * @className ILift
 * @description TODO
 * @date {2020/9/2} 22:09
 */
public interface ILift {
    // 电梯开启动作
    public void open();
    // 电梯关门动作
    public void close();
    // 电梯要能上能下
    public void run();
    // 电梯停止
    public void stop();
}
