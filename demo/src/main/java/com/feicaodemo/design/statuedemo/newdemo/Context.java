package com.feicaodemo.design.statuedemo.newdemo;

/**
 * @author Caofei
 * @className Context
 * @description 环境角色，串联各个状态的过渡
 * 在抽象类ListState中定义并把这个环境角色聚合起来，传递到子类（4个具体的实现类中自己根据环境来决定如何进行状态的过渡）
 * @date {2020/9/2} 22:59
 */
public class Context {
    /**
     * 定义出电梯的所以状态
     */

    public static final OpenningState openningState = new OpenningState();
    public static final ClosingState closingState = new ClosingState();
    public static final RunningState runningState = new RunningState();
    public static final StoppingState stoppingState = new StoppingState();

    /**
     * 定义一个当前电梯的状态
     */

    private LiftState liftState;

    public LiftState getLiftState(){
        return this.liftState;
    }

    public void setLiftState(LiftState liftState){
        this.liftState = liftState;
        // 把当前的环境通知到各个实现类中
        this.liftState.setContext(this);
    }

    public void open(){
        this.liftState.open();
    }

    public void close(){
        this.liftState.close();
    }

    public void run(){
        this.liftState.run();
    }

    public void stop(){
        this.liftState.stop();
    }
}
