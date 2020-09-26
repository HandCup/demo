package com.feicaodemo.design;

/**
 * @author Caofei
 * @className Stratge
 * @description 策略枚举
 * @date {2020/8/20} 23:04
 */
public enum Strage {


    /**
     * 策略枚举：
     * 定义了一个抽象方法exec()
     * 然后再枚举成员里重写了方法exec() 实现 ADD/SUM
     * 每个枚举成员就是一个策略(把原有定义在抽象策略中的方法移植到枚举中)
     *
     */
    ADD("+"){
        @Override
        public int exec(int a, int b){
            return  a+b;
        }
    },

    SUM("-"){
        @Override
        public int exec(int a, int b) {
          return  a - b;
      }
    };

    String value = "";

    // 定义成员变量
    Strage(String value){
        this.value  =value;
    }

    // 获得枚举的值
    public String getValue(){
        return this.value;
    }

    // 声明一个抽象函数
    public abstract int exec(int a, int b);

}
