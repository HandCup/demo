package com.feicaodemo.design.statuedemo.newdemo;

/**
 * @author Caofei
 * @className Client
 * @description TODO
 * @date {2020/9/2} 23:30
 *
 * 状态模式的核心：封装
 * 状态的变更引起行为的变更
 *
 * State 抽象状态角色
 * ConcreteState 具体状态角色
 * Context 环境角色
 *
 */
public class Client {
    public static void main(String[] args){
        Context context = new Context();

        context.setLiftState(new ClosingState());
        context.open();
        context.close();
        context.run();
        context.stop();
    }
}
