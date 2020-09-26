package com.feicaodemo.jdkdemo.optional;
import javax.naming.Name;
import java.util.Optional;
import java.util.Properties;
import java.util.function.Function;

public class optionalDemo1 {

    public static void main(String[] args){
        /**
         * Optional类只是对类简单封装，变量值不存在的时候，缺失的值会被建模成一个"空"的Optional对象，返回Optional.empty();
         * 思考:
         *  null和 optional.empty()的区别在哪？
         * Optional.ofNullable() 检查对象是否有值，处理了空指针异常
         * Optional中检查是否有值的另一个方法：ifPresent()
         * 会检查传入的（消费者）参数，如果对象不是空的会执行传入的Lambda表达式
         *
         */

    }

    public void createOptionalObject(){
        Optional<String> country = Optional.of("中国");
        Optional<String> city = Optional.ofNullable("上海");
        Optional<String> world = Optional.ofNullable(null);
        //下面会报空指针异常
        Optional<String> province = Optional.of(null);
    }

    public int readDuration(Properties props, String name){
        String value = props.getProperty(name);
        // 确保名称对应的属性存在
        if(value != null){
            try{
                // String -> int
                int i = Integer.parseInt(value);
                if(i > 0){
                    // 检查i 是否为正数，正数则返回
                    return i;
                }
            }catch (NumberFormatException e){
            }
        }
        return 0;
    }
}
