package com.feicaodemo.design.statuedemo.newdemo;

/**
 * @author Caofei
 * @className RunningState
 * @description TODO
 * @date {2020/9/2} 23:06
 */
public class RunningState extends LiftState {
    /**
     * 运行时电梯门不能开着
     */
    @Override
    public void open() {
        // do nothing
    }

    /**
     * 电梯门关闭
     */

    @Override
    public void close() {
        // do nothing
    }

    /**
     * 运行状态下 的动作
     */

    @Override
    public void run() {

        System.out.println("电梯上下运行。。。");
    }

    /**
     * 电梯运行可以停止
     */

    @Override
    public void stop() {
        super.context.setLiftState(Context.stoppingState);
        // 运行状态切换为停止状态
        super.context.getLiftState().stop();

    }
}
