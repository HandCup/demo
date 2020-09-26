package com.feicaodemo.threaddemo.demo1;

import java.awt.*;

/**
 * @author Caofei
 * @className Demo1
 * @description TODO
 * @date {2020/8/26} 22:36
 */
public class Demo1 {
    private static final long count = 10000L;
    public static void main(String[] args) throws InterruptedException{
        concurrency();
        serial();
    }

    private static void concurrency() throws InterruptedException{
        long start = System.currentTimeMillis();
        // 创建一个线程
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                int a = 0;
                for(long i = 0; i< count; i++){
                    a +=5;
                }
            }
        });
        // 开启线程
        thread.start();

        int b =0;
        for(long i =0; i<count; i++){
            b --;
        }
        long time = System.currentTimeMillis() - start;

        thread.join();

        System.out.println("concurrency:"+time+"ms,b="+b);
    }

    private static void serial() throws InterruptedException{
        long start2 = System.currentTimeMillis();
        int a2= 0;
        for(long i =0;i < count; i ++){
            a2 +=5;
        }
        int b2= 0;
        for(long k = 0; k< count;k++){
            b2 --;
        }
        long time = System.currentTimeMillis() - start2;

        System.out.println("serial:"+time+"ms,b2="+b2);
    }
}
