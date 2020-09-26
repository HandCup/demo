package com.feicaodemo.design.builddemo.demo1;

import java.util.ArrayList;

/**
 * @author Caofei
 * @className CarModel
 * @description TODO
 * @date {2020/9/2} 23:46
 *
 * 改Model的设计原理
 * setSequence() 用来让客户自己设置一个顺序，理解为定制。一个具体的模型是固定的
 * 但是N个模型的话就是动态的了，这里提供了run() 去读取sequence,然后遍历其中的字符串，哪个在前就先执行谁
 *
 *
 */
public abstract class CarModel {
    /**
     * 各个方法的执行顺序
     */
    private ArrayList<String> sequence = new ArrayList<String>();

    /**
     * 模型是 启动开始跑了
     */
    protected abstract void start();

    /**
     * 能停下来
     */
    protected abstract void stop();
    /**
     * 喇叭能发出声音
     */
    protected abstract void alarm();

    /**
     * 引擎能启动
     */

    protected abstract void engineBoom();

    final public void run(){
        // 循环一遍，谁在前，就先执行谁
        for (int i =0; i< sequence.size(); i++){
            String action = this.sequence.get(i);
            if (action.equalsIgnoreCase("start")){
                // 启动汽车
                this.start();
            }else if(action.equalsIgnoreCase("stop")){
                // 汽车熄火
                this.stop();
            }else if(action.equalsIgnoreCase("alarm")){
                // 汽车鸣笛
                this.alarm();
            }else if (action.equalsIgnoreCase("engine boom")){
                // 引擎启动
                this.engineBoom();
            }
        }
    }

    /**
     * 把传递过来的值传递到类内
     */
    final public void setSequence(ArrayList<String> sequence){
        this.sequence = sequence;
    }
}
