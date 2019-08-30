package com.example.consumer.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.example.api.HelloSVC;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class IndexController {

    @Reference
    HelloSVC helloSVC;

    @RequestMapping("hello.do")
    public String index(){
        return helloSVC.showInfo();
    }
}
