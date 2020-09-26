package com.feicaodemo.design.observerdemo;

/**
 * @author Caofei
 * @className Spy
 * @description 间谍
 * @date {2020/8/20} 23:57
 */
public class Spy extends Thread{
    // 具体的被观察者1号
    private ConcretePerson1 concretePerson1;
    // 具体的观察者1号
    private ConcreateObservor1 concreateObservor1;

    private String type;

    // 通过构造函数传递参数，我要监控谁，谁来监控，监控什么
    public Spy(ConcretePerson1 person1, ConcreateObservor1 observor1,String actions){
        this.concreateObservor1 = observor1;
        this.concretePerson1 = person1;
        this.type = actions;
    }


    @Override
    public void run() {
        while (true){
            if(this.type.equals("rest")){
                // 监控是否在休息
                // 如果发现1号在休息 通知上级
                if(this.concretePerson1.isRest()){
                    this.concreateObservor1.update("1号在休息");
                    // 重置状态 继续监控
                    this.concretePerson1.setRest(false);
                }
            }else {
                // 监控是否在玩

                if(this.concretePerson1.isPlay()){
                    this.concreateObservor1.update("1号在玩");
                    this.concretePerson1.setPlay(false);
                }
            }
        }
    }
}
