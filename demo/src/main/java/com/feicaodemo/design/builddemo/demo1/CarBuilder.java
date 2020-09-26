package com.feicaodemo.design.builddemo.demo1;

import java.util.ArrayList;

/**
 * @author Caofei
 * @className CarBuilder
 * @description TODO
 * @date {2020/9/3} 0:06
 * 车辆模型的建造者
 * 作用：可以组装各个车辆模型（定制）
 */
public abstract class CarBuilder {
    /**
     * 建造一个模型 你需要给我你的定制需求
     */
    public abstract void setSequence(ArrayList<String> sequence);

    /**
     * 拿到客户的定制后，就可以拿到定制的车辆模型，所以这里有个根据定制要求生成车辆模型的方法
     */
    public abstract CarModel getCarModel();
}
