package com.he.eurekaclient.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/demo",method = RequestMethod.GET)
public class DemoController {
    @RequestMapping("/hello")
    public String hello(@RequestParam String name){
        return "hello "+name+"!";
    }
}
