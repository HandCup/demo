package com.feicaodemo.design.statuedemo.newdemo;

/**
 * @author Caofei
 * @className ClosingState
 * @description TODO
 * @date {2020/9/2} 23:05
 */
public class ClosingState extends LiftState {
    /**
     * 电梯关了再开
     */
    @Override
    public void open() {
        super.context.setLiftState(Context.openningState);
        // 置换为敞开状态
        super.context.getLiftState().open();
    }

    /**
     *      电梯关闭 这是关闭状态要实现的操作
     */
    @Override
    public void close() {
        System.out.println("电梯关门。。。。");
    }

    /**
     * 电梯关了再运行
     */

    @Override
    public void run() {
        super.context.setLiftState(Context.runningState);
        // 设置为运行状态
        super.context.getLiftState().run();
    }

    /**
     *      电梯门关着 我不按楼层 保持停止
     */
    @Override
    public void stop() {
        super.context.setLiftState(Context.stoppingState);
        // 设置为停止状态
        super.context.getLiftState().stop();
    }
}
