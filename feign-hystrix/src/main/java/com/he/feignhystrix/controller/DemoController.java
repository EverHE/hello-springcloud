package com.he.feignhystrix.controller;

import com.he.feignhystrix.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @Autowired
    DemoService demoService;

    @RequestMapping(value = "hello")
    public String hello(@RequestParam String name){
        return demoService.hello(name);
    }
}
