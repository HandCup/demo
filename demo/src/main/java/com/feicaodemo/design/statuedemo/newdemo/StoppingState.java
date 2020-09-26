package com.feicaodemo.design.statuedemo.newdemo;

/**
 * @author Caofei
 * @className StoppingState
 * @description TODO
 * @date {2020/9/2} 23:06
 */
public class StoppingState extends LiftState {
    /**
     * 电梯停止的时候 可以开门
     */
    @Override
    public void open() {
        super.context.setLiftState(Context.openningState);
        // 电梯开门
        super.context.getLiftState().open();
    }

    /**
     * 电梯停止时  可以关门
     */
    @Override
    public void close() {
        // do noting
    }

    /**
     * 电梯停止时 需要再运行起来
     */
    @Override
    public void run() {
       super.context.setLiftState(Context.runningState);
       // 停止后 重新运行起来
       super.context.getLiftState().run();
    }

    /**
     * 电梯停止时的动作
     */
    @Override
    public void stop() {
        System.out.println("电梯停止。。。。");
    }
}
