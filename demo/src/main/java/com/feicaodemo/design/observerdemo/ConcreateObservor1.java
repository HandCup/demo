package com.feicaodemo.design.observerdemo;

/**
 * @author Caofei
 * @className ConcreateObservor1
 * @description 具体得观察者1号
 * @date {2020/8/20} 23:53
 */
public class ConcreateObservor1 implements Observor {
    @Override
    public void update(String context) {
        System.out.println("具体得观察者1号：发现1号 有异常动作: 开始向上级汇报");
        this.report(context);
        System.out.println("具体得观察者1号：汇报完毕");
    }
    public void report(String s){
        System.out.println("具体得观察者1号的汇报内容");
    }
}
