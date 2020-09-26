package com.feicaodemo.springvalidation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Caofei
 * @className ScopeTestController
 * @description TODO
 * @date {2020/9/24} 21:43
 *
 *
 *
 */
@RestController
@Scope("prototype")
public class ScopeTestController {
    private int num = 0;

    @RequestMapping("/testScope")
    public void testScope(){
        System.out.println(++num);
    }

    @RequestMapping("/testScope2")
    public void testScope2(){
        System.out.println(++num);
    }
}
