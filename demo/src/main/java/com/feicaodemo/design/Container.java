package com.feicaodemo.design;

/**
 * @author Caofei
 * @className Container
 * @description TODO
 * @date {2020/8/20} 23:23
 */
public class Container {
    /**
     * 构造函数 传入需要使用的策略
      */
    private Calculator calculator;

    public Container(Calculator calculator){
        this.calculator = calculator;
    }

    /**
     * 使用策略
     */
    public void exec(){
        this.calculator.exec();
    }
}
