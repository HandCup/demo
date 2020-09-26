package com.feicaodemo.design.builddemo.demo1;

import java.util.ArrayList;

/**
 * @author Caofei
 * @className BenzBuilder
 * @description 奔驰模型的建造者
 * @date {2020/9/3} 0:10
 */
public class BenzBuilder extends CarBuilder {
    private BenzModel benz = new BenzModel();
    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.benz.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return this.benz;
    }
}
