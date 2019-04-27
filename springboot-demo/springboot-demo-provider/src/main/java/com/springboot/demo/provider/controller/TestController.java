package com.springboot.demo.provider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/provider")
public class TestController {

    @RequestMapping("/test")
    public String test() {
        return "SUCCESS";
    }

}
