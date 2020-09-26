package com.feicaodemo.design.statuedemo.newdemo;

/**
 * @author Caofei
 * @className OpenningState
 * @description TODO
 * @date {2020/9/2} 23:00
 */
public class OpenningState extends LiftState {
    /**
     * 电梯 打开门
     */
    @Override
    public void open() {
        System.out.println("电梯门开启：。。。。");
    }

    /**
     * 电梯门开启可以关闭
     */

    @Override
    public void close() {
        super.context.setLiftState(Context.closingState);
        // 设置为关闭状态
        super.context.getLiftState().close();
    }

    /**
     * 门开着 还能跑?  吓人
     */
    @Override
    public void run() {
     // do nothing
    }

    /**
     * 门开着还不停止？ 也很可怕
     */
    @Override
    public void stop() {
        // do nothing
    }
}
