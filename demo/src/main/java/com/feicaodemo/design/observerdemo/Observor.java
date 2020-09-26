package com.feicaodemo.design.observerdemo;

/**
 * @author Caofei
 * @className Observor
 * @description 观察者接口
 * @date {2020/8/20} 23:52
 */
public interface Observor {

    /**
     * 一旦发现有动静，得立马行动起来
     */
    public void update(String context);
}
