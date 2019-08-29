package com.example.consumer.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.api.HelloSVC;
import org.springframework.stereotype.Service;

@Service
public class HelloService {
    @Reference
    private HelloSVC helloSVC;

    public String showInfo(){
        return helloSVC.showInfo();
    }
}
