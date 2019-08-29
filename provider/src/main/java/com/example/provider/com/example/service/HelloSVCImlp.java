package com.example.provider.com.example.service;


import com.alibaba.dubbo.config.annotation.Service;
import com.example.api.HelloSVC;

import java.util.Date;

@Service
public class HelloSVCImlp implements HelloSVC{
    @Override
    public String showInfo() {
        return "当前时间为"+(new Date().toLocaleString());
    }
}
