package com.feicaodemo.design.builddemo.demo1;

import java.util.ArrayList;

/**
 * @author Caofei
 * @className BMWBuilder
 * @description 宝马车辆模型的 建造者
 * @date {2020/9/3} 0:12
 */
public class BMWBuilder extends CarBuilder {
    private BMWModel bmwModel = new BMWModel();

    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.bmwModel.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return this.bmwModel;
    }
}
