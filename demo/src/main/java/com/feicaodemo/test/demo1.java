package com.feicaodemo.test;

import java.util.ArrayList;
import java.util.List;

public class demo1 {
    public static void main(String[] args) {
        List<String> list =new ArrayList<>();

    }

    /**
     * 在divide方法中，我们对被除数做了个简单的检查，如果其值为0，那么就直接抛出一个异常，并明确提示异常原因。这其实就是fail-fast理念的实际应用。
     * @param divisor
     * @param divided
     * @return
     */

    public int divide(int divisor, int divided){
        if(divided ==0){
            throw new RuntimeException("divided can't be null");
        }
        return divisor/divided;
    }
}
