package com.feicaodemo.design.statuedemo;

/**
 * @author Caofei
 * @className Cient
 * @description TODO
 * @date {2020/9/2} 22:13
 */
public class Client {
    public static void main(String[] args){
        ILift lift = new Lift();

        lift.open();
        lift.close();
        lift.run();
        lift.stop();
    }
}
