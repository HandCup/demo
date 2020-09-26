package com.feicaodemo.design;

/**
 * @author Caofei
 * @className Client
 * @description TODO
 * @date {2020/8/20} 23:17
 */
public class Client {
    public static void main(String[] args){
        // 输入的两个参数是数字
        int a = 10;

        int b = 6;

        System.out.println(Strage.ADD.exec(a,b));
        System.out.println(Strage.SUM.exec(a,b));

    }
}
