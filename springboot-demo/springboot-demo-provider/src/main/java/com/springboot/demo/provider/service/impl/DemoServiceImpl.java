package com.springboot.demo.provider.service.impl;

import org.apache.dubbo.config.annotation.Service;

import com.springboot.demo.api.DemoService;

@Service
public class DemoServiceImpl implements DemoService {

    @Override
    public String hello() {
        return "Hello world!";
    }

}
