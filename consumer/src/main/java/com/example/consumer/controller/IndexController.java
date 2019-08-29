package com.example.consumer.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.example.api.HelloSVC;
import com.example.consumer.service.HelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/")
public class IndexController {

    @Resource
    HelloService helloService;

    @RequestMapping("hello.do")
    public String index(){
        return helloService.showInfo();
    }
}
