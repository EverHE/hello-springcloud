package com.he.feignhystrix.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 调用helloservice服务
 */
@FeignClient(value = "helloservice",fallback = DemoServiceHystric.class)
public interface DemoService {
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    String hello(String name);
}
