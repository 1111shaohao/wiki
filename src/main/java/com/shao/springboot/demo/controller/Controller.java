package com.shao.springboot.demo.controller;

import com.shao.springboot.demo.domain.Test;
import com.shao.springboot.demo.service.TestService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.EnableMBeanExport;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController

public class Controller {
    @Value("${test.hello:TEST}")
    private  String testHello;
    @Resource
    private TestService testService;
    @GetMapping("/hello")

    public String hello(){
        return "hello world!"+testHello;
    }
    @PostMapping("/hello/post")

    public String helloPost( String name ){
        return "hello world! Post."+ name ;
    }


    @GetMapping("/test/list")
    public List<Test> list(){
        return testService.list();
    }

}
