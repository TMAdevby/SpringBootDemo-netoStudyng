package ru.netology.springbootdemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import ru.netology.springbootdemo.domain.Person;

@RestController
//@ConfigurationProperties("hello")
public class HelloController {
//    @Value("${hello.from:undefined}")
    @Value("myAppTest")
    private String from;

//    public void setFrom(String from) {
//        this.from = from;
//    }

    @PostMapping("/hello")
    private String hello(@RequestBody @Validated Person guest) {
        return String.format("Hello from %s to name %s age %d!",
                from, guest.getName(), guest.getAge());
    }

//    @GetMapping ("/hello")
//    private String hello(Person guest) {
//        return String.format("Hello from %s to name %s age %d!",
//                from, guest.getName(), guest.getAge());
//    }

//    @GetMapping ("/hello")
//    private String hello(@RequestParam("name") String name,
//                         @RequestParam("age") int age) {
//        return String.format("Hello from %s to name %s age %d!",
//                from, name, age);
//    }

    /*@GetMapping("/")
    private String hello(){
        return String.format("Hello from %s!",from);
    }*/
}
