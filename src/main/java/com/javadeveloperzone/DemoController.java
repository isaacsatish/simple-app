package com.javadeveloperzone;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @RequestMapping(value = "/")
    public String hello1(){
        return "Landing page";
    }

    @RequestMapping(value = "hello")
    public String hello(){
        return "Spring boot Gradle Example";
    }
}
