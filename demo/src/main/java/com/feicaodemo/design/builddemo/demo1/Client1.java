package com.feicaodemo.design.builddemo.demo1;

import java.util.ArrayList;

/**
 * @author Caofei
 * @className Client1
 * @description TODO
 * @date {2020/9/3} 0:00
 * 这种设计不够灵动 每次增加一个定制 都需要重新生成一个模型  会被搞疯
 *
 * 解决方案：
 *  这个模型可以根据客户的要求改动 只需要把需求告诉模型方就可以 这个模型方被称作为建造者
 */
public class Client1 {
    public static void main(String[] args){
        /**
         * 客户定制了辆 宝马车模型
         */
        BenzModel benzModel = new BenzModel();
        // 存放run的顺序
        ArrayList<String> sequence = new ArrayList<String>();
        sequence.add("engine boom");
        sequence.add("start");
        sequence.add("stop");
        // 根据定制的要求  生成一个奔驰的模型
        benzModel.setSequence(sequence);
        benzModel.run();
    }
}
