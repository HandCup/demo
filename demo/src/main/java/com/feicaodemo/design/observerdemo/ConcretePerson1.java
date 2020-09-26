package com.feicaodemo.design.observerdemo;

/**
 * @author Caofei
 * @className ConcretePerson1
 * @description 具体的被观察者1号
 * @date {2020/8/20} 23:48
 */
public class ConcretePerson1 implements BeObversor {
    /**
     * 1号是否在休息或玩耍
     * 定义个监控的状态
     *
     * 通过isRest 和 isPlay 布尔型变量 来判断1号是否在休息或玩耍
     */
    private boolean isRest =false;
    private boolean isPlay =false;
    @Override
    public void rest() {
        System.out.println("被观察者1号说：我在休息");
        isRest = true;
    }

    @Override
    public void play() {
        System.out.println("被观察者1号说：我在玩");
        isPlay = true;
    }

    public boolean isRest() {
        return isRest;
    }

    public void setRest(boolean rest) {
        isRest = rest;
    }

    public boolean isPlay() {
        return isPlay;
    }

    public void setPlay(boolean play) {
        isPlay = play;
    }
}
