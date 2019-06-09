package com.he.feignhystrix.service;

import org.springframework.stereotype.Component;

/**
 * 当 DemoService 服务不可用的时候，会回调这里的实现
 */
@Component
public class DemoServiceHystric implements DemoService {
    @Override
    public String hello(String name) {
        return "hello hystrix!";
    }
}
