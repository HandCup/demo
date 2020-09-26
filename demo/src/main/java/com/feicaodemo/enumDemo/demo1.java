package com.feicaodemo.enumDemo;

/**
 * @author Caofei
 * @className demo1
 * @description TODO
 * @date {2020/9/5} 0:06
 */
public class demo1 {
    /**
     * 1.枚举可以使用声明在内部类
     * 2.每个枚举都是通过Class在内部实现的，且所有的枚举值都是public static final的
     * (以上的枚举类Color转化在内部类实现)
     * 3.使用for语句来迭代枚举元素Color.values 中是一个个枚举Color对象
     * 4.枚举类常用于switch语句中
     * 5.枚举中的
     *         values() 返回枚举中的所有值
     *         ordinal() 可以找到每个枚举常量的索引，就像数组索引一样
     *         valueOf() 返回指定字符串的枚举常量
     *
     * 6.枚举类成员：
     *  枚举可以跟普通类一样可以用自己的变量、方法、构造函数（构造函数只能用private访问修饰符）
     *  枚举既可以包含具体方法，也可以包含抽象方法
     *  如果枚举类具有抽象方法，则枚举类的每个实例都必须实现它
     *
     * 7.
     *
     */
    enum Color{
        RED,
        GREEN,
        BLUE;

        private Color(){
            System.out.println("构造函数："+ this.toString());
        }

        public void ColorInfo(){
            System.out.println("Universal Color");
        }
    }

    public static void main(String[] args){
//        Color color = Color.RED;
//        System.out.println(color);
//
//        for (Color myCo: Color.values()) {
//            System.out.println(myCo);
//        }

//
//        Color color = Color.BLUE;
//        switch (color){
//            case RED:
//                System.out.println("红色");
//                break;
//            case BLUE:
//                System.out.println("蓝色");
//                break;
//            case GREEN:
//                System.out.println("绿色");
//                break;
//        }
//        // 调用枚举常量
//        Color arr[] = Color.values();
//        // 迭代枚举
//        for(Color color : arr){
//            // 查看索引
//            System.out.println(color + "  at index" + color.ordinal());
//        }
//
//        // 使用valueOf() 返回枚举常量，不存在的会报错IllegalArgumentException
//        System.out.println(Color.valueOf("RED"));
        Color c1 = Color.RED;
        System.out.println(c1);
        c1.ColorInfo();

    }
}
