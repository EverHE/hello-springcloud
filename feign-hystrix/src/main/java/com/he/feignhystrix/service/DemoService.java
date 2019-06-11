package com.he.feignhystrix.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 调用helloservice服务
 */
@FeignClient(value = "eureka-client",fallback = DemoServiceHystric.class)
public interface DemoService {
    @RequestMapping(value = "/demo/hello",method = RequestMethod.GET)
    String hello(@RequestParam String name);
}
