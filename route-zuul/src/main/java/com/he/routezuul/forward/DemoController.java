package com.he.routezuul.forward;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 控制类，测试forward功能。
 * zuul提供的rest服务
 */
@RestController
@RequestMapping("/demo")
public class DemoController {
    @GetMapping("/hello")
    public String hello(String name) {
        return "hi," + name + ",this is zuul api! ";
    }
}
