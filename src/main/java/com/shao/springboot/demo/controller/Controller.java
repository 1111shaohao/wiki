package com.shao.springboot.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.EnableMBeanExport;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController

public class Controller {
    @Value("${test.hello:TEST}")
    private  String testHello;

    @GetMapping("/hello")

    public String hello(){
        return "hello world!"+testHello;
    }
    @PostMapping("/hello/post")

    public String helloPost( String name ){
        return "hello world! Post."+ name ;
    }


}