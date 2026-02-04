package ru.netology.springbootdemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@ConfigurationProperties("hello")
public class HelloController {
    @Value("${hello.from:undefined}")
    private String from;

//    public void setFrom(String from) {
//        this.from = from;
//    }

    @GetMapping("/")
    private String hello(){
        return String.format("Hello from %s!",from);
    }
}
