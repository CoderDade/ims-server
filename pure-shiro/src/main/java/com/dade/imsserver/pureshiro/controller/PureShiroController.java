package com.dade.imsserver.pureshiro.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PureShiroController {

    @RequestMapping("hello")
    public String sayHello(){
        return "Hello Pure Shiro";
    }

    @RequestMapping("/401")
    public String say401(){
        return "This is a 401 api";
    }

}
