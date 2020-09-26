package com.feicaodemo.design.statuedemo.newdemo;


/**
 * @author Caofei
 * @className LiftState
 * @description 状态模式
 * @date {2020/9/2} 22:57
 */
public abstract class LiftState {
    /**
     * 定义一个环境角色，也就是封装状态的变化引起的功能变化
     */
    protected Context context;
    public void setContext(Context _context){
        this.context = _context;
    }
    public abstract void open();
    public abstract void close();
    public abstract void run();
    public abstract void stop();
}
